package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandellingMultipleExldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("Logindetails").getLastRowNum();
		for(int i=1;i<=rowcount;i++) {
			String un = wb.getSheet("Logindetails").getRow(i).getCell(0).getStringCellValue();
			String pwd = wb.getSheet("Logindetails").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+" "+pwd);
		}

	}

}
