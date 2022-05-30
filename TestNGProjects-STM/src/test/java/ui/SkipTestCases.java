package ui;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCases {

	Boolean datasetup = false;

	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("Skipping this test as it is not Completed");
	}

	@Test
	public void skipTest2() {
		System.out.println("Skipping this test Forcefully");
		throw new SkipException("Skipping this Test");
	}

	@Test
	public void skipTest3() {
		System.out.println("Skipping this test based on Condition");
		if (datasetup == true) {
			System.out.println("Execute the Test");
		} else {
			System.out.println("Do Not Execute further steps");
			throw new SkipException("Do Not Execute Further Steps");
		}
	}

}
