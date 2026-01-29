package org.evavdb1.smoothies.shop;

import org.evavdb1.smoothies.mixables.Food;
import org.evavdb1.smoothies.mixables.fruits.*;
import org.evavdb1.smoothies.mixables.vegetables.*;

public enum SmoothieRecipe {

    CITRUS(new Food[] {new Orange(1), new Orange(1), new Lemon(0.75)}),
    STRAWBERRYDREAM(new Food[] {new Strawberry(2), new Orange(1), new Orange(1), new Banana(1.25)}),
    BANANASLIDE(new Food[] {new Banana(1.25), new Banana(1.25), new Orange(1)}),
    VEGIESLURRY(new Food[] {new Banana(1.25), new Celery(1), new Spinach(1.25), new Apple(0.5)}),
    CUSTOMSMOOTHIE(new Food[4]);

    private double totalPrice;
    private Food[] recipe;


    SmoothieRecipe(Food[] recipe) {
        this.recipe = recipe;
    }


    public double getTotalPrice() {
        double totalPrice = 0;
        for (Food ingredient : recipe) {
                totalPrice = totalPrice + ingredient.getPricePerPiece();
        }
        return totalPrice;
    }

    public void mixIngredients() {
        for (Food ingredient : recipe) {
                ingredient.mix();
        }
    }
}
