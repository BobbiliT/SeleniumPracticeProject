package ActionsClass_mouse_keyboard_functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	Actions action = new Actions(driver);
	WebElement alertbox=driver.findElement(By.id("alertBox"));
	action.doubleClick(alertbox).perform();
	String text=driver.switchTo().alert().getText();
	System.out.println("alert text :"+text);
	driver.switchTo().alert().accept();
	
}
}
