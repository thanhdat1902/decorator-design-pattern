import detail.FoodDetailTest;
import detail.FoodWithToppingDetailTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import price.*;

@Suite
@SelectClasses({FoodPriceTest.class, FoodWithToppingPriceTest.class, CustomerOrderPriceTest.class, CustomerOrderWithLoyaltyPriceTest.class, FoodWithToppingIn1LinePriceTest.class, FoodDetailTest.class, FoodWithToppingDetailTest.class})
public class CompleteUnitTest {
}
