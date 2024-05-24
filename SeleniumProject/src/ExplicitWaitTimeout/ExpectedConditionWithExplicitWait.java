package ExplicitWaitTimeout;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExpectedConditionWithExplicitWait {
private static final String Expectedcondition = null;

public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.facebook.com");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	driver.findElement(By.id("email")).sendKeys("tejesh");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
	driver.findElement(By.id("pass")).sendKeys("bobbili");
	driver.close();
}
}
