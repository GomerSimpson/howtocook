package com.howtocook.domain;

/**
 * @author Viktar Kolbik
 * @since 7/31/17
 */
public class Ingredient {
    private int ingredientId;
    private String name;
    private int amount;
    private int unit;

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingredient that = (Ingredient) o;

        if (ingredientId != that.ingredientId) return false;
        if (amount != that.amount) return false;
        if (unit != that.unit) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = ingredientId;
        result = 31 * result + name.hashCode();
        result = 31 * result + amount;
        result = 31 * result + unit;
        return result;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientId=" + ingredientId +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", unit=" + unit +
                '}';
    }
}
