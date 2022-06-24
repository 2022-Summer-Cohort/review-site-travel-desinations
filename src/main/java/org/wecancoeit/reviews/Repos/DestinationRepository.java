package org.wecancoeit.reviews.Repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.Model.Destination;


import java.util.Collection;
import java.util.Optional;

public interface DestinationRepository extends CrudRepository<Destination, Long> {
   Destination findByDestinationName(String name);


}
