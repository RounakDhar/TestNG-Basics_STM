package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAssertionTest {

	@Test
	public void titletest() {
		String expectedtitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		// driver.manage().window().maximize();

		String actualtitle = driver.getTitle();

		Assert.assertEquals(actualtitle, expectedtitle);
		driver.close();
	}

}
