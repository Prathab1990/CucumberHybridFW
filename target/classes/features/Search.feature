Feature: Search for the product

Scenario: User Searches for a valid product
Given User opens the application
When User enters valid product "HP" into the search box
And User clicks on search button
Then User should get a valid product displayed in search results

Scenario: User Searches for an invalid product
Given User opens the application
When User enters valid product "Hond" into the search box
And User clicks on search button
Then User should get a message about no product matching
