Feature: Registration on the demoOpenCart

  Scenario: Registration on the demoOpenCart with valid values (Test 1)
    Given I open Main page
    When I select 'Register' on the TopBar Menu
    And I fill form with valid values
    Then I see message 'Your Account Has Been Created!' appears
