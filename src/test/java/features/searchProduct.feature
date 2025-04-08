Feature: Search and Place the order for Products

  Scenario Outline: Search Experience for product search in both home and Offers page

    Given User is on GreenCart Landing Page
    When User searched with shortname <Name> and extracted actual name of product
    Then User searched for <Name> Shortname in offers page
    And validate product name in offer page matches with Landing Page

    Examples:
    | Name |
    | Tom  |
    | Beet |
