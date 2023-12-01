package com.boot.moviebooking.controller;

import com.boot.moviebooking.entity.Theatres;
import com.boot.moviebooking.service.TheatreServiceImpl;
import com.boot.moviebooking.util.URLMoviesConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(URLMoviesConstant.THEATRES_REST_URL)
public class TheatreController {
    // Controller for each and every entity class
    @Autowired
    TheatreServiceImpl theatreService;

    @GetMapping(URLMoviesConstant.VIEW_MOVIES_BY_THEATRE_ID)
    public List<Theatres> getMoviesByTheatreId(@PathVariable("theatre_id") String theatre_id) {
        List<Theatres> result = theatreService.findByTheatreId(theatre_id);
        if (result != null) {
            return result;
        } else {
            return null;
        }

    }
}
