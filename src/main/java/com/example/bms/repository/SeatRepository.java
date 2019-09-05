package com.example.bms.repository;

import com.example.bms.entity.Booking;
import com.example.bms.entity.Seat;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<Seat, Long> {

}
