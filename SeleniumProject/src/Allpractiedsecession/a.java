package Allpractiedsecession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HP/Documents/xpath.html");
	String title=driver.getTitle();
	System.out.println(title);
	String cr=driver.getCurrentUrl();
	System.out.println(cr);
	String pagesource=driver.getPageSource();
	System.out.println(pagesource);
	driver.close();
}
}
