package gem.recipeproject.gemrecipeproject.repositories;

import gem.recipeproject.gemrecipeproject.entities.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long>
{
    Optional<UnitOfMeasure> findById(Long unitOfMeasureId);
}
