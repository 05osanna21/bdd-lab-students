Feature: Availability of elements in  wish list on the demoOpenCart

  Scenario: Check that 2 items exist in  wish list on the demoOpenCart
    Given I open Main page
    When I login to the site
    And I hover mouse  over for top menu 'COMPONENTS'
    And I select 'MONITORS' in SubNavbarMenu
    And I Click Add to Wish List button for
    | Apple Cinema | Samsung SyncMaster |