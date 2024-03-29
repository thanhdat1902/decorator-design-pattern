import org.example.decorator.food.Burger;
import org.example.decorator.Food;
import org.example.decorator.topping.Cheese;
import org.example.decorator.topping.Chili;
import org.example.decorator.topping.Ketchup;
import org.example.decorator.food.Fries;
import org.example.decorator.food.Hotdog;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodWithToppingTest {
    @Test
    public void testBurgerCheesePrice() {
        Food burger = new Burger();
        burger = new Cheese(burger);
        assertEquals(7.5, burger.getPrice(), 0.0001);
    }
    @Test
    public void testBurgerChiliPrice() {
        Food burger = new Burger();
        burger = new Chili(burger);
        assertEquals(6.7, burger.getPrice(), 0.0001);
    }
    @Test
    public void testBurgerKetchupPrice() {
        Food burger = new Burger();
        burger = new Ketchup(burger);
        assertEquals(5.2, burger.getPrice(), 0.0001);
    }
    @Test
    public void testBurgerKetchupCheeseChiliPrice() {
        Food burger = new Burger();
        burger = new Cheese(burger);
        burger = new Chili(burger);
        burger = new Ketchup(burger);
        assertEquals(9.4, burger.getPrice(), 0.0001);
    }

    @Test
    public void testFriesCheesePrice() {
        Food fries = new Fries();
        fries = new Cheese(fries);
        assertEquals(6.0, fries.getPrice(), 0.0001);
    }

    @Test
    public void testHotdogChiliPrice() {
        Food hotdog = new Hotdog();
        hotdog = new Chili(hotdog);
        assertEquals(3.2, hotdog.getPrice(), 0.0001);
    }
}
