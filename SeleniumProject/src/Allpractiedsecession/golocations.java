package Allpractiedsecession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class golocations {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	options.addArguments("--disable-geolocation");
	options.addArguments("--ignore-certificate-errors");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='px-1   flex flex-middle nmx-1 pb-1']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Where from?']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
}
}
