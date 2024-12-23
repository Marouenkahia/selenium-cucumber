package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.ConnexionPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConnexionSteps {

	 ConnexionPage connexionPage;
	 SeleniumUtils seleniumUtils;
	 ConfigFileReader configFileReader;
	 Validations validations;

	public ConnexionSteps() {
		connexionPage = new ConnexionPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}

	@Given("Je me connecte sur le siteweb Orange")
	public void jeMeConnecteSurLeSitewebOrange() {
		seleniumUtils.get(configFileReader.getProperty("home.url"));
	}

	@When("Je saisis mon username valide {string}")
	public void jeSaisisMonUsernameValide(String name) throws InterruptedException {
		seleniumUtils.writeText(ConnexionPage.getUsername(), name);
	}

	@When("Je saisis mon mot de passe valide {string}")
	public void jeSaisisMonMotDePasseValide(String password) {
		seleniumUtils.writeText(ConnexionPage.getPassword(), password);
	}


	@When("Je clique sur button Login")
	public void jeCliqueSurButtonLogin() {
		seleniumUtils.click(ConnexionPage.getBtnLogin());
	}
	
	@Then("Je me redirige vers le Dashboard {string}")
	public void jeMeRedirigeVersLeDashboard(String text) {
		validations.assertEquals(ConnexionPage.getUserHome(), text);
	}

}