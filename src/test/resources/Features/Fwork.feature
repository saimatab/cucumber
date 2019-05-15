Feature: End to End cucumber test



Scenario: Login with Valid credentials
Given user is on home page
When user navigate to login page
And user enters username and password 
Then message displayed login successfully



Scenario: Logout
Given  user  is already signed in 
When user logout from the application
Then message displayed logout successfully