package com.example.bms.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "theatre")
public class Theatre extends BaseEntity{


    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "locality_id", nullable = false)
    private Locality locality;


    @ManyToMany(fetch = FetchType.LAZY,
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
    @JoinTable(name = "theatre_movie",
        joinColumns = { @JoinColumn(name = "theatre_id") },
        inverseJoinColumns = { @JoinColumn(name = "movie_id") })
    private Set<Movie> movies = new HashSet<>();

}
