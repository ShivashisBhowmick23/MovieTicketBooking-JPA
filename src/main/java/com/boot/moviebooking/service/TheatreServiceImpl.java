package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Theatres;
import com.boot.moviebooking.repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public List<Theatres> findByTheatreId(String theatre_id) {
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
}
