package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusBrokenLinks {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.redbus.in/");
	List<WebElement> linklists =driver.findElements(By.tagName("a"));
	linklists.addAll(driver.findElements(By.tagName("img")));
	System.out.println("size of the links and images :"+linklists.size());
	List<WebElement> activelinks = new ArrayList<WebElement>();
		for(WebElement e :linklists) {
			String link=e.getAttribute("href");
			checklinks(link);
		}
		System.out.println("size of all active links and images :"+activelinks.size());
}
public static void checklinks(String linkurl) throws Exception {
	try {
		URL url = new URL(linkurl);
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();
		connection.setConnectTimeout(5000);
		connection.connect();
		if(connection.getResponseCode()>=400) {
			System.out.println(linkurl+"----"+connection.getResponseMessage()+" is broken link");
		}
		else {
			System.out.println(linkurl+"----"+connection.getResponseMessage());
		}
	}
	catch(Exception e) {
		
	}
}
}
