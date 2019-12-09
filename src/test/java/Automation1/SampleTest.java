package Automation1;
import org.openqa.selenium.By;

import Automation1.BrowserLaunch;
import Automation1.Values;
public class SampleTest extends BrowserLaunch {
	
	void sample() {
		Values lp= new Values();
		driver.get("http://newtours.demoaut.com/");
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
}
