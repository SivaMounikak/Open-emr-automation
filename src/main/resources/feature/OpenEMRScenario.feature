Feature: Scenarios 
	In order to check if the application is working as required
Scenario: LoginValidCredential 
	Given i have browser with openemrpage 
	When I enter login details from Excel "src/test/resources/Excel/openEMR.xlsx" with SheetName "LoginValidCredential" 
	Then I should access to the portal with title as 'OpenEMR' 
Scenario: Add a patient 
	Given I enter the login details from Excel "src/test/resources/Excel/openEMR.xlsx" with SheetName "LoginValidCredential" 
	When I  enter details and click on create new patient and confirm new patient 
	Then I should access to the dashboard portal 
Scenario: Search patient 
	Given I enter the login details from Excel "src/test/resources/Excel/openEMR.xlsx" with SheetName "LoginValidCredential" 
	When I click on search and click on patient detail 
	Then I should be access to that patient dashboard portal 
Scenario: Donatenow 
	Given  I enter the login details from Excel "src/test/resources/Excel/openEMR.xlsx" with SheetName "LoginValidCredential" 
	When I click on about and click on donate now 
	Then I should be access to paypal page 
Scenario: Add facility 
	Given I enter the login details from Excel "src/test/resources/Excel/openEMR.xlsx" with SheetName "LoginValidCredential" 
	When I click on facility and add user 
	Then Ishould able to save 
Scenario: Valid Change Password 
	Given I enter the login details from Excel "src/test/resources/Excel/openEMR.xlsx" with SheetName "LoginValidCredential" 
	When I click on change password and enter details 
	Then password change successful message should display 
	
	
