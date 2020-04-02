package com.Basic.tagsSD;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TagsStepDef {
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
	 @And("^Enter \"([^\"]*)\" email address$")
		public void Enter_email_address(String userEmailAddress) throws InterruptedException {
		 Thread.sleep(10000);
			mydriver.findElement(By.id("email_create")).sendKeys(userEmailAddress);
			
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
	 Thread.sleep(10000);
	 Thread.sleep(10000);
	 mydriver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys(userName);
	WebElement TitleClick= mydriver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
	Thread.sleep(3000);
	TitleClick.click();
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
	  Thread.sleep(2000);
	  Assert.assertEquals(checksDetail, name);
	// throw new PendingException();
 }
 
 @Then("^close browser$")
 public void close_browser() {
	 mydriver.quit();
	 mydriver=null;
 }
 

}
