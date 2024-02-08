package com.orangehrm.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.pages.LeavePage;

public class LeaveTest extends BaseClass {

	LeavePage leave;

	public LeaveTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		leave = new LeavePage();

	}

	@Test(priority = 1)
	public void testUsername() throws Exception {
		Logger.info("enter the username");
		try {
			leave.enterValidUsername(prop.getProperty("loginUsername"));
		} catch (Exception e) {
			captureScreen(driver, "username");

		}
	}

	@Test(priority = 2)
	public void testPassword() throws Exception {
		Logger.info("enter the password");
		try {
			leave.enterValidPassword(prop.getProperty("loginPassword"));
		} catch (Exception e) {
			captureScreen(driver, "password");

		}
	}

	@Test(priority = 3)
	public void testLogin() throws Exception {
		Logger.info("click on login");
		try {
			leave.clickOnLogin();
		} catch (Exception e) {
			captureScreen(driver, "login");

		}
	}

	@Test(priority = 4)
	public void testLoginPage() throws Exception {
		if (leave.validateLoginPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the dashboard");
		} else {
			captureScreen(driver, "dashboard");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testLeave() throws Exception {
		Logger.info("click on Leave");
		try {
			leave.clickOnLeave();
		} catch (Exception e) {
			captureScreen(driver, "Leave");

		}
	}

	@Test(priority = 6)
	public void testLeavePage() throws Exception {
		if (leave.validateLeavePageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the leave page");
		} else {
			captureScreen(driver, "leave page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testApplyLeave() throws Exception {
		Logger.info("click on apply leave");
		try {
			leave.clickOnApplyLeave();
		} catch (Exception e) {
			captureScreen(driver, "apply leave");

		}
	}

	@Test(priority = 8)
	public void testApplyPage() throws Exception {
		if (leave.validateApplyPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the apply leave page");
		} else {
			captureScreen(driver, "leave page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testLeaveType() throws Exception {
		Logger.info("enter the leave type");
		try {
			leave.enterLeaveType(prop.getProperty("leaveType"));
		} catch (Exception e) {
			captureScreen(driver, "leave type");

		}
	}

	@Test(priority = 10)
	public void testFromDate() throws Exception {
		Logger.info("enter the from date");
		try {
			leave.enterFromDate(prop.getProperty("fromDate"));
		} catch (Exception e) {
			captureScreen(driver, "from date");

		}
	}

	@Test(priority = 11)
	public void testToDate() throws Exception {
		Logger.info("enter the to date");
		try {
			leave.enterToDate(prop.getProperty("toDate"));
		} catch (Exception e) {
			captureScreen(driver, "to date");

		}
	}

	@Test(priority = 12)
	public void testApply() throws Exception {
		Logger.info("click on apply");
		try {
			leave.clickOnApply();
		} catch (Exception e) {
			captureScreen(driver, "apply");

		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
