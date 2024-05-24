package Naviagtion;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookToGoogle {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	Thread.sleep(1000);
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(1000);
	driver.navigate().back();
	Thread.sleep(1000);
	driver.navigate().forward();
	Thread.sleep(1000);
	WebElement us=driver.findElement(By.id("email"));
	us.sendKeys("tejesh");
	String utext=us.getAttribute("value");
	System.out.println("username :"+utext);
	Thread.sleep(1000);
	WebElement ps=driver.findElement(By.id("pass"));
	ps.sendKeys("bobbili");
	String ptext=ps.getAttribute("value");
	System.out.println("password :"+ptext);
	Thread.sleep(1000);
	driver.navigate().refresh();
	Thread.sleep(1000);
	driver.close();
}
}
