package org.wecancoeit.reviews.Repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.Model.Review;

import javax.persistence.Tuple;
import java.util.Optional;

public interface ReviewRepository extends CrudRepository<Review, Long> {


    Optional<Review> findByDestinationIgnoreCase(String destination);

}
