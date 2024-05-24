package WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateBrowserDoSomeAction {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	String parentwindow=driver.getWindowHandle();
	driver.findElement(By.id("newWindowBtn")).click();
	Set<String> allwindow=driver.getWindowHandles();
	int size=allwindow.size();
	System.out.println("numebr of windows :"+size);
	for(String window:allwindow) {
		if(!window.equals(parentwindow)) {
			driver.switchTo().window(window);
			driver.manage().window().maximize();
			String title=driver.getTitle();
			System.out.println("window title :"+title);
			driver.findElement(By.id("firstName")).sendKeys("tejesh");
			Thread.sleep(1000);
			driver.findElement(By.id("lastName")).sendKeys("bobbili");
			Thread.sleep(1000);
			driver.findElement(By.id("femalerb")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("spanishchbx")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("email")).sendKeys("b.tejesh123@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.id("password")).sendKeys("12345");
			Thread.sleep(1000);
			driver.close();
		}
	}
}
}
