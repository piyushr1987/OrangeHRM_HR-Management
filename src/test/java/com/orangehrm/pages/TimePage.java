package com.orangehrm.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.genericPage.BaseClass;
import com.orangehrm.utilities.CommonUtils;
import com.orangehrm.utilities.ElementUtils;

public class TimePage extends BaseClass {

	public TimePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement txtUsername;

	@FindBy(name = "password")
	private WebElement txtPassword;

	@FindBy(xpath = "//button[@type='submit' and text()=' Login ']")
	private WebElement btnLogin;

	@FindBy(xpath = "//li[contains(@class,'oxd-main-menu-item-wrapper')][4]")
	private WebElement lstTime;

	@FindBy(xpath = "//li[contains(@class,'oxd-to')][1]")
	private WebElement lstTimeSheet;

	@FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li[1]")
	private WebElement lstMyTimeSheet;

	@FindBy(xpath = "//button[contains(@class,'oxd-button oxd-button--medium oxd-button--g')]")
	private WebElement btnEdit;

	@FindBy(xpath = "//input[contains(@placeholder,'Type')]")
	private WebElement txtProject;

	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	private WebElement drpActivity;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table --editable']//tbody/tr[1]/td[3]")
	private WebElement txtMon;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table --editable']//tbody/tr[1]/td[4]")
	private WebElement txtTue;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table --editable']//tbody/tr[1]/td[5]")
	private WebElement txtWed;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table --editable']//tbody/tr[1]/td[6]")
	private WebElement txtThu;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table --editable']//tbody/tr[1]/td[7]")
	private WebElement txtFri;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table --editable']//tbody/tr[1]/td[8]")
	private WebElement txtSat;

	@FindBy(xpath = "//table[@class='orangehrm-timesheet-table --editable']//tbody/tr[1]/td[9]")
	private WebElement txtSun;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSave;

	@FindBy(xpath = "//button[contains(@class,'oxd-button oxd-button--medium oxd-button--s')]")
	private WebElement btnSubmit;

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

	public void clickOnTime() {
		ElementUtils.clickOnElement(lstTime, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean validateTimePageNavigation() {
		return driver.getCurrentUrl().contains("time");

	}

	public void clickOnTimeSheet() {
		ElementUtils.clickOnElement(lstTimeSheet, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnMyTimeSheet() {
		ElementUtils.clickOnElement(lstMyTimeSheet, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean validateMyTimeSheetPageNavigation() {
		return driver.getCurrentUrl().contains("viewMyTimesheet");

	}

	public void clickOnEdit() {
		ElementUtils.clickOnElement(btnEdit, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public boolean validateEditTimeSheetPageNavigation() {
		return driver.getCurrentUrl().contains("/editTimesheet");

	}

	public void enterProjectName(String pname) {
		ElementUtils.typeTextIntoElement(txtProject, pname, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void selectValueFromDropDown() throws InterruptedException {
		String searchText = "Global Corp and Co - Global Software phase - 1";
		// WebElement dropdown = driver.findElement(By.xpath("/html/body/div[4]"));

		List<WebElement> options = driver.findElements(By.tagName("li"));
		Thread.sleep(3000);
		for (WebElement option : options) {
			if (option.getText().equals(searchText)) {
				option.click(); // click the desired option
				break;
			}
		}
	}

	public void selectTheActivity() {
		Select sel1 = new Select(drpActivity);
		sel1.selectByValue("7");
	}

	public void enterMondayTime(String mon) {
		ElementUtils.typeTextIntoElement(txtMon, mon, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterTuesdayTime(String tue) {
		ElementUtils.typeTextIntoElement(txtTue, tue, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterWednesdayTime(String wed) {
		ElementUtils.typeTextIntoElement(txtWed, wed, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterThrusdayTime(String thu) {
		ElementUtils.typeTextIntoElement(txtThu, thu, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterFridayTime(String fri) {
		ElementUtils.typeTextIntoElement(txtFri, fri, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterSaturdayTime(String sat) {
		ElementUtils.typeTextIntoElement(txtSat, sat, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void enterSundayTime(String sun) {
		ElementUtils.typeTextIntoElement(txtSun, sun, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnSave() {
		ElementUtils.clickOnElement(btnSave, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

	public void clickOnSubmit() {
		ElementUtils.clickOnElement(btnSubmit, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
	}

}
