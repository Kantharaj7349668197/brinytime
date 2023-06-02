package com.Brinytime.Testyantra.genericutility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
public int getRandomNumber() {
	Random random = new Random();
	int randnum = random.nextInt(1000);
	return randnum;
}

public String currentSystemDate() {
	Date date = new Date();
	String currentDate = date.toString();
	return currentDate;
}
public String getSystemDateInFormat() {
	Date date = new Date();
	String currentDate=date.toString();
	String d[]=currentDate.split(" ");
	int month = date.getMonth();
	String week=d[0];
	String edate=d[2];
	String year=d[5];
	String customdate=(edate+" "+week+" "+month+" "+year);
	return customdate;
	
}
}

