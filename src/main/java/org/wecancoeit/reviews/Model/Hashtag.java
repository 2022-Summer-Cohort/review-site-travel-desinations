package org.wecancoeit.reviews.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private long id;
    private String hashtag;

    public Hashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public Hashtag(){

    }
    public String getHashtag() {
        return hashtag;
    }

    public long getId() {
        return id;
    }
}
