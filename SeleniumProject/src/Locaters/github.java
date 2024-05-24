package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class github {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.github.com");
		driver.manage().window().maximize();
		
	}
}
