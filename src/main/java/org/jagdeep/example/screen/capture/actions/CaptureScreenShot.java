package org.jagdeep.example.screen.capture.actions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jagdeep.example.screen.capture.common.AppConfig;
import org.jagdeep.example.screen.capture.common.AutomationUtil;
import org.jagdeep.example.screen.capture.common.ScreenShotMaker;
import org.jagdeep.example.screen.capture.common.SetupBrowser;
import org.jagdeep.example.screen.capture.pages.GoogleSearchPage;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot extends HttpServlet {

	public WebDriver driver;

	AppConfig appConfig = new AppConfig();
	SetupBrowser setupAppUnderTest = new SetupBrowser();
	GoogleSearchPage googleSearchPage = new GoogleSearchPage();
	AutomationUtil automationUtil = new AutomationUtil();
	ScreenShotMaker screenShotMaker = new ScreenShotMaker();

	public void getScreenShot() throws InterruptedException {
		driver = setupAppUnderTest.getBrowser(driver);
		appConfig.openURL(driver);

		googleSearchPage.setText(driver, "Jagdeep");
		Thread.sleep(2000);
		if (automationUtil.isTextPresent("Jagdeep", driver)) {
			screenShotMaker.takeScreenShot(driver, "googleCapture");
		}
		driver.quit();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CaptureScreenShot captureScreenShot = new CaptureScreenShot();
		try {
			captureScreenShot.getScreenShot();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("<h1>Look at what we have captured for you:</h1>");
		response.getWriter().println("<a href='src/main/resource/googleCapture.png'>Google Search<a>");
	}
}
