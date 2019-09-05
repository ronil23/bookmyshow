package com.example.bms.repository;

import com.example.bms.entity.Booking;
import com.example.bms.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
