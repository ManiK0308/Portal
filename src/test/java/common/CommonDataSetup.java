package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {

		
		@BeforeSuite
		public void Loginintoapplication() {
			
			System.out.println("login into the application");
		}
		@AfterSuite
		public void logoutfromapplication() {
			System.out.println("logout from application");
		
	}
}
