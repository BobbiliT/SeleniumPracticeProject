package AllExceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_regestration {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("tejesh");
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("B");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='28']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='May']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[text()='1999']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("Btejesh@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("12345");
		Thread.sleep(1000);
	}
}
