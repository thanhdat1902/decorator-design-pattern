package org.example.decorator.topping;

import org.example.decorator.Food;

public class Ketchup implements Food {
    private Food foodBase;
    private double toppingCost = 0.2;
    public Ketchup(Food foodItem) {
        this.foodBase = foodItem;
    }
    @Override
    public double getPrice() {
        return foodBase.getPrice() + toppingCost;
    }

    @Override
    public String getDetails() {
        return foodBase.getDetails() + " -- Ketchup";
    }
}
