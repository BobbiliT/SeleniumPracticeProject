package BrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_broken_links {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElements(By.tagName("img")));
		System.out.println("total links and images into the web-page = "+links.size());
		int noofBrokenlinks =0;
		for(WebElement link : links) {
			String hreflink = link.getAttribute("href");
			if(hreflink==null||hreflink.isEmpty()) {
				System.out.println("if the href value null or empty, it is not possiable to check.");
				continue;
			}
			try {
				URL linkurl = new URL(hreflink);
				HttpURLConnection connection  = (HttpURLConnection)linkurl.openConnection();
				connection.connect();
				if(connection.getResponseCode()<=400) {
					System.out.println(hreflink+"========>"+"broken link");
					noofBrokenlinks++;
				}
				else {
					System.out.println(hreflink+"========>"+"not a broken link");
				}
			}
			catch(Exception e) {
				
			}
		}
		System.out.println("number of broken links = "+noofBrokenlinks);
	}
}
