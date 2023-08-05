package com.actitime.com;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class DemoGenaric {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileLib f=new FileLib() ;
	System.out.println(f.getPropertyData("url"));
	System.out.println(f.getExcelData("CreateCustomer", 1, 2));
	f.setExcelData("Logindetails", 1, 1, "Balaji");
			
			
		

	}

}
