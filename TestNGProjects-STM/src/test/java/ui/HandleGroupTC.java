package ui;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "user-registration")
public class HandleGroupTC {

	@BeforeClass
	public void beforeclass()

	{
		System.out.println("Run this Before Class");

	}

	@AfterClass
	public void afterclass()

	{
		System.out.println("Run this After Class");

	}

	@BeforeGroups(value = "regression")
	public void beforeGroup()

	{
		System.out.println("Run this Before Regression");

	}

	@AfterGroups(value = "regression")
	public void afterGroup()

	{
		System.out.println("Run this After Regression");

	}

	@Test(priority = 1, groups = "regression")
	public void aTest1()

	{
		System.out.println("test1");

	}

	@Test(priority = 2, groups = { "regression", "bvt" })
	public void bTest2()

	{
		System.out.println("test2");

	}

	@Test(groups = "bvt")
	public void cTest3()

	{
		System.out.println("test3");

	}

	@Test(groups = "smoke")
	public void dTest4()

	{
		System.out.println("test4");

	}

}
