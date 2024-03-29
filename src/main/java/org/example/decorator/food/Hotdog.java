package org.example.decorator.food;

import org.example.decorator.Food;

public class Hotdog implements Food {
    private double price = 1.5;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDetails() {
        return "Hot dog";
    }
}
