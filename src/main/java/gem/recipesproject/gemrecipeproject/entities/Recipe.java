package gem.recipesproject.gemrecipeproject.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipeId;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String direction;
   // private Difficulty difficulty;

    @Lob
    @Column(name = "image", columnDefinition = "BLOB")
    private Byte[] image;

    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;

    @OneToMany( mappedBy = "recipe", cascade = CascadeType.ALL)
    private Set<Ingredients> ingredients;

    public Long getRecipeId()
    {
        return recipeId;
    }

    public void setRecipeId(Long recipeId)
    {
        this.recipeId = recipeId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getPrepTime()
    {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime)
    {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime)
    {
        this.cookTime = cookTime;
    }

    public Integer getServings()
    {
        return servings;
    }

    public void setServings(Integer servings)
    {
        this.servings = servings;
    }

    public String getSource()
    {
        return source;
    }

    public void setSource(String source)
    {
        this.source = source;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getDirection()
    {
        return direction;
    }

    public void setDirection(String direction)
    {
        this.direction = direction;
    }

    public Byte[] getImage()
    {
        return image;
    }

    public void setImage(Byte[] image)
    {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Set<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}
