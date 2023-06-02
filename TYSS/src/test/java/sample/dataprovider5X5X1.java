package sample;

import org.testng.annotations.DataProvider;

public class dataprovider5X5X1 {
	@DataProvider
	public Object[][] data() {
		Object[][] arr = new Object[4][5];
		arr[0][0]="bidadi";
		arr[0][1]="kengeri";
		arr[0][2]=18;
		arr[0][3]="25rs";
		arr[0][4]=30;
		
		arr[1][0]="kengeri";
		arr[1][1]="nayandanahalli";
		arr[1][2]=11;
		arr[1][3]="15rs";
		arr[1][4]=20;
		
		arr[2][0]="nayandanahalli";
		arr[2][1]="kathruguppe";
		arr[2][2]=7;
		arr[2][3]="10rs";
		arr[2][4]=12;
		
		arr[3][0]="kathruguppe";
		arr[3][1]="gopalancoworks";
		arr[3][2]=1;
		arr[3][3]="nendkond hogadhu kas ella";
		arr[3][4]=5;
		
	
		return arr;
	}
}
