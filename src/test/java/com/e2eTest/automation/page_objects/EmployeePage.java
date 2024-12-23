package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class EmployeePage extends BasePage {

	@FindBy(how = How.XPATH, using = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")
	private static WebElement pimBtn;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Add']")
	private static WebElement addBtn;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='First Name']")
	private static WebElement firstName;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Last Name']")
	private static WebElement lastName;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Save']")
	private static WebElement saveBtn;

	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Personal Details']")
	private static WebElement personalDetails;

	@FindBy(how = How.XPATH, using = "//p[contains(text(), 'Success') and contains(@class, 'oxd-toast-content-text')]")
	private static WebElement successfullyBtn;

	@FindBy(how = How.XPATH, using = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//input[1]")
	private static WebElement inputEmployeName;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement searchBtn;

	@FindBy(how = How.XPATH, using = "//button[contains(@class, 'oxd-icon-button') and .//i[contains(@class, 'bi-trash')]]")
	private static WebElement deleteBtn;

	/* Search employee name */
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private static WebElement searchEmployName;

	/* bouton Search employe */
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Search']")
	private static WebElement employSearchBtn;

	/* Select employee button */
	@FindBy(how = How.XPATH, using = "//div[@role='table']//div[1]//div[1]//div[1]//div[1]//div[1]//label[1]//span[1]//i[1]")
	private static WebElement employeeSelectBtn;

	/* Modify employee button */
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[9]/div[1]/button[1]")
	private static WebElement modifyEmployeeBtn;

	/* Save button After Modify employee informations */
	@FindBy(how = How.XPATH, using = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[@type='submit'][normalize-space()='Save']")
	private static WebElement saveModifBtn;

	public EmployeePage() {
		super(Setup.getDriver());
	}

	public WebElement getPimBtn() {
		wait.waitForElementToBeVisible(pimBtn, 15);
		return pimBtn;
	}

	public WebElement getAddBtn() {
		wait.waitForElementToBeVisible(addBtn, 15);
		return addBtn;
	}

	public WebElement getFirstname() {
		wait.waitForElementToBeVisible(firstName, 15);
		return firstName;
	}

	public WebElement getLastname() {
		wait.waitForElementToBeVisible(lastName, 15);
		return lastName;
	}

	public WebElement getSaveBtn() {
		wait.waitForElementToBeVisible(saveBtn, 15);
		return saveBtn;
	}

	public WebElement getPersonalDetails() {
		wait.waitForElementToBeVisible(personalDetails, 15);
		return personalDetails;
	}

	public WebElement getSuccessfullSaved() {
		wait.waitForElementToBeVisible(successfullyBtn, 15);
		return successfullyBtn;
	}

	public WebElement getEmployeeName() {
		wait.waitForElementToBeVisible(inputEmployeName, 15);
		return inputEmployeName;
	}

	public WebElement getSearchBtn() {
		wait.waitForElementToBeVisible(searchBtn, 15);
		return searchBtn;
	}

	public WebElement getDeleteBtn() {
		wait.waitForElementToBeVisible(deleteBtn, 15);
		return deleteBtn;
	}

	public WebElement setEmployeName() {
		wait.waitForElementToBeVisible(searchEmployName, 15);
		return searchEmployName;
	}

	public WebElement getEmployeSearchBtn() {
		wait.waitForElementToBeVisible(employSearchBtn, 15);
		return employSearchBtn;
	}

	public WebElement getEmployeeSelectBtn() {
		wait.waitForElementToBeVisible(employeeSelectBtn, 15);
		return employeeSelectBtn;
	}

	public WebElement getClickModifyBtn() {
		wait.waitForElementToBeVisible(modifyEmployeeBtn, 15);
		return modifyEmployeeBtn;
	}

	public WebElement getSaveModifEmployee() {
		wait.waitForElementToBeVisible(saveModifBtn, 15);
		return saveModifBtn;
	}

	public WebElement getModifLastname() {
		wait.waitForElementToBeVisible(lastName, 15);
		return lastName;
	}

}
