package edu.neu.controller;

import edu.neu.dao.MovieDAO;
import edu.neu.pojo.Movie;
import edu.neu.validation.MovieValidator;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

@Controller
public class MovieController {
    @Autowired
    MovieValidator validator; 
    // through autowired the class becomes public static global,
    // and then every user requests will be running the same
    
    @GetMapping("/movie/save.htm")
    public String saveMovieGet(ModelMap model, Movie movie) { // this is a service method
        //formBackingObject
        //this is needed mainly for the update functionality.
        //We want to show old values so that the user could see the existing values
        //Movie movie = new Movie // formbackingobject
        //movie.setTitle("Old Title");
        //Here, I set this to demonstrate, but normally, you would retrieve old values from the database
        //Movie movie = new MovieDAO.getMovie();
        
        //name of the model object must match the modelAttribute in the movie-form view
        model.addAttribute("movie", movie);
        return "movie-from";
    }
    
    @PostMapping("/movie/save.htm")
    public String saveMoviePost(@ModelAttribute("movie") Movie movie, BindingResult result, SessionStatus status, MovieDAO moviedao) {

// ModelAttribute annotation is used to define Command Class for (SimpleFormController)
// "movie" written there is Command Class Name, alias for (SimpleFormController)
// its name has to match with the modelattribute given in movie-form.jsp view file


// we have used above MovieDao moviedao
// in order to use it: define a bean in application.conetxt.xml and then inject it into handler method 
// bean name/id should match the instance name 'moviedao' 
// 

//save the movie instance using the dao class
        moviedao.createMovie(movie);
        //moviedao.deleteMovie(movie);
        //moviedao.updateMovie(movie);
        
        //Movie m = moviedao.getMovie(111);
  
        String view = null;
        if (result.hasErrors()) //BindingResult
            view = "movie-from";
        else {
            status.setComplete();
            view = "movie-success";
        }
        return view;
    }
    
    @GetMapping("/movie/search.htm")
    public String searchMovieGet() {
        
        return "";
    }
    
    @PostMapping("/movie/search.htm")
    public String searchMoviePost() {
        
        return "";
    }
}
