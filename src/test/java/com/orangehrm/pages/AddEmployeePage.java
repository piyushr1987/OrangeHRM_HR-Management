package com.orangehrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.utilities.CommonUtils;
import com.orangehrm.utilities.ElementUtils;

public class AddEmployeePage extends BaseClass {

	public AddEmployeePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement txtUsername;

	@FindBy(name = "password")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@type='submit' and text()=' Login ']")
	private WebElement btnLogin;

	@FindBy(xpath = "//li[contains(@class,'oxd-main-menu-item-wrapper')][2]")
	private WebElement lstPIM;

	@FindBy(xpath = "//li[contains(@class,'oxd-to')]//a[text()='Add Employee']")
	private WebElement lstAddEmployee;

	@FindBy(name = "firstName")
	private WebElement txtFirstName;

	@FindBy(name = "middleName")
	private WebElement txtMiddleName;

	@FindBy(name = "lastName")
	private WebElement txtLastName;

	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement txtEmployeeId;

	@FindBy(xpath = "//div[@class='oxd-form-actions']/descendant::button[2]")
	private WebElement btnSave;

	public void enterValidUsername(String uname) {
		ElementUtils.typeTextIntoElement(txtUsername, uname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterValidPassword(String pass) {
		ElementUtils.typeTextIntoElement(txtPassword, pass, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnLogin() {
		ElementUtils.clickOnElement(btnLogin, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean validateLoginPageNavigation() {
		return driver.getCurrentUrl().contains("dashboard");

	}

	public void clickOnPIM() {
		ElementUtils.clickOnElement(lstPIM, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean validatePIMPageNavigation() {
		return driver.getCurrentUrl().contains("viewEmployeeList");

	}

	public void clickOnAddEmployee() throws InterruptedException {
		ElementUtils.clickOnElement(lstAddEmployee, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(5000);
	}

	public boolean validateAddEmployeePageNavigation() {
		return driver.getCurrentUrl().contains("addEmployee");

	}

	public void enterEmployeeFirstName(String fname) {
		ElementUtils.typeTextIntoElement(txtFirstName, fname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterEmployeeMiddleName(String mname) {
		ElementUtils.typeTextIntoElement(txtMiddleName, mname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterEmployeeLastName(String lname) {
		ElementUtils.typeTextIntoElement(txtLastName, lname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterEmployeeId(String eid) throws InterruptedException {
		txtEmployeeId.clear();
		Thread.sleep(5000);
		ElementUtils.typeTextIntoElement(txtEmployeeId, eid, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnSave() throws InterruptedException {
		ElementUtils.clickOnElement(btnSave, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		Thread.sleep(10000);
	}

	public boolean validateEmployeePersonalDetailsPageNavigation() {
		return driver.getCurrentUrl().contains("viewPersonalDetails");

	}

}
