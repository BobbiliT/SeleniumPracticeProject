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

public class BrokenLinkForFlipkart {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		//1.get all the links and images 
		List<WebElement> linklists=driver.findElements(By.tagName("a"));
		linklists.addAll(driver.findElements(By.tagName("img")));
		System.out.println("size of the all links and images :"+linklists.size());
		//2.get all the active links and images
		List<WebElement> activelinks = new ArrayList<WebElement>();
		for(int i=0; i<linklists.size(); i++) {
			if(linklists.get(i).getAttribute("href")!=null) {
				activelinks.add(linklists.get(i));
			}
		}
		System.out.println("size of the all active links and images :"+activelinks.size());
		//3.check and verify http and href links;
		for(int j=0; j<activelinks.size(); j++) {
			HttpURLConnection connection=(HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
			connection.connect();
			String responce=connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelinks.get(j).getAttribute("href")+"---->"+responce);
		}
	}
}
