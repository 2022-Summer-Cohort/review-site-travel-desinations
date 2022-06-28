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

import java.util.Collection;

@Controller
public class DestinationController {
  private DestinationRepository destinationRepo;
  private ReviewRepository reviewRepo;

    public DestinationController(DestinationRepository destinationRepo, ReviewRepository reviewRepo) {
        this.destinationRepo = destinationRepo;
        this.reviewRepo = reviewRepo;
    }

    @RequestMapping("/destination/{destinationName}")
    public String showSingleDestination(Model model, @PathVariable String destinationName){
        model.addAttribute("destination", destinationRepo.findByDestinationName(destinationName).get());
        return "review";
    }
    @PostMapping("/destination/{destinationName}/addReview")
    private String addReview(@PathVariable String destinationName, @RequestParam int rating, @RequestParam String comment){
        Destination destination1 = destinationRepo.findByDestinationName(destinationName).get();
        Review review = new Review(destination1.getDestinationName(),rating,comment);
        reviewRepo.save(review);
        destination1.addReview(review);
        destinationRepo.save(destination1);
        return "redirect:/destination/" + destinationName;
    }
//    @RequestMapping("/destination/{review}")
//    public String showDestinationReviews(Model model, @PathVariable Review review){
//        model.addAttribute("review",destinationRepo)
//    }
}

