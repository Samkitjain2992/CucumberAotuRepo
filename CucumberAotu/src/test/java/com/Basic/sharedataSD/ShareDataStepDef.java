package com.Basic.sharedataSD;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
WebDriver mydriver;
	
   public ShareDataStepDef(ShareDataStepDef2 share) {
	   mydriver = share.setup();
	   
   }

	@Given("^User need to be on your logo page$")
	public void User_need_to_be_on_Yourlogo_page() throws Throwable{
		
	    mydriver.get("http://automationpractice.com/index.php");
	    String getTitle = mydriver.getTitle();
	    System.out.println(getTitle);
	   
	    
	}
	
	 @When("^user click sing button$")
 
 public void user_click_sing_button () {
     
	 mydriver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
	
}
	 @And("^Enter \"([^\"]*)\" email address$")
		public void Enter_email_address(String userEmailAddress) throws InterruptedException {
		 Thread.sleep(10000);
			mydriver.findElement(By.id("email_create")).sendKeys(userEmailAddress);
			
		}

 @And("^User enters user \"([^\"]*)\" surname$")
 public void User_enters_user_surname(String userSurName) {
	 mydriver.findElement(By.id("customer_lastname")).sendKeys(userSurName);
 }
 @Then("^user checks user \"([^\"]*)\" first name and \"([^\"]*)\" surname is present$")
 public void user_checks_user_first_name_and_last_name_is_presentl(String userName,String userSurName) throws Throwable {
	  List<String> checksDetail = new LinkedList<String>();
	   checksDetail.add(mydriver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).getAttribute("value"));
	  checksDetail.add(mydriver.findElement(By.id("customer_lastname")).getAttribute("value"));
	  LinkedList<String> name = new LinkedList<String> ();
	  name.add(userName);
	  name.add(userSurName);
	  Thread.sleep(3000);
	  Assert.assertEquals(name,checksDetail);
	
 }

  
 
 
 
 
 
 
 
 
}
