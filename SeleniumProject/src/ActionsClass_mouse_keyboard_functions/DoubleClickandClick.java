package ActionsClass_mouse_keyboard_functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickandClick {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	Actions action = new Actions(driver);
	WebElement element= driver.findElement(By.id("email"));
	element.sendKeys("tejesh");
	action.doubleClick(element).perform();
	WebElement element1=driver.findElement(By.id("pass"));
	element1.sendKeys("bobbili");
	action.doubleClick(element1).perform();
	driver.close();
}
}
