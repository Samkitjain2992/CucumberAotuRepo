Feature: Create account in Your logo Site8
  As a user u need to open Your logo page and do the validations

  Scenario: Validate signin Email address field
    Given User need to be on your logo page
    When user click sing button
    And Enter "samkitjain@cdnsol.com" email address
    Then check "samkitjain@cdnsol.com" Email address field
    Then close browser

  Scenario: Validate create user multiple fields
    Given User need to be on your logo page
    When user click sing button
    And Enter "samkitjain@cdnsol.com" email address
    And user need to be on your logo SignIn page
    And user click on create account button and Create account page should be open there
    When user enters Title and user "Samkit" first name
    And User enters user "Jain" surname
    Then user checks user "Samkit" first name and "Jain" surname is present
    Then close browser
