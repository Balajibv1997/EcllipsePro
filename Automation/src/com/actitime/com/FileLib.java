package com.actitime.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This is a genaric clas for data driven 
 * @author Balaji
 *
 */
public class FileLib {
	/**
	 * This is a genaric method to read the data from property file
	 * @param Key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String Key) throws IOException{
		
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
       String data = p.getProperty(Key);
	return data;
	}
	
	/**
	 * This is a genaric method to read data from Excel sheet
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".data/TestScript.property");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;	
	}
	/**
	 * This is a genaric method to read data from Excel sheet
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheetName,int row,int cell,String data) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream(".data/TestScript.property");
		Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
		 FileOutputStream fos=new FileOutputStream(".data/TestScript.property");
		wb.write(fos);
		wb.close();
		
	}
}










