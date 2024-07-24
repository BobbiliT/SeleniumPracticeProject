package JavascriptExectore;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_and_down {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	JavascriptExecutor js =(JavascriptExecutor)driver;
	//scroll down the web page
	for(int i=0; i<=10; i++) {
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
	}
	//scroll up the web page
	for(int i=0; i<=10; i++) {
		js.executeScript("windowscrollBy(0,-1000)");
		Thread.sleep(3000);
	}
	//scroll the particular element 
	WebElement e=driver.findElement(By.xpath("//a[text()='Create new account']"));
	Point p=e.getLocation();
	int x=p.getX();
	int y=p.getY();
	for(int i=0; i<=10; i++) {
		js.executeScript("window.scrollBy(x,y)");
		Thread.sleep(3000);
	}
}
}
