package selenium.automation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import selenium.automation.MercuryTours;

public class Sampletest {
	MercuryTours mt;

	@Test
	void m1() {
		mt = new MercuryTours();
		mt.test1();
	}

	@BeforeMethod
	void m2() {
		mt.test();
	}

	@AfterMethod
	void m3() {
		mt.test2();
	}
}
