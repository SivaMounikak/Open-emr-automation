$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/OpenEMRScenario.feature");
formatter.feature({
  "name": "Scenarios",
  "description": "\tIn order to check if the application is working as required",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search patient",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the login details from Excel \"src/test/resources/Excel/openEMR.xlsx\" with SheetName \"LoginValidCredential\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_enter_the_login_details_from_Excel_with_SheetName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on search and click on patient detail",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_click_on_search_and_click_on_patient_detail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be access to that patient dashboard portal",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_should_be_access_to_that_patient_dashboard_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Donatenow",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the login details from Excel \"src/test/resources/Excel/openEMR.xlsx\" with SheetName \"LoginValidCredential\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_enter_the_login_details_from_Excel_with_SheetName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on about and click on donate now",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_click_on_about_and_click_on_donate_now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be access to paypal page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_should_be_access_to_paypal_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add facility",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the login details from Excel \"src/test/resources/Excel/openEMR.xlsx\" with SheetName \"LoginValidCredential\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_enter_the_login_details_from_Excel_with_SheetName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on facility and add user",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_click_on_facility_and_add_user()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ishould able to save",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.ishould_able_to_save()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Change Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the login details from Excel \"src/test/resources/Excel/openEMR.xlsx\" with SheetName \"LoginValidCredential\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_enter_the_login_details_from_Excel_with_SheetName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on change password and enter details",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.i_click_on_change_password_and_enter_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password change successful message should display",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinations.StepDefinations.password_change_successful_message_should_display()"
});
formatter.result({
  "status": "passed"
});
});