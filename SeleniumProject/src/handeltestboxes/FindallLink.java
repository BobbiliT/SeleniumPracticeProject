package handeltestboxes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindallLink {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	List<WebElement> links =driver.findElements(By.xpath("//a"));
	int size=links.size();
	System.out.println("total links are avaliable in this website :"+size);
	driver.close();
}
}
