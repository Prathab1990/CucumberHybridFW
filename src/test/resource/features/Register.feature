Feature: Registration functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to register account page
When User enters the details into below fields
|firstName | Prathap|
|Lastname  | R      |
|email     |testqa2308@gmail.com|
|telephone |9003056229|
|password  |123456|
And User selects privacy policy
And User clicks on Continue button
Then User account should get created successfully


Scenario: User creates an account with all fields
Given User navigates to register account page
When User enters the details into below fields
|firstName | Prathap|
|Lastname  | R      |
|email     |testqa2308@gmail.com|
|telephone |9003056229|
|password  |123456|
And User selects Yes for Newsletter
And User selects privacy policy
And User clicks on Continue button
Then User account should get created successfully
