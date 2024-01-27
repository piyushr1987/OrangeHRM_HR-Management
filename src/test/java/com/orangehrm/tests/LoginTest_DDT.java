package com.orangehrm.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.utilities.XLUtils;
import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.pages.LoginPage;

public class LoginTest_DDT extends BaseClass {
	LoginPage login;

	public LoginTest_DDT() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException {
		intialization();
		login = new LoginPage();

	}

	@Test(dataProvider = "LoginData")
	public void testLoginFunctionality(String uname, String pass) throws Exception {

		Logger.info("enter the username");
		login.enterUsername(uname);

		Logger.info("enter the password");
		login.enterPassword(pass);

		Logger.info("click on login");
		login.clickOnLogin();

		if (login.validateLoginPageNavigation()) {
			Assert.assertTrue(true);
			Logger.info("sucessfully navigate to the dashboard");
		} else {
			captureScreen(driver, "dashboard");
			Assert.assertTrue(false);
			Logger.info("validation test failed");
		}

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws Exception {
		String path = System.getProperty("user.dir") + "/src/test/java/com/orangehrm/testData/OrangeHRMLoginData.xlsx";
		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);
		String logindata[][] = new String[rownum][colcount];
		for (int i = 1; i < rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}

}
