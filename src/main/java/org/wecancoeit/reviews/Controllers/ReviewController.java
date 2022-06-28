package org.wecancoeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancoeit.reviews.Model.Destination;
import org.wecancoeit.reviews.Model.Review;
import org.wecancoeit.reviews.Repos.DestinationRepository;
import org.wecancoeit.reviews.Repos.ReviewRepository;

import javax.persistence.Id;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class ReviewController {

    private ReviewRepository reviewRepo;
    private DestinationRepository destinationRepo;
    public ReviewController(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @RequestMapping("/review/")
    private String showReview(Model model, @PathVariable String destination) {
        model.addAttribute("review", reviewRepo.findByDestinationIgnoreCase(destination));
        return "review";
    }

}
