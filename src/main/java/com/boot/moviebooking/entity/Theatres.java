package com.boot.moviebooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Theatres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theatre_id;
    @NotNull(message = "Theatre name cannot be NULL")
    private String theatre_name;
    @NotNull(message = "Theatre movie timing cannot be null")
    private String movie_timings;
    @NotNull(message = "Theatre location cannot be null")
    private String location;

    @JsonIgnore
    @ManyToMany(mappedBy = "theatres")
    List<Movies> movies = new ArrayList<>();

}