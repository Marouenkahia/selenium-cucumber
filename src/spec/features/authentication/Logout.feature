@logoutPage
Feature: je souhaite tester la deconnexion du site web orange
 
 Background:
    Given Je me connecte sur le site OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le mot de passe "admin123"
    And Je clique sur bouton Login
 
 @logout
    Scenario: je souhaite tester la deconnexion

    When je clique sur Profil
    And je clique sur logout
    Then je me redirige vers page "Login"

