Feature: Simple Addition

  Scenario Outline: Search GEM Company
    Given I navigate browser to "<link>"
    When I enter to input to search "<textSearch>"
    Then the result should be "<expectedResult>" on the screen
    Examples:
      | link | textSearch | expectedResult |
      | https://google.com.vn | GEM vietnam | kết quả |