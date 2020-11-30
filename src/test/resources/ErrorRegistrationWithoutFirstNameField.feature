Feature: Error Registration  on the demoOpenCart

  Scenario: Registration without fill First Name Field on the demoOpenCart
    Given I open Main page
    When I select 'Register' on the TopBar Menu
    And I fill all fields except First Name
    Then I see that message 'First Name must be between 1 and 32 characters!' appears