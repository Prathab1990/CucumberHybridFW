Feature: Login functionality

Scenario: Login with valid credentials
Given User navigated to login page
When User enters valid email address "testqa2308@gmail.com" into email field
And User has entered valid password "12345" into password field
And User clicks on login button
Then User should get succesfully logged in 

Scenario: Login with invalid credentials
Given User navigated to login page
When User enters invalid email address "testqa12308@gmail.com" into email field
And User has entered valid password "12345" into password field
And User clicks on login button
Then User should get a proper warning message

Scenario: Login with valid email and invalid password
Given User navigated to login page
When User enters valid email address "testqa2308@gmail.com" into email field
And User has entered invalid password "12345ui" into password field
And User clicks on login button
Then User should get a proper warning message

Scenario: Login without providing credentials
Given User navigated to login page
When User does not enter email address into email field
And User does not entered password into password field
And User clicks on login button
Then User should get a proper warning message

 