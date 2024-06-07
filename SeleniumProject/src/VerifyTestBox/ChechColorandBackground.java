package VerifyTestBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechColorandBackground {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String color=driver.findElement(By.id("email")).getCssValue("color");
		String backgroundcolor=driver.findElement(By.id("email")).getCssValue("background-color");
		System.out.println("testbox color :"+color);
		System.out.println("testbox background-color :"+backgroundcolor);
		if(color.equals(backgroundcolor)) {
			System.out.println("color and background color is same");
		}
		else {
			System.out.println("color and background color is different");
		}
		driver.close();
	}
}
