package com.example.bms.repository;

import com.example.bms.entity.Booking;
import com.example.bms.entity.Locality;
import org.springframework.data.repository.CrudRepository;

public interface LocalityRepository extends CrudRepository<Locality, Long> {

}
