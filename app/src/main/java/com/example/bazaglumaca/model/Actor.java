package com.example.bazaglumaca.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Actor {
    private int id;
    private String name,lastName,bio;
    private String image;
    private Date born;
    private Date died;
    private double rating;

    public Actor(int id, String name, String lastName, String bio, String image, String born,String died, double rating)  {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.bio = bio;
        this.image = image;
        DateFormat format = new SimpleDateFormat("MM.dd.yyyy", Locale.ENGLISH);
        try {
            this.born = format.parse(born);
            if(died!=null){
        this.died = format.parse(died);
            }else{
                this.died=format.parse("00.00.0000");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.rating = rating;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public Date getDied() {
        return died;
    }

    public void setDied(Date died) {
        this.died = died;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
