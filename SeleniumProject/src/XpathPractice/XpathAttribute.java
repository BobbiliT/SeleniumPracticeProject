package XpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("id Attribute");
		driver.findElement(By.name("email")).sendKeys("name Attribute");
		driver.findElement(By.tagName("input")).sendKeys("tagname Attribute");
		driver.findElement(By.cssSelector("input[id=email]")).sendKeys("cssSelect Attribute");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Xpath Attribute");
	}
}
