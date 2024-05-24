package handeltestboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hyrpage {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	Thread.sleep(3000);
	WebElement username=driver.findElement(By.id("firstName"));
	if(username.isDisplayed()) {
		if(username.isEnabled()) {
			username.sendKeys("tejesh");
			String text=username.getAttribute("value");
			System.out.println(text);
			Thread.sleep(3000);
			username.clear();
		}
		else {
			System.out.println("username is not enabled.");
		}
	}
	else {
		System.out.println("username is not displayed.");
	}
	driver.close();
}
}
