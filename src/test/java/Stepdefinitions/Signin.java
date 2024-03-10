package Stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signin {
	
	WebDriver driver;
	
// These are hook methods which executed before and after each testscenario	
	

@Given("User navigated to login page")
public void user_navigated_to_login_page() {
	 driver=DriverFactory.getDriver();
    driver.findElement(By.xpath("//span[text()='My Account']")).click();
    driver.findElement(By.linkText("Login")).click();
    
}

@When("User enters valid email address {string} into email field")
public void user_enters_valid_email_address_into_email_field(String EmailAddressText) {
    driver.findElement(By.id("input-email")).sendKeys(EmailAddressText);
}

@And("User has entered valid password {string} into password field")
public void user_has_entered_valid_password_into_password_field(String PasswordText) {
    driver.findElement(By.id("input-password")).sendKeys(PasswordText);
}

@When("User clicks on login button")
public void user_clicks_on_login_button() {
    driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("User should get succesfully logged in")
public void user_should_get_succesfully_logged_in() {
    Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
}

@When("User enters invalid email address {string} into email field")
public void user_enters_invalid_email_address_into_email_field(String invalidEmailAddress) {
	driver.findElement(By.id("input-email")).sendKeys(invalidEmailAddress);
}

@Then("User should get a proper warning message")
public void user_should_get_a_proper_warning_message() {
    Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).isDisplayed());
    		
}

@When("User has entered invalid password {string} into password field")
public void user_has_entered_invalid_password_into_password_field(String invalidPasswordText) {
	 driver.findElement(By.id("input-password")).sendKeys(invalidPasswordText);
}

@And("User does not enter email address into email field")
public void user_does_not_enter_email_address_into_email_field() {
	driver.findElement(By.id("input-email")).sendKeys("");
}

@And("User does not entered password into password field")
public void user_does_not_entered_password_into_password_field() {
	driver.findElement(By.id("input-password")).sendKeys("");
}

}
