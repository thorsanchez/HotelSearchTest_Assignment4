package com.example.hotelsearchtest_assignment4;

import java.awt.*;

public class Amenity {

    public String amenityName;
    private String description;
    private Image icon;

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getDescription() {
        return this.description;
    }

    public void setIcon(Image newIcon) {
        this.icon = newIcon;
    }

    public Image getIcon() {
        return this.icon;
    }
}
