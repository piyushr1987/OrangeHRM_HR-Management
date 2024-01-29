package com.orangehrm.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.pages.SystemUsersPage;

public class SystemUsersTest extends BaseClass {

	SystemUsersPage system;

	public SystemUsersTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		system = new SystemUsersPage();

	}

	@Test(priority = 1)
	public void testUsername() throws Exception {
		Logger.info("enter the username");
		try {
			system.enterValidUsername(prop.getProperty("loginUsername"));
		} catch (Exception e) {
			captureScreen(driver, "username");

		}
	}

	@Test(priority = 2)
	public void testPassword() throws Exception {
		Logger.info("enter the password");
		try {
			system.enterValidPassword(prop.getProperty("loginPassword"));
		} catch (Exception e) {
			captureScreen(driver, "password");

		}
	}

	@Test(priority = 3)
	public void testLogin() throws Exception {
		Logger.info("click on login");
		try {
			system.clickOnLogin();
		} catch (Exception e) {
			captureScreen(driver, "login");

		}
	}

	@Test(priority = 4)
	public void testLoginPage() throws Exception {
		if (system.validateLoginPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the dashboard");
		} else {
			captureScreen(driver, "dashboard");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testAdmin() throws Exception {
		Logger.info("click on admin");
		try {
			system.clickOnAdmin();
		} catch (Exception e) {
			captureScreen(driver, "admin");

		}
	}

	@Test(priority = 6)
	public void testSystemUsersPageNavigation() throws Exception {
		if (system.validateSystemUsersPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the system user page");
		} else {
			captureScreen(driver, "system user page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testUsernameOnAdminPage() throws Exception {
		Logger.info("enter the username on system page");
		try {
			system.enterUsername(prop.getProperty("username"));
		} catch (Exception e) {
			captureScreen(driver, "username");

		}
	}

	@Test(priority = 8)
	public void testSearch() throws Exception {
		Logger.info("click on search");
		try {
			system.clickOnSearch();
		} catch (Exception e) {
			captureScreen(driver, "search");

		}
	}

	@Test(priority = 9)
	public void testUsernameDisplayOnPage() throws Exception {

		WebElement username = driver
				.findElement(By.xpath("//div[@role='table']//div[@role='rowgroup'][2]//div[@role='cell'][4]"));
		String actUsername = username.getText();
		if (actUsername.contains("Virat")) {
			Assert.assertTrue(true);
			Logger.info("search username is sucessfully displayed");
		} else {
			captureScreen(driver, "valid username");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
