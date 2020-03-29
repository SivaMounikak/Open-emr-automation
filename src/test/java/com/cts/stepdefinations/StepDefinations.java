package com.cts.stepdefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.pages.DashboardPage;
import com.cts.pages.LoginPage;
import com.cts.utils.ReadExcel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations {
	WebDriver driver;

	@Given("i have browser with openemrpage")
	public void i_have_browser_with_openemrpage() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter browser link
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");

	}

	@When("I enter login details from Excel {string} with SheetName {string}")
	public void i_enter_login_details_from_Excel_with_SheetName(String filedetails, String sheetname)
			throws IOException {
		String str[][] = ReadExcel.getSheetIntoStringArray("src/test/resources/Excel/openEMR.xlsx",
				"LoginValidCredential");
		// object for constructor
		LoginPage login = new LoginPage(driver);
		// enter user name
		login.enterUsername(str[0][0]);
		// enter password
		login.enterPassword(str[0][1]);
		// click on login
		login.clickLogin();

	}

	@Then("I should access to the portal with title as {string}")
	public void i_should_access_to_the_portal_with_title_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		String pageSource = driver.getPageSource();
		if (pageSource.toLowerCase().contains("openemr")) {
			System.out.println("PASS");
		} else {
			Assert.fail("Not accessed to required portal");
		}
		driver.quit();

	}

	@Given("I enter the login details from Excel {string} with SheetName {string}")
	public void i_enter_the_login_details_from_Excel_with_SheetName(String filedetails, String sheetname)
			throws IOException {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		String str[][] = ReadExcel.getSheetIntoStringArray("src/test/resources/Excel/openEMR.xlsx",
				"LoginValidCredential");
		// object for constructor
		LoginPage login = new LoginPage(driver);
		// enter user name
		login.enterUsername(str[0][0]);
		// enter password
		login.enterPassword(str[0][1]);
		// click on login
		login.clickLogin();

	}

	@When("I  enter details and click on create new patient and confirm new patient")
	public void i_enter_details_and_click_on_create_new_patient_and_confirm_new_patient() {
		DashboardPage dashboard = new DashboardPage(driver);
		// click on new patient
		dashboard.newpatient();
		// enter prefix of name
		dashboard.enterprefix();
		// enter first name
		dashboard.enterfirstname();
		// enter last name

		dashboard.enterlastname();
		// enter date of birth

		dashboard.enterdob();
		// enter gender

		dashboard.entergender();
		// click on create new patient

		dashboard.createnewpatient();
		// click on confirm new patient

		dashboard.confirmnewpatient();
		// click on alert message
		dashboard.alert();

	}

	@Then("I should access to the dashboard portal")
	public void i_should_access_to_the_dashboard_portal() {
		DashboardPage dashboard = new DashboardPage(driver);
		// get patient detail text on console
		dashboard.gettext();
		driver.quit();

	}

	@When("I click on search and click on patient detail")
	public void i_click_on_search_and_click_on_patient_detail() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage(driver);
		// click on new patient
		dashboard.newpatient();
		// click on search
		dashboard.search();
		// click on patient details
		dashboard.clickpatient();
	}

	@Then("I should be access to that patient dashboard portal")
	public void i_should_be_access_to_that_patient_dashboard_portal() throws InterruptedException {

		DashboardPage dashboard = new DashboardPage(driver);
		// click on another patient detail text on console
		dashboard.getanothertext();
		driver.quit();
	}

	@When("I click on about and click on donate now")
	public void i_click_on_about_and_click_on_donate_now() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage(driver);
		// click on about
		dashboard.clickonabout();
		// click on donate now
		dashboard.clickdonatenow();
	}

	@Then("I should be access to paypal page")
	public void i_should_be_access_to_paypal_page() throws InterruptedException {
		String pageSource = driver.getPageSource();
		if (pageSource.toLowerCase().contains("donate")) {
			System.out.println("PASS");
		} else {
			Assert.fail("Not accessed to required portal");
		}
		driver.quit();

	}

	@When("I click on facility and add user")
	public void i_click_on_facility_and_add_user() throws InterruptedException {

		DashboardPage dashboard = new DashboardPage(driver);
		// Move on administrator
		dashboard.moveonadmin();
		// click on add facility
		dashboard.add();
		// enter name
		dashboard.name();
		// pick colour
		dashboard.colour();
		// click on save
		dashboard.saveadd();
	}

	@Then("Ishould able to save")
	public void ishould_able_to_save() {
		String pageSource = driver.getPageSource();
		if (pageSource.toLowerCase().contains("openemr")) {
			System.out.println("PASS");
		} else {
			Assert.fail("Not accessed to required portal");
		}

		driver.quit();
	}

	@When("I click on change password and enter details")
	public void i_click_on_change_password_and_enter_details() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage(driver);
		// click on BillySmith
		dashboard.moveonbilly();
		// enter current password
		dashboard.currentpassword();
		// enter new password
		dashboard.newpassword();
		// reenter password
		dashboard.reenterpassword();
		// click on save
		dashboard.save();

	}

	@Then("password change successful message should display")
	public void password_change_successful_message_should_display() {
		DashboardPage dashboard = new DashboardPage(driver);
		// get success text on console
		dashboard.getSuccessText();
		driver.quit();
	}
}