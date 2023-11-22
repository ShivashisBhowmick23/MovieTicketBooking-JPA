package com.boot.moviebooking.service;

import com.boot.moviebooking.entity.Directors;
import com.boot.moviebooking.entity.Movies;
import com.boot.moviebooking.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DirectorServiceImpl implements IDirectorService {

@Autowired
    DirectorRepository directorRepo;

    @Override
    public Directors addDirector(Directors director) {
        Directors addOneDirector = new Directors();
        directorRepo.save(addOneDirector);
        return addOneDirector;
    }

    @Override
    public List<Directors> addDirectors(List<Directors> directors) {
        List<Directors> addMultipleDirectors = new ArrayList<>();
        directorRepo.saveAll(addMultipleDirectors);
        return addMultipleDirectors;
    }

    @Override
    public Optional<Directors> findByDirectorId(int director_id) {

        return directorRepo.findById(director_id);
    }

    @Override
    public Boolean deleteByDirectorId(int director_id) {
        directorRepo.deleteById(director_id);
        return true;
    }

    @Override
    public Directors updateDirectorById(int director_id) {
        Directors updatedDirector = new Directors();
        directorRepo.save(updatedDirector);
        return updatedDirector;


    }
}
