package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	@Test
	public void assertion_example() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String Actualtitle = driver.getTitle();
		driver.close();
		String expectedttitle = "Swag Labs";
		Assert.assertEquals(Actualtitle, expectedttitle);

	}
}
