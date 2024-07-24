package XpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunctions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.findElement(By.xpath("//td[text()='Maria Anders']")); // Xpath with text function
		driver.findElement(By.xpath("//a[contains(text(),'Sign in into ')]")); // Xpath with contains function
		driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into ')]")); // Xpath with starts-with function
		driver.findElement(By.xpath("//label[normalize-space(text()='First Name ')]")); // Xpath with normalize-space
																						// function
		driver.findElement(By.xpath("(//label[normalize-space(text()='First Name ')])[last()]")); // Xpath with last
																									// fucntion
		driver.findElement(By.xpath("(//label[normalize-space(text()='First Name ')][2]")); // xpath wiht position
																							// function
	}
}
