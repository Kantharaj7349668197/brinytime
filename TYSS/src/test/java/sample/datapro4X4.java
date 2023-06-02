package sample;

import org.testng.annotations.Test;

public class datapro4X4 {
@Test(dataProviderClass = Dataprovider4X4X1.class,dataProvider = "data")
public void getdata(String src,String dest,int price,String languages) {
	System.out.println("from---->"+src+" to---->"+dest+" price---->"+price+" languages---->"+languages);
}
}
