package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Confirmationpopup {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	driver.findElement(By.id("confirmBox")).click();
	String text=driver.switchTo().alert().getText();
	System.out.println("pop up text :"+text);
	driver.switchTo().alert().accept();
	WebElement output=driver.findElement(By.id("output"));
	String outputtext=output.getText();
	System.out.println("if you click on ok botton :"+outputtext);
	driver.findElement(By.id("confirmBox")).click();
	String text1=driver.switchTo().alert().getText();
	System.out.println("pop up text :"+text1);
	driver.switchTo().alert().dismiss();
	WebElement output1=driver.findElement(By.id("output"));
	String outputtext1=output1.getText();
	System.out.println("if you click on cancel botton :"+outputtext1);
	driver.close();
}
}
