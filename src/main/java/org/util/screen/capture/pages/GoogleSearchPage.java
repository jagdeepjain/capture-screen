package org.util.screen.capture.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.util.screen.capture.components.Buttons;
import org.util.screen.capture.components.EditBox;

/**
 * @author Jagdeep Jain
 * 
 */

public class GoogleSearchPage {
	EditBox editBox = new EditBox();
	Buttons button = new Buttons();

	public void setText(WebDriver driver, String searchText) {
		editBox.searchText(driver, searchText);
		button.searchButton(driver);
	}
	
	
}
