package com.boot.moviebooking.repository;

import com.boot.moviebooking.dto.TheatreDTO;
import com.boot.moviebooking.entity.Theatres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TheatreRepository extends JpaRepository<Theatres, Integer> {
    @Query(nativeQuery = true, value = "SELECT * \n" +
            "FROM movies mvs \n" +
            "JOIN theatres t ON t.id = mvs.movie_id \n" +
            "WHERE t.theatre_id = ?")
    List<TheatreDTO> findByTheatreId(String theatre_id);

    // CUSTOM QUERY WE CAN WRITE, WHICH ARE NOT PROVIDED BY JPA REPOSITORY
}
