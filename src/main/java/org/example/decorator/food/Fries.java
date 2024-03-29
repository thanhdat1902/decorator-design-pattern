package org.example.decorator.food;

import org.example.decorator.Food;

public class Fries implements Food {
    private double price = 3.5;

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDetails() {
        return "Fries";
    }
}
