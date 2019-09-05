package com.example.bms.service;

import com.example.bms.constants.Constants.BookingSlot;
import com.example.bms.entity.Booking;
import com.example.bms.entity.Seat;
import com.example.bms.entity.User;
import com.example.bms.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BookService {

    @Autowired
    private BookingRepository bookingRepository;

    public synchronized Booking addBooking(User user, Seat seat, BookingSlot slot) {
        try {
            Booking booking = new Booking(seat, user, slot);
            return bookingRepository.save(booking);
        } catch (Exception e) {
            //catch specific db exception;
            System.out.println("could not book the requested seat, please try some other seat");
        }
    }

}
