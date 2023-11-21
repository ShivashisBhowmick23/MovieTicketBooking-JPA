package com.boot.moviebooking.repository;

import com.boot.moviebooking.entity.Directors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Directors, Integer> {
}
