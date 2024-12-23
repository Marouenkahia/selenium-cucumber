package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class LogoutPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//span[@class='oxd-userdropdown-tab']")
	private static WebElement btnProfil;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
	private static WebElement btnLogout;

	@FindBy(how = How.XPATH, using = "//h5[normalize-space()='Login']")
	private static WebElement homePageText;
	
	public LogoutPage() {
		super(Setup.getDriver());
	}
	
	public WebElement getBtnProfil() {
		return btnProfil;
	}

	public WebElement getBtnLogout() {
		return btnLogout;
	}

	public WebElement getLoginText() {
		return homePageText;

	}
}
