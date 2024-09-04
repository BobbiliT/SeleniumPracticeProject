package AllExceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class stale_element_refernace_exception {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com");
		driver.findElement(By.xpath("//a[text()='onlytestingblog']")).click();
		driver.findElement(By.id("check2")).click();
		driver.navigate().to("https://selenium143.blogspot.com/");
		driver.navigate().back();
		driver.findElement(By.id("check2")).click();
		boolean selected = driver.findElement(By.id("check2")).isSelected();
		System.out.println(selected);
		driver.close();
	}
}
