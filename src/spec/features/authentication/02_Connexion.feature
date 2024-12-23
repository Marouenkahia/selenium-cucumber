@connexion
Feature: Connexion
  Je souhaite me connecter sur l'application


  @connexion1
  Scenario Outline: Je souhaite me connecter sur l'application
    Given Je me connecte sur le siteweb Orange
    When Je saisis mon username valide "<username>"
    And Je saisis mon mot de passe valide "<password>"
    And Je clique sur button Login
    Then Je me redirige vers le Dashboard "Dashboard" 

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Hedia    | hedia123 |
      | Souad    | souad123 |