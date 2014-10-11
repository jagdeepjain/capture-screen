/**
 * 
 */
package org.util.screen.capture.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Jagdeep Jain
 *
 */
public class Buttons {
	
	
	public void searchButton(WebDriver driver) {
		WebElement done = driver.findElement(By.name("btnG"));
		done.click();
	}
	
}

