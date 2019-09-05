package com.example.bms.repository;

import com.example.bms.entity.Booking;
import com.example.bms.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {

}
