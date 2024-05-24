package lunchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkartlunch {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	String title=driver.getTitle();
	System.out.println("page title :"+title);
	driver.close();
}
}
