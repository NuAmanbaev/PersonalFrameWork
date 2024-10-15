@SignInFunction

  Feature: Signing in


    Background:
      Given user is on CashWiseHomePage


      @SignUpStep

      Scenario: verify user is able create an account
        When user click on singup button
        And user click enters his "email"
        And user enters hiw "Zarylkanova2000"
        And confirms his "Zarylkanova2000"
        And user click on continue button
        And user enters his "name"
        And user enters his lastname "lastName"
        And user enters his name of business "nameOfBusiness"
        And user selects area of business from dropDown
        And user select retail business
        And user enters his address "Address"
        And user selects currency from dropdown
        And user cliks on UDS
        And user clicks on signIn
        Then verify that user is siged in



