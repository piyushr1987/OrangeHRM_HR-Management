package com.orangehrm.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.pages.TimePage;

public class TimeTest extends BaseClass {
	TimePage time;

	public TimeTest() throws IOException {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		time = new TimePage();

	}

	@Test(priority = 1)
	public void testUsername() throws Exception {
		Logger.info("enter the username");
		try {
			time.enterValidUsername(prop.getProperty("loginUsername"));
		} catch (Exception e) {
			captureScreen(driver, "username");

		}
	}

	@Test(priority = 2)
	public void testPassword() throws Exception {
		Logger.info("enter the password");
		try {
			time.enterValidPassword(prop.getProperty("loginPassword"));
		} catch (Exception e) {
			captureScreen(driver, "password");

		}
	}

	@Test(priority = 3)
	public void testLogin() throws Exception {
		Logger.info("click on login");
		try {
			time.clickOnLogin();
		} catch (Exception e) {
			captureScreen(driver, "login");

		}
	}

	@Test(priority = 4)
	public void testLoginPage() throws Exception {
		if (time.validateLoginPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the dashboard");
		} else {
			captureScreen(driver, "dashboard");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testTime() throws Exception {
		Logger.info("click on Time");
		try {
			time.clickOnTime();
		} catch (Exception e) {
			captureScreen(driver, "Time");

		}
	}

	@Test(priority = 6)
	public void testTimePage() throws Exception {
		if (time.validateTimePageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the time page");
		} else {
			captureScreen(driver, "time page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testTimesheet() throws Exception {
		Logger.info("click on timesheet");
		try {
			time.clickOnTimeSheet();
		} catch (Exception e) {
			captureScreen(driver, "Timesheet");

		}
	}

	@Test(priority = 8)
	public void testMyTimesheet() throws Exception {
		Logger.info("click on my timesheet");
		try {
			time.clickOnMyTimeSheet();
		} catch (Exception e) {
			captureScreen(driver, "My Timesheet");

		}
	}

	@Test(priority = 9)
	public void testMyTimeSheetPage() throws Exception {
		if (time.validateMyTimeSheetPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the my timesheet page");
		} else {
			captureScreen(driver, "timesheet page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 10)
	public void testEdit() throws Exception {
		Logger.info("click on edit");
		try {
			time.clickOnEdit();
		} catch (Exception e) {
			captureScreen(driver, "edit");

		}
	}

	@Test(priority = 11)
	public void testEditTimeSheetPage() throws Exception {
		if (time.validateEditTimeSheetPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the edit timesheet page");
		} else {
			captureScreen(driver, "edit timesheet page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 12)
	public void testProjectName() throws Exception {
		Logger.info("enter project name");
		try {
			time.enterProjectName(prop.getProperty("projectName"));
		} catch (Exception e) {
			captureScreen(driver, "project name");

		}
	}

	@Test(priority = 13)
	public void testProjectNameValue() throws Exception {
		Logger.info("select name project name from drop down");
		try {
			time.selectValueFromDropDown();
		} catch (Exception e) {
			captureScreen(driver, "project value");

		}
	}

	@Test(priority = 14)
	public void testActivity() throws Exception {
		Logger.info("select the activity");
		try {
			time.selectTheActivity();
		} catch (Exception e) {
			captureScreen(driver, "activity");

		}
	}

	@Test(priority = 15)
	public void testMonday() throws Exception {
		Logger.info("enter the monday time");
		try {
			time.enterMondayTime(prop.getProperty("mondayTime"));
		} catch (Exception e) {
			captureScreen(driver, "monday");

		}
	}

	@Test(priority = 16)
	public void testTuesday() throws Exception {
		Logger.info("enter the tuesday time");
		try {
			time.enterTuesdayTime(prop.getProperty("tuesdayTime"));
		} catch (Exception e) {
			captureScreen(driver, "tuesday");

		}
	}

	@Test(priority = 17)
	public void testWednesday() throws Exception {
		Logger.info("enter the wednesday time");
		try {
			time.enterWednesdayTime(prop.getProperty("wednesdayTime"));
		} catch (Exception e) {
			captureScreen(driver, "wednesday");

		}
	}

	@Test(priority = 18)
	public void testThrusday() throws Exception {
		Logger.info("enter the thrusday time");
		try {
			time.enterThrusdayTime(prop.getProperty("thursdayTime"));
		} catch (Exception e) {
			captureScreen(driver, "thrusday");

		}
	}

	@Test(priority = 19)
	public void testFriday() throws Exception {
		Logger.info("enter the friday time");
		try {
			time.enterFridayTime(prop.getProperty("fridayTime"));
		} catch (Exception e) {
			captureScreen(driver, "friday");

		}
	}

	@Test(priority = 20)
	public void testSaturday() throws Exception {
		Logger.info("enter the saturday time");
		try {
			time.enterSaturdayTime(prop.getProperty("saturdayTime"));
		} catch (Exception e) {
			captureScreen(driver, "saturday");

		}
	}

	@Test(priority = 21)
	public void testSunday() throws Exception {
		Logger.info("enter the sunday time");
		try {
			time.enterSundayTime(prop.getProperty("sundayTime"));
		} catch (Exception e) {
			captureScreen(driver, "sunday");

		}
	}

	@Test(priority = 22)
	public void testSave() throws Exception {
		Logger.info("click on save");
		try {
			time.clickOnSave();
		} catch (Exception e) {
			captureScreen(driver, "save");

		}
	}

	@Test(priority = 23)
	public void testSubmit() throws Exception {
		Logger.info("click on submit");
		try {
			time.clickOnSubmit();
		} catch (Exception e) {
			captureScreen(driver, "submit");

		}
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
