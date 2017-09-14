package com.howtocook.dao.interfeices;

import com.howtocook.domain.Ingredient;

/**
 * @author Viktar Kolbik
 * @since 7/31/17
 */
public interface IngredientDao {
    int add(Ingredient ingredient);
    void update(Ingredient ingredient);
    void remove(int ingredientId);
}
