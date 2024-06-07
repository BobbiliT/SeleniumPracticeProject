package handleCalendars;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlecalender {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.id("datepicker1")).click();
		selectdate("14", "May", "2025");
		driver.close();
		
	}
	public static String[] getmonthyear(String monthyear) {
		return monthyear.split(" ");
	}
	public static void selectdate(String Exdate, String Exmonth, String Exyear) {
		String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(monthyear);
		while(!(getmonthyear(monthyear)[0].equals(Exmonth)&&getmonthyear(monthyear)[1].equals(Exyear))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(monthyear);
		}
		driver.findElement(By.xpath("//a[text()='"+Exdate+"']")).click();
	}
}
