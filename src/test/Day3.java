package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




public class Day3 {
	@Parameters({"URL","Key"})
	@Test
	public void WebLoginHomeLoan(String urlName1,String key) {

		System.out.println("webloginhome Parametre in day3  "+urlName1);
		System.out.println("Parameter in class 3"+key);
		
	}
	@Test
	public void MobileLoginHomeLoan() {
		System.out.println("Mobile Login Home");
		Assert.assertTrue(false);

	}
	@BeforeSuite
	public void MobileSignInHomeLoan() {
		System.out.println("Mobile Sign in Home");

	}
	
	@Test(enabled=false)
	public void MobileSignOutHomeLoan() {
		System.out.println("Mobile Sign in Home");

	}
	
	@Test(dataProvider ="getData")
	public void LoginAPIHomeLoan(String userName, String password) {

		System.out.println("Mobile SIGNOUT");
		System.out.println(userName);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstuserName";
		data[0][1]="password";
		//columns in the row are nothing but values for the particualar combination(row
		//2nd set
		data[1][0]="secondserName";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="thirduserName";
		data[2][1]="thirdpassword";
		return data;
	}



}
