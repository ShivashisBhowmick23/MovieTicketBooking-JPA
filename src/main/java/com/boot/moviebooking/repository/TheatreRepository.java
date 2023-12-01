package com.boot.moviebooking.repository;

import com.boot.moviebooking.entity.Theatres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TheatreRepository extends JpaRepository<Theatres, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM theatres WHERE theatre_id = ?")
    List<Theatres> findByTheatreId(String theatreId);

    // CUSTOM QUERY WE CAN WRITE, WHICH ARE NOT PROVIDED BY JPA REPOSITORY
}
