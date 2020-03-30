Feature: Create account in Your logo Site6
  As a user u need to open Your logo page and do the validations

  Scenario Outline: Validate create user multiple fields
    Given User need to be on your logo page
    When user click sing button
    And Enter "samkitjain@cdnsol.com" email address
    And user need to be on your logo SignIn page
    And user click on create account button and Create account page should be open there
    When user enters Title and user as "<username>" first name
    And User enters user as "<usersurname>" surname
    Then user checks user as "<username>" first name and as "<usersurname>" surname is present
    Then close browser

    Examples: 
      | username | usersurname |
      | Samkit   | jain        |
     
