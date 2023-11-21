package com.boot.moviebooking.repository;

import com.boot.moviebooking.entity.Theatres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatres, Integer> {

    // CUSTOM QUERY WE CAN WRITE, WHICH ARE NOT PROVIDED BY JPA REPOSITORY
}
