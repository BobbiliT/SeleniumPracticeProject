package PerformMouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveToElement {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	Actions action = new Actions(driver); 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
	WebElement element=driver.findElement(By.xpath("//span[text()='Login']"));
	action.moveToElement(element).perform();
	driver.close();
}
}