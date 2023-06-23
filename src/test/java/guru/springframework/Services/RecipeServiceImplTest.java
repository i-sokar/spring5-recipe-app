package guru.springframework.Services;

import guru.springframework.Model.Recipe;
import guru.springframework.Repos.RecipeRepo;
import junit.framework.TestCase;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.*;

public class RecipeServiceImplTest extends TestCase {
    RecipeServiceImpl recipeService;
    @Mock
    RecipeRepo recipeRepo;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService=new RecipeServiceImpl(recipeRepo);
    }

    public void testGetRecipes() {
        //add recipe
        Recipe recipe=new Recipe();
        HashSet recipeData=new HashSet<>();
        recipeData.add(recipe);
        //
        when(recipeRepo.findAll()).thenReturn(recipeData);
        Set<Recipe> recipes= recipeService.getRecipes();
        assertEquals(recipes.size(),1);
        verify(recipeRepo,times(1)).findAll();
    }
}