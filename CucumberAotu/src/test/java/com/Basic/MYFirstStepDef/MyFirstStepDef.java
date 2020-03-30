package com.Basic.MYFirstStepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
WebDriver mydriver;

@Given("^User need to be on your logo page$")
public void User_need_to_be_on_Yourlogo_page() throws Throwable{
	
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
    mydriver = new ChromeDriver();
    mydriver.get("http://automationpractice.com/index.php");
    String getTitle = mydriver.getTitle();
    System.out.println(getTitle);
   
    
}

 @When("^user click sing button$")

public void user_click_sing_button () {
 
 mydriver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

}
 @And("^Enter email address$")
	public void Enter_email_address() throws InterruptedException {
	 Thread.sleep(10000);
		mydriver.findElement(By.id("email_create")).sendKeys("samkitjain@cdnsol.com");
		
	}
 
@Then("^check Email address field$")
public void  User_checks_Email_address_field() {
WebElement verifySingingPage = mydriver.findElement(By.id("email_create"));
    String userNameActual    = verifySingingPage.getAttribute("value");

System.out.println(userNameActual);
Assert.assertEquals(userNameActual,"samkitjain@cdnsol.com" );
//  throw new PendingException();


}
}





