package com.sadakar.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.sadakar.common.BasePage;

import io.cucumber.java.en.Then; 
public class DirectoryPage extends BasePage{
	
	@Then("User is on Directory page")
	public void directoryPage() {

		driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Then("Is Search button displayed")
	public void isSearchButtonDisplayed() {
	
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"searchBtn\"]"));
		Assert.assertTrue(searchButton.isDisplayed());
	}



}
