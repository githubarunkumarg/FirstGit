package org.selenium.maven.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnnotations {
	
	@BeforeClass
	public static void launchBrowser() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void quitBrowser() {
		System.out.println("After Class");
	}
	
	@Before
	public void startTime() {
		System.out.println("Test Case Starts");
	}
	
	@After
	public void endTime() {
		System.out.println("Test Case Ends");
	}
	
	@Test
	public void tc1() {
		System.out.println("Test case 1");
	}
	
	@Test
	public void tc3() {
		System.out.println("Test case 3");
	}
	
	@Test
	public void tc2() {
		System.out.println("Test case 2");
	}

}
