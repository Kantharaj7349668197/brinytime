package sample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rcb.com/");
		WebElement logo = driver.findElement(By.xpath("//div[@class='mkdf-position-left-inner']//div[@class='mkdf-logo-wrapper']"));
		File srcfile = logo.getScreenshotAs(OutputType.FILE);
		String timestamp = LocalDate.now().toString().replace(":","-");
		File destfile = new File("./errorshots/"+timestamp+".png");
		FileUtils.copyFile(srcfile, destfile);
	}
	
}
