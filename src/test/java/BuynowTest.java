import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.OrderSummary;
import com.qa.pages.ShoppingCart;
import com.qa.util.TestBase;

public class BuynowTest extends TestBase {
	ShoppingCart shoppingCart;
	OrderSummary orderssummary;

	public BuynowTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		shoppingCart = new ShoppingCart();
		orderssummary = new OrderSummary();

	}

	@Test(priority=1)
	public void MainPageTitleTest() {
		String title = shoppingCart.validateLoginPageTitle();
		Assert.assertEquals(title, "Sample Store");

	}

	@Test(priority=2)
	public void enterdetails_cart() {
		shoppingCart.enterdetails_in_shoppingcart();

	}

	@Test(priority=3)
	public void verify_order_summary() {
		// orderssummary.validate_logo_on_order();
		orderssummary.ordersummay_details();
	}

	// @AfterMethod
	// public void teardown() {
	// driver.quit();
	// }
}
