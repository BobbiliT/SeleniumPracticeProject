package JavascriptExectore;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickOpertaionUsingJavascript {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	wait.until(ExpectedConditions.jsReturnsValue("return document.getElementById('email').value='tejesh';"));
	js.executeScript("return document.getElementById('email').value='tejesh';");
	wait.until(ExpectedConditions.jsReturnsValue("return document.getElementById('pass').value='bobbili';"));
	js.executeScript("return document.getElementById('pass').value='bobbili';");
	wait.until(ExpectedConditions.jsReturnsValue("return document.getElementsByName('login')[0].click;"));
	js.executeScript("return document.getElementsByName('login')[0].click;");
    driver.close();
}
}
