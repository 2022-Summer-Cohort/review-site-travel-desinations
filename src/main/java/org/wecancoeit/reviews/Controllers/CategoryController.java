package org.wecancoeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.Repos.CategoryRepository;
import org.wecancoeit.reviews.Repos.DestinationRepository;

@Controller
public class CategoryController {
    private CategoryRepository categoryRepo;
    private DestinationRepository destinationRepo;

    public CategoryController(CategoryRepository categoryRepo, DestinationRepository destinationRepo) {
        this.categoryRepo = categoryRepo;
        this.destinationRepo = destinationRepo;
    }

    @RequestMapping("/")
    public String showAllCategories(Model model){
        model.addAttribute("categories",categoryRepo.findAll());
        return "categories";
    }

    @RequestMapping("/category/{categoryName}")
    public String showCategoryByName(Model model, @PathVariable String categoryName){
        model.addAttribute("category", categoryRepo.findByCategoryName(categoryName));
        return "category";
    }

//    @RequestMapping("/category/{destinationName}")
//    public String showDestinationByCategory(Model model, @PathVariable String destinationName){
//        model.addAttribute("destination", destinationRepo.findByDestinationName(destinationName));
//        return "review";
//    }

}
