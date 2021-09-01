Feature: 3
Scenario: Vaidate current date and mutiple languages   
    Given Browser launched
    When User opens URL "https://americas.datasite.com/"
    Then Click on "TERMS OF USE" at the bottom of page.
    And Validate if today's date is displayed next to "Effective as of".
    Then Click on Language drop on top right corner.
    And Verify drop down has Français, Deutsch, 中文, 日本語, Español and Italiano.
    And enters email as "info@datasite.com" alongwith password as "admin123"
    And click on LOG IN
    Then see the message "We didn't recognize the username or password you entered. Please try again."
    And close the browser window 
    And exit from browser 