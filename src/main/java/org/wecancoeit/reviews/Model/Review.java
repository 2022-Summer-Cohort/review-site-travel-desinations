package org.wecancoeit.reviews.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private long id;
    private String destination;
    private double rating;
    private String comment;


    // TODO take out the string destination, replace with one to many relationship with reviews and destinations
    public Review(String destination, double rating, String comment) {
        this.destination = destination;
        this.rating = rating;
        this.comment = comment;
    }

    public Review() {

    }

    public String getDestination() {
        return destination;
    }

    public long getId() {
        return id;
    }

    public double getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
