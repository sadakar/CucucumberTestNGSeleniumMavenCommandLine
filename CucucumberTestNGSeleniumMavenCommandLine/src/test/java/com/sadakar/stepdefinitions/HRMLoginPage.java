package com.sadakar.stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.sadakar.common.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then; 
public class HRMLoginPage extends BasePage {

	
	@Given("User login to HRM application with UserName and Password")
	public void loginToHRMApp(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> cells = dataTable.cells();
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(cells.get(0).get(0));
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(cells.get(0).get(1));
		driver.findElement(By.id("btnLogin")).submit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("User navigates to Dashboard page")
	public void navigateToDashboardTab() {
	   
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu_dashboard_index\"]")));
		
		WebElement dashboardLabel = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1"));
		Assert.assertTrue(dashboardLabel.isDisplayed());
		
	}


}
