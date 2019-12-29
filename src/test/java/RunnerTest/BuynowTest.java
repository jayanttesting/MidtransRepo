package RunnerTest;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.OrderSummary;
import com.qa.pages.Payment;
import com.qa.pages.ShoppingCart;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class BuynowTest extends TestBase {

	ShoppingCart shoppingCart;
	OrderSummary orderssummary;
	Payment payment;
	String sheetname = "Payment";

	public BuynowTest() {
		super();
	}

	@BeforeTest
	public void setup() {
		initialize();
		shoppingCart = new ShoppingCart();
		orderssummary = new OrderSummary();

	}

	@Test(priority = 1)
	public void MainPageTitleTest() {
		String title = shoppingCart.validateLoginPageTitle();
		AssertJUnit.assertEquals(title, "Sample Store");

	}

	@Test(priority = 2)
	public void enterdetails_cart() {
		shoppingCart.enterdetails_in_shoppingcart();

	}

	@Test(priority = 3)
	public void verify_order_summary() throws InterruptedException {

		// orderssummary.validate_logo_on_order();
		orderssummary.ordersummay_details();
	}

	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = TestUtil.getTestData(sheetname);
		return data;
	}

	@Test(priority = 4, dataProvider = "getTestData")
	public void ordertest(String cardno, String edate, String cvv) {
		payment.makepayment(cardno, edate, cvv);

	}
	// @AfterMethod
	// public void teardown() {
	// driver.quit();
	// }
}
