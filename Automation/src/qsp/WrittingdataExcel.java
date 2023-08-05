package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WrittingdataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/TestScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("Logindetails").getRow(1).getCell(2).setCellValue("pass");
		FileOutputStream fos=new FileOutputStream("./data/TestScript.xlsx");
		wb.write(fos);
		wb.close();
	
	}

}
