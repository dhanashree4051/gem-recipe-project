package gem.recipesproject.gemrecipeproject.entities;

import javax.persistence.*;

@Entity
public class Notes
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notesId;

    @Lob
    @Column(name = "recipeNotes", columnDefinition = "CLOB")
    private String recipeNotes;

    @OneToOne
    private Recipe recipe;

    public Long getNotesId()
    {
        return notesId;
    }

    public void setNotesId(Long notesId)
    {
        this.notesId = notesId;
    }

    public String getNotes()
    {
        return recipeNotes;
    }

    public void setNotes(String notes)
    {
        this.recipeNotes = notes;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

}
