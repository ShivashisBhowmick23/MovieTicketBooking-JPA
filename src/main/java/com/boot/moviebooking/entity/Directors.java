package com.boot.moviebooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Directors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull(message = "Director ID cannot be null or empty")
    private int director_id;
    @NotNull(message = "Director Name cannot be null or empty")
    private String director_name;

    @JsonIgnore()
    @OneToMany(mappedBy = "directors")
    private List<Movies> movies = new ArrayList<>();

}
