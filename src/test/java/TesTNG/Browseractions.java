package TesTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;

public class Browseractions {

	WebDriver driver = new ChromeDriver();

	@BeforeTest(description = "prerequisite")
	public void Prerequisite() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}

//	@Test(priority = 1, description = "Launch orange hrm")
//	public void testcase1() throws InterruptedException
//	{
//		System.out.println("I am in this testcase1 method");
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(5000);
//	}

	@Test(priority = 2, description = "sending text to username")
	public void tc2_orangelogin() {
		System.out.println("I am in this testcase2 method");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	}

	@Test(priority = 3, description = "Sending text to password")
	public void tc3_orangelogin() {
		System.out.println("I am in this testcase3 method");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	}

	@AfterTest
	public void tc4() {
		driver.quit();
	}

}
