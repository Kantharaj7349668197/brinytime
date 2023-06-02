package sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Brinytime.Testyantra.genericutility.IpathConstants;

public class ExcelDataprovider {
@DataProvider
	public Object[][] readdata() throws Throwable {
		FileInputStream fis = new FileInputStream(IpathConstants.excelFilePaths);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("DataProvider");
		int lastRow=sheet.getLastRowNum()+1;
		int lastCell = sheet.getRow(0).getLastCellNum();
		
		Object[][] obj = new Object[lastRow][lastCell];
		for (int i = 0; i <lastRow; i++) {
			for (int j = 0; j < lastCell; j++) {
				obj[i][j]=sheet.getRow(i).getCell(j).getStringCellValue();	
			}
		}
		return obj;
	}
@Test(dataProvider = "readdata")
public void getdata(String src,String dest,String price) {
	System.out.println("yellindha--->"+src+"  yellige--->"+dest+"  kasu--->"+price);
}
}
