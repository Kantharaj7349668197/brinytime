package sample;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.com/");
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	ArrayList brokenlinks = new ArrayList<>();
	for (int i = 0; i < alllinks.size(); i++) {
		String links = alllinks.get(i).getAttribute("href");
		int statuscode=0;
		try {
			URL url=new URL(links);
			URLConnection urlconnection = url.openConnection();
			HttpURLConnection httpUrlconnection = (HttpURLConnection)urlconnection;
			statuscode=httpUrlconnection.getResponseCode();
			if (statuscode>400) {
				brokenlinks.add(links+" "+statuscode);
			}
		} catch (Exception e) {
		 continue;
		}
		
	}
	System.out.println(brokenlinks);
}
}
