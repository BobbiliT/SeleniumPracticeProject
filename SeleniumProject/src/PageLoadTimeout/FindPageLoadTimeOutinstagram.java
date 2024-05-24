package PageLoadTimeout;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindPageLoadTimeOutinstagram {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	Instant StartTime=Instant.now();
	System.out.println(StartTime);
	driver.get("https://www.instagram.com/accounts/login/?hl=en");
	Instant EndTime=Instant.now();
	System.out.println(EndTime);
	Duration result=Duration.between(StartTime, EndTime);
	System.out.println("pageload timeout is :"+result.toMillis()+" milli seconds");
	String title=driver.getTitle();
	System.out.println("instageam title :"+title);
	driver.close();
}
}
