package gem.recipeproject.gemrecipeproject.repositories;

import gem.recipeproject.gemrecipeproject.entities.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long>
{
}
