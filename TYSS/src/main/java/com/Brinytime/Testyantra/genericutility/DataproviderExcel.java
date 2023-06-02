package com.Brinytime.Testyantra.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataproviderExcel {
@DataProvider
public  Object[][] getData() throws Throwable {
	FileInputStream fis = new FileInputStream(IpathConstants.excelFilePaths);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("DataProvider");
	int lastRow = sheet.getLastRowNum();
	int lastCell=sheet.getRow(0).getLastCellNum();
	
	Object[][] arr = new Object[lastRow][lastCell];
	for (int i = 0; i <lastRow; i++) {
		for (int j = 0; j < lastCell; j++) {
			arr[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();
		}
	}
	return arr;
}

public HashMap<String, String> getMultipleData(String sheetName) throws Throwable
{
	FileInputStream fis=new FileInputStream(IpathConstants.excelFilePaths);
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(sheetName);
	int count=sheet.getLastRowNum();
	
	HashMap<String,String>map=new HashMap<String,String>();
	
	for (int i = 0; i <=count; i++) {
		String Key=sheet.getRow(i).getCell(0).getStringCellValue();
		String value=sheet.getRow(i).getCell(1).getStringCellValue();
		map.put(Key, value);
	}
	return map;
	
}
}
