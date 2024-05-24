package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("tejesh"); // id locator
		driver.findElement(By.name("email")).sendKeys("tejesh"); // name locator
		driver.findElement(By.className("fb_logo _8ilh img")); // classname locator
		driver.findElement(By.tagName("h2")); // tagname locator
		driver.findElement(By.linkText("Forgotten password?")); // linktest locator
		driver.findElement(By.partialLinkText("Create new account")); // partiallinktest locator
		driver.findElement(By.xpath("//button[text()='Log in']")); // xpath locator
		driver.findElement(By.cssSelector("div[id=reg_pages_msg]")); // cssSelector
	}
}
