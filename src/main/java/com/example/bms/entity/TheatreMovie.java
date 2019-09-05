package com.example.bms.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

////@Entity
//@Table(name = "theatre_movie")
public class TheatreMovie {


    @Id
    @Column(name = "theatre_movie_id")
    private int theatreMovieId;

    @Column(name = "theatre_id")
    private int theatreId;

    @Column(name = "movie_id")
    private int movieId;


    @ManyToOne
    @PrimaryKeyJoinColumn(name = "movie_id", referencedColumnName="movie_Id")
    private Movie movie;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "theatre_id", referencedColumnName="theatre_Id")
    private Theatre theatre;



}
