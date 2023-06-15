package guru.springframework.Repos;

import guru.springframework.Model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepo extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String description);
}
