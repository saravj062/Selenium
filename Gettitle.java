package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Gettitle {
	
	@Test
    public void getpagetitle() {

    System.setProperty("webdriver.chrome.driver", "D://Shanthi_Selenium//Selenium//src//Drivers//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    String title = driver.getTitle();
    System.out.println("This is the title of the Facebook home page " +  title);
    String expected = "Facebook - Log In or Sign Up";
    //Assert.assertEquals(title,expected);
    Assert.assertTrue(title.contains("Facebook - Log In or Sign Up"));
    System.out.println("Test case passed");


}
}