Feature: Flight Purchase Form Functionality

  Scenario Outline: Verify form functionality and message
    Given User navigates to "https://blazedemo.com/purchase.php"
    When User enters Full Name "<firstName>" "<lastName>"
    And User enters Address "<address>"
    And User enters City "<city>"
    And User enters State "<state>"
    And User enters Zipcode "<zipcode>"
    And User selects cardType
      | cardType |
      | <type>   |
    And User enters Credit Card "<creditCard>"
    And User enters Month "<month>"
    And User enters Year "<year>"
    And User enters Name on Card "<name>"
    And User clicks Remember Me checkbox
    And User clicks Purhcase Flight button
    Then User verifies success message " Thank you for your purchase today!"

    Examples: 
      | firstName | lastName | address       | city      | state | zipcode | type             | creditCard | month | year | name      |
      | John      | Cena     | 123 Hello dr  | Reston    | VA    |   20190 | visa             |     789702 |    11 | 2025 | John Cena |
      | Sam       | R        | 456 Main St   | Rockville | MD    |   22930 | American Express |     922930 |    04 | 2028 | Sam R     |
      | Gina      | Q        | 789 Dear dr   | Sterling  | VA    |   20165 | Visa             |     680221 |    12 | 2024 | Gina Q    |
      | Frida     | R        | 012 Street    | LA        | CA    |   99213 | Diners Club      |     499298 |    01 | 2023 | Frida R   |
      | Luna      | N        | 479 My Street | Scranton  | PA    |   76459 | Visa             |     123456 |    07 | 2029 | Luna N    |
