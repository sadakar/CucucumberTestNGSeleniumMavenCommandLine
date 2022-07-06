package com.sadakar.stepdefinitions;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.sadakar.common.BasePage;

import io.cucumber.java.en.Then; 
public class DashboardPage extends BasePage {

	@Then("User finds the list of quick launch elements")
	public void listOfQuickLaunchElementsOnDashboardPage() {

		// Adding table data of a row to WebElement List
		List<WebElement> actualListOfQuickLaunchElements = driver
				.findElements(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td"));

		// Display the table data of row from the WebElementList
		for (WebElement ele : actualListOfQuickLaunchElements) {
			System.out.println(ele.getText());
		}

		// Display the size of WebElement List
		System.out.println("Size of Quick launch elements : " + actualListOfQuickLaunchElements.size());

	}

	@Then("User clicks on Directory tab and verifies the navigation")
	public void navigateToDirectoryTabFromDashbaordTab() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[@id=\"menu_directory_viewDirectory\"]")).click();
	}

}
