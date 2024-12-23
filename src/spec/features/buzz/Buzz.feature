@buzz
Feature: Buzz
  En tant que utilisateur je souhaite tester la creation d un buzz

  Background: 
    Given Je me connecte sur le site OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot de passe "admin123"
    And Je clique sur bouton Login

  @buzz1
  Scenario: Je souhaite tester la creation d un buzz
    When je Clique Sur Le module Buzz
    And je saisis le buzz "Test Automation"
    And je clique sur Post
    Then je verifie l ajout du post "Test Automation"
