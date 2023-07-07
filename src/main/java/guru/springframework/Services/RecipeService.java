package guru.springframework.Services;

import guru.springframework.Model.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);

}
