package WindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiactions {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	//click window browser 
	driver.findElement(By.id("newWindowBtn")).click();
	//count number of windows
	Set<String> allwindows=driver.getWindowHandles();
	int numberofwindoes=allwindows.size();
	System.out.println("number of window are open :"+numberofwindoes);
	//print the window titles 
	for(String windows : allwindows) {
		driver.switchTo().window(windows);
		String title=driver.getTitle();
		System.out.println("window titles :"+title);
	// close the all windows 
		driver.close();
	}
	
}
}
