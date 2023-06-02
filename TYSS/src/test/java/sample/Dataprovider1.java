package sample;

import org.testng.annotations.DataProvider;

public class Dataprovider1 {
	 @DataProvider
		public Object[][] data()
		{
			Object[][] arr = new Object[3][3];
			arr[0][0]="mysore";
		    arr[0][1]="mandya";
		    arr[0][2]=100;
		    		
		   	arr[1][0]="testyantra";
		    arr[1][1]="client";
		    arr[1][2]=3;
		    
		    arr[2][0]="mannual";
		    arr[2][1]="java";
		    arr[2][2]=48000;
			return arr;
		}
}
