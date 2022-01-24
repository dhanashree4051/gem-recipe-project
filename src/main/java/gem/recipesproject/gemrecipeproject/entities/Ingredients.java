package gem.recipesproject.gemrecipeproject.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Ingredients
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingredientId;

    private String description;
    private BigDecimal amount;

    @ManyToOne(fetch = FetchType.EAGER)
    private Recipe recipe;

    @OneToOne
    private UnitOfMeasure unitOfMeasure;

    public Long getIngredientId()
    {
        return ingredientId;
    }

    public void setIngredientId(Long ingredientId)
    {
        this.ingredientId = ingredientId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }

    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
