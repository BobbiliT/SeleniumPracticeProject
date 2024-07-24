package Frams;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Documents/iframepage2.html");

//		driver.switchTo().frame(0); // -------------------------->by using frame index
//		driver.findElement(By.id("t1")).sendKeys("tejesh");
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("t2")).sendKeys("bobbili");
//		
		driver.switchTo().frame("f1"); // --------------------------->by using frame id
		driver.findElement(By.id("t1")).sendKeys("bobbili");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("tejesh");
		
//		driver.switchTo().frame("n1"); // --------------------------->by using the frame name
//		driver.findElement(By.id("t1")).sendKeys("tejesh");
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("t2")).sendKeys("bobbili");
//		
//		WebElement c = driver.findElement(By.className("c1"));
//		driver.switchTo().frame(c); // ------------------------------>by using the frame webelement
//		driver.findElement(By.id("t1")).sendKeys("bobbili");
//		driver.switchTo().defaultContent();
//		driver.findElement(By.id("t2")).sendKeys("tejesh");
	}
}
