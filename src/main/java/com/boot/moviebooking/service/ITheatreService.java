package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Theatres;

import java.util.List;

public interface ITheatreService {

    public Theatres addTheatre(Theatres theatre);

    public String addTheatres(List<Theatres> theatres);

    public Theatres findByTheatreId(int theatre_id);

    public Theatres deleteByTheatreId(int theatre_id);

    public Theatres updateByTheatreId(int  theatre_id);
}
