package detail;

import org.example.decorator.Food;
import org.example.decorator.food.Burger;
import org.example.decorator.topping.Cheese;
import org.example.decorator.topping.Chili;
import org.example.decorator.topping.Ketchup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodWithToppingDetailTest {
    @Test
    public void testBurgerKetchupCheeseChiliDetails() {
        Food burger = new Burger();
        burger = new Cheese(burger);
        burger = new Chili(burger);
        burger = new Ketchup(burger);
        assertEquals("Burger -- Mozzarella Cheese -- Brazilian Chili -- Ketchup", burger.getDetails());
    }
}
