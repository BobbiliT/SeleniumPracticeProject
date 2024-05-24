package Dropdowns;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class optionsUNIQEandSHORT{
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/HP/Documents/dropdown.html");
	WebElement listbox=driver.findElement(By.id("mtr"));
	Select s = new Select(listbox);
	List<WebElement> alloption=s.getOptions();
	int size=alloption.size();
	System.out.println(size);
	TreeSet<String> ts = new TreeSet<String>();
	for(WebElement option:alloption) {
		String text=option.getText();
		System.out.println(text);
		ts.add(text);
	}
	System.out.println(ts);
	driver.close();
}
}
