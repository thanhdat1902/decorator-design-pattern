package price;

import org.example.decorator.Food;
import org.example.decorator.topping.Cheese;
import org.example.decorator.topping.Chili;
import org.example.decorator.topping.Ketchup;
import org.example.decorator.food.Fries;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodWithToppingIn1LinePriceTest {
    @Test
    public void testFriesCheeseChiliKetchupPrice() {
        Food fries = new Cheese(new Chili( new Ketchup(new Fries())));
        assertEquals(7.9, fries.getPrice(), 0.0001);
    }
}
