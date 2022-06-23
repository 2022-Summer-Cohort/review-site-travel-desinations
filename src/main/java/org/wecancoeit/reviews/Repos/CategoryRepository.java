package org.wecancoeit.reviews.Repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancoeit.reviews.Model.Category;

import java.util.Collection;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Collection<Category> findByCategoryName(String categoryName);
}
