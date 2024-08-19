Feature: Test for Google application

  Scenario: Test for Google title
    Given Open the Google application
    When User captures current page title
    Then Title should match
