Feature: Search and Place the order for Products

  Scenario: Search Experience for product search in both home and Offers page

    Given User is on GreenCart Landing Page
    When User searched with shortname "Tom" and extracted actual name of product
    Then User searched for "Tom" Shortname in offers page
    And validate product name in offer page matches with Landing Page
