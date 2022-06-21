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

    public Destination(String destinationName) {
        this.destinationName = destinationName;
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
