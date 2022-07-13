package org.wecancoeit.reviews.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Arrays;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String hashtag;
    @ManyToMany(mappedBy = "hashtags")
    private Collection<Destination> destinations;

    public Hashtag(String hashtag,Destination...destinations) {
        this.hashtag = hashtag;
        this.destinations = Arrays.asList(destinations);
    }

    public Hashtag(){

    }
    public String getHashtag() {
        return hashtag;
    }

    public long getId() {
        return id;
    }

    public Collection<Destination> getDestinations(){
        return destinations;
    }

}
