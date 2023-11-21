package com.boot.moviebooking.entity;

import java.util.ArrayList;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Theatres {

	@Id
	private int id;
	private String theatre_name;
	private String movie_timings;
	private String location;

	@JsonIgnore
	@OneToMany(mappedBy = "theatres")
	List<Movies> movies = new ArrayList<>();

}
