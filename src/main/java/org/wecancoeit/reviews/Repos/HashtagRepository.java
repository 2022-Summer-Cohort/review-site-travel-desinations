package org.wecancoeit.reviews.Repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.Model.Hashtag;

import java.util.Collection;
import java.util.Optional;

public interface HashtagRepository extends CrudRepository<Hashtag, Long> {

    Optional<Hashtag> findByHashtagIgnoreCase(String hashtag);

}
