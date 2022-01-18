/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part4.controller;

import com.mycompany.part4.dao.MovieDAO;
import com.mycompany.part4.pojo.MovieBean;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author aksha
 */

public class MovieController extends AbstractController {

    /*public MovieController(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }*/
    @Autowired
    private MovieDAO movieDao;

    public MovieController() {
    }

    //@RequestMapping(value = "/movie.htm", method = RequestMethod.GET)

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setContentType("text/html;charset=UTF-8");
        ModelAndView mv = new ModelAndView();
        String value = request.getParameter("action");
        System.out.println(value);
        movieDao = new MovieDAO();

        if (value.equals("login")) {
            String option = request.getParameter("loginOption");

            if (option.equalsIgnoreCase("browse")) {
                mv.setViewName("searchMovie");

            } else if (option.equalsIgnoreCase("add")) {
                mv.setViewName("addMovie");
            } else {
                mv.setViewName("index");

            }
        }

        if (value.equals("doAddMovie")) {

            String title = request.getParameter("title");
            String actor = request.getParameter("actor");
            String actress = request.getParameter("actress");
            String genre = request.getParameter("genre");
            int year = Integer.parseInt(request.getParameter("year"));

            MovieBean movieBean = new MovieBean();
            movieBean.setTitle(title);
            movieBean.setActor(actor);
            movieBean.setActress(actress);
            movieBean.setGenre(genre);
            movieBean.setYear(year);

            movieDao.addMovie(movieBean, mv);
            //mv.setViewName("movieAdded");
            mv = new ModelAndView("movieAdded", "MovieBean", movieBean);
        }
        if (value.equals("doSearch")) {
            String searchMethod = request.getParameter("searchMethod");

            MovieBean movieBean = new MovieBean();
            if (searchMethod.equals("title")) {

                String searchKeywordTitle = request.getParameter("searchKeyword");
                ArrayList<MovieBean> movieList = new ArrayList<>();
                movieList = movieDao.searchMovieTitle(movieBean, mv, searchKeywordTitle);
                request.setAttribute("resultArrayList", movieList);
                request.setAttribute("searchedItem", searchKeywordTitle);
                //mv.setViewName("showMovie");
                mv = new ModelAndView("showMovie", "MovieBean", movieBean);
            }
            if (searchMethod.equals("actor")) {
                String searchKeywordActor = request.getParameter("searchKeyword");
                ArrayList<MovieBean> movieList1 = new ArrayList<>();
                movieList1 = movieDao.searchMovieActor(movieBean, mv, searchKeywordActor);
                request.setAttribute("resultArrayList", movieList1);
                request.setAttribute("searchedItem", searchKeywordActor);
                // mv.setViewName("showMovie");
                mv = new ModelAndView("showMovie", "MovieBean", movieBean);
            }
            if (searchMethod.equals("actress")) {
                String searchKeywordActress = request.getParameter("searchKeyword");
                ArrayList<MovieBean> movieList2 = new ArrayList<>();
                movieList2 = movieDao.searchMovieActress(movieBean, mv, searchKeywordActress);
                request.setAttribute("resultArrayList", movieList2);
                request.setAttribute("searchedItem", searchKeywordActress);
                // mv.setViewName("showMovie");
                mv = new ModelAndView("showMovie", "MovieBean", movieBean);
            }
        }

        return mv;

    }
}
