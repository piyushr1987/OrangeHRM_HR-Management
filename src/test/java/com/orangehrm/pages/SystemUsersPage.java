package com.orangehrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.utilities.CommonUtils;
import com.orangehrm.utilities.ElementUtils;

public class SystemUsersPage extends BaseClass {

	public SystemUsersPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement txtUsername;

	@FindBy(name = "password")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@type='submit' and text()=' Login ']")
	private WebElement btnLogin;

	@FindBy(xpath = "//li[contains(@class,'oxd-main-menu-item-wrapper')][1]")
	private WebElement lstAdmin;

	@FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private WebElement userName;

	@FindBy(xpath = "//button[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary ')]")
	private WebElement btSearch;

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

	public void clickOnAdmin() {
		ElementUtils.clickOnElement(lstAdmin, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean validateSystemUsersPageNavigation() {
		return driver.getCurrentUrl().contains("viewSystemUsers");

	}

	public void enterUsername(String uname) {
		ElementUtils.typeTextIntoElement(userName, uname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnSearch() {
		ElementUtils.clickOnElement(btSearch, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

}
