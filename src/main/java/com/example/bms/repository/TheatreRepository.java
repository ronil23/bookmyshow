package com.example.bms.repository;

import com.example.bms.entity.Booking;
import com.example.bms.entity.Theatre;
import org.springframework.data.repository.CrudRepository;

public interface TheatreRepository extends CrudRepository<Theatre, Long> {

}
