package Allpractiedsecession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("tejesh");
		String name = username.getAttribute("value");
		System.out.println("username -> " + name);
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("bobbili");
		String password = pass.getAttribute("value");
		System.out.println("password -> " + password);
		driver.navigate().back();
		String gt = driver.getTitle();
		System.out.println("google title -> " + gt);
		driver.navigate().forward();
		String ft = driver.getTitle();
		System.out.println("facebook title -> " + ft);
	}
}
