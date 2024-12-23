package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AdminPage extends BasePage {

	public AdminPage() {
		super(Setup.getDriver());
	}

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Admin']")
	private static WebElement adminBtn;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	private static WebElement inputUsername;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement searchBtn;

	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")
	private static WebElement adminVerif;

	@FindBy(how = How.XPATH, using = "// button[normalize-space()='Add']")
	private static WebElement addBtn;

	/* User Role locator */
	//@FindBy(how = How.XPATH, using = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	@FindBy(how = How.XPATH, using = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	private static WebElement dropDownRole;

	
	
	//@FindBy(how = How.XPATH, using = "(//div[@role='listbox']//child::div)[2]")
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-select-text-input'][normalize-space()='ESS']")
	
	private static WebElement adminSelect;

		
		/* Status Locator */
	@FindBy(how = How.XPATH, using = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private static WebElement dropDownStatus;

	@FindBy(how = How.XPATH, using = "(//div[@role='listbox']//child::div)[2]")
	private static WebElement enableSelect;

	/* Employee Name Locator */
	@FindBy(how = How.XPATH, using = "//input[@placeholder='Type for hints...']")
	private static WebElement employeeName;

	/* Username Locator */
	@FindBy(how = How.XPATH, using = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	private static WebElement userName1;

	/* Password Locator */
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement password;

	/* ConfirmPassword Locator */
	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
	private static WebElement confirmPassword;

	/* Save Button Locator */
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']")
	private static WebElement saveBtn;

	/* Methods */

	public WebElement getAdminmodule() {
		return adminBtn;
	}

	public WebElement setUsernameAdmin() {
		return inputUsername;
	}

	public WebElement getSearchBut() {
		return searchBtn;
	}

	public WebElement getAdminSearch() {
		return adminVerif;
	}

	/* Add user */

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement selectDropDownList() throws InterruptedException {
		return dropDownRole;
	}
	
	public WebElement selectAdminOption() throws InterruptedException {
		return adminSelect;
	}

	public WebElement selectStatus() {

		return dropDownStatus;
		
	}

	public WebElement setEmployeeName() {
		return employeeName;
	}

	public WebElement setUserN() {
		return userName1;
		
	}

	public WebElement setPassword() {
		return password;
		
	}

	public WebElement setConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getSaveBtn() {
		return saveBtn;

	}

}
