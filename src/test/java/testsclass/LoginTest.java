package testsclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import extentlisteners.ListenerClass;

public class LoginTest  extends ListenerClass {
	
	WebDriver driver;
	@Test( priority = 1)
	public void verifylogin()
	{	
		
		lp.enterCredentials();
	
		
	}

	
	
}
