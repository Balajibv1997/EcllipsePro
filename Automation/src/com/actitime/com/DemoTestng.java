package com.actitime.com;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestng {
	@Test
	public void tastDemo(){
		System.out.println("hi");
		Reporter.log("hiiiiii",true);
	}

}
