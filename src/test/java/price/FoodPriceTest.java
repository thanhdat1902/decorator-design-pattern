package price;

import org.example.decorator.food.Burger;
import org.example.decorator.Food;
import org.example.decorator.food.Fries;
import org.example.decorator.food.Hotdog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodPriceTest {
    @Test
    public void testBurgerPrice() {
        Food burger = new Burger();
        assertEquals(5.0, burger.getPrice(), 0.0001);
    }
    @Test
    public void testFriesPrice() {
        Food burger = new Fries();
        assertEquals(3.5, burger.getPrice(), 0.0001);
    }
    @Test
    public void testHotdogPrice() {
        Food burger = new Hotdog();
        assertEquals(1.5, burger.getPrice(), 0.0001);
    }
}
