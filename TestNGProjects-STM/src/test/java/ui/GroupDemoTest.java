package ui;

import org.testng.annotations.Test;

import common.commonDataSetup;




public class GroupDemoTest extends commonDataSetup {


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
