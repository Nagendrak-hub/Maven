package selenium.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	WebDriver driver;
	public void browser() {
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\dev03\\Desktop\\NagendraReddy\\Excel\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();

}
}