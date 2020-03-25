Feature: Scenarios 
	In order to check if the application is working as required
Scenario: Add a patient 
	Given I should able to login 
	When I  enter details and click on create new patient and confirm new patient 
	Then I should access to the dashboard portal 
Scenario: Search patient 
	Given I should able to login 
	When I click on search and click on patient detail 
	Then I should be access to that patient dashboard portal 
Scenario: Donatenow 
    Given I should able to login
	When I click on about and click on donate now 
	Then I should be access to paypal page 
Scenario: Add facility 
	Given I should able to login 
	When I click on facility and add user 
	Then Ishould able to save 
Scenario: Valid Change Password 
	Given I should able to login 
	When I click on change password and enter details 
	Then password change successful message should display 
	
	
