/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aksha
 */
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
            response.setContentType("/test.html");
            PrintWriter out = response.getWriter();
            Map<String, String[]> map = request.getParameterMap();

            for (Map.Entry<String, String[]> entry : map.entrySet()) {
                String k = entry.getKey();
                String[] arr = entry.getValue();

                if (k.equals("acadterm")) {
                    out.println("<br>");
                    out.println("Academic Term : ");
                    for (String str : arr) {
                        out.println(str + "  ");
                    }
                }

                if (k.equals("year")) {
                    out.println("<br>");
                    out.println("Academic Year : ");
                    for (String str : arr) {
                        out.println(str + "  ");
                    }
                }

                if (k.equals("status")) {
                    out.println("<br>");
                    out.println("Status : ");
                    for (String str : arr) {
                        out.println(str + " , ");
                    }
                }

                if (k.equals("name")) {
                    out.println("<br>");
                    out.println("Student Name is:");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("relationship")) {
                    out.println("<br>");
                    out.println("Relationship to Employee is:");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("nuid")) {
                    out.println("<br>");
                    out.println("Student NUID is:");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("ename")) {
                    out.println("<br>");
                    out.println("Employee Name is:");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("department")) {
                    out.println("<br>");
                    out.println("Department is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("location")) {
                    out.println("<br>");
                    out.println("Campus Location is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("phoneNumber")) {
                    out.println("<br>");
                    out.println("Phone Number is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("sname")) {
                    out.println("<br>");
                    out.println("Supervisor Name is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("school")) {
                    out.println("<br>");
                    out.println("School or program is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("cnumber")) {
                    out.println("<br><br>");
                    out.println("Course No is:");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("cname")) {
                    out.println("<br>");
                    out.println("Course Name is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("ssign")) {
                    out.println("<br>");
                    out.println("Supervisor Signature is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                
                if (k.equals("credit")) {
                    out.println("<br>");
                    out.println("Credit Hrs is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                
                if (k.equals("days")) {
                    out.println("<br>");
                    out.println("Day(s) is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("time")) {
                    out.println("<br>");
                    out.println("Time(a.m/p.m) is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("cnumber1")) {
                    out.println("<br><br>");
                    out.println("Course No is:");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("cname1")) {
                    out.println("<br>");
                    out.println("Course Name is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("ssign1")) {
                    out.println("<br>");
                    out.println("Supervisor Signature is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                
                if (k.equals("credit1")) {
                    out.println("<br>");
                    out.println("Credit Hrs is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                
                if (k.equals("days1")) {
                    out.println("<br>");
                    out.println("Day(s) is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("time1")) {
                    out.println("<br>");
                    out.println("Time(a.m/p.m) is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("cnumber2")) {
                    out.println("<br><br>");
                    out.println("Course No is:");
                    for (String str : arr) {
                        out.println(str);
                    }
                }

                if (k.equals("cname2")) {
                    out.println("<br>");
                    out.println("Course Name is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("ssign2")) {
                    out.println("<br>");
                    out.println("Supervisor Signature is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                
                if (k.equals("credit2")) {
                    out.println("<br>");
                    out.println("Credit Hrs is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                
                if (k.equals("days2")) {
                    out.println("<br>");
                    out.println("Day(s) is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("time2")) {
                    out.println("<br>");
                    out.println("Time(a.m/p.m) is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("esign")) {
                    out.println("<br><br>");
                    out.println("Employee Signature is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("date3")) {
                    out.println("<br>");
                    out.println("Date is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("approval")) {
                    out.println("<br><br>");
                    out.println("HRM Approval is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
                if (k.equals("date4")) {
                    out.println("<br>");
                    out.println("Date is: ");
                    for (String str : arr) {
                        out.println(str);
                    }
                }
                
 
            }

        } catch (Exception e) {
            out.println("Exception" + e);
        }
    }

}
