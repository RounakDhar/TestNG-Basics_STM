package ui;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInTestNG {

	@BeforeTest
	public void LogintoApplication() {
		System.out.println("Login to Application");
	}

	@AfterTest
	public void LogoutFromApplication() {
		System.out.println("Logout From Application");
	}

	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB Connected");
	}

	@AfterMethod
	public void DisconnectfromDB() {
		System.out.println("DB DisConnected");
	}

	@Test(priority = 1, description = "this is a login test")
	public void LoginTest()

	{
		System.out.println("Login is Successfull");

	}

	@Test(priority = 2, description = "this is a logout test")
	public void LogoutTest()

	{
		System.out.println("Logout is Successfull");

	}

}
