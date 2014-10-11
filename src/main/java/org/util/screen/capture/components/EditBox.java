/**
 * 
 */
package org.util.screen.capture.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.util.screen.capture.common.AutomationUtil;

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
