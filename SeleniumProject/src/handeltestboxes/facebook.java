package handeltestboxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	WebElement us=driver.findElement(By.id("email"));
	if(us.isDisplayed()) {
		if(us.isEnabled()) {
			us.sendKeys("tejesh");
			String value1=us.getAttribute("value");
			System.out.println(value1);
			Thread.sleep(2000);
			us.clear();
			us.sendKeys("bobbili");
			String value2=us.getAttribute("value");
			System.out.println(value2);
			Thread.sleep(2000);
			us.clear();
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
