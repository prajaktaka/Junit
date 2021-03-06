package Demo1.Demo1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 


public class Demo1
{   
	static WebDriver driver; 
	
	@Before
	public  void BrowserOpen() 
	{
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/Chrome/chromedriver.exe");     
		driver= new ChromeDriver() ;     
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	}
	
	@Test
	public void Register_User() 
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} 

	@After
	public  void BrowserClose() 
	{
		//driver.quit(); 
	}   
}