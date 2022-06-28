package org.wecancoeit.reviews.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private long id;
    private String destination;
    private double rating;
    private String stars;
    private String comment;
    @ManyToMany(mappedBy = "reviews")
    private Collection<Destination> destinations;

    // TODO take out the string destination, replace with one to many relationship with reviews and destinations
    public Review(String destination, int rating, String stars, String comment) {
        this.destination = destination;
        this.rating = rating;
        this.stars = stars;
        this.comment = comment;
        this.destinations = new ArrayList<>();
    }
    public Review(String destination, int rating, String comment){
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

    public String getStars() {
        return stars;
    }

    public Collection<Destination> getDestinations() {
        return destinations;
    }
}
