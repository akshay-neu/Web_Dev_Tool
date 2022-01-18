/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.Controller;

import edu.neu.Bean.Cart;
import edu.neu.Bean.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author aksha
 */
@Controller
public class ShoppingCartController extends HttpServlet {
    
    
@Autowired
Cart cart;

@Autowired
Item item;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String hidd = request.getParameter("hidd");
        /**
         * Delete if hidd is "1" otherwise go to add
         */

        if(hidd != null && hidd .equals("1")){
            HttpSession session = request.getSession();
            cart = (Cart) session.getAttribute("cart");
            if( cart == null){
                cart = new Cart();
            }
            Enumeration<String> list = request.getParameterNames();

            while(list.hasMoreElements()){
                String name = list.nextElement();
                if(name.equals("Submit")) continue;
                String amount = request.getParameter(name);
                int count = Integer.parseInt(amount);
                if(count == 0){
                    cart.deleteItem(name);
                }else{
                    cart.modifyItemCount(name,count);
                }
            }
            session.setAttribute("cart",cart);
            request.getRequestDispatcher("ViewCart.jsp").forward(request,response);
            return ;
        }

        String[] items = request.getParameterValues("books");
        if (items == null)
            items = request.getParameterValues("music");
        if (items == null)
            items = request.getParameterValues("computers");
//        System.out.println(Arrays.toString(items));
        HttpSession session = request.getSession();
        cart = (Cart)session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
        }

        if (items == null) {
            session.setAttribute("items", items);
            session.setAttribute("cart", cart);
            request.getRequestDispatcher("AddSuccessful.jsp").forward(request, response);
            return;
        }
//       
        for(String name:items){
            Item item = new Item(name,1);
            cart.addItem(item);
        }
//        System.out.println(cart.getCart().get(0));
        session.setAttribute("items", items);
//        System.out.println(Arrays.toString((String[])session.getAttribute("items")));
        session.setAttribute("cart", cart);
        System.out.println(items[0]);
        request.getRequestDispatcher("AddSuccessful.jsp").forward(request, response); 
    
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
        processRequest(request, response);
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
        processRequest(request, response);
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
