package XpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesOperation {
public static void main(String[] args) {
	System.setProperty("webdrivd.chrome.driver", ".//Drivers//choromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")); // following-sibling
	driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click(); // preceding-sibling
	driver.findElement(By.xpath("//table[@id='contactList']/tbody/tr/td/a")); // child axes 
	driver.findElement(By.xpath("//td[text()='Helen Bennett']/parent::tr")); // parent axes
	driver.findElement(By.xpath("//table[@id='contactList']/ancestor-or-self::div")); // ancestor-or-self 
	driver.findElement(By.xpath("//table[@id='contactList']/ancestor::div")); // ancestor axes
	driver.findElement(By.xpath("//table[@id='contactList']/descendant-or-self::td")); // decendent-or-self
	driver.findElement(By.xpath("//table[@id='contactList']/descendant::td")); // decendent axes
	driver.close();
}
}
