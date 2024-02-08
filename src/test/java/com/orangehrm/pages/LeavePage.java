package com.orangehrm.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.utilities.CommonUtils;
import com.orangehrm.utilities.ElementUtils;

public class LeavePage extends BaseClass {

	public LeavePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement txtUsername;

	@FindBy(name = "password")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@type='submit' and text()=' Login ']")
	private WebElement btnLogin;

	@FindBy(xpath = "//li[contains(@class,'oxd-main-menu-item-wrapper')][3]")
	private WebElement lstLeave;

	@FindBy(xpath = "//li[contains(@class,'oxd-t')][1]")
	private WebElement lstApply;

	@FindBy(xpath = "//div[contains(@class,'oxd-select-text oxd')]")
	private WebElement leaveType;

	@FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")
	private WebElement FromDate;

	@FindBy(xpath = "//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]")
	private WebElement ToDate;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnApply;

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

	public void clickOnLeave() {
		ElementUtils.clickOnElement(lstLeave, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean validateLeavePageNavigation() {
		return driver.getCurrentUrl().contains("viewLeaveList");

	}

	public void clickOnApplyLeave() {
		ElementUtils.clickOnElement(lstApply, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean validateApplyPageNavigation() {
		return driver.getCurrentUrl().contains("applyLeave");

	}

	public void enterLeaveType(String leave) {
		ElementUtils.typeTextIntoElement(leaveType, leave, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterFromDate(String fdate) {
		ElementUtils.typeTextIntoElement(FromDate, fdate, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterToDate(String tdate) {
		ElementUtils.typeTextIntoElement(ToDate, tdate, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnApply() {
		ElementUtils.clickOnElement(btnApply, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

}
