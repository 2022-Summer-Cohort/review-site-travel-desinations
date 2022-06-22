package org.wecancoeit.reviews.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Destination {
    @Id
    @GeneratedValue
    private long id;
    private String destinationName;
    private String description;

    public Destination(String destinationName, String description) {
        this.destinationName = destinationName;
        this.description = description;
    }


    public Destination(){

    }
    public long getId() {
        return id;
    }

    public String getDestinationName() {
        return destinationName;
    }
}
