package org.wecancoeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancoeit.reviews.Model.Destination;
import org.wecancoeit.reviews.Model.Hashtag;
import org.wecancoeit.reviews.Model.Review;
import org.wecancoeit.reviews.Repos.DestinationRepository;
import org.wecancoeit.reviews.Repos.HashtagRepository;
import org.wecancoeit.reviews.Repos.ReviewRepository;

import java.util.Collection;
import java.util.Optional;

@Controller
public class DestinationController {
  private DestinationRepository destinationRepo;
  private ReviewRepository reviewRepo;
  private HashtagRepository hashtagRepo;

    public DestinationController(DestinationRepository destinationRepo, ReviewRepository reviewRepo, HashtagRepository hashtagRepo) {
        this.destinationRepo = destinationRepo;
        this.reviewRepo = reviewRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @RequestMapping("/destination/{destinationName}")
    public String showSingleDestination(Model model, @PathVariable String destinationName){
        model.addAttribute("destination", destinationRepo.findByDestinationName(destinationName).get());
        return "review";
    }
    @PostMapping("/destination/{destinationName}/addReview")
    private String addReview(@PathVariable String destinationName, @RequestParam int rating, @RequestParam String comment){
        Destination destination1 = destinationRepo.findByDestinationName(destinationName).get();
        String stars = "⭐";
        Review review = new Review(destination1.getDestinationName(),rating, stars, comment);
        reviewRepo.save(review);
        destination1.addReview(review);
        destinationRepo.save(destination1);

        return "redirect:/destination/" + destinationName;
    }

    @PostMapping("/destination/{destinationName}/addHashtag")
    private String addHashtag(@PathVariable String destinationName, @RequestParam String hashtag) {
        Optional<Hashtag> hashtag1 = hashtagRepo.findByHashtagIgnoreCase(hashtag);
        if (!hashtag1.isPresent()) {
            Hashtag hashtag2 = new Hashtag(hashtag);
            hashtagRepo.save(hashtag2);
            Destination destination1 = destinationRepo.findByDestinationName(destinationName).get();
            destination1.addHashtag(hashtag2);
            destinationRepo.save(destination1);
        }
        return "redirect:/destination/" + destinationName;
    }



//    @RequestMapping("/destination/{review}")
//    public String showDestinationReviews(Model model, @PathVariable Review review){
//        model.addAttribute("review",destinationRepo)
//    }
}

