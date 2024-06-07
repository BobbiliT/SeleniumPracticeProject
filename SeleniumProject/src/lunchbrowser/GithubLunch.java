package lunchbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubLunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://github.com/login");
	driver.findElement(By.id("login_field")).sendKeys("BobbiliT");
	driver.findElement(By.id("password")).sendKeys("tejesh@67");
	driver.findElement(By.name("commit")).click();
	
}
}
