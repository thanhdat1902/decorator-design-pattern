package org.example;

import org.example.decorator.*;
import org.example.decorator.topping.Cheese;
import org.example.decorator.topping.Chili;
import org.example.decorator.topping.Ketchup;
import org.example.decorator.food.Burger;
import org.example.decorator.Food;
import org.example.decorator.food.Fries;
import org.example.decorator.food.Hotdog;

public class Driver {
    public static void main(String[] args) {
        //   Create food base
        Food burgerOrder1 = new Cheese(new Ketchup(new Burger()));
        Food friesOrder1 = new Chili(new Fries());
        Food hotDogOrder2 = new Hotdog();

        //   Create food order 2
        hotDogOrder2 = new Cheese(hotDogOrder2);


        CustomerOrder order1 = new CustomerOrder("Dat", new LoyaltyStatus(LoyaltyStatus.LOYALTY_STATUS.GOLD));
        order1.addFoodToOrder(burgerOrder1);
        order1.addFoodToOrder(friesOrder1);

        CustomerOrder order2 = new CustomerOrder("Nguyen", new LoyaltyStatus(LoyaltyStatus.LOYALTY_STATUS.EXECUTIVE));
        order2.addFoodToOrder(hotDogOrder2);


        order1.printOrderDetail();
        order2.printOrderDetail();
    }
}