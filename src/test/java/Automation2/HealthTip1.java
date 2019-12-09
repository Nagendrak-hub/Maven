package Automation2;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HealthTip1 {
	WebDriver driver;
	FileInputStream fis;
	JavascriptExecutor js;

	public void test() throws Exception {
		Properties pro = new Properties();
		fis = new FileInputStream(
				"C:\\Users\\dev03\\Desktop\\workspace\\automation\\src\\test\\java\\Automation2\\config.properties");

		pro.load(fis);
		System.out.println(pro.getProperty("browser"));
		String s = pro.getProperty("browser");
		if(s.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\dev03\\Desktop\\NagendraReddy\\Excel\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(pro.getProperty("url"));
			js=((JavascriptExecutor)driver);
			js.executeScript("scroll(0, 400)");
			driver.findElement(By.xpath(pro.getProperty("register"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(pro.getProperty("onlineregister"))).click();
			
			
		}
		
		
		
		

	}

	public static void main(String[] args) throws Exception {
		HealthTip1 ht = new HealthTip1();
		ht.test();

	}

}
