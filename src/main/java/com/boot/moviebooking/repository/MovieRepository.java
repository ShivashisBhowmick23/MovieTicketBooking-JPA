package com.boot.moviebooking.repository;

import com.boot.moviebooking.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movies, Integer> {
}
