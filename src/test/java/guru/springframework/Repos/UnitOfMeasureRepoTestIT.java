package guru.springframework.Repos;

import guru.springframework.Model.UnitOfMeasure;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepoTestIT extends TestCase {


    @Autowired
    UnitOfMeasureRepo unitOfMeasureRepo;

    public void setUp() throws Exception {
        super.setUp();
    }
@Test
    public void testFindByDescription() throws Exception {
    Optional<UnitOfMeasure> unitOfMeasure=unitOfMeasureRepo.findByDescription("Teaspoon");
    assertEquals("Teaspoon",unitOfMeasure.get().getDescription());


    }
@Test
    public void testFindByDescriptionCup() throws Exception{

        Optional<UnitOfMeasure> unitOfMeasure=unitOfMeasureRepo.findByDescription("Cup");

        assertEquals("Cup",unitOfMeasure.get().getDescription());

    }
}