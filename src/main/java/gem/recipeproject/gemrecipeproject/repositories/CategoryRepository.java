package gem.recipeproject.gemrecipeproject.repositories;

import gem.recipeproject.gemrecipeproject.entities.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long>
{
    Optional<Category> findById(Long categoryId);
}
