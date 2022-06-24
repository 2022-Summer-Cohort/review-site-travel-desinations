package org.wecancoeit.reviews.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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


    public Destination(String destinationName, String imageURL, String altText, String description, Category[] categories, Hashtag[] hashtags) {
        this.destinationName = destinationName;
        this.imageURL = imageURL;
        this.altText = altText;
        this.description = description;
        this.categories = Arrays.asList(categories);
        this.hashtags = Arrays.asList(hashtags);
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

    public String getAltText() {
        return altText;
    }
    public Collection<Category> getCategories(){
        return categories;
    }
    public Collection<Hashtag> getHashtags(){
        return hashtags;
    }
}
