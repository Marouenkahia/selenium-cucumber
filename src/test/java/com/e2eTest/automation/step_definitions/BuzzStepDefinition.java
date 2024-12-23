package com.e2eTest.automation.step_definitions;

import org.junit.jupiter.api.Assertions;

import com.e2eTest.automation.page_objects.BuzzPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuzzStepDefinition {

	BuzzPage buzzPage;

	public BuzzStepDefinition() {
		buzzPage = new BuzzPage();
	}

	@When("je Clique Sur Le module Buzz")
	public void jeCliqueSurLeModuleBuzz()throws InterruptedException {
		buzzPage.getBuzzModule();
		Thread.sleep(3000);
	}

	@When("je saisis le buzz {string}")
	public void jeSaisisLeBuzz(String text) throws InterruptedException {
		buzzPage.getBuzzText(text);
		Thread.sleep(3000);
	}

	@When("je clique sur Post")
	public void jeCliqueSurPost() throws InterruptedException {
		buzzPage.getBuzzSubmit();
		Thread.sleep(3000);
	}

	@Then("je verifie l ajout du post {string}")
	public void jeVerifieLAjoutDuPost(String text) {
		String textPost = buzzPage.verifAddPost();
		Assertions.assertEquals(text, textPost);
	}

}
