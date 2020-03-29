package com.cts.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
private  By newsearchLoc = By.xpath("//div[text()='New/Search']");
private  By patientLoc = By.xpath("//div[text()='Patient/Client']");
private  By selectLoc = By.xpath("(//select[@class='form-control'])[1]");
private  By firstnameLoc = By.id("form_fname");
private  By lastnameLoc = By.id("form_lname");
private  By idLoc = (By.xpath("//input[@id='form_pubpid']"));
private  By dobLoc = By.id("form_DOB");
private  By genderLoc = By.id("form_sex");
private  By createLoc = By.id("create");
private  By confirmLoc = By.xpath("//input[@value='Confirm Create New Patient']");
private  By searchOrAddLoc = By.xpath("//span[text()='Search or Add Patient']");
private  By alertLoc = By.xpath("//div[@class='closeDlgIframe']");
private  By gettextLoc = By.xpath("//h2[text()='Medical Record Dashboard - Angel Devil   ']");
private  By searchLoc = By.id("search");
private  By clickpatientLoc = By.xpath("(//td[@class='srName'])[1]");
private  By getanothertextLoc = By.xpath("//h2[text()='Medical Record Dashboard - Phil Belford   ']");
private  By billyLoc = By.id("username");
private  By changeLoc = By.xpath("//li[@data-bind='click: changePassword']");
private  By currentpasswordLoc = By.id("curPass");
private  By newpasswordLoc = By.name("newPass");
private  By saveLoc = By.xpath("//button[@type='Submit']");
private  By textchange = By.xpath("//div[@class='alert alert-success']");
private  By errormessageLoc = By.xpath("//div[@class='alert alert-danger']");
private  By aboutLoc = By.xpath("//div[contains(text(),'About')]");
private  By donateLoc = (By.xpath("//i[@class='fa fa-2x fa-heart']"));
private  By adminLoc=By.xpath("//div[contains(text(),'Administration')]");
private  By facLoc=By.xpath("//div[contains(text(),'Facilities')]");
private  By addLoc=By.xpath("//a[@class='addfac_modal btn btn-default btn-add']");
private  By nameLoc=By.name("facility");
private By colourLoc=By.name("ncolor");
private  By saveaddLoc=By.name("form_save");
private WebDriver driver;
public DashboardPage(WebDriver driver) {
	 this.driver=driver;
 }

public  void newpatient() {
WebElement patientEle = driver.findElement(patientLoc);
Actions actions = new Actions(driver);
actions.moveToElement(patientEle).build().perform();
driver.findElement(newsearchLoc).click();
}

public  void enterprefix() {

driver.findElement(searchOrAddLoc).click();
driver.switchTo().frame("pat");
// Thread.sleep(5000);

WebElement assigenedName = driver.findElement(selectLoc);

Select selectAssigenedName = new Select(assigenedName);

selectAssigenedName.selectByVisibleText("Mr.");

}

public  void enterfirstname() {
driver.findElement(firstnameLoc).sendKeys("angel");
}

public  void enterlastname() {
driver.findElement(lastnameLoc).sendKeys("devil");
}

public  void enterdob() {
driver.findElement(dobLoc).sendKeys("2020-03-19");

}

public  void entergender() {
WebElement sexEle = driver.findElement(genderLoc);
Select selectsexEle = new Select(sexEle);
selectsexEle.selectByVisibleText("Male");
}

public  void createnewpatient() {
driver.findElement(createLoc).click();
// driver.switchTo().defaultContent();
}

public  void confirmnewpatient() {
driver.switchTo().defaultContent();
driver.switchTo().frame("modalframe");
driver.findElement(confirmLoc).click();
}

public  void alert() {
driver.switchTo().defaultContent();
driver.switchTo().frame("pat");
WebDriverWait wait = new WebDriverWait(driver, 50);
wait.until(ExpectedConditions.alertIsPresent());

Alert alertclass = driver.switchTo().alert();
String alertbox = alertclass.getText();
System.out.println(alertbox);
alertclass.accept();
//driver.findElement(alertLoc).click();

}

public  void gettext() {
driver.switchTo().defaultContent();
driver.switchTo().frame("pat");

WebElement enteredText = driver.findElement(gettextLoc);

System.out.println(enteredText.getText());
}

public  void search() throws InterruptedException {

driver.switchTo().defaultContent();
Thread.sleep(5000);
driver.switchTo().frame("pat");
Thread.sleep(3000);
driver.findElement(searchLoc).click();
}

public  void clickpatient() {
driver.switchTo().defaultContent();
driver.switchTo().frame("modalframe");
driver.findElement(clickpatientLoc).click();
}

public  void getanothertext() throws InterruptedException {
driver.switchTo().defaultContent();
driver.switchTo().frame("pat");
Thread.sleep(3000);
WebElement enteredText = driver.findElement(getanothertextLoc);
System.out.println(enteredText.getText());
}

public  void moveonbilly() {
WebElement billy= driver.findElement(billyLoc);
Actions actions = new Actions(driver);
actions.moveToElement(billy).build().perform();
driver.findElement(changeLoc).click();
}
public  void currentpassword() throws InterruptedException {
driver.switchTo().defaultContent();
driver.switchTo().frame("msc");
Thread.sleep(3000);
driver.findElement(currentpasswordLoc).sendKeys("pass");


}
public  void  newpassword() {

driver.findElement(newpasswordLoc).sendKeys("mouni");

}
public  void reenterpassword() {
// driver.switchTo().defaultContent();
// driver.switchTo().frame("msc");
driver.findElement(By.name("newPass2")).sendKeys("mouni");
}
public  void save() {
driver.switchTo().defaultContent();
driver.switchTo().frame("msc");
driver.findElement(saveLoc).click();
}
public  void getSuccessText() {
driver.switchTo().defaultContent();
driver.switchTo().frame("msc");
WebElement enteredtheText = driver.findElement(textchange);

System.out.println(enteredtheText.getText());
}
public  void geterrormessage() {
driver.switchTo().defaultContent();
driver.switchTo().frame("msc");
WebElement errormessage= driver.findElement(errormessageLoc);
System.out.println(errormessage.getText());
}
public  void clickonabout() {
	//driver.switchTo().defaultContent();
driver.findElement(aboutLoc).click();
}

public  void clickdonatenow() throws InterruptedException {
driver.switchTo().defaultContent();
driver.switchTo().frame("msc");
Thread.sleep(3000);
driver.findElement(donateLoc).click();
}
public  void moveonadmin() {
WebElement admin= driver.findElement(adminLoc);
Actions actions = new Actions(driver);
actions.moveToElement(admin).build().perform();
driver.findElement(facLoc).click();

}
public  void add() throws InterruptedException {
Thread.sleep(3000);
driver.switchTo().defaultContent();
driver.switchTo().frame("adm");

driver.findElement(addLoc).click();
}
public  void name() throws InterruptedException {
driver.switchTo().defaultContent();
driver.switchTo().frame("modalframe");
Thread.sleep(3000);
driver.findElement(nameLoc).sendKeys("dora");
}
public  void colour() {
driver.findElement(colourLoc).sendKeys("blue");
}
public  void saveadd() {
driver.findElement(saveaddLoc).click();;

}

}

