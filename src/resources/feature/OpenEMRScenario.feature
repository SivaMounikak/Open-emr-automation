Feature: Scenarios 
	In order to check if the application is working as required
Scenario: LoginValidCredential 
	Given i have browser with openemrpage 
	When I enter login details from Excel "src/test/resources/Excel/openEMR.xlsx" with SheetName "LoginValidCredential" 
	Then I should access to the portal with title as 'OpenEMR' 
	
Scenario: invalidCredential 
	Given I have browser with openemrpage 
	When I enter wrong login details from Excel "src/test/resources/Excel/openEMR.xlsx" with SheetName "invalidCredential" 
	Then Error message should be displayed as 'Invalid username or password' 
	
Scenario: createNewPatentError 
	Given I have browser with openemrpage and loggedin 
	When I click on create new patient without entering details 
	Then Error message should be displayed 
	
Scenario: recallBoard 
	Given I have browser with openemrpage and loggedin 
	When I click on recall board and enter details 
	Then New recall should be created 
	
	
Scenario: Create an appointment 
	Given I have browser with openemrpage and loggedin 
	When I click on Time sheet and create an appointment 
	Then New appointment should be created 
	
Scenario: Search an appointment 
	Given I have browser with openemrpage and loggedin 
	When I click on search an appointment 
	Then Searched appointment should be displayed 
	
Scenario: Logout 
	Given I have browser with openemrpage and loggedin 
	When I click on logout 
	Then I should go to the portal with title as 'OpenEMR Login' 
	
