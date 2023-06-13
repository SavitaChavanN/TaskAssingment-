package testsclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Senario1;
import pages.Senario2;
import pages.Senario3;
import pages.Senario4;
import utility.ReadDataFromConfig;

public class BaseTest {
	public static WebDriver driver;
	//public Senario1 lp;
	//public Senario2 lp;
	//public Senario3 lp;
	public Senario4 lp;
		
	@BeforeSuite
	public void initBrowser() throws IOException{
	
		
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();

         driver.manage().window().maximize();// to maximize the window

		//driver.get("https://www.saucedemo.com/");
         String url = ReadDataFromConfig.getPropData("testsiteurl");
 		
 		driver.get(url);
		
		
	}

	@AfterSuite
	public void teardown()
	{
		//driver.quit();
	}
	
	@BeforeClass
	public void createobject() throws IOException
	{

	//lp=new Senario1(driver);
	//lp=new Senario2(driver);
		//lp=new Senario3(driver);
			
	lp=new Senario4(driver);
			
	}

}
