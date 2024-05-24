package WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosedSpecficBrowserWindow {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html"); 
	String expected_title="XPath Practice - H Y R Tutorials";
	driver.findElement(By.id("newWindowsBtn")).click();
	Set<String> allwindows=driver.getWindowHandles();
	int size=allwindows.size();
	System.out.println("number of browser windows :"+size);
	for(String window : allwindows) {
		driver.switchTo().window(window);
		String actual_title=driver.getTitle();
		if(actual_title.equals(expected_title)) {
			driver.close();
			System.out.println("specific browser window -"+actual_title+" is closed");
		}
	}
}
}
