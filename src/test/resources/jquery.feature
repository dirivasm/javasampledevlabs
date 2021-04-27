@tag
Feature: Jquery

  @jqeuryexercise
  Scenario Outline: Click on specific item
    Given I go to "https://jqueryui.com/selectable/"
    When "<option_from_nav_bar>" is selected
    Then select "<item>"

    Examples: 
      | option_from_nav_bar | item  |
      | Selectable          | 1,4,7 |
