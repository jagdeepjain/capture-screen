package org.jagdeep.example.screen.capture.pages;

import org.jagdeep.example.screen.capture.components.Buttons;
import org.jagdeep.example.screen.capture.components.EditBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
