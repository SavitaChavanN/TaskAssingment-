package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	
static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		
		String path = System.getProperty("user.dir")+"//reports//swaglabs.html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setTheme(Theme.DARK);
		
		reporter.config().setReportName("Swag Labs Report");
		
		extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project name", "Swag Labs");
		
		extent.setSystemInfo("Environment", "SIT");
		
		extent.setSystemInfo("Executed by", "Savita");
		
		return extent;
	}


}
