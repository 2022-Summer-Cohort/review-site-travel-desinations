package org.wecancoeit.reviews.Repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.Model.Hashtag;

import java.util.Collection;

public interface HashtagRepository extends CrudRepository<Hashtag, Long> {

    Collection<Hashtag> findByHashtag(String hashtag);

}
