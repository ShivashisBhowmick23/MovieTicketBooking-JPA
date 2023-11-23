package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Theatres;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ITheatreService {

    public Theatres addTheatre(Theatres theatre);

    public List<Theatres> addTheatres(List<Theatres> theatres);

    public Optional<Theatres> findByTheatreId(int theatre_id);

    public boolean deleteByTheatreId(int theatre_id);

    public Theatres updateByTheatreId(int theatre_id);
}
