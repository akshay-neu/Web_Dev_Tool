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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aksha
 */
@WebServlet(name = "TestServlet" , urlPatterns = {"/test.html"})
public class TestServlet extends HttpServlet {

 

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
//        processRequest(request, response);
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
//         response.setContentType("text/html;charset=UTF-8");
        try{
            response.setContentType("/test.html");
            PrintWriter out = response.getWriter();
            Enumeration<String> enumeration = request.getParameterNames();
            Iterator it = enumeration.asIterator();
            while(enumeration.hasMoreElements()){
                String str = enumeration.nextElement();
//                out.println(str+" : "+request.getParameter(str));
       
                
                if (str.equals("acadterm")) {
                    out.println("<br>");
                    out.println("Academic Term : ");
                    out.println(request.getParameter(str));
                }

                if (str.equals("year")) {
                    out.println("<br>");
                    out.println("Academic Year : ");
                    out.println(request.getParameter(str));
                }

                if (str.equals("status")) {
                    out.println("<br>");
                    out.println("Status : ");
                    String[] temp = request.getParameterValues(str);
                    for (String s : temp) {
                        out.println(s + " , ");
                    }
                    
                }

                if (str.equals("name")) {
                    out.println("<br>");
                    out.println("Student Name is :");
                    out.println(request.getParameter(str));
                }

                if (str.equals("relationship")) {
                    out.println("<br>");
                    out.println("Relationship to Employee is :");
                    out.println(request.getParameter(str));
                }

                if (str.equals("nuid")) {
                    out.println("<br>");
                    out.println("Student NUID is :");
                    out.println(request.getParameter(str));
                }

                if (str.equals("ename")) {
                    out.println("<br>");
                    out.println("Employee Name is :");
                    out.println(request.getParameter(str));
                }

                if (str.equals("department")) {
                    out.println("<br>");
                    out.println("Department is : ");
                    out.println(request.getParameter(str));
                }

                if (str.equals("location")) {
                    out.println("<br>");
                    out.println("Campus Location is : ");
                    out.println(request.getParameter(str));
                }

                if (str.equals("phoneNumber")) {
                    out.println("<br>");
                    out.println("Phone Number is : ");
                    out.println(request.getParameter(str));
                }

                if (str.equals("sname")) {
                    out.println("<br>");
                    out.println("Supervisor Name is : ");
                    out.println(request.getParameter(str));
                }

                if (str.equals("school")) {
                    out.println("<br>");
                    out.println("School or program is : ");
                    out.println(request.getParameter(str));
                }

                if (str.equals("cnumber")) {
                    out.println("<br><br>");
                    out.println("Course No is :");
                    out.println(request.getParameter(str));
                }

                if (str.equals("cname")) {
                    out.println("<br>");
                    out.println("Course Name is : ");
                    out.println(request.getParameter(str));
                }
                
                if (str.equals("ssign")) {
                    out.println("<br>");
                    out.println("Supervisor Signature is : ");
                    out.println(request.getParameter(str));

                }
                
                
                if (str.equals("credit")) {
                    out.println("<br>");
                    out.println("Credit Hrs is : ");
                    out.println(request.getParameter(str));
                }
                
                
                if (str.equals("days")) {
                    out.println("<br>");
                    out.println("Day(s) is: ");
                    out.println(request.getParameter(str));
                }
                
                if (str.equals("time")) {
                    out.println("<br>");
                    out.println("Time(a.m/p.m) is: ");
                    out.println(request.getParameter(str));
                }
                
                if (str.equals("cnumber1")) {
                    out.println("<br><br>");
                    out.println("Course No is:");
                    out.println(request.getParameter(str));
                }

                if (str.equals("cname1")) {
                    out.println("<br>");
                    out.println("Course Name is: ");
                    out.println(request.getParameter(str));
                }
                
                if (str.equals("ssign1")) {
                    out.println("<br>");
                    out.println("Supervisor Signature is : ");
                    out.println(request.getParameter(str));
                }
                
                
                if (str.equals("credit1")) {
                    out.println("<br>");
                    out.println("Credit Hrs is: ");
                    out.println(request.getParameter(str));
                }
                
                
                if (str.equals("days1")) {
                    out.println("<br>");
                    out.println("Day(s) is : ");
                    out.println(request.getParameter(str));
                    
                }
                
                if (str.equals("time1")) {
                    out.println("<br>");
                    out.println("Time(a.m/p.m) is : ");
                    out.println(request.getParameter(str));

                }
                
                if (str.equals("cnumber2")) {
                    out.println("<br><br>");
                    out.println("Course No is :");
                    out.println(request.getParameter(str));
                }

                if (str.equals("cname2")) {
                    out.println("<br>");
                    out.println("Course Name is : ");
                    out.println(request.getParameter(str));
                }
                
                if (str.equals("ssign2")) {
                    out.println("<br>");
                    out.println("Supervisor Signature is : ");
                    out.println(request.getParameter(str));
                }
                
                
                if (str.equals("credit2")) {
                    out.println("<br>");
                    out.println("Credit Hrs is : ");
                    out.println(request.getParameter(str));
                }
                
                
                if (str.equals("days2")) {
                    out.println("<br>");
                    out.println("Day(s) is : ");
                    out.println(request.getParameter(str));
                }
                
                if (str.equals("time2")) {
                    out.println("<br>");
                    out.println("Time(a.m/p.m) is: ");
                   out.println(request.getParameter(str));
                }
                
                if (str.equals("esign")) {
                    out.println("<br><br>");
                    out.println("Employee Signature is: ");
out.println(request.getParameter(str));
                }
                
                if (str.equals("date3")) {
                    out.println("<br>");
                    out.println("Date is : ");
                    out.println(request.getParameter(str));
                }
                
                if (str.equals("approval")) {
                    out.println("<br><br>");
                    out.println("HRM Approval is : ");
                    out.println(request.getParameter(str));
                }
                
                if (str.equals("date4")) {
                    out.println("<br>");
                    out.println("Date is: ");
                    out.println(request.getParameter(str));
                }
                
                out.println("<br><br>"); 
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION: " + e.getMessage());
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
