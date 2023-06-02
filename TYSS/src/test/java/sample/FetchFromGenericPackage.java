package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Brinytime.Testyantra.genericutility.DataproviderExcel;

public class FetchFromGenericPackage {
@DataProvider
public Object[][] getdata() throws Throwable {
	DataproviderExcel excelutils = new DataproviderExcel();
	Object[][] data = excelutils.getData();
	return data;
}
@Test(dataProvider = "getdata")
public void readdata(String src,String dest,String price) {
	System.out.println("\"yellindha--->"+src+"  yellige--->"+dest+"  kasu--->"+price);
}
}
