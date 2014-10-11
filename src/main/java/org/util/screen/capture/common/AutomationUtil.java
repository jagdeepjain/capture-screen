/**
 * 
 */
package org.util.screen.capture.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.util.screen.capture.components.XPaths;

/**
 * @author Jagdeep Jain
 * 
 */
public class AutomationUtil {

	// checking if text present on the page or not, for validation purpose
	public boolean isTextPresent(String textToBeVerified, WebDriver driver) {
		boolean exists = true;
		String pageText = driver.findElement(By.tagName("Body")).getText();
		//System.out.println(pageText);
		if (!pageText.contains(textToBeVerified)) {
			exists = false;
		}
		return exists;
	}

	
}
