Feature: 1
Scenario: Validate unrecognize username or password 
    Given Browser launched
    When User opens URL "https://americas.datasite.com/"
    And enters email as "info@datasite.com" alongwith password as "admin123"
    And click on LOG IN
    Then see the message "We didn't recognize the username or password you entered. Please try again."
    And close the browser