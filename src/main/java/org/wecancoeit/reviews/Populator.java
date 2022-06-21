package org.wecancoeit.reviews;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.Repos.CategoryRepository;
import org.wecancoeit.reviews.Repos.DestinationRepository;
import org.wecancoeit.reviews.Repos.ReviewRepository;

@Component
public class Populator implements CommandLineRunner {
    private ReviewRepository reviewRepo;
    private DestinationRepository destinationRepo;
    private CategoryRepository categoryRepo;

    public Populator(ReviewRepository reviewRepo, DestinationRepository destinationRepo, CategoryRepository categoryRepo) {
        this.reviewRepo = reviewRepo;
        this.destinationRepo = destinationRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
