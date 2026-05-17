package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL","Key"})
	@Test
	public void WebloginHomeLoan(String urlname, String key) {
		System.out.println(" This is the parameter ");
		
		System.out.println(urlname);
		System.out.println("This is param2"+key);
	}
	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLoginHome");
	}
	@Test(groups = {"Smoke"})
	public void LoginApiHomeLoan() {
		System.out.println("API Login Home");
	}

}
