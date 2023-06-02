package com.Brinytime.Testyantra.genericutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilty {
	/**
	 * this method is used to insert the data to excel
	 * @author kantharaj
	 * @param sheetName
	 * @param rowno
	 * @param cellno
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void insertDataIntoExcel(String sheetName,int rowno,int cellno,String data) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream=new FileInputStream(IpathConstants.excelFilePaths);
		Workbook workbook=WorkbookFactory.create(fileInputStream);
		workbook.getSheet(sheetName).getRow(rowno).getCell(cellno).setCellValue(data);
		FileOutputStream fileOutputStream=new FileOutputStream(IpathConstants.excelFilePaths);
		workbook.write(fileOutputStream);
		workbook.close();
	}
	/**
	 * this method is used to fetch the data from the excel
	 * @author Kantharaj
	 * @param sheetname
	 * @param rowno
	 * @param cellno
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String fetchDataFromExcel(String sheetname,int rowno,int cellno) throws EncryptedDocumentException, IOException {
		FileInputStream fileInputStream=new FileInputStream(IpathConstants.excelFilePaths);
		Workbook workbook=WorkbookFactory.create(fileInputStream);
		Cell cell = workbook.getSheet(sheetname).getRow(rowno).getCell(cellno);
		DataFormatter formatData = new DataFormatter();
		String data=formatData.formatCellValue(cell);
		return data;
		
	}

}
