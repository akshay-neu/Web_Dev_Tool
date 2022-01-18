/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw4p8.controller;

import com.mycompany.hw4p8.pojo.User;
import com.mycompany.hw4p8.service.UserLookupService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author aksha
 */
@Controller
public class UserController {
     @Autowired
    UserLookupService service;
    
    @RequestMapping(value = "/index.htm",method=RequestMethod.GET)
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response ) throws Exception {

        
        return new ModelAndView("index");
    }
    
    @RequestMapping(value = "/user.htm",method=RequestMethod.POST)
    protected ModelAndView handleRequestPOST(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
           
            String username=request.getParameter("name");
            User user=new User();
            user.setName(username);
            request.setAttribute("user", user);
            request.setAttribute("info", service.getInfo());
            request.setAttribute("objectID", service);
                   
        
        return new ModelAndView("user-details");
    }
    
      @RequestMapping(value = "/user.htm",method=RequestMethod.GET)
    protected ModelAndView handleRequestobject(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
           
            
            request.setAttribute("objectID2", service);
                   
        
        return new ModelAndView("ObjectID-check");
    }
    
}
