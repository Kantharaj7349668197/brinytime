package sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider4X4 {
	
	@Test(dataProvider = "data")
	public void getdata(String src,String dest,int price,String languages) {
		System.out.println("from---->"+src+" to---->"+dest+" price---->"+price+" languages---->"+languages);
	}

	@DataProvider
	public  Object[][] data() {
	   Object[][] arr = new Object[4][4];
	   arr[0][0]="india";
	    arr[0][1]="pakistan";
	    arr[0][2]=00;
	    arr[0][3]="urdu barle beku";
	    		
	   	arr[1][0]="pakistan";
	    arr[1][1]="india";
	    arr[1][2]=100000;
	    arr[1][3]="kannada barlilla andru sersthare";
	    
	    arr[2][0]="indiagate";
	    arr[2][1]="mandya";
	    arr[2][2]=10000;
	    arr[2][3]="restriction he ella yaradru banni yaradru hogi";
	    
	    arr[3][0]="india";
	    arr[3][1]="china";
	    arr[3][2]=200000;
	    arr[3][3]="ange edre hogake esta ella";
	    return arr;
	}
}
