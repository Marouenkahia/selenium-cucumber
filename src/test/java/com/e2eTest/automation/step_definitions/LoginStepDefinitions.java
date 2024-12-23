package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.LoginPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {

	ConfigFileReader configFileReader;
	LoginPage loginPage;

	public LoginStepDefinitions() {
		configFileReader = new ConfigFileReader();
		loginPage = new LoginPage();
	}
	        
	@Given("Je me connecte sur le site OrangeHRM")
	public void jeMeConnecteSurLeSiteOrangeHRM() throws InterruptedException {
		Setup.getDriver().get(configFileReader.getProperty("home.url"));
		Thread.sleep(3000);
	}

	@When("Je saisis le username {string}")
	public void jeSaisisLeUsername(String username) throws InterruptedException {
		loginPage.getUsername(username);
		Thread.sleep(3000);
	}

	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) throws InterruptedException {
		loginPage.getPassword(password);
		Thread.sleep(3000);
	}

	@When("Je clique sur bouton Login")
	public void jeCliqueSurBoutonLogin() throws InterruptedException {
		loginPage.getBtnLogin();
		Thread.sleep(3000);
	}

	@Then("Je me regirige vers la page Home {string}")
	public void jeMeRegirigeVersLaPageHome(String text) {
		String txtHomePage = loginPage.getUserHome();
		Assertions.assertEquals(text, txtHomePage);
	}

}
