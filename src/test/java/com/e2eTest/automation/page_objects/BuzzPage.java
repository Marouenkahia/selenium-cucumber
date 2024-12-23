package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class BuzzPage extends BasePage {

	public BuzzPage() {
		super(Setup.getDriver());
	}

	/* Retrieve element */
	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Buzz']")
	private static WebElement buzzModule;

	@FindBy(how = How.XPATH, using = "//textarea[@placeholder=\"What's on your mind?\"]")
	private static WebElement buzzText;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement buzzBtn;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Test Automation']")
	private static WebElement textAfterPost;

	/* Methods */
	public void getBuzzModule() {
		buzzModule.click();
	}

	public void getBuzzText(String buzz) {
		buzzText.sendKeys(buzz);
	}

	public void getBuzzSubmit() {
		buzzBtn.click();
	}
	
	public String verifAddPost() {
		return textAfterPost.getText();
	}

}
