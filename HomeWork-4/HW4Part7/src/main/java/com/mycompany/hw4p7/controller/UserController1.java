/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw4p7.controller;

import com.mycompany.hw4p7.pojo.User;
import com.mycompany.hw4p7.service.UserLookupService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author aksha
 */
public class UserController1 extends AbstractController {
    
    public UserController1() {
    }
    
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
            String username=request.getParameter("name");

             User user=new User();
             user.setName(username);
  
            request.setAttribute("user", user);
            
            UserLookupService service=(UserLookupService) this.getApplicationContext().getBean("service");
            request.setAttribute("info", service.getInfo());
            request.setAttribute("objectID", service);
                   
        
        return new ModelAndView("user-details");
    }
    
}
