package TesTNG;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.testng.SkipException;
import org.testng.annotations.Test;

/*
 * We can skip the testcases in java multiple ways
 * 1. (enabled = false)
 * 2. Throwing skipException during run time. 
 * 
 * 
 */
public class SkipDemotest {

	boolean DBconnection = true;

	@Test(enabled = false)
	public void skip_test1() {
		System.out.println("Skipping test1");
	}

	@Test
	public void skip_test2() {
		System.out.println("Skipping test2");
		System.out.println("i am in test2");
		throw new SkipException("Throwing skip execpetion");
	}

	@Test
	public void skip_test3() {
		System.out.println("Skipping test3");
		if (DBconnection) {
			System.out.println("We are executing the current testcase");
		} else {
			System.out.println("We are not executing this testcase");
			throw new SkipException("DB connectipon failed throwing runtime exception");
		}
	}

}
