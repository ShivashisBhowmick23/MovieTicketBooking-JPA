package com.boot.moviebooking.repository;

import com.boot.moviebooking.entity.Directors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Directors, Integer> {

    // CUSTOM QUERY WE CAN WRITE, WHICH ARE NOT PROVIDED BY JPA REPOSITORY
}
