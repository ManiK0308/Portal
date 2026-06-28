package Selenium;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandling {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentwindow = driver.getWindowHandle();
		List  windowhandles = (List) driver.getWindowHandles();
		System.out.println("Total number of windows opened: " + windowhandles.size());
		driver.close();
	}
}
