package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@AfterClass
	public void demo() {
		System.out.println("Hi Testng");		
		
	}
	@BeforeClass
	public void demo2() {
		
		System.out.println("Hi I am back");
	}

	@AfterSuite
	public void Second()
	{
		System.out.println("bye");
	}
	@AfterTest
	public void lastExecution() {
		System.out.println("Lst Execution");  
	}

}

