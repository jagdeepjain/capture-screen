/**
 * 
 */
package org.util.screen.capture.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Jagdeep Jain
 *
 */
public class SetupBrowser {

	AppConfig appConfig = new AppConfig();
	
	//using fireFox to test application
	public WebDriver setBrowser(WebDriver driver) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver;
	}

	//TODO add support for other browsers
	
	public WebDriver getBrowser(WebDriver driver) {
		return setBrowser(driver);
		
	}
	
}
