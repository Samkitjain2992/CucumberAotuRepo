Feature: Create account in Your logo Site5
As a user u need to open Your logo page and do the validations


Scenario: Validate create user multiple fields
Given User need to be on your logo page
When user click sing button
When Enter "samkitjain@cdnsol.com" email address
When check "samkitjain@cdnsol.com" Email address field
And user need to be on your logo SignIn page
And user click on create account button and Create account page should be open there
When Enter following data
    |userName |userSurName|
    |Samkit   |Jain       |
