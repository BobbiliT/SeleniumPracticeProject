package Allpractiedsecession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sb {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.starbucks.in/dashboard");
	//driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("drinks");
	driver.findElement(By.xpath("//img[@alt='search']")).click();
}
}
