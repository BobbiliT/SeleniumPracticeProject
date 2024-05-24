package Frams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandFrames {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	WebElement text=driver.findElement(By.id("name"));
    text.sendKeys("tejesh");
	driver.switchTo().frame("frm1");
	WebElement fd1=driver.findElement(By.id("selectnav2"));
	Select sd1 = new Select(fd1);
	sd1.selectByVisibleText("Home");
	Thread.sleep(2000);
	WebElement fd2=driver.findElement(By.id("selectnav1"));
	Select sd2 = new Select(fd2);
	sd2.selectByVisibleText("-- Automation Testing");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	text.clear();
	text.sendKeys("bobbili tejesh");
	Thread.sleep(2000);
	driver.switchTo().frame("frm2");
	driver.findElement(By.id("firstName")).sendKeys("tejesh");
	driver.findElement(By.id("lastName")).sendKeys("bobbili");
	driver.findElement(By.id("femalerb")).click();
	driver.findElement(By.id("chinesechbx")).click();
	driver.findElement(By.id("email")).sendKeys("btejesh123@gmail.com");
	driver.findElement(By.id("password")).sendKeys("12345");
	
}
}
