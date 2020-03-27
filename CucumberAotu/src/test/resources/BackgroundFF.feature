Feature: Create account in Your logo Site3
As a user u need to open Your logo page and do the validations


Background: common login steps
Given User need to be on your logo page
When user click sing button
Scenario: Validate signin Email address field
And Enter email address
Then check Email address field
Then close browser
Scenario: Validate create user multiple fields
And Enter email address
And user need to be on your logo SignIn page
And user click on create account button and Create account page should be open there
When user enters Title and user first name
And User enters user surname
Then user checks user first name and last name is present
Then close browser
