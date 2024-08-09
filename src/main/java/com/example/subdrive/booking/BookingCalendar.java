package com.example.subdrive.booking;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookingCalendar {
    private String availableDateRange;
    private List<Booking> recentBookings;
    private List<Booking> currentBookings;
    private List<Booking> futureBookings;
}
