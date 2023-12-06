package com.boot.moviebooking.service;

import com.boot.moviebooking.dto.MovieDTO;
import com.boot.moviebooking.dto.TheatreDTO;
import com.boot.moviebooking.entity.Movies;
import com.boot.moviebooking.entity.Theatres;
import com.boot.moviebooking.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TheatreServiceImpl implements ITheatreService {

    @Autowired
    TheatreRepository theatreRepo;

    @Override
    public Theatres addTheatre(Theatres theatre) {
        Theatres addSingleTheatre = new Theatres();
        theatreRepo.save(addSingleTheatre);
        return addSingleTheatre;

    }

    @Override
    public List<Theatres> addTheatres(List<Theatres> theatres) {
        List<Theatres> addMultipleTheatres = new ArrayList<>();
        theatreRepo.saveAll(addMultipleTheatres);
        return addMultipleTheatres;


    }

    @Override
    public List<TheatreDTO> findByTheatreId(String theatre_id) {
        return theatreRepo.findByTheatreId(theatre_id);
    }

    @Override
    public boolean deleteByTheatreId(int theatre_id) {
        theatreRepo.deleteById(theatre_id);
        return true;
    }

    @Override
    public Theatres updateByTheatreId(int theatre_id) {
        Theatres updatedTheatre = new Theatres();
        theatreRepo.save(updatedTheatre);
        return updatedTheatre;
    }

    private TheatreDTO mapToTheatreDTO(Theatres theatres) {
        TheatreDTO theatreDTO = new TheatreDTO();
        theatreDTO.setTheatre_id(theatres.getTheatre_id());
        theatreDTO.setTheatre_name(theatres.getTheatre_name());
        theatreDTO.setLocation(theatres.getLocation());
        theatreDTO.setMovies(mapToMoviesDTO(theatres.getMovies()));

        return theatreDTO;
    }

    private Set<MovieDTO> mapToMoviesDTO(Set<Movies> movies) {
        return movies.stream()
                .map(movie-> {
                    MovieDTO movieDTO = new MovieDTO();
                    movieDTO.setMovie_name(movie.getMovie_name());
                    movieDTO.setMovie_category(movie.getMovie_category());
                    movieDTO.setMovie_rating(movie.getRating());
                    movieDTO.setDirectors(movie.getDirectors());
                    return movieDTO;
                })
                .collect(Collectors.toSet());
    }
}
