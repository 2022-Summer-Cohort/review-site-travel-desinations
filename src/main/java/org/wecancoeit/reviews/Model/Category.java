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

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
    public Category(){

    }
    public long getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
