package detail;

import org.example.decorator.Food;
import org.example.decorator.food.Burger;
import org.example.decorator.food.Fries;
import org.example.decorator.food.Hotdog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodDetailTest {
    @Test
    public void testFriesDetails() {
        Food burger = new Fries();
        assertEquals("Fries", burger.getDetails());
    }
    @Test
    public void testHotdogDetails() {
        Food burger = new Hotdog();
        assertEquals("Hot dog", burger.getDetails());
    }
    @Test
    public void testBurgerDetails() {
        Food burger = new Burger();
        assertEquals("Burger", burger.getDetails());
    }
}
