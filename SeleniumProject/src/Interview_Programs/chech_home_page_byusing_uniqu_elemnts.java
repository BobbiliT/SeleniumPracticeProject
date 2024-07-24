package Interview_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chech_home_page_byusing_uniqu_elemnts {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	driver.findElement(By.xpath("//p[text()='manda user']")).click();
	WebElement logout=driver.findElement(By.xpath("//input[@placeholder='Search']"));
	if(logout.isDisplayed()) {
		System.out.println("home page is displayed.");
	}
	else {
		System.out.println("home page is not displyed.");
	}
}
}
