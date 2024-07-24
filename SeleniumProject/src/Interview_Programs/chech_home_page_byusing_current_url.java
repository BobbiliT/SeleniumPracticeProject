package Interview_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chech_home_page_byusing_current_url {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	String s="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	String u=driver.getCurrentUrl();
	if(s.equals(u)) {
		System.out.println("Home page is displayed.");
	}
	else {
		System.out.println("Home page is not displayed.");
	}
	driver.close();
}
}
