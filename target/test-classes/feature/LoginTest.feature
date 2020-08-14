Feature: LoginTest

@Login
Scenario Outline: Successful login with valid credentials
	Given User is at home page
	When user navigate to login page
	And user enter Username<userID>
	And user enter Password<password>
	Then message dispayed is successful login
	
Examples:
|userID | password |
|Anagha | 123456 |
| Om | 123564 |


