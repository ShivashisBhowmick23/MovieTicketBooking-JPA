package com.boot.moviebooking.service;



import com.boot.moviebooking.entity.Directors;

import java.util.List;

public interface IDirectorService {

    public Directors addDirectors(Directors directors);

    public String addDirectors(List<Directors> directors);

    public Directors findByDirectorId(int director_id);

    public Directors deleteByDirectorId(int director_id);

    public Directors updateDirectorById(int  director_id);
}
