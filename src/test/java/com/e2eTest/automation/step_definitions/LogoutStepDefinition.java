package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.LogoutPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDefinition {

	LogoutPage logoutPage;
	SeleniumUtils seleniumUtils;
	Validations validations;
	ConfigFileReader configFileReader;

	public LogoutStepDefinition() {
		logoutPage = new LogoutPage();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		configFileReader = new ConfigFileReader();
	}

	
	@When("je clique sur Profil")
	public void jeCliqueSurProfil() throws InterruptedException {
		seleniumUtils.click(logoutPage.getBtnProfil());
		Thread.sleep(2000);
	}

	@When("je clique sur logout")
	public void jeCliqueSurLogout() throws InterruptedException {
		seleniumUtils.click(logoutPage.getBtnLogout());
		Thread.sleep(2000);
	}

	@Then("je me redirige vers page {string}")
	public void jeMeRedirigeVersPage(String text) {
		validations.assertEquals(logoutPage.getLoginText(), text);
	}

}
