package guru.springframework.controllers;

import guru.springframework.Services.RecipeService;
import org.springframework.stereotype.Controller;

@Controller
public class RecipeController {

 private  final RecipeService recipeService;


    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }


}
