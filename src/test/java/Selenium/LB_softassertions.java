package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LB_softassertions {

	@Test
	public void assertion_example() {
		SoftAssert sassert = new SoftAssert();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String expectedttitle = "Swag Lab";
		String Actualtitle = driver.getTitle();
		System.out.println("Verifying title");
		sassert.assertEquals(Actualtitle, expectedttitle, "title verification");

		String exptext = "Accepted usernames are:";
		String actualtext = driver.findElement(By.xpath("//div[@id='login_credentials']/h4")).getText();
		System.out.println("Verifying text");
		sassert.assertEquals(exptext, actualtext, "Text verification");

		sassert.assertAll();
		driver.close();

	}
}
