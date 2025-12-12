package Allpractiedsecession;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class crick {
	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='col-12-12 I01Bvi O1jfZ8']/li"));
		System.out.println(elements.size());
		driver.close();
	}
}