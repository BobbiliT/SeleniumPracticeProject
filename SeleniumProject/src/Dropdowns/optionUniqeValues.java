package Dropdowns;


import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class optionUniqeValues {  // if you want do any uniqe problems then we can use HashSet
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/HP/Documents/dropdown.html");
	WebElement listbox=driver.findElement(By.id("mtr"));
	Select s = new Select(listbox);
	System.out.println("all options form the list box ");
	List<WebElement> alloptions=s.getOptions();
	int size=alloptions.size();
	System.out.println(size);
	HashSet<String> hs = new HashSet<String>();
	for(WebElement option: alloptions) {
		String text=option.getText();
		System.out.println(text);
		hs.add(text);
	}
	System.out.println(hs);
	driver.close();
}
}
