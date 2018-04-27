package com.example.mariajosemolina.tourguideapp;

public class Location {
    String Name;
    String Address;
    String Description;
    String Website;
    int Image;

    // 0: Bar/Restaurant
    // 1: Sight seeing
    // 2: Street art
    // 3: Parks
    int Type;


    public Location(String name, String address, String description, String website, int type, int image){
        this.Name = name;
        this.Address = address;
        this.Description = description;
        this.Website = website;
        this.Type = type;
        this.Image = image;

    }
}