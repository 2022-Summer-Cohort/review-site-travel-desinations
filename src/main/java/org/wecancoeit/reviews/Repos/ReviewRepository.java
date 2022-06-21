package org.wecancoeit.reviews.Repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.Model.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
