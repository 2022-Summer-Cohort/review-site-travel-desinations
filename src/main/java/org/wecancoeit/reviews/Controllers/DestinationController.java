package org.wecancoeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.Repos.DestinationRepository;

@Controller
public class DestinationController {
  private DestinationRepository destinationRepo;

    public DestinationController(DestinationRepository destinationRepo) {
        this.destinationRepo = destinationRepo;
    }

    @RequestMapping(/"destination"/{id})
}
