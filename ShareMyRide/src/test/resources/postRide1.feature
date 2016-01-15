Feature: Post a ride.
As a Employee I want to share my Car so that anyone can travel with me

Scenario: Correct Data posting
Given employee enter all the data 
When Click on submit
Then System display message "Posting Successful"

Scenario: Reset Entered Data
Given employee enter all the data 
When Click on Reset
Then All the entered data should be cleared

@vikas
Scenario: Data posting with Sample Data
Given employee Name : "Vikas" , Source : "Dwarka" , Destination : "Bldg 3 Gurgaon", Time : "11:30"
When Click on submit
Then System display message "Posting Successful"

Scenario: Name can't be blank
Given Employee give name as ""  
When Click on submit
Then System display message "Validation Error Name is Missing"

Scenario:Data Validation
Given Employee is logged in on portal
And employee enters incomplete data Source is missing
When Click on submit
Then System display message "Missing required information"
And data should be displayed on the top in display screen

	