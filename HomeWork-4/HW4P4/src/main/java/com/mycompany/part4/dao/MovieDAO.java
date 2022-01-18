/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part4.dao;

import com.mycompany.part4.controller.MovieController;
import com.mycompany.part4.pojo.MovieBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author aksha
 */
public class MovieDAO extends DAO {

    Connection conn;
    PreparedStatement ps;

    public void addMovie(MovieBean movieBean, ModelAndView mv) throws SQLException {
        try {
            this.conn = getConnection();
            String sql = "INSERT INTO movie(title,actor,actress,genre,year)" + "VALUES" + "(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, movieBean.getTitle());
            ps.setString(2, movieBean.getActor());
            ps.setString(3, movieBean.getActress());
            ps.setString(4, movieBean.getGenre());
            ps.setInt(5, movieBean.getYear());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MovieDAO.class.getName()).log(Level.SEVERE, null, ex);
            mv.setViewName("index");

        }

    }

    public ArrayList<MovieBean> searchMovieTitle(MovieBean movieBean, ModelAndView mv, String keyword) {
        ArrayList<MovieBean> movieList = new ArrayList<>();
        try {
            this.conn = getConnection();
            String sql = "SELECT * FROM movie WHERE title=?";

            ps = conn.prepareStatement(sql);

            ps.setString(1, keyword);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                movieBean.setTitle(rs.getString(1));
                movieBean.setActor(rs.getString(2));
                movieBean.setActress(rs.getString(3));
                movieBean.setGenre(rs.getString(4));
                movieBean.setYear(rs.getInt(5));
                movieList.add(movieBean);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
            mv.setViewName("index");
        }
        return movieList;
    }

    public ArrayList<MovieBean> searchMovieActor(MovieBean movieBean, ModelAndView mv, String keyword) {
        ArrayList<MovieBean> movieList = new ArrayList<>();
        try {
            this.conn = getConnection();
            String sql = "SELECT * FROM movie WHERE actor=?";

            ps = conn.prepareStatement(sql);

            ps.setString(1, keyword);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                movieBean.setTitle(rs.getString(1));
                movieBean.setActor(rs.getString(2));
                movieBean.setActress(rs.getString(3));
                movieBean.setGenre(rs.getString(4));
                movieBean.setYear(rs.getInt(5));
                movieList.add(movieBean);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
            mv.setViewName("index");
        }
        return movieList;
    }

    public ArrayList<MovieBean> searchMovieActress(MovieBean movieBean, ModelAndView mv, String keyword) {
        ArrayList<MovieBean> movieList = new ArrayList<>();
        try {
            this.conn = getConnection();
            String sql = "SELECT * FROM movie WHERE actress=?";

            ps = conn.prepareStatement(sql);

            ps.setString(1, keyword);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                movieBean.setTitle(rs.getString(1));
                movieBean.setActor(rs.getString(2));
                movieBean.setActress(rs.getString(3));
                movieBean.setGenre(rs.getString(4));
                movieBean.setYear(rs.getInt(5));
                movieList.add(movieBean);
            }

        } catch (SQLException ex) {
            Logger.getLogger(MovieController.class.getName()).log(Level.SEVERE, null, ex);
            mv.setViewName("index");
        }
        return movieList;
    }
}
