package org.example.decorator.topping;

import org.example.decorator.Food;

public class Cheese implements Food {
    private Food foodBase;
    public Cheese(Food foodItem) {
        this.foodBase = foodItem;
    }
    private double toppingCost = 2.5;
    @Override
    public double getPrice() {
        return foodBase.getPrice() + toppingCost;
    }

    @Override
    public String getDetails() {
        return foodBase.getDetails() + " -- Mozzarella Cheese";
    }
}
