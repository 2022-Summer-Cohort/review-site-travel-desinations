package org.wecancoeit.reviews.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.Repos.CategoryRepository;

@Controller
public class CategoryController {
    private CategoryRepository categoryRepo;

    public CategoryController(CategoryRepository categoryRepo) {
        this.categoryRepo = categoryRepo;
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

}
