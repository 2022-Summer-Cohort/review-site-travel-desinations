package org.wecancoeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.Repos.DestinationRepository;

@Controller
public class DestinationController {
  private DestinationRepository destinationRepo;

    public DestinationController(DestinationRepository destinationRepo) {
        this.destinationRepo = destinationRepo;
    }

    @RequestMapping("/destination/{destinationName}")
    public String showSingleDestination(Model model, @PathVariable String destinationName){
        model.addAttribute("destination", destinationRepo.findByDestinationName(destinationName));
        return "review";
    }
}
