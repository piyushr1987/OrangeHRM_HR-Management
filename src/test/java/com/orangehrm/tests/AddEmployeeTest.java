package com.orangehrm.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.pages.AddEmployeePage;

public class AddEmployeeTest extends BaseClass {

	AddEmployeePage add;

	public AddEmployeeTest() throws IOException {
		super();

	}

	@BeforeTest
	public void setUp() throws IOException {
		intialization();
		add = new AddEmployeePage();

	}

	@Test(priority = 1)
	public void testUsername() throws Exception {
		Logger.info("enter the username");
		try {
			add.enterValidUsername(prop.getProperty("loginUsername"));
		} catch (Exception e) {
			captureScreen(driver, "username");

		}
	}

	@Test(priority = 2)
	public void testPassword() throws Exception {
		Logger.info("enter the password");
		try {
			add.enterValidPassword(prop.getProperty("loginPassword"));
		} catch (Exception e) {
			captureScreen(driver, "password");

		}
	}

	@Test(priority = 3)
	public void testLogin() throws Exception {
		Logger.info("click on login");
		try {
			add.clickOnLogin();
		} catch (Exception e) {
			captureScreen(driver, "login");

		}
	}

	@Test(priority = 4)
	public void testLoginPage() throws Exception {
		if (add.validateLoginPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the dashboard");
		} else {
			captureScreen(driver, "dashboard");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 5)
	public void testPIM() throws Exception {
		Logger.info("click on PIM");
		try {
			add.clickOnPIM();
		} catch (Exception e) {
			captureScreen(driver, "PIM");

		}
	}

	@Test(priority = 6)
	public void testPIMPageNavigation() throws Exception {
		if (add.validatePIMPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to PIM page");
		} else {
			captureScreen(driver, "PIM page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 7)
	public void testAddEmployee() throws Exception {
		Logger.info("click on add employee");
		try {
			add.clickOnAddEmployee();
		} catch (Exception e) {
			captureScreen(driver, "add employee");

		}
	}

	@Test(priority = 8)
	public void testAddEmployeePageNavigation() throws Exception {
		if (add.validateAddEmployeePageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the Add Employee Page");
		} else {
			captureScreen(driver, "Add Employeepage");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 9)
	public void testFirstName() throws Exception {
		Logger.info("enter employee first name");
		try {
			add.enterEmployeeFirstName(prop.getProperty("firstName"));
		} catch (Exception e) {
			captureScreen(driver, "first name");

		}
	}

	@Test(priority = 10)
	public void testMiddleName() throws Exception {
		Logger.info("enter employee middle name");
		try {
			add.enterEmployeeMiddleName(prop.getProperty("middleName"));
		} catch (Exception e) {
			captureScreen(driver, "middle name");

		}
	}

	@Test(priority = 11)
	public void testLastName() throws Exception {
		Logger.info("enter employee last name");
		try {
			add.enterEmployeeLastName(prop.getProperty("lastName"));
		} catch (Exception e) {
			captureScreen(driver, "last name");

		}
	}

	@Test(priority = 12)
	public void testEmployeeId() throws Exception {
		Logger.info("enter employee ID");
		try {
			add.enterEmployeeId(prop.getProperty("empID"));
		} catch (Exception e) {
			captureScreen(driver, "emp Id");

		}
	}

	@Test(priority = 13)
	public void testSave() throws Exception {
		Logger.info("click on save");
		try {
			add.clickOnSave();
		} catch (Exception e) {
			captureScreen(driver, "save");

		}
	}

	@Test(priority = 14)
	public void testEmployeePersonalDetailsPageNavigation() throws Exception {
		if (add.validateEmployeePersonalDetailsPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the Employee Personal Details Page");
		} else {
			captureScreen(driver, "Employee Details Page");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}
	}

	@Test(priority = 15)
	public void testEmployeeName() throws Exception {

		WebElement empName = driver.findElement(
				By.xpath("//div[@class='oxd-layout-container']//div[@class='orangehrm-edit-employee-name']"));
		String actEmpName = empName.getText();
		String expEmpName = prop.getProperty("employeeName");
		try {
			Assert.assertEquals(actEmpName, expEmpName);
			Logger.info("actual and expected employee name is matched");
		} catch (Exception e) {
			captureScreen(driver, "employee name");
			Assert.assertTrue(false);
			Logger.info("validation test failed");

		}

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
