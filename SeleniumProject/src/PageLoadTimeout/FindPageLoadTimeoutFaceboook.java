package PageLoadTimeout;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindPageLoadTimeoutFaceboook {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	Instant starttime=Instant.now();
	System.out.println(starttime.toString());
	driver.get("https://www.youtube.com");
	Instant endtime=Instant.now();
	System.out.println(endtime.toString());
	Duration between=Duration.between(starttime, endtime);
	System.out.println("pageload timeout :"+between.toMillis()+"milli seconds");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
}
}
