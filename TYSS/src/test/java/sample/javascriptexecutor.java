package sample;

import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javascriptexecutor {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://mite.ac.in/");
	//driver.findElement(By.xpath("//a[text()='Stakeholders Feedback']")).click();
	JavascriptExecutor javascriptexecutor = (JavascriptExecutor)driver;
	javascriptexecutor.executeScript("window.scrollBy(0,10000)");
	
}
}
