@employee
Feature: Gestion des employés dans OrangeHRM

  Background: 
    Given Je me connecte sur le site OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot de passe "admin123"
    And Je clique sur bouton Login
    And Je navigue vers le module PIM 

  @add_employee
  Scenario: Ajouter un nouvel employe
    And Je clique sur le bouton Add Employee
    And Je remplis "Salah" dans le champ firstname
    And Je remplis "Saadaoui" dans le champ Lastname
    And Je clique sur le bouton Save
    #Then je devrais voir un message de succès "Successfully Saved"
    Then je me redirige vers "Personal Details"

  @update_Employee
  Scenario: Modifier les informations d'un employe
    When je recherche "Salah Saadaoui" dans la liste des employes
    And je sélectionne "Salah Saadaoui" dans les résultats de recherche
    And je clique sur le bouton Modifier
    And je modifie le champ Lastname par "kahia"
    And je clique sur Save
    #Then je devrais voir un message de succès
    #And "Ali1 Sallami" devrait être listé dans la page "Informations personnelles de l'employé"
    