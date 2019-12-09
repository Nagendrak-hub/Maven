package Automation2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import selenium.automation.UtilityClass;

public class HealthIns {	
	UtilityClass uc;
	HealthTip ht;
@BeforeMethod
	void browser() throws Exception {
	UtilityClass uc = new UtilityClass();
	String first = uc.health("Details", "First");
	System.out.println(first);
	String last = uc.health("Details", "Last");
	System.out.println(last);
	String phone = uc.health("Details", "Phone");
	System.out.println(phone);
	String email = uc.health("Details", "Email");
	System.out.println(email);
	String adress = uc.health("Details", "Adress");
	System.out.println(adress);
	String city = uc.health("Details", "City");
	System.out.println(city);
	String postal = uc.health("Details", "Postal");
	System.out.println(postal);
	}
@	Test
public void test() throws Exception {
	HealthTip ht=new HealthTip();
	ht.test();
}
}
