package Automation1;


import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//import Automation1.BrowserLaunch;
//import Automation1.ApplicationLaunch;
import Automation1.SampleTest;
public class TestClass {
	//ApplicationLaunch al = new ApplicationLaunch();
	//BrowserLaunch bl= new BrowserLaunch();
	SampleTest st = new SampleTest();
	
@BeforeMethod
	void test() {
		System.out.println("Launch");
		st.browser();
		System.out.println("Next");

	
		//al.launch();
	}
	@Test
	void t2() {
		//bl.browser();
		//st.launch();
	   	st.sample();
	}
}
