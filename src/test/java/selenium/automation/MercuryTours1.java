package selenium.automation;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import selenium.automation.MercuryTours;


public class MercuryTours1 {
	void test1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Desktop\\NagendraReddy\\Excel\\chromedriver_win32 (1)\\chromedriver.exe");
		MercuryTours mt=new MercuryTours();
		mt.test();
		mt.test1();
		mt.test2();
	}
	public static void main(String[] args) {
		MercuryTours1 mt1=new MercuryTours1();
		mt1.test1();
	}
}
