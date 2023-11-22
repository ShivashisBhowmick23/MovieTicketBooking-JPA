package com.boot.moviebooking.service;



import com.boot.moviebooking.entity.Directors;

import java.util.List;
import java.util.Optional;

public interface IDirectorService {

    public Directors addDirector(Directors director);

    public List<Directors> addDirectors(List<Directors> directors);

    public Optional<Directors> findByDirectorId(int director_id);

    public Boolean deleteByDirectorId(int director_id);

    public Directors updateDirectorById(int  director_id);
}
