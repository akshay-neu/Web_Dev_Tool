/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.validation;

import edu.neu.pojo.Movie;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author ysf
 */
public class MovieValidator implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return Movie.class.isAssignableFrom(type);
        // 'type' is same as class 'movie' or sub-class of it
    }

    @Override
    public void validate(Object o, Errors errors) {
    } 
}
