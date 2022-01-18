/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/AbstractController.java to edit this template
 */
package com.neu.edu.controller;

import com.neu.edu.pojo.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author sachin
 */
@Controller
public class MovieFormController {

    @RequestMapping(value = "/movie.htm", method = RequestMethod.GET)
    public String showForm(ModelMap model, Movie movie) {
        //TODO
         return "movie-form";
    }

    @RequestMapping(value = "/movie.htm", method = RequestMethod.POST)
    // @PostMapping("/user.htm")
    // public String showSuccess(@ModelAttribute("movie") Movie movie, BindingResult result, SessionStatus status) {
        public String showSuccess() {
        
        Movie movie = new Movie();
        movie.setActor("new actor");
        movie.setActress("new actress");
        movie.setGenre("new actress");  
        movie.setYear(2001);
//        movie.setMovieid(2001); can not assign as it is native in movie.hbm.xml 

              
            
        //TODO
        // Hibernate ORM code
        Configuration cfg = new Configuration(); // notice: import correct package
        //SessionFactory sf = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
       SessionFactory sf = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession(); // notice: import correct package 
        Transaction tx = session.beginTransaction();
        session.save(movie);
        tx.commit();
        
       // Session Interface is the main runtime interface between a Java Application and Hibernate.
       // Configuration object reads the configuration file
       // SessionFactory creates Session instances.
       // Session object offers CRUD operations.
       // transaction means a group of operations
       
         
    
       return "movie-success";
    }
}
