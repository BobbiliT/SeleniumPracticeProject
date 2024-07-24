package BrokenLinks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class active_hidden_links {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com");
	List<WebElement> alllinks=driver.findElements(By.tagName("a"));
	int links=alllinks.size();
	int visiablelinks=0;
	int hiddenlinks=0;
	for(WebElement link:alllinks) {
		if(link.isDisplayed()) {
			visiablelinks++;
		}
		else{
			hiddenlinks++;
		}
	}
	System.out.println("total visiable links from this web site -> "+visiablelinks);
	System.out.println("total hidden links from this web site -> "+hiddenlinks);
	driver.close();
}
}
