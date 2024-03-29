import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({FoodTest.class, FoodWithToppingTest.class, CustomerOrderTest.class, CustomerOrderWithLoyaltyTest.class, FoodWithToppingIn1LineTest.class})
public class CompleteUnitTest {
}
