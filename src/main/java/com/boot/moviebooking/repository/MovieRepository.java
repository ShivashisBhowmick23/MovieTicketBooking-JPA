package com.boot.moviebooking.repository;

import com.boot.moviebooking.entity.Movies;
import com.boot.moviebooking.entity.Theatres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM movies WHERE movie_category = ?")
    public List<Movies> findByCategory(String movie_category);

    @Query(nativeQuery = true, value = "SELECT mvs.id, mvs.movie_id, mvs.movie_name, mvs.movie_category,mvs.release_year,mvs.rating FROM movies mvs join directors d on d.id = mvs.id where d.director_name=:director_name")
    public List<Movies> findByDirectorName(String director_name);

    @Query(nativeQuery = true, value = "SELECT mvs.id, mvs.movie_id, mvs.movie_name, mvs.movie_category,mvs.release_year,mvs.rating FROM movies mvs join directors d on d.id = mvs.id where d.director_id=:director_id")
    public List<Movies> findDirectorsById(int director_id);

    @Query(nativeQuery = true, value = "SELECT mvs.id, mvs.movie_id, mvs.movie_name, mvs.movie_category, mvs.release_year, mvs.rating \n" +
            "FROM movies mvs \n" +
            "JOIN theatres t ON t.theatre_id = mvs.id \n" +
            "WHERE t.theatre_name =:theatre_name")
    public List<Theatres> findTheatreByName(String theatre_name);


}
