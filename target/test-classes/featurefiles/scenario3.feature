Feature: 3
Scenario: Vaidate current date and mutiple languages   
    Given Browser launched to validate scenario3
    When User opens URL "https://www.datasite.com/us/en/legal/terms-of-use.html"
    Then Click on "TERMS OF USE" at the bottom of page.
    And Validate if today's date is displayed next to "Effective as of".
    Then Click on Language drop on top right corner.
    And Verify drop down has Français, Deutsch, 中文, 日本語, Español and Italiano.
    And close the browser window 
    And exit from browser 