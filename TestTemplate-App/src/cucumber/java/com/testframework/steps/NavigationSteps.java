package com.testframework.steps;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class NavigationSteps {
	WebDriver driver;
	
	@Before
	public void beforeScenario() {
		
		//Set the drivers:
		System.setProperty("webdriver.chrome.driver", "C:\\apps\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@When("^we access \"(.*)\" using Google Chrome$")
	public void I_Access(String url) {
		driver.get(url);
	}
	
	@When("^I click the About button$")
	public void About_Click() {
		driver.findElement(By.id("about-button")).click();
	}
	
	@When("^I click the Contact button$")
	public void Contact_Click() {
		driver.findElement(By.id("contact-button")).click();
	}
	
	@When("^I click the Home button$")
	public void Home_Click() {
		driver.findElement(By.id("home-button")).click();
	}
	
	@When("^I click the Project Title button$")
	public void ProjectTitle_Click() {
		driver.findElement(By.id("projectTitle-button")).click();
	}
	
	@Then("^the title should be \"(.*)\"")
	public void Page_Title(String title) {
		assertEquals(title, driver.getTitle());
	}
	
	@After
	public void afterScenario() {
		driver.quit();
	}
}
