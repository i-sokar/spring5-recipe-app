package guru.springframework.Model;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CategoryTest {

    Category category;
@Before
    public  void setUp(){
        category=new Category();
    }

    @Test
    public void testGetId() {
    Long idVal=4L;
    category.setId(idVal);
    assertEquals(idVal,category.getId());
    }

    @Test
    public void testGetDescription() {
    }

    @Test
    public void testGetRecipes() {
    }
}