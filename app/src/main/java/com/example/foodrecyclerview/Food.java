package com.example.foodrecyclerview;

public class Food {
    private String name;
    private String imageUrl;
    private String description;  // Новое поле

    public Food(String name, String imageUrl, String description) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }
}
