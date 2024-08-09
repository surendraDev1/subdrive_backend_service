package com.example.subdrive.entity;

import com.example.subdrive.booking.BookingCalendar;
import com.example.subdrive.domain.Category;
import org.springframework.stereotype.Component;

@Component
public class CarDetails {
    private Car car;
    private CarPrice carPrice;
    private BookingCalendar carCalendar;
    private CarAddress carAddress;
    private CarDocuments carDocuments;
    private User carOwner;
    private Category category;

}
