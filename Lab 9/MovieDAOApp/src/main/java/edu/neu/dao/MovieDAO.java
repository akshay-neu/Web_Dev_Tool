package edu.neu.dao;

import edu.neu.pojo.Movie;

public class MovieDAO extends DAO {
    // this class extends DAO class for the Hibernate ORM code
    // This class performs CRUD operations on POJO
    
    public void createMovie(Movie movie) {
        try {
            // methods: begin(), getSession(), commit(), rollback() are from DAO.java
        begin(); 
        getSession().save(movie);
        commit();
        } catch(Exception e) {
            rollback();
        }
        System.out.println("Movie Saved in the DB");
    }
    
    public Movie getMovie(int movieid) {
        return getSession().get(Movie.class, movieid);
    }
    
    public void deleteMovie(Movie movie) {
        begin();
        getSession().delete(movie);
        commit();
    }
    
    public void updateMovie(Movie movie) {
        begin();
        getSession().update(movie);
        commit();
    }
}