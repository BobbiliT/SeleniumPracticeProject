package WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OnlyClosedChildWindows {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	String parentwindow=driver.getWindowHandle();
	driver.findElement(By.id("newWindowsBtn")).click();
	Set<String> allwindow=driver.getWindowHandles();
	int size=allwindow.size();
	System.out.println("number of window are open :"+size);
	for(String childwindow :allwindow) {
		driver.switchTo().window(childwindow);
		if(!childwindow.equals(parentwindow)) {
			String title =driver.getTitle();
			driver.close();
			System.out.println("child windows are "+title+" is closed.");
		}
	}
}
}
