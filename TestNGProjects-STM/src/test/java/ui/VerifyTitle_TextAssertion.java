package ui;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.Assert.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle_TextAssertion {
	@Test
	public void titletest() {

		SoftAssert softassert = new SoftAssert();

		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext = "Search";

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		// driver.manage().window().maximize();

		String actualtitle = driver.getTitle();
		System.out.println("Verifying Title");
		softassert.assertEquals(actualtitle, expectedtitle, "Title Verification Passed");

		String actualtext = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		System.out.println("Verifying Text");

		softassert.assertEquals(actualtext, expectedtext, "Text Verification Passed");
		System.out.println("Closing Browser");

		driver.close();
		softassert.assertAll();
	}

}
