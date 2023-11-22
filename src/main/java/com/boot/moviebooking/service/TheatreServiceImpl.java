package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Theatres;
import com.boot.moviebooking.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TheatreServiceImpl implements ITheatreService {

    @Autowired
    TheatreRepository theatreRepo;
    @Override
    public Theatres addTheatre(Theatres theatre) {
        Theatres addSingleTheatre = new Theatres();
        theatreRepo.save(addSingleTheatre);
        return  addSingleTheatre;

    }

    @Override
    public List<Theatres> addTheatres(List<Theatres> theatres) {
        List<Theatres> addMultipleTheatres = new ArrayList<>();
        theatreRepo.saveAll(addMultipleTheatres);
        return addMultipleTheatres;


    }

    @Override
    public Optional<Theatres> findByTheatreId(int theatre_id) {
        return theatreRepo.findById(theatre_id);
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
}
