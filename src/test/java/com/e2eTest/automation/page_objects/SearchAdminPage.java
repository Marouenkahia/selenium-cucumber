package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class SearchAdminPage extends BasePage {
	


	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Admin']")
	private static WebElement adminBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private static WebElement inputUsername;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement searchBtn;
	
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")
	private static WebElement adminVerif;
	
	public SearchAdminPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getAdminModule() {
		return adminBtn;

	}
	
	public static WebElement getInputUsername() {
		return inputUsername;

	}
	
	public static WebElement getBtnSearch() {
		return searchBtn;

	}
}
