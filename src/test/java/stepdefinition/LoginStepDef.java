package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {
	
	WebDriver driver = Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	   
        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS );
	
        
	}

	@When("I entered the correct username and password")
	public void i_entered_the_correct_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement UserName = driver.findElement(By.name("user_login"));
        UserName.sendKeys("abc@xyz.com");
        
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Test@1234");
		
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I entered the incorrect username and password")
	public void i_entered_the_incorrect_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement UserName = driver.findElement(By.name("user_login"));
        UserName.sendKeys("abc@xyz.com");
        
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Test@1234");
	}

	@Then("I should get error message {string}")
	public void i_should_get_error_message(String ExpError) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement Error = driver.findElement(By.id("msg_box"));
		String ActError = Error.getText();
		Assert.assertEquals(ExpError, ActError);
		
	}
	
	@And("I click on the Login Link")
	public void i_click_on_the_Login_Link() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(4000);
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
        LoginLink.click();
	}

	@And("I Click the Login Button")
	public void i_Click_the_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
        LoginButton.click();
	}
	
	@When("I enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String Usernameval, String Pswval) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement UserName = driver.findElement(By.name("user_login"));
        UserName.sendKeys(Usernameval);
        
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys(Pswval);
	}
}
