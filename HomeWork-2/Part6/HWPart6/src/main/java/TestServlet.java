/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aksha
 */
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String acadterm = request.getParameter("acadterm");
        String year = request.getParameter("year");
        String status[] = request.getParameterValues("status");

        String name = request.getParameter("name");
        String nuid = request.getParameter("nuid");
        String relationship = request.getParameter("relationship");
        String ename = request.getParameter("ename");
        String enuid = request.getParameter("enuid");
        String department = request.getParameter("department");
        String location = request.getParameter("location");
        String phoneNumber = request.getParameter("phoneNumber");
        String sname = request.getParameter("sname");

        String school = request.getParameter("program");
        
        String cnumber = request.getParameter("cnumber");
        String cname = request.getParameter("cname");
        String ssign = request.getParameter("ssign");
        String credit = request.getParameter("credit");
        String days = request.getParameter("days");
        String time = request.getParameter("time");
        
        String cnumber1 = request.getParameter("cnumber1");
        String cname1 = request.getParameter("cname1");
        String ssign1 = request.getParameter("ssign1");
        String credit1 = request.getParameter("credit1");
        String days1 = request.getParameter("days1");
        String time1 = request.getParameter("time1");
        
        String cnumber2 = request.getParameter("cnumber2");
        String cname2 = request.getParameter("cname2");
        String ssign2 = request.getParameter("ssign2");
        String credit2 = request.getParameter("credit2");
        String days2 = request.getParameter("days2");
        String time2 = request.getParameter("time2");

        String esign = request.getParameter("esign");
        String date3 = request.getParameter("date3");

        String approval = request.getParameter("approval");
        String date4 = request.getParameter("date4");
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("Form Details");
        out.println("</title>");
        out.println("</head>");

        out.println("<body>");
        out.println("<br>");

        out.println("Academic Term : " + acadterm);
        out.println("<br>");

        out.println("Academic Year : " + year);
        out.println("<br>");

        out.println("Employee Status : ");
         if (status != null) {
            for (String stat : status) {
                out.println(stat + "  ,  ");
            }
        }
        out.println("<br>");

        out.println("Student Name is: " + name);
        out.println("<br>");
        out.println("Relationship to Employee is: " + relationship);
        out.println("<br>");
        out.println("Student NUID is: " + nuid);
        out.println("<br>");
        out.println("Employee Name is: " + ename);
        out.println("<br>");
        out.println("Employee Id is: " + enuid);
        out.println("<br>");
        out.println("Department is: " + department);
        out.println("<br>");
        out.println("Campus Location is: " + location);
        out.println("<br>");
        out.println("Phone Number is: " + phoneNumber);
        out.println("<br>");
        out.println("Supervisor Name is: " + sname);
        out.println("<br>");
        out.println("School or program is: " + school);
        out.println("<br>");
        
        out.println("Course No is: " + cnumber);
        out.println("<br>");
        out.println("Course Name is: " + cname);
        out.println("<br>");
        out.println("Supervisor Signature is: " + ssign);
        out.println("<br>");
        out.println("Credit Hrs is: " + credit);
        out.println("<br>");
        out.println("Day(s) is: " + days);
        out.println("<br><br>");
        out.println("Time(a.m/p.m) is: " + time);
        out.println("<br><br>");
        
        
        out.println("Course No is: " + cnumber1);
        out.println("<br />");
        out.println("Course Name is: " + cname1);
        out.println("<br />");
        out.println("Supervisor Signature is: " + ssign1);
        out.println("<br />");
        out.println("Credit Hrs is: " + credit1);
        out.println("<br />");
        out.println("Day(s) is: " + days1);
        out.println("<br><br>");
        out.println("Time(a.m/p.m) is: " + time1);
        out.println("<br><br>");
        
        
        out.println("Course No is: " + cnumber2);
        out.println("<br>");
        out.println("Course Name is: " + cname2);
        out.println("<br>");
        out.println("Supervisor Signature is: " + ssign2);
        out.println("<br>");
        out.println("Credit Hrs is: " + credit2);
        out.println("<br>");
        out.println("Day(s) is: " + days2);
        out.println("<br>");
        out.println("Time(a.m/p.m) is: " + time2);
        out.println("<br><br>");
        
        out.println("Employee Signature is: " + esign);
        out.println("<br>");
        out.println("Date is: " + date3);
        out.println("<br>");
        out.println("HRM Approval is: " + approval);
        out.println("<br>");
        out.println("Date is: " + date4);

        out.println("</body>");
        out.println("</html>");

        out.close();
        } catch (Exception e) {
            
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
