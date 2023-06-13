package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ScreenShots {
	 public static void capturescreenshot(WebDriver driver, String filename) throws IOException
	 {
		 TakesScreenshot scrshot=(TakesScreenshot)driver;
		 File source = scrshot.getScreenshotAs(OutputType.FILE);
		 String path="C:\\SeleniumAutomation\\capturescreenshot\\" +filename+".png";
		 File destination=new File(path);
			//	 FileHandler.copy(source,destination);
		 FileHandler.copy(source,destination);
	 
	 }
	 public static void main(String[] args) {
		
		 
	}

}
