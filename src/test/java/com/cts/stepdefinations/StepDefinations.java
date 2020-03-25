package com.cts.stepdefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cts.pages.DashboardPage;
import com.cts.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinations {
	WebDriver driver;

	@Given("I should able to login")
	public void i_should_able_to_login() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/a/openemr/interface/login/login.php?site=default");
		LoginPage login = new LoginPage(driver);
		login.enterUsername(driver, "admin");
		login.enterPassword(driver, "pass");
		login.clickLogin(driver);
	}

	@When("I  enter details and click on create new patient and confirm new patient")
	public void i_enter_details_and_click_on_create_new_patient_and_confirm_new_patient() {
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.newpatient(driver);
		dashboard.enterprefix(driver);
		dashboard.enterfirstname(driver, "angel");

		dashboard.enterlastname(driver, "devil");

		dashboard.enterdob(driver, "2020-03-19");

		dashboard.entergender(driver);

		dashboard.createnewpatient(driver);

		dashboard.confirmnewpatient(driver);
		dashboard.alert(driver);

	}

	@Then("I should access to the dashboard portal")
	public void i_should_access_to_the_dashboard_portal() {
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.gettext(driver);
		driver.quit();

	}

	@When("I click on search and click on patient detail")
	public void i_click_on_search_and_click_on_patient_detail() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.newpatient(driver);
		dashboard.search(driver);
		dashboard.clickpatient(driver);
	}

	@Then("I should be access to that patient dashboard portal")
	public void i_should_be_access_to_that_patient_dashboard_portal() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.getanothertext(driver);
		driver.quit();
	}

	@When("I click on about and click on donate now")
	public void i_click_on_about_and_click_on_donate_now() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.clickonabout(driver);
		dashboard.clickdonatenow(driver);
	}

	@Then("I should be access to paypal page")
	public void i_should_be_access_to_paypal_page() throws InterruptedException {
		driver.quit();

	}

	@When("I click on facility and add user")
	public void i_click_on_facility_and_add_user() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.moveonadmin(driver);
		dashboard.add(driver);
		dashboard.name(driver, "dora");
		dashboard.colour(driver, "blue");
		dashboard.saveadd(driver);
	}

	@Then("Ishould able to save")
	public void ishould_able_to_save() {
		driver.quit();
	}

	@When("I click on change password and enter details")
	public void i_click_on_change_password_and_enter_details() throws InterruptedException {
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.moveonbilly(driver);
		dashboard.currentpassword(driver, "pass");
		dashboard.newpassword(driver, "mouni");
		dashboard.reenterpassword(driver, "mouni");
		dashboard.save(driver);

	}

	@Then("password change successful message should display")
	public void password_change_successful_message_should_display() {
		DashboardPage dashboard = new DashboardPage(driver);
		dashboard.getSuccessText(driver);
		driver.quit();
	}
}