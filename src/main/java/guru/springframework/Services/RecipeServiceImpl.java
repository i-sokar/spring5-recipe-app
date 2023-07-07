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
        Optional<Recipe> recipeOptional=recipeRepo.findById(1L);
        if (!recipeOptional.isPresent()){throw new RuntimeException("recipe not found");
        }
        return recipeOptional.get();
    }
}
