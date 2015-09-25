/**
 * 
 */
package org.jagdeep.example.screen.capture.common;

import org.openqa.selenium.WebDriver;

/**
 * @author Jagdeep Jain
 *
 */
public class AppConfig {
	
	//verification error
	public StringBuffer verificationErrors = new StringBuffer();
			
	private String urlUnderTest = "http://www.google.com";
	
	public void openURL(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get(urlUnderTest);
	}
}
