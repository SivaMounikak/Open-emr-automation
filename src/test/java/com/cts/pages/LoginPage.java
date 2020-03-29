package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
		private  By usernameLoc=By.id("authUser");
		private  By passLoc=By.id("clearPass");
		private  By languageLoc=By.name("languageChoice");
		private  By clickLoginLoc=By.xpath("//button[@type='submit']");
		private  By errormessgLoc=By.xpath("//div[@class='alert alert-danger login-failure m-1']");
		private WebDriver driver;
		public LoginPage(WebDriver driver) {
			 this.driver=driver;
		 }

		public  void enterUsername(String username)
		{
			driver.findElement(usernameLoc).sendKeys(username);
		}
				
		public  void enterPassword(String password)
		{
			driver.findElement(passLoc).sendKeys(password);
		}
		
		public  void selectLanguage(String language)
		{
		WebElement langSelect = driver.findElement(languageLoc);
		Select selectLanguage = new Select(langSelect);
		selectLanguage.selectByVisibleText(language);
			}
		public  void clickLogin()
		{
			driver.findElement(clickLoginLoc).click();
		}
		public  String errormessg()
		{
			WebElement errorEle = driver.findElement(errormessgLoc);
			String actualmessg = errorEle.getText();
			return actualmessg;
		}

}



