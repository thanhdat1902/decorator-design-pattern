package org.example.decorator.topping;

import org.example.decorator.Food;

public class Chili implements Food {
    private Food foodBase;
    private double toppingCost = 1.7;
    public Chili(Food foodItem) {
        this.foodBase = foodItem;
    }
    @Override
    public double getPrice() {
        return foodBase.getPrice() + toppingCost;
    }

    @Override
    public String getDetails() {
        return foodBase.getDetails() + " -- Brazilian Chili";
    }
}
