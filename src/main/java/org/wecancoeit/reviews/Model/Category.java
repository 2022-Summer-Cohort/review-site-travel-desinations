package org.wecancoeit.reviews.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String categoryName;
    private String imageURL;
    private String altText;

    public Category(String categoryName, String imageURL, String altText) {
        this.categoryName = categoryName;
        this.imageURL = imageURL;
        this.altText = altText;
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
}
