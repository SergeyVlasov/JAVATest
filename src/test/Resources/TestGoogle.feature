Feature: Google search
  Scenario: Test google search
    Given Google search main page is open
    When write text in search field
    And click search button
    Then Google search page is open