
package sample;

import org.testng.annotations.Test;

public class Datapro {
     @Test(dataProviderClass = Dataprovider1.class,dataProvider = "data")
	public void getdata(String src,String dest,int price) {
		System.out.println(src+"   ----->"+dest+"------->"+price);
	}
}

