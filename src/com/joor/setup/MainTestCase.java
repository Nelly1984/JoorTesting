  package com.joor.setup;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.joor.driver.Driver;
import com.joor.drivers.DriverFactory;

public class MainTestCase {
	
	DriverFactory driverFactory = null;
	
	@Parameters({"browser"})
	
	@BeforeClass
	public void setUp(String browser){
		driverFactory = new DriverFactory();
		driverFactory.getDriver(browser);
	}
	
	@AfterClass
	public void tearDown(){
		driverFactory.tearDown();
	}
	
	protected Driver driver()
	{
		return new Driver(driverFactory.driver());
	}

}
