package gem.recipeproject.gemrecipeproject.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long recipeId;

   private String description;
   private int prepTime;
   private int cookTime;
   private int serving;
   private String source;
   private String url;
   private String direction;

   @Enumerated(value = EnumType.STRING)
   private Difficulty difficulty;

   @Lob
   private Byte[] image;

   @OneToOne(cascade = CascadeType.ALL)
   private Notes notes;

   @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
   private Set<Ingredients> ingredients;

  @ManyToMany
   @JoinTable(name = "recipe_category",
           joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
   private Set<Category> categories;

   public Long getRecipeId() {
      return recipeId;
   }

   public void setRecipeId(Long recipeId) {
      this.recipeId = recipeId;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getPrepTime() {
      return prepTime;
   }

   public void setPrepTime(int prepTime) {
      this.prepTime = prepTime;
   }

   public int getCookTime() {
      return cookTime;
   }

   public void setCookTime(int cookTime) {
      this.cookTime = cookTime;
   }

   public int getServing() {
      return serving;
   }

   public void setServing(int serving) {
      this.serving = serving;
   }

   public String getSource() {
      return source;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getUrl() {
      return url;
   }

   public void setUrl(String url) {
      this.url = url;
   }

   public String getDirection() {
      return direction;
   }

   public void setDirection(String direction) {
      this.direction = direction;
   }

   public Byte[] getImage() {
      return image;
   }

   public void setImage(Byte[] image) {
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

   public Difficulty getDifficulty() {
      return difficulty;
   }

   public void setDifficulty(Difficulty difficulty) {
      this.difficulty = difficulty;
   }

   public Set<Category> getCategories() {
      return categories;
   }

   public void setCategories(Set<Category> categories) {
      this.categories = categories;
   }
}
