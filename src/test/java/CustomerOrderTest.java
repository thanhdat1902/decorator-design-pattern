import org.example.decorator.CustomerOrder;
import org.example.decorator.topping.Cheese;
import org.example.decorator.food.Burger;
import org.example.decorator.Food;
import org.example.decorator.food.Fries;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CustomerOrderTest {
    @Test
    public void testCustomerOrderWithoutLoyalty() {
        CustomerOrder order = new CustomerOrder("Dat", null);
        Food burger = new Burger();
        Food fries = new Fries();

        burger = new Cheese(burger);

        order.addFoodToOrder(burger);
        order.addFoodToOrder(fries);

        assertEquals(11.0, order.getOrderCost(), 0.001);
    }
}
