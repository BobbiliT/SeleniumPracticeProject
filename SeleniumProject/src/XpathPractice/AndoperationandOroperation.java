package XpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndoperationandOroperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		// Or operation if the both value are not correct even the xpath will find the
		// matching element in the html treee
		driver.findElement(By.xpath("//input[@name='refreshbtn'or@type='submit']"));
		// And operation if the both value are not match then xpath will not find the
		// exect element in the html tree
		driver.findElement(By.xpath("//input[@name='refreshbtn'and@type='submit']"));
		driver.close();
	}
}
