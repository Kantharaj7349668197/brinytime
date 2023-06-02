package sample;

import org.testng.annotations.Test;

public class datapro5X5 {
@Test(dataProviderClass = dataprovider5X5X1.class,dataProvider = "data")
	public void getdata(String src,String dest,int KM,String Buscharge,int time) {
		System.out.println("from---->"+src+" to---->"+dest+" KM---->"+KM+" Buscharge---->"+Buscharge+" time====>"+time);
}
}
