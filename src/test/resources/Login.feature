Feature: Login to demoOpenCart

   Scenario: Login with already registered account
     Given I am open Main page
     When I am open the demoOpenCart login page
     And I enter 'Email' into  email field
     And I enter 'Password' into  password field
     And I click on the Login button
     Then  I see 'My Account' in the Personal Cabinet Page

