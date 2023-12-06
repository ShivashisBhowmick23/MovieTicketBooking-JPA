package com.boot.moviebooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Theatres {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull(message = "Theatre ID cannot be Null")
    private String theatre_id ;
    @NotNull(message = "Theatre name cannot be NULL")
    private String theatre_name;
    @NotNull(message = "Theatre movie timing cannot be null")
    private String movie_timings;
    @NotNull(message = "Theatre location cannot be null")
    private String location;
    @ManyToMany(mappedBy = "theatres", fetch = FetchType.EAGER)
    @JsonIgnore
   private Set<Movies> movies = new HashSet<>();


}