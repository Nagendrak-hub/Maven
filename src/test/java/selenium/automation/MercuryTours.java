package selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.automation.LaunchPage;
//import selenium.automation.MercuryTours1;

public class MercuryTours {
	LaunchPage lp;
	WebDriver driver;

	void test() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Desktop\\NagendraReddy\\Excel\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LaunchPage();
		driver.get(lp.s);
	}

	void test1() {
		 lp = new LaunchPage();
		driver.manage().window().maximize();
		driver.getTitle();
		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys(lp.first);
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys(lp.last);
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys(lp.ph);
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(lp.em);
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys(lp.address);
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys(lp.city);
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys(lp.state);
		driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys(lp.post);

	}

	void test2() {
		driver.findElement(By.xpath("//*[@name='register']")).click();
	}

}
