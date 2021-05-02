Feature: Login page feature
@smoke
Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"
@smoke
Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed
@regression
Scenario: Login with correct credentials
Given user is on login page
When user enters username "demofor@gmail.com"
And user enters password "demofor"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Store"