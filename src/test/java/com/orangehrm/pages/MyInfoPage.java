package com.orangehrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.utilities.CommonUtils;
import com.orangehrm.utilities.ElementUtils;

public class MyInfoPage extends BaseClass {

	public MyInfoPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement txtUsername;

	@FindBy(name = "password")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@type='submit' and text()=' Login ']")
	private WebElement btnLogin;

	@FindBy(xpath = "//li[contains(@class,'oxd-main-menu-item-wrapper')][6]")
	private WebElement myInfo;

	@FindBy(name = "firstName")
	private WebElement txtFirstName;

	@FindBy(name = "lastName")
	private WebElement txtLastName;

	@FindBy(xpath = "//div[@class='oxd-form-row'][3]//input[@class='oxd-input oxd-input--active']")
	private WebElement txtDOB;

	@FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")
	private WebElement btnSave;

	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	private WebElement drpMenu;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logOut;

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

	public void clickOnMyInfo() {
		ElementUtils.clickOnElement(myInfo, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean validateMyInfoPageNavigation() {
		return driver.getCurrentUrl().contains("viewPersonalDetails");

	}

	public void enterFirstName(String fname) {
		txtFirstName.clear();
		ElementUtils.typeTextIntoElement(txtFirstName, fname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterLastName(String lname) {
		txtLastName.clear();
		ElementUtils.typeTextIntoElement(txtLastName, lname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterDateOfBirth(String dob) {
		txtDOB.clear();
		ElementUtils.typeTextIntoElement(txtDOB, dob, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnSave() {
		ElementUtils.clickOnElement(btnSave, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnMenu() {
		ElementUtils.clickOnElement(drpMenu, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnLogOut() {
		ElementUtils.clickOnElement(logOut, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

}
