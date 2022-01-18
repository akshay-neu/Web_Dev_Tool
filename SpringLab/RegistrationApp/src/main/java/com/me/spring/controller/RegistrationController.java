/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.me.spring.controller;

import com.me.pojo.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author aksha
 */
public class RegistrationController extends AbstractController {
    
    public RegistrationController() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        //throw new UnsupportedOperationException("Not yet implemented");
    
        System.out.println("Here we have reached");
        
        String action = "view";
        ModelAndView mav = new ModelAndView();
        
        //read request parameters
        String email = request.getParameter("email");
        String pswd = request.getParameter("password");
        String startdate = request.getParameter("startdate");
        String aboutme = request.getParameter("aboutme");
        String gender = request.getParameter("gender");
        
        //create and populate User POJO
        User user = new User();
        user.setEmail(email);
        user.setPassword(pswd);
        user.setStartdate(startdate);
        user.setAboutme(aboutme);
        user.setGender(gender);
        
        //place the bean in the Scope
       // request.setAttribute("user", user);
        if(action.equals("view"))
        {
            request.setAttribute("user", user);
        mav.setViewName("user-view");
        }
        else 
        {
        mav.setViewName("another-view");
        }
        return mav;
    }
    
}
