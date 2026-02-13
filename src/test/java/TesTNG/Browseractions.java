package TesTNG;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Browseractions {
	
	WebDriver driver = new ChromeDriver();
	
	@Test(priority = 1)
	public void testcase1()
	{
		System.out.println("I am in this testcase1 method");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test(priority = 2)
	public void tc2_orangelogin()
	{
		System.out.println("I am in this testcase2 method");
		driver.findElement(By.name("username")).sendKeys("Admin");
	}
	
	
	@Test(priority = 3)
	public void tc3_orangelogin()
	{
		System.out.println("I am in this testcase3 method");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
}

