package org.example.decorator.food;

import org.example.decorator.Food;

public class Burger implements Food {
    private double price = 5.0;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDetails() {
        return "Burger";
    }
}
