package com.example.hotelsearchtest_assignment4;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    public String name;
    private List<Room> roomList;
    private List<Review> reviewList;
    private List<Amenity> amenityList;
    private String description;
    private int starRating;
    private Image image;
    private String location;

    //constructor
    public Hotel(String newHotel) {
        name = newHotel;
        roomList = new ArrayList<>();
        reviewList = new ArrayList<>();
        amenityList = new ArrayList<>();
    }

    public void setImage(Image newImage) {
        this.image = newImage;
    }

    public Image getImage() {
        return image;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getDescription() {
        return this.description;
    }

    public void setLocation(String newLocation) {
        //Setja constraints hér, throwa exception ef passar ekki í einhvern lista?
        this.location = newLocation;
    }

    public String getLocation() {
        return this.location;
    }

    public void setStarRating(int newRating) {
        if (newRating < 0 || newRating > 5) {
            throw new IllegalArgumentException("Star rating must be between 1 and 5 stars");
        }
        starRating = newRating;
    }

    public int getStarRating() {
        return starRating;
    }

    public void addRoom(Room newRoom) {
        roomList.add(newRoom);
    }

    public void removeRoom(Room oldRoom) {
        roomList.remove(oldRoom);
    }

    public void addReview(Review newReview) {
        reviewList.add(newReview);
    }

    public void deleteReview(Review oldReview) {
        reviewList.remove(oldReview);
    }

    public int getAvailability(LocalDate date) {
        int availability = 0;
        for (Room room : roomList) {
            availability = availability + room.getAvailability(date);
        }
        return availability;
    }

    public double bestAvailableRate(LocalDate date) {
        double bestRate = Double.POSITIVE_INFINITY;
        for (Room room : roomList) {
            bestRate = Double.min(bestRate, room.getRate(date));
        }
        return bestRate;
    }
}
