package org.wecancoeit.reviews.Model;

import org.wecancoeit.reviews.Repos.ReviewRepository;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Destination {
    @Id
    @GeneratedValue
    private long id;
    private String destinationName;
    private String description;
    private String imageURL;
    private String altText;
    @ManyToMany
    Collection<Category> categories;
    @ManyToMany
    Collection<Hashtag> hashtags;
    @ManyToMany
    Collection<Review> reviews;

    public Destination(String destinationName, String imageURL, String altText, String description, Category[] categories, Hashtag[] hashtags, Review...reviews) {
        this.destinationName = destinationName;
        this.imageURL = imageURL;
        this.altText = altText;
        this.description = description;
        this.categories = Arrays.asList(categories);
        this.hashtags = Arrays.asList(hashtags);
        this.reviews = Arrays.asList(reviews);
    }


    public Destination(){

    }
    public long getId() {
        return id;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Review> getReviews() {
        return reviews;
    }
    public void addReview(Review review){
        reviews.add(review);
    }

    public String getAltText() {
        return altText;
    }
    public Collection<Category> getCategories(){
        return categories;
    }
    public Collection<Hashtag> getHashtags(){
        return hashtags;
    }

    public void addHashtag(Hashtag hashtag){
        hashtags.add(hashtag);
    }
}
