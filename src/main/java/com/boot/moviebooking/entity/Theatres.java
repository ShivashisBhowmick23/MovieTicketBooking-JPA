package com.boot.moviebooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Theatres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theatre_id;
    private String theatre_name;
    private String movie_timings;
    private String location;

    @JsonIgnore
    @ManyToMany(mappedBy = "theatres")
    List<Movies> movies = new ArrayList<>();

}