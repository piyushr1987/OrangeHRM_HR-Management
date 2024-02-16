package com.orangehrm.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.pages.MyInfoPage;

public class MyInfoTest extends BaseClass {

	MyInfoPage info;

	public MyInfoTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		info = new MyInfoPage();

	}

	@Test(priority = 1)
	public void testUsername() throws Exception {
		Logger.info("enter the username");
		try {
			info.enterValidUsername(prop.getProperty("loginUsername"));
		} catch (Exception e) {
			captureScreen(driver, "username");

		}
	}

	@Test(priority = 2)
	public void testPassword() throws Exception {
		Logger.info("enter the password");
		try {
			info.enterValidPassword(prop.getProperty("loginPassword"));
		} catch (Exception e) {
			captureScreen(driver, "password");

		}
	}

	@Test(priority = 3)
	public void testLogin() throws Exception {
		Logger.info("click on login");
		try {
			info.clickOnLogin();
		} catch (Exception e) {
			captureScreen(driver, "login");

		}
	}

	@Test(priority = 4)
	public void testLoginPage() throws Exception {
		if (info.validateLoginPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the dashboard");
		} else {
			captureScreen(driver, "dashboard");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testMyInfo() throws Exception {
		Logger.info("click on my info");
		try {
			info.clickOnMyInfo();
		} catch (Exception e) {
			captureScreen(driver, "my info");

		}
	}

	@Test(priority = 6)
	public void testMyInfoPage() throws Exception {
		if (info.validateMyInfoPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the my info page");
		} else {
			captureScreen(driver, "my info page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testFirstName() throws Exception {
		Logger.info("enter the first name");
		try {
			info.enterFirstName(prop.getProperty("firstName"));
		} catch (Exception e) {
			captureScreen(driver, "first name");

		}
	}

	@Test(priority = 8)
	public void testLastName() throws Exception {
		Logger.info("enter the last name");
		try {
			info.enterLastName(prop.getProperty("lastName"));
		} catch (Exception e) {
			captureScreen(driver, "last name");

		}
	}

	@Test(priority = 9)
	public void testDateOfBirth() throws Exception {
		Logger.info("enter the date of birth");
		try {
			info.enterDateOfBirth(prop.getProperty("birthDate"));
		} catch (Exception e) {
			captureScreen(driver, "date of birth");

		}
	}

	@Test(priority = 10)
	public void testSave() throws Exception {
		Logger.info("click on save");
		try {
			info.clickOnSave();
		} catch (Exception e) {
			captureScreen(driver, "save");

		}
	}

	@Test(priority = 11)
	public void testEmployeeFullName() throws Exception {

		WebElement empName = driver.findElement(By.xpath("//div[@class='orangehrm-edit-employee-name']/h6"));
		String actName = empName.getText();

		WebElement empNameOnMenu = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//p"));
		String expName = empNameOnMenu.getText();
		try {
			Assert.assertEquals(actName, expName);
			Logger.info("actual and expected employee name is matched");
		} catch (Exception e) {
			captureScreen(driver, "employee name");

		}

	}

	@Test(priority = 12)
	public void testMenu() throws Exception {
		Logger.info("click on menu");
		try {
			info.clickOnMenu();
		} catch (Exception e) {
			captureScreen(driver, "menu");

		}
	}

	@Test(priority = 13)
	public void testLogOut() throws Exception {
		Logger.info("click on logout");
		try {
			info.clickOnLogOut();
		} catch (Exception e) {
			captureScreen(driver, "log out");

		}
	}

	@Test(priority = 14)
	public void testHomePage() throws Exception {

		String actURL = driver.getCurrentUrl();
		String expURL = prop.getProperty("url");
		try {
			Assert.assertEquals(actURL, expURL);
			Logger.info("actual and expected URL is matched");
		} catch (Exception e) {
			captureScreen(driver, "employee name");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
