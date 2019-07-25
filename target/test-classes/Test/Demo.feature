Feature: Test Login functionality

Scenario: Login with valid data
Given user opens login portal
When user enters username as "mercury"
When user enters password as "mercury"
And Clicks on singn button
Then validate login success
