package Automation1;

//import org.openqa.selenium.WebDriver;

import Automation1.BrowserLaunch;

public class ApplicationLaunch extends BrowserLaunch {
	// WebDriver driver;
	// BrowserLaunch bw = new BrowserLaunch();
	//String s = "http://newtours.demoaut.com/";

	void launch() {
		//ApplicationLaunch ap = new ApplicationLaunch();
		driver.get("http://newtours.demoaut.com/");
	}

}
