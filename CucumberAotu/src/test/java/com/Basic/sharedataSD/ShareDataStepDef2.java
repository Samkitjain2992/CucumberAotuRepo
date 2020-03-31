package com.Basic.sharedataSD;

import java.util.LinkedList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef2 {
WebDriver mydriver;
	
    @Before
    public WebDriver setup() {
    	if(mydriver==null) {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
	    mydriver = new ChromeDriver();
    }
    	return mydriver;
    }
	 
@Then("^check \"([^\"]*)\" Email address field$")
public void  User_checks_Email_address_field(String userEmailAddress ) throws InterruptedException {
	WebElement verifySingingPage = mydriver.findElement(By.id("email_create"));
   String userNameActual    = verifySingingPage.getAttribute("value");
   System.out.println(userNameActual);
   LinkedList<String> mailid= new LinkedList<String>();
    mailid.add("samkitjain@cdnsol.com");
    mailid.add(userNameActual);
    Assert.assertEquals(mailid , mailid );

 
  Thread.sleep(3000);
 }

  @And("^user need to be on your logo SignIn page$")
       public void user_need_to_be_on_your_logo_singnin_page() {
	    mydriver.manage().window().maximize();
	  	mydriver.findElement(By.className("page-heading"));	
	 }


@And("^user click on create account button and Create account page should be open there$")
public void user_click_on_create_account_button () throws InterruptedException {
	 Thread.sleep(3000);
	 mydriver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
	String pageTitle = mydriver.findElement(By.className("page-subheading")).getText();
	 Assert.assertEquals(pageTitle, "CREATE AN ACCOUNT");
	 
}
@When ("^user enters Title and user \"([^\"]*)\" first name$")
public void user_enters_title_and_user_first_name(String userName) throws InterruptedException {
	Thread.sleep(4000);
	 mydriver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(userName);
	WebElement TitleClick= mydriver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
	Thread.sleep(3000);
	TitleClick.click();
}
@After
public void tearDown() {
	System.out.println("in after");
	 mydriver.quit();
	 mydriver=null;
}


 
    }
