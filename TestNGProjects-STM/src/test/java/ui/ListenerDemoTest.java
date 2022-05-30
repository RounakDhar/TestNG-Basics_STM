package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;
import common.RetryAnalyzer;

public class ListenerDemoTest extends BaseTest{

	
		@Test(retryAnalyzer = RetryAnalyzer.class)

		public void launchApp() {
			driver.get("https://ebay.com");
			Assert.assertTrue(false);
		}
	}


