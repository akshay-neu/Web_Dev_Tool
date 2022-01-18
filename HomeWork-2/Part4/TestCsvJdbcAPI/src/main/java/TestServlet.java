/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aksha
 */
@WebServlet(urlPatterns = {"/test.xls"})
public class TestServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        
        
        String answer = request.getParameter("fileName");
        
        if(answer.equals("parking_facilities")) {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            // Load the driver.
            Class.forName("org.relique.jdbc.csv.CsvDriver");

            //String path = "C:\\Users\\jshar\\OneDrive\\Documents\\NetBeansProjects\\HWPart4\\src\\main\\webapp\\files";
// Create a connection. CSV file is in D:
            Connection conn = DriverManager.getConnection("jdbc:relique:csv:C:");

// Create a Statement object to execute the query with.
            Statement stmt = conn.createStatement();

// Select columns from SalesOrder.csv
            ResultSet rs = stmt.executeQuery("SELECT * FROM parking_facilities");

            ResultSetMetaData data = rs.getMetaData();

//loop through rs
            System.out.println("Start");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HWPart4</title>");
            out.println("</head>");
            System.out.println("head");

            out.println("<body>");
            out.println("<table>");
//            out.println("<h1>Servlet HWPart4 at " + request.getContextPath() + "</h1>");
////             get titles
//            out.println("<tr>");
            System.out.println("Inside Body");
            out.println("<table border-='1'>");

            int columnCount = data.getColumnCount();
            System.out.println("Column name start");
            for (int i = 1; i <= columnCount; i++) {
                String title = data.getColumnName(i);
                out.println("<th>" + title + "</th>");
            }
            while (rs.next()) {
                out.println("<tr>");
                for (int i = 1; i <= columnCount; i++) {
                    String value = rs.getString(i);
                    out.println("<td>" + value + "</td>");
                }
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
// Clean up
            rs.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
        }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
