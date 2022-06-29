package org.wecancoeit.reviews.Controllers;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.Repos.HashtagRepository;

@Controller
public class HashtagController {
    private HashtagRepository hashtagRepo;

    public HashtagController(HashtagRepository hashtagRepo) {
        this.hashtagRepo = hashtagRepo;
    }
    @RequestMapping("/hashtags")
    public String showAllHashtags(Model model){
        model.addAttribute("hashtags",hashtagRepo.findAll());
        return "hashtags";
    }
    @RequestMapping("/hashtags/{hashtag}")
    public String showOneHashtag(Model model, @PathVariable String hashtag){
        model.addAttribute("hashtag", hashtagRepo.findByHashtagIgnoreCase(hashtag).get());
        return "hashtag";
    }
}
