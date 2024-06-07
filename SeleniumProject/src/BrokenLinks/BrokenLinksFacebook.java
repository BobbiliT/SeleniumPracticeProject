package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksFacebook {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of all the links and images :"+linklist.size());
		List<WebElement> activelinks = new ArrayList<WebElement>();
		for(int i=0; i<linklist.size(); i++) {
			if(linklist.get(i).getAttribute("href")!=null) {
				activelinks.addAll(linklist);
			}
		}
		System.out.println("size of all the activelink :"+activelinks.size());
		for(int j=0; j<activelinks.size(); j++) {
			HttpURLConnection connection =(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.setConnectTimeout(5000);
			connection.connect();
			String responce=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"------"+responce);
		}
	}
}
