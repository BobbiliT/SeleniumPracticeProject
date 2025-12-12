package ActionsClass_mouse_keyboard_functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//span[text()='Login']"));
		a.moveToElement(element).perform();
	}
}
