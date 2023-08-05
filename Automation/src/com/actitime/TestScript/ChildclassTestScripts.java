package com.actitime.TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitimeBaseclass.genaric.Baseclasses;

public class ChildclassTestScripts extends Baseclasses{
	@Test(priority = 1,invocationCount = 2)
	public void editCustomer() {
		Reporter.log("editCustomer",true);
	}
	
	@Test
	public void registerCustomer() {
		Reporter.log("registerCustomer",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}

}
