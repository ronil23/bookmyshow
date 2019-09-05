package com.example.bms.entity;

import com.example.bms.constants.Constants.BookingSlot;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Booking extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false)
    private Seat seat;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name="slot", nullable = false, length = 20)
    private BookingSlot slot;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;


    public Booking(Seat seat, User user, BookingSlot slot) {
        this.seat = seat;
        this.user = user;
        this.slot = slot;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BookingSlot getSlot() {
        return slot;
    }

    public void setSlot(BookingSlot slot) {
        this.slot = slot;
    }
}
