package com.Brinytime.Testyantra.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getPropertyData(String key) throws IOException {
		FileInputStream fileInputStream=new FileInputStream(IpathConstants.propertyFilePaths);
		Properties properties=new Properties();
		properties.load(fileInputStream);
		String value = properties.getProperty(key);
		return value;
		
	}
	/**
	 * 
	 * this method is used to..
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData1(String key) throws IOException {
		FileInputStream fileInputStream=new FileInputStream(IpathConstants.propertyFilePaths1);
		Properties properties=new Properties();
		properties.load(fileInputStream);
		String value = properties.getProperty(key);
		return value;
}
	
}
