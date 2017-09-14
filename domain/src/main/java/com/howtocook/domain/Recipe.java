package com.howtocook.domain;

/**
 * @author Viktar Kolbik
 * @since 7/26/17
 */
public class Recipe {

    private int recipeId;
    private String name;
    private int calories;
    private int protein;
    private int fat;
    private int carbohydrates;
    private String type;
    private String description;

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recipe recipe = (Recipe) o;

        if (recipeId != recipe.recipeId) return false;
        if (calories != recipe.calories) return false;
        if (protein != recipe.protein) return false;
        if (fat != recipe.fat) return false;
        if (carbohydrates != recipe.carbohydrates) return false;
        if (!name.equals(recipe.name)) return false;
        if (!type.equals(recipe.type)) return false;
        return description.equals(recipe.description);
    }

    @Override
    public int hashCode() {
        int result = recipeId;
        result = 31 * result + name.hashCode();
        result = 31 * result + calories;
        result = 31 * result + protein;
        result = 31 * result + fat;
        result = 31 * result + carbohydrates;
        result = 31 * result + type.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbohydrates=" + carbohydrates +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
