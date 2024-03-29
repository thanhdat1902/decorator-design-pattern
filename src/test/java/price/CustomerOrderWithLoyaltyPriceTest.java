package price;

import org.example.decorator.CustomerOrder;
import org.example.decorator.Food;
import org.example.decorator.LoyaltyStatus;
import org.example.decorator.topping.Cheese;
import org.example.decorator.topping.Chili;
import org.example.decorator.topping.Ketchup;
import org.example.decorator.food.Burger;
import org.example.decorator.food.Fries;
import org.example.decorator.food.Hotdog;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerOrderWithLoyaltyPriceTest {
    @ParameterizedTest
    @EnumSource(value = LoyaltyStatus.LOYALTY_STATUS.class, names = {"EXECUTIVE"})
    public void testCustomerOrderExecutive(LoyaltyStatus.LOYALTY_STATUS status) {

        CustomerOrder order = new CustomerOrder("Dat", new LoyaltyStatus(status));
        Food burger = new Burger();
        Food fries = new Fries();
        Food hotDog = new Hotdog();

        //   Create food order 1
        burger = new Cheese(burger);
        burger = new Ketchup(burger);
        fries = new Chili(fries);


        order.addFoodToOrder(burger);
        order.addFoodToOrder(fries);
        order.addFoodToOrder(hotDog);

        order.setLoyaltyStatus(new LoyaltyStatus(status));

        assertEquals(11.52, order.getOrderCost(), 0.001);
    }

    @ParameterizedTest
    @EnumSource(value = LoyaltyStatus.LOYALTY_STATUS.class, names = {"GOLD"})
    public void testCustomerOrderGold(LoyaltyStatus.LOYALTY_STATUS status) {
        CustomerOrder order = new CustomerOrder("Dat", new LoyaltyStatus(status));
        Food burger = new Burger();
        Food fries = new Fries();
        Food hotDog = new Hotdog();

        //   Create food order 1
        burger = new Cheese(burger);
        burger = new Ketchup(burger);
        fries = new Chili(fries);


        order.addFoodToOrder(burger);
        order.addFoodToOrder(fries);
        order.addFoodToOrder(hotDog);

        order.setLoyaltyStatus(new LoyaltyStatus(LoyaltyStatus.LOYALTY_STATUS.GOLD));

        assertEquals(12.96, order.getOrderCost(), 0.001);
    }
}
