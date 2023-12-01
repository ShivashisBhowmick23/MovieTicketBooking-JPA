package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Theatres;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ITheatreService {

    public Theatres addTheatre(Theatres theatre);

    public List<Theatres> addTheatres(List<Theatres> theatres);

    public List<Theatres> findByTheatreId(String theatre_id);

    public boolean deleteByTheatreId(int theatre_id);

    public Theatres updateByTheatreId(int theatre_id);
}
