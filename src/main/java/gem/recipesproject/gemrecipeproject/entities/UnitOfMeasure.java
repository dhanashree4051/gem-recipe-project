package gem.recipesproject.gemrecipeproject.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
public class UnitOfMeasure
{
    private String uom;

    @OneToOne
    private Set<Ingredients> ingredients;
}
