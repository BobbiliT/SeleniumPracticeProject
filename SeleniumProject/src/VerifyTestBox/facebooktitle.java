package VerifyTestBox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktitle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
}
}
