package com.juaracoding.pageobjecttwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.juaracoding.pageobjecttwo.drivers.DriverSingleton;
import com.juaracoding.pageobjecttwo.pages.PostTest19;

public class TestPostTest19{

	public static WebDriver driver;
	private PostTest19 posttest19;

	@BeforeClass
	public void setUp() {
		DriverSingleton.getInstace("Chrome");
		driver = DriverSingleton.getDriver();

		String url = "https://shop.demoqa.com/my-account/";
		driver.get(url);

	}

	@BeforeMethod
	public void pageObjectTwo() {
		posttest19 = new PostTest19();
	}

	@Test
	public void testPostTestNineteen() {

		delay(3);
		scroll(700);
		posttest19.usernameReg();
		posttest19.emailReg();
		posttest19.passwordReg();
		posttest19.regist();
		System.out.println("You have successfully Registered a New Account.");

		delay(3);
		posttest19.usernameLogin();
		posttest19.passwordLogin();
		posttest19.btnLogin();
		System.out.println("Your newly created account is successfully logged in.");

		delay(3);
		posttest19.btnOrder();
		System.out.println("You're entering your order page.");
		posttest19.btnBrowse();
		System.out.println("Do you wish to browse to other products?");
		posttest19.search();
		posttest19.searchInput();
		System.out.println("You're successfully search of your keyword");

		delay(3);
		posttest19.compareOne();
		System.out.println("You have added a product to compare list.");
		delay(3);
		posttest19.closeWindow();

		delay(3);
		posttest19.clickProductTitle();
		System.out.println("You are looking on Product detail page.");

		scroll(700);

		delay(3);
		posttest19.compareTwo();
		System.out.println("You have added product 2 to compare list.");

		delay(3);
		driver.switchTo().frame(driver.findElement(By.cssSelector("#cboxLoadedContent > iframe")));

		delay(3);
		posttest19.selectProduct();
		System.out.println("You have selected a product detail.");
		
		delay(3);
		scroll(700);
		posttest19.addCart();
		System.out.println("You have added a product to a cart.");
		posttest19.viewCart();
		System.out.println("You viewed your cart.");
		
		scroll(700);
		posttest19.proceedCheckout();
		System.out.println("You proceed your cart to Check out.");
		delay(3);
		
		scroll(700);
		posttest19.firstName();
		posttest19.lastName();
		posttest19.companyName();
		scroll(300);
		
		delay(3);
//		postTestNineteen.selectIndo();
		
		delay(3);
		posttest19.houseNumber();
		posttest19.suiteUnit();
		posttest19.townCity();
		
		delay(3);
		posttest19.selectProvice();
		posttest19.inputProvince();
		
		delay(3);
		posttest19.inputPostcode();
		posttest19.inputPhone();
		posttest19.inputNote();
		System.out.println("You have successfully entered you billing detail.");
		
		delay(3);
		scroll(-300);
		posttest19.agreeBox();
		
		delay(3);
		posttest19.btnPlacedOrder();
		System.out.println("Congratulation! your order was successfully created.");
	
		delay(5);

	}

	@AfterClass
	public void closeBrowser() {
		delay(3);
		driver.quit();
	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void scroll(int vertical) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + vertical + ")");
	}
}
