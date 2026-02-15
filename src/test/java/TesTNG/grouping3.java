package TesTNG;

import org.testng.annotations.*;

public class grouping3 {

	@BeforeTest(description = "Pre testcase")
	public void pre_test() {
		System.out.println("Inside pretest method");
	}

	@AfterTest(description = "Post testcase", groups = { "smoke", "regression" })
	public void post_test() {
		System.out.println("Inside posttest method");
	}

	@BeforeMethod()
	public void beforeeverymethod() {
		System.out.println("DB connected");
	}

	@AfterMethod
	public void aftereverymethod() {
		System.out.println("DB disconnected");
	}

	@Test(priority = 1, description = "First testcase", groups = { "smoke", "regression" })
	public void tc1() {
		System.out.println("Inside tc1 method");
	}

	@Test(priority = 2, description = "Second testcase", groups = { "regression" })
	public void tc2() {
		System.out.println("Inside tc2 method");
	}

	@Test(priority = 3, description = "Third testcase", groups = { "regression" })
	public void tc3() {
		System.out.println("Inside tc3 method");
	}

	@Test(priority = 4, description = "Fourth testcase", groups = { "smoke" })
	public void tc4() {
		System.out.println("Inside tc4 method");
	}

	@Test(priority = 5, description = "Fifth testcase", groups = { "smoke" })
	public void tc5() {
		System.out.println("Inside tc5 method");
	}
}
