Feature: 2
Scenario: Validate error message "Error: Invalid email address
    Given Browser launched
    When User opens URL "https://americas.datasite.com/"
    And Click on Submit without giving any email address.
    Then Validate if the error message is "Error: Email address required"
    And Enter some text "abcd" and click on Submit
    Then see the message "Error: Email address require"
    And exit the browser