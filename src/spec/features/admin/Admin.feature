@Admin
Feature: Gestion des utilisateurs

  Background: 
    Given Je me connecte sur le site OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot de passe "admin123"
    And Je clique sur bouton Login

  @searchUser
  Scenario: Rechercher un utilisateur nomme "Admin" dans System Users
    When je clique sur le module Admin
    And je saisis  dans Username "Admin"
    And je clique sur Search
    Then je devrais voir dans la liste "Admin" 

  @addUser
  Scenario: Ajouter un nouvel utilisateur
    When je clique sur le module Admin
    And je clique sur le bouton Add
    And je selectionne Admin dans le menu deroulant User Role
 #   And je selectionne Enable dans le menu deroulant Status  
 #   And je saisis "Marouen" dans le champ Employee Name
 #   And je saisis "MarouentTester" dans le champ Username2 
 #   And je saisis "marouen123" dans le champ Mot de passe
 #   And je saisis "marouen123" dans le champ Confirmer le mot de passe
 #   And je clique sur le bouton Save
 #   Then "Marouen" devrait etre liste dans Records Found
