package FluentWaitTimeout;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Wait<WebDriver> wait = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		WebElement input = wait.until(d->d.findElement(By.xpath("//input[@type='text']")));
		input.sendKeys("iphone mobile");
		WebElement click = wait.until(d->d.findElement(By.xpath("//span[text()=' under 20000']")));
		click.click();
		wait.until(d->d.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Midnight']"))).click();
		wait.until(d->d.findElement(By.id("buy-now-button"))).click();
		wait.until(d->d.findElement(By.id("ap_email_login"))).sendKeys("7036060404");
	}
}
