/**
 * 
 */
package org.jagdeep.example.screen.capture.components;

import org.jagdeep.example.screen.capture.common.AutomationUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Jagdeep Jain
 * 
 */
public class EditBox {

	AutomationUtil automationUtil = new AutomationUtil();

	public void searchText(WebDriver driver, String searchKey) {

		WebElement search = driver.findElement(By.name("q"));
		search.clear();
		search.sendKeys(searchKey);

	}
}
