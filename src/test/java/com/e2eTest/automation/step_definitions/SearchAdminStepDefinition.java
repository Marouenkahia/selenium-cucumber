package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.SearchAdminPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchAdminStepDefinition {

	 SearchAdminPage searchAdminPage;
	 SeleniumUtils seleniumUtils;
	 ConfigFileReader configFileReader;
	 Validations validations;

	public SearchAdminStepDefinition() {
		searchAdminPage = new SearchAdminPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}

	
	@When("je clique sur le module nomme Admin")
	public void jeCliqueSurLeModuleNommeAdmin() {
		
		seleniumUtils.click(SearchAdminPage.getAdminModule());  
	}
	
	@When("je saisis  dans Username {string}")
	public void jeSaisisDansUsername(String string) {
	 
	}
	@When("je clique sur Search")
	public void jeCliqueSurSearch() {
	  
	}
	@Then("je devrais voir dans la liste {string}")
	public void jeDevraisVoirDansLaListe(String string) {
	   
	}






}
