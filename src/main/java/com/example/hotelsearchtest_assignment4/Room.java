package com.example.hotelsearchtest_assignment4;

import java.awt.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Room {

    public String name;
    private String type;
    private String description;
    private Image image;
    private Map<LocalDate, Double> rateMap;
    private Map<LocalDate, int> availabilityMap;

    //Constructor
    public Room(String createName) {
        name = createName;
        rateMap = new HashMap<>();
        availabilityMap = new HashMap<>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {
        this.description = d;
    }

    public String getType() {
        return type;
    }

    public void setType(String t) {
        this.type = t;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image i) {
        this.image = i;
    }

    public void setRate(LocalDate d, Double r) {
        rateMap.put(d, r);
    }

    public Double getRate(LocalDate d) {
        return rateMap.get(d);
    }

    public void setAvailability(LocalDate d, int a) {
        availabilityMap.put(d, a);
    }

    public int getAvailability(LocalDate d) {
        return availabilityMap.get(d);
    }
}
