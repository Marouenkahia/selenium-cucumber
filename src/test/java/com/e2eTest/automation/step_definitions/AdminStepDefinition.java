package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.AdminPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinition {
	
	AdminPage adminPage;
	SeleniumUtils seleniumUtils;
	ConfigFileReader configFileReader;
	Validations validations;
	
	public AdminStepDefinition() {
		adminPage = new AdminPage();
		seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();
		validations = new Validations();
	}
	
	@When("je clique sur le module Admin")
	public void jeCliqueSurLeModuleAdmin() throws InterruptedException {
		seleniumUtils.click(adminPage.getAdminmodule());
		Thread.sleep(3000);
	}
	@When("je clique sur le bouton Add")
	public void jeCliqueSurLeBoutonAdd() throws InterruptedException {
		seleniumUtils.click(adminPage.getAddBtn());
		Thread.sleep(3000);
	}
	
	@When("je selectionne Admin dans le menu deroulant User Role")
	public void jeSelectionneAdminDansLeMenuDeroulantUserRole() throws InterruptedException {
		Thread.sleep(3000);
		seleniumUtils.click(adminPage.selectDropDownList());
		seleniumUtils.click(adminPage.selectAdminOption());
		Thread.sleep(6000);

	}
	
	@When("je selectionne Enable dans le menu deroulant Status")
	public void jeSelectionneEnableDansLeMenuDeroulantStatus() {
	   
	}
	@When("je saisis {string} dans le champ Employee Name")
	public void jeSaisisDansLeChampEmployeeName(String string) {
	   
	}
	@When("je saisis {string} dans le champ Username2")
	public void jeSaisisDansLeChampUsername2(String string) {
	   
	}
	@When("je saisis {string} dans le champ Mot de passe")
	public void jeSaisisDansLeChampMotDePasse(String string) {
	    
	}
	@When("je saisis {string} dans le champ Confirmer le mot de passe")
	public void jeSaisisDansLeChampConfirmerLeMotDePasse(String string) {
	   
	}
	@When("je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() {
	   
	}
	@Then("{string} devrait etre liste dans Records Found")
	public void devraitEtreListeDansRecordsFound(String string) {
	  
	}



}
