Feature: User should able to add new comment successfully and able to see comment successful messege.
@test2
Scenario: User should be able to comment successfully.
Given user is on  homepage of https://demo.nopcommerce.com/
When user clicks on View News Archive link.
And user clicks on first Details button.
And user enters Title.
And user enters Comment.
And user clicks on New comment button.
Then user should able to see new comment successful message

