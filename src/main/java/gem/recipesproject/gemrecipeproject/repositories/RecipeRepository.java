package gem.recipesproject.gemrecipeproject.repositories;

import gem.recipesproject.gemrecipeproject.entities.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe , Long>
{
}
