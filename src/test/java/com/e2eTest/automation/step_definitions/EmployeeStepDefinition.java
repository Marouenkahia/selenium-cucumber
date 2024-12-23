package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.EmployeePage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.WaitUtil;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeStepDefinition {

	private EmployeePage employeePage;
	private SeleniumUtils seleniumUtils;
	private Validations validations;
	public EmployeeStepDefinition() {
		employeePage = new EmployeePage();
		seleniumUtils = new SeleniumUtils();
		new ConfigFileReader();
		validations = new Validations();
		new WaitUtil();
	}

	@When("Je navigue vers le module PIM")
	public void jeNavigueVersLeModulePIM() throws InterruptedException {
		seleniumUtils.click(employeePage.getPimBtn());
	}

	@When("Je clique sur le bouton Add Employee")
	public void jeCliqueSurLeBoutonAddEmployee() throws InterruptedException {
		seleniumUtils.click(employeePage.getAddBtn());
	}

	@When("Je remplis {string} dans le champ firstname")
	public void jeRemplisDansLeChampFirstname(String firstname) throws InterruptedException {
		seleniumUtils.writeText(employeePage.getFirstname(), firstname);
	}

	@When("Je remplis {string} dans le champ Lastname")
	public void jeRemplisDansLeChampLastname(String lastname) throws InterruptedException {
		seleniumUtils.writeText(employeePage.getLastname(), lastname);
	}

	@When("Je clique sur le bouton Save")
	public void jeCliqueSurLeBoutonSave() throws InterruptedException {
		seleniumUtils.click(employeePage.getSaveBtn());
	}

	@Then("je me redirige vers {string}")
	public void jeMeRedirigeVers(String text) throws InterruptedException {
		validations.assertEquals(employeePage.getPersonalDetails(), text);
	}

	@When("je recherche {string} dans la liste des employes")
	public void jeRechercheDansLaListeDesEmployes(String name) throws InterruptedException {
		seleniumUtils.writeText(employeePage.getEmployeeName(), name);
		seleniumUtils.click(employeePage.getEmployeSearchBtn());
	}

	@When("je sélectionne {string} dans les résultats de recherche")
	public void jeSélectionneDansLesRésultatsDeRecherche(String text) throws InterruptedException {
		seleniumUtils.click(employeePage.getEmployeeSelectBtn());
	}

	@When("je clique sur le bouton Modifier")
	public void jeCliqueSurLeBoutonModifier() throws InterruptedException {
		seleniumUtils.click(employeePage.getClickModifyBtn());
	}

	@When("je modifie le champ Lastname par {string}")
	public void jeModifieLeChampLastnamePar(String text2) throws InterruptedException {
		seleniumUtils.writeText(employeePage.getModifLastname(), text2);
	}

	@Then("je devrais voir un message de succès")
	public void jeDevraisVoirUnMessageDeSuccès() {
	}

	@When("je clique sur Save")
	public void jeCliqueSurSave() throws InterruptedException {
		seleniumUtils.click(employeePage.getSaveModifEmployee());
	}

	@Then("{string} devrait être listé dans la page {string}")
	public void devraitÊtreListéDansLaPage(String string, String text) {
	}

}
