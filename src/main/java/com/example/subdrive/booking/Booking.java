package com.example.subdrive.booking;

import com.example.subdrive.entity.User;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;

@Component
public class Booking {
    private DateTimeFormatter fromDate;
    private DateTimeFormatter toDate;
    private User carOwner;
    private User renter;
}
