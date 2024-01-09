package guru.springframework.Services;

import guru.springframework.Model.Recipe;
import guru.springframework.Repos.RecipeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepo recipeRepo;

    public RecipeServiceImpl(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("service called");
        Set<Recipe>recipeSet=new HashSet<>();
        recipeRepo.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }

    @Override
    public Recipe findById(Long l) {
        Optional<Recipe> recipeOptional = recipeRepo.findById(l);

        if (!recipeOptional.isPresent()) {
            throw new RuntimeException("Recipe not found for ID: " + l);
        }

        return recipeOptional.get();
    }

}
