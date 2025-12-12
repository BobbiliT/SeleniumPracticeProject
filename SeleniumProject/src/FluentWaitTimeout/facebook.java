package FluentWaitTimeout;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class facebook {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
		//FluentWait<>(driver) → Creates a FluentWait object for the WebDriver.
		//It will apply the wait rules (timeout, polling, exceptions) on the browser (driver).
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(20))
				// Sets the maximum waiting time to 20 seconds.
				// If the element is not found in 20 seconds, Selenium throws a TimeoutException.
				.pollingEvery(Duration.ofSeconds(20))
				// Here it will check every 2 seconds.
				// So in 20 seconds, Selenium will check 10 times (20 ÷ 2).
				.ignoring(NoSuchElementException.class);
		        // Tells Selenium to ignore NoSuchElementException while waiting.
	            // This means if the element is not found during one check, Selenium won’t fail 
		        //  -> immediately; it will wait and try again until timeout is reached.
		WebElement us = wait.until(d->d.findElement(By.id("email")));
		//until(...) → Waits until the given condition is true.
		us.sendKeys("usernmae");
		WebElement ps = wait.until(d->d.findElement(By.id("pass")));
		ps.sendKeys("password");
	}
}
