package test.dao;

import edu.neu.dao.MovieDAO;
import edu.neu.pojo.Movie;

public class MainClass {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setActor("Actor 1");
        movie.setActress("Actress 2");
        movie.setGenre("romantic");
        movie.setTitle("New Movie");
        movie.setYear(2040);

        MovieDAO moviedao = new MovieDAO();
        moviedao.createMovie(movie);
    }
}
// through this we can check DAO class without the need of deploying the full application
// just run this test file
