package gem.recipeproject.gemrecipeproject.repositories;

import gem.recipeproject.gemrecipeproject.entities.Ingredients;
import org.springframework.data.repository.CrudRepository;

public interface IngredientsRepository extends CrudRepository<Ingredients,Long>
{
}
