package com.Basic.dataTableSD;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DataTableStepDef {
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
	 @When("^Enter \"([^\"]*)\" email address$")
		public void Enter_email_address(String userEmailAddress) throws InterruptedException {
	 Thread.sleep(10000);
			mydriver.findElement(By.id("email_create")).sendKeys(userEmailAddress);
			
		}
	 
// @When("^check \"([^\"]*)\" Email address field$")
//public void  User_checks_Email_address_field(String userEmailAddress ) throws InterruptedException {
//	WebElement verifySingingPage = mydriver.findElement(By.id("email_create"));
//    String userNameActual    = verifySingingPage.getAttribute("value");
//    
//	System.out.println(userNameActual);
//    Assert.assertEquals(userNameActual,userEmailAddress );
//    Thread.sleep(10000);
//  }
// 
//   @When("^user need to be on your logo SignIn page$")
//        public void user_need_to_be_on_your_logo_singnin_page() {
//	    mydriver.manage().window().maximize();
//	  	mydriver.findElement(By.className("page-heading"));	
//	 }

 
// @When("^user click on create account button and Create account page should be open there$")
// public void user_click_on_create_account_button () throws InterruptedException {
//	 Thread.sleep(3000);
//	 mydriver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
//	String pageTitle = mydriver.findElement(By.className("page-subheading")).getText();
//	 Assert.assertEquals(pageTitle, "CREATE AN ACCOUNT");
//	 
// }
 @When("^Enter followind data$")
 public void Enter_followind_data(DataTable table)  {
	List<List<String>> data = table.raw();
	
	String values1 = data.get(0).get(0);
	String values2 = data.get(0).get(1);
	
	String values3 = data.get(1).get(0);
	String values4 = data.get(1).get(1);

	
	
	// mydriver.findElement(By.xpath("//i[@id=\"customer_firstname\"]")).sendKeys(userName);
 }
// @And("^User enters user \"([^\"]*)\" surname$")
// public void User_enters_user_surname(String userSurName) {
//	 mydriver.findElement(By.id("customer_lastname")).sendKeys(userSurName);
// }


}
