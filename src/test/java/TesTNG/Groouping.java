package TesTNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = "User Registration")
public class Groouping {

	@BeforeTest(groups = "smoke")
	public void pretest() {
		System.out.println("Before every test");
	}

	@Test(priority = 1, description = "First testcase", groups = { "smoke", "regression" })
	public void tc1() {
		System.out.println("Inside tc1 method");
	}

	@Test(priority = 2, description = "Second testcase", groups = { "regression" })
	public void tc2() {
		System.out.println("Inside tc2 method");
	}

	@Test(priority = 3, description = "Third testcase", groups = { "smoke", "regression" })
	public void tc3() {
		System.out.println("Inside tc3 method");
	}

	@Test(priority = 4, description = "Fourth testcase", groups = { "regression" })
	public void tc4() {
		System.out.println("Inside tc4 method");
	}

	@Test(priority = 5, description = "Fifth testcase", groups = { "regression" })
	public void tc5() {
		System.out.println("Inside tc5 method");
	}
}
