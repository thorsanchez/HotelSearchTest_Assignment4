package com.example.hotelsearchtest_assignment4;

import java.time.LocalDate;

public class HotelController {

    private Hotel[] hotels; // listi af hotelum

    public HotelController(Hotel[] hotels) {
        this.hotels = hotels;
    }

    public void handleHotelSelection() {
        // Logic til að velja hotel frá fylki (af hotelum)
    }

    public Hotel searchHotel(LocalDate date) {
        // Notum searchHotel sem skilar laust hotel með laust herbergi fyrir gefna dagsetningu 
        for (Hotel hotel : hotels) {
            if (hotel.getAvailability(date) > 0) {
                return hotel;
            }
        }
        return null; // Engin laus hotel?
    }
    
}
