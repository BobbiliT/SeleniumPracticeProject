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

public class BrokenLinkHYR {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.hyrtutorials.com/p/broken-links.html");
	//1.get the size of the all links and images
	List<WebElement> linklist=driver.findElements(By.tagName("a"));
	linklist.addAll(driver.findElements(By.tagName("img")));
	System.out.println("get the size of the  links and images :"+linklist.size());
	//2.get the size of the active links present in the webpage
	List<String> activelinks = new ArrayList<String>();
	for(WebElement e :linklist) {
		String s=e.getAttribute("href");
	    //activelinks.add(s);
	    checklinks(s);
	}
	System.out.println("get all active links and image from web-site :"+activelinks.size());
//	long stime=System.currentTimeMillis();                   |
//	activelinks.parallelStream().forEach(e->checklinks(e));  |______ this furture is introduce by Java 8 version,
//	long etime=System.currentTimeMillis();                   |
//	System.out.println("taken time "+(etime-stime));         |    this fuature will take less time           
//	long stime=System.currentTimeMillis();                   |
//	activelinks.stream().forEach(e->checklinks(e));          |____this furture is introduce by Java 8 version,
//	long etime=System.currentTimeMillis();                   |   this fuature will take extra time
//	System.out.println("take time for exection :"+(etime-stime)); |
	driver.quit();
}
public static void checklinks(String linkurl)  {
	try {
		URL url = new URL(linkurl);
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		connection.setConnectTimeout(5000);
		connection.connect();
		if(connection.getResponseCode()>=400) {
			System.out.println(linkurl+"---"+connection.getResponseMessage()+"is broken link");
		}
		else {
			System.out.println(linkurl+"---"+connection.getResponseMessage());
		}
	}
	catch(Exception e) {
		
	}
}
}
