package TesTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Order_Of_Execution {

	@Test(priority = 0)
	public void atestcase1() throws InterruptedException {
		System.out.println("I am in this testcase1 method");
	}

	@Test(priority = 0)
	public void a1tc2_orangelogin() {
		System.out.println("I am in this testcase2 method");
	}

	@Test(priority = 0)
	public void aa3_orangelogin() {
		System.out.println("I am in this testcase3 method");
	}
}
