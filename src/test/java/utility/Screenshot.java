package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static String captureScreenshotWithPath(WebDriver driver, String filename) throws IOException
	{
		
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
	
		String path = System.getProperty("user.dir")+"\\screenshots\\"+filename+".png";
	
		// String path="C:\\SeleniumAutomation\\capturescreenshot\\" +filename+".png";
			
		
		File destination = new File(path);
	
		FileHandler.copy(source, destination);
		
		return path;
	}
	public static void captureScreenshot(WebDriver driver, String filename) throws IOException
	{
		
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
	
		String path = System.getProperty("user.dir")+"\\screenshots\\"+filename+".png";
		
		
		File destination = new File(path);
	
		FileHandler.copy(source, destination);
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
		String path = "C:\\SeleniumAutomation\\capturescreenshot";

		File destination = new File(path);
	
		FileHandler.copy(source, destination);
		
		
	}

}
