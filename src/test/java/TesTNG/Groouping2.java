package TesTNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = "User Registration")
public class Groouping2 {

	@BeforeTest(groups = "smoke")
	public void pretest() {
		System.out.println("Before every test");
	}

	@AfterTest(description = "Post testcase")
	public void post_test() {
		System.out.println("Inside posttest method");
	}

	@Test(priority = 1, description = "Sixth testcase", groups = { "regression" })
	public void tc6() {
		System.out.println("Inside tc6 method");
	}

	@Test(priority = 7, description = "Seventh testcase", groups = { "smoke" })
	public void tc7() {
		System.out.println("Inside tc7 method");
	}

	@Test(priority = 8, description = "Eights testcase", groups = { "smoke", "regression" })
	public void tc8() {
		System.out.println("Inside tc8 method");
	}

	@Test(priority = 4, description = "Fourth testcase", groups = { "smoke" })
	public void tc4() {
		System.out.println("Inside tc4 method");
	}

	@Test(priority = 5, description = "Fifth testcase", groups = { "regression" })
	public void tc5() {
		System.out.println("Inside tc5 method");
	}
}
