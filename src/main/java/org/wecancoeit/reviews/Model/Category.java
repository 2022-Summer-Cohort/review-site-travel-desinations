package org.wecancoeit.reviews.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String categoryName;
    private String imageURL;
    private String altText;
    @ManyToMany(mappedBy = "categories")
    private Collection<Destination> destinations;

    public Category(String categoryName, String imageURL, String altText) {
        this.categoryName = categoryName;
        this.imageURL = imageURL;
        this.altText = altText;
        this.destinations = new ArrayList<Destination>();
    }

    public Category(){

    }
    public long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getAltText() {
        return altText;
    }

    public Collection<Destination> getDestinations() {
        return destinations;
    }
}
