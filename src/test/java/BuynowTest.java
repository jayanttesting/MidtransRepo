import org.testng.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.ShoppingCart;
import com.qa.util.TestBase;

public class BuynowTest extends TestBase {
	ShoppingCart shoppingCart;

	public BuynowTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialize();
		shoppingCart = new ShoppingCart();

	}

	@Test
	public void MainPageTitleTest() {
		String title = shoppingCart.validateLoginPageTitle();
		Assert.assertEquals(title, "Sample Store");

	}

	@Test
	public void enterdetails_cart() {
		shoppingCart.enterdetails_in_shoppingcart();

	}

	// @AfterMethod
	// public void teardown() {
	// driver.quit();
	// }
}
