package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpopup {
public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.findElement(By.id("alertBox")).click();
	Thread.sleep(2000);
	String text=driver.switchTo().alert().getText();
	System.out.println("popup message :"+text);
	driver.switchTo().alert().accept();
	WebElement output=driver.findElement(By.id("output"));
	String outputtext=output.getText();
	System.out.println("Output Text :"+outputtext);
	driver.close();
}
}
