/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.Controller;

import edu.neu.Bean.BookBean;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author aksha
 */
public class NewBookController extends AbstractController {

    public NewBookController() {
    }

    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();

        response.setContentType("text/html;charset=UTF-8");
        String action = request.getParameter("action");
        Connection conn = null;
        PreparedStatement stmt = null;

//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//        }
        if (action.equals("add")) {
            int bookQuantity = Integer.parseInt(request.getParameter("bookQuantity"));
            if (bookQuantity > 0) {
                request.setAttribute("bookQuantity", bookQuantity);
//                RequestDispatcher rd = request.getRequestDispatcher("addBooks.jsp");
//                rd.forward(request, response);
                mv.addObject("bookQuantity", bookQuantity);
                mv.setViewName("addBooks");

            } else {
//                RequestDispatcher rd = request.getRequestDispatcher("books.jsp");
//                rd.forward(request, response);
                mv.setViewName("books");
            }
        }

        if (action.equals("doAddBook")) {
            String[] isbnList = request.getParameterValues("isbn");
            String[] titleList = request.getParameterValues("title");
            String[] authorsList = request.getParameterValues("authors");
            String[] priceList = request.getParameterValues("price");

            BookBean bookBean = new BookBean();
            conn = getConnectionJDBC();

            String sql = "INSERT INTO books (isbn, title, authors, price)"
                    + "VALUES"
                    + "(?, ?, ?, ?)";
            try {
                stmt = conn.prepareStatement(sql);

                for (int i = 0; i < isbnList.length; i++) {
                    stmt.setString(1, isbnList[i]);
                    stmt.setString(2, titleList[i]);
                    stmt.setString(3, authorsList[i]);
                    float price = Float.parseFloat(priceList[i]);
                    stmt.setInt(4, (int) price);
                    stmt.executeUpdate();

                    bookBean.setIsbn(isbnList[i]);
                    bookBean.setTitle(titleList[i]);
                    bookBean.setAuthors(authorsList[i]);
                    bookBean.setPrice(price);

                }

                stmt.close();

                request.setAttribute("quantity", isbnList.length);
//                RequestDispatcher rd = request.getRequestDispatcher("booksAdded.jsp");
//                rd.forward(request, response);
                mv = new ModelAndView("booksAdded", "BookBean", bookBean);
                

            } catch (SQLException ex) {
                Logger.getLogger(NewBookController.class.getName()).log(Level.SEVERE, null, ex);
//                RequestDispatcher rd = request.getRequestDispatcher("books.jsp");
//                rd.forward(request, response);
                mv = new ModelAndView("books","BookBean",bookBean);


            }
        }
        return mv;
    }

    private Connection getConnectionJDBC() throws IOException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:"
                    + "3306/bookdb", "root", "root");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        if (connection != null) {
            System.out.println("connection established");
        }
        return connection;
    }

}
