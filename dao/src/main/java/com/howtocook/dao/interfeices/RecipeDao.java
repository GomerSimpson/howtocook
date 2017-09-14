package com.howtocook.dao.interfeices;

import com.howtocook.domain.Recipe;

/**
 * @author Viktar Kolbik
 * @since 7/31/17
 */
public interface RecipeDao {
    int add(Recipe recipe);
    void update(Recipe recipe);
    void remove(int recipeId);
}