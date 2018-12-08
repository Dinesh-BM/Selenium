package com.baseorGeneric;
//import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
/*
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;*/
import org.testng.annotations.DataProvider;

public class baseclass 
{
	@DataProvider(name="logintests")
	public Object [][] getTestdata() throws EncryptedDocumentException, IOException
	{
	/*	
		FileInputStream f=new FileInputStream("./src/test/resources/properties/file/Book1.xlsx");
		Workbook book = WorkbookFactory.create(f); 
		String s1=book.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		String s2=book.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		String s11=book.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
		String s12=book.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
*/		return new Object[][]{{"cs","sc"},{"sz","xasd"}};
	}
	

}
