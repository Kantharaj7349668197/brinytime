package com.Brinytime.Testyantra.genericutility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testname=result.getMethod().getMethodName();
		System.out.println("i m kelskonding--");
		
		TakesScreenshot takesScreenshot = (TakesScreenshot)Baseclass.driver;
		File srcfile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String timestamp = LocalDateTime.now().toString().replace(" ", "_").replace(":", "_");
		File destfile = new File("screnshots/"+" "+testname+" "+timestamp+".png");
		try {
			FileUtils.copyFile(srcfile, destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
