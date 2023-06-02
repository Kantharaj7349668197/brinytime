package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class facebook {
	@Test
	public void facebook() {
//public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	WebElement button = driver.findElement(By.xpath("//a[text()='Create new account']"));
	boolean flag=false;
	wait.until(ExpectedConditions.visibilityOf(button));
	if (flag==true) {
		System.out.println("button is present");
	}else
		System.out.println("not");
}
}
