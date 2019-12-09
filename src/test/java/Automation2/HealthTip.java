package Automation2;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import selenium.automation.UtilityClass;


public class HealthTip {
	WebDriver driver;
	Properties pro;
	FileInputStream fis;
	JavascriptExecutor js;
	Select se;

	public void test() throws Exception {
		UtilityClass uc = new UtilityClass();
		String first = uc.health("Details", "First");
		//System.out.println(first);
		String last = uc.health("Details", "Last");
		//System.out.println(last);
		String phone = uc.health("Details", "Phone");
	//	System.out.println(phone);
		String email = uc.health("Details", "Email");
		//System.out.println(email);
		String adress = uc.health("Details", "Adress");
		//System.out.println(adress);
		String city = uc.health("Details", "City");
		//System.out.println(city);
		String postal = uc.health("Details", "Postal");
		//System.out.println(postal);
		
		// String email=uc.health("Value","Email");

		pro = new Properties();
		fis = new FileInputStream(
				"C:\\Users\\dev03\\Desktop\\workspace\\automation\\src\\test\\java\\Automation2\\config.properties");
		pro.load(fis);
		System.out.println(pro.getProperty("browser"));
		String s = pro.getProperty("browser");
		if (s.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\dev03\\Desktop\\NagendraReddy\\Excel\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(pro.getProperty("url"));
			driver.manage().window().maximize();
			js = ((JavascriptExecutor) driver);
			Thread.sleep(3000);
			js.executeScript("scroll(0,500)");
			// js.executeScript("arguments[0].scrollIntoView();",pro.getProperty("register"));
			Thread.sleep(2000);
			driver.findElement(By.xpath(pro.getProperty("register"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(pro.getProperty("onlineregister1"))).click();
			// driver.findElement(By.xpath(pro.getProperty("dropdown")));
			Thread.sleep(5000);
			se = new Select(driver.findElement(By.xpath(pro.getProperty("dropdown"))));
			se.selectByVisibleText(pro.getProperty("value"));
			driver.findElement(By.xpath(pro.getProperty("firstname"))).sendKeys(first);
			driver.findElement(By.xpath(pro.getProperty("lastname"))).sendKeys(last);
			driver.findElement(By.xpath(pro.getProperty("email"))).sendKeys(email);
			driver.findElement(By.xpath(pro.getProperty("email"))).sendKeys(email);
			driver.findElement(By.xpath(pro.getProperty("phone"))).sendKeys(phone);
			driver.findElement(By.xpath(pro.getProperty("adress"))).sendKeys(adress);
			driver.findElement(By.xpath(pro.getProperty("pincode"))).sendKeys(postal);
            Thread.sleep(4000);
           /* se = new Select(driver.findElement(By.xpath(pro.getProperty("state"))));
			se.selectByVisibleText(pro.getProperty("state"));*/
		} else {
			System.out.println("Browser not match");
		}
	}

	
	public static void main(String[] args) throws Exception {
		HealthTip ht = new HealthTip();
		ht.test();
	}
}