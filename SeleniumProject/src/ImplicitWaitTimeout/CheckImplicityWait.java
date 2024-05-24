package ImplicitWaitTimeout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckImplicityWait {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().window().setSize(new Dimension(500, 500));
	driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	driver.findElement(By.id("btn1")).click();
	WebElement element=driver.findElement(By.id("txt1"));
	element.sendKeys("tejesh");
	String text=element.getAttribute("value");
	System.out.println(text);
	driver.findElement(By.id("btn2")).click();
	WebElement element1=driver.findElement(By.id("txt2"));
	element1.sendKeys("b.tejesh");
	String text1 =element1.getAttribute("value");
	System.out.println(text1);
	
}
}
