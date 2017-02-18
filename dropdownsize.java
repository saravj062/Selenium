import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownsize {
	WebDriver driver;
	@Test
	public void dropdwn()
	
	{
		System.setProperty("webdriver.chrome.driver","D:\\Shanthi_Selenium\\Selenium\\src\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//List <WebElement> dd = driver.findElements(By.tagName("select"));
		
		//By Class
		By day = By.name("birthday_day");
		By year = By.name("birthday_year");
		By radio = By.xpath("//input[@type='radio']"); 
		By textboxes = By.xpath("//input[@type='text' or @class='inputtext']");
		
		//Page Load Timeout
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			
		
		//Select Class
		Select monsel = new Select(driver.findElement(By.id("month")));
		Select daysel = new Select(driver.findElement(day));
		Select yearsel = new Select(driver.findElement(year));
		
		
		
		monsel.selectByValue("6");
		//List Interface
		List <WebElement> monthlist = monsel.getOptions();
		//int size = dd.size();
		
		for(int i = 0;i<monthlist.size();i++)
		{ 
			String monthname = monthlist.get(i).getText();
			
			System.out.println("The months are  " + monthname);
			
			
	
		}System.out.println("The number of months in the dropdown  " + monthlist.size());
		
		
		List <WebElement> daylist = daysel.getOptions();
				
		for(int i = 0;i<daylist.size();i++)
		{ 
			String dayname = daylist.get(i).getText();
			
			
			System.out.println("The days are  " + dayname);
			
			
		}
		System.out.println("The number of days in the dropdown  " + daylist.size());
		
		List <WebElement> yearlist = yearsel.getOptions();
		
		for(int i = 0;i<yearlist.size();i++)
		{ 
			String yearname = yearlist.get(i).getText();
			
			System.out.println("The " + i + " year is  " + yearname);
				
		}
		
		System.out.println("The number of years in the dropdown  " + yearlist.size());
		
		
		List <WebElement> rad = driver.findElements(radio);
		 	
		System.out.println("The number of radio buttons are  " + rad.size());
		
		List <WebElement> textboxlist = driver.findElements(textboxes);
		
		System.out.println("The number of textboxes are  " + textboxlist.size());
				
		
	driver.quit();
	}

}
