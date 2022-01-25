package gem.recipesproject.gemrecipeproject.repositories;

import gem.recipesproject.gemrecipeproject.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepositoty extends CrudRepository<Category,Long>
{
}
