package org.wecancoeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.Repos.ReviewRepository;

import javax.persistence.Id;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class ReviewController {

    private ReviewRepository reviewRepo;

    public ReviewController(ReviewRepository reviewRepo) {
        this.reviewRepo = reviewRepo;
    }

    @RequestMapping("/reviews/{id}")
    private String showReview(Model model, @PathVariable long id) {
        model.addAttribute("review",reviewRepo.findById(id).get());
        return "review";
    }

}
