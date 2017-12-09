Feature: Attitude Matters

In order to understand Attitude
As a IT working guy
I want to know whom he is wishing


@tester

Scenario Outline: I am a Employee and his attitude

Given I work in Latenights 
When I meet watchman
Then I Greeted him

Given I work in Mornings
When I meet newsPaperBoy
Then I skipGreeting him

Given we work in "<weekday>"
When we meet "<guy>"
Then I skipGreeting him

Examples:
  |weekday    |    guy     |
  |tenpm	  | watchman   |
  |ninepm	  | cabdriver  |	