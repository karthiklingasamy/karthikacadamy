Feature: Place the order for Products

  Scenario Outline: Search Experience for product search in both home and Offers page

    Given User is on GreenCart Landing Page
    When User searched with shortname <Name> and extracted actual name of product
    And Added "3" items of the selected product to cart
    Then User proceed to checkout and vaidate the <Name> items in checkout page
    And verify user has ability to enter promo code and place the order

    Examples:
    | Name |
    | Tom  |

