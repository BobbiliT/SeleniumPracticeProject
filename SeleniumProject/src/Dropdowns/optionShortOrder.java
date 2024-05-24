package Dropdowns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class optionShortOrder {  // if you want to do shorted order then we can you ArrayList
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/HP/Documents/dropdown.html");
	WebElement listbox = driver.findElement(By.id("mtr"));
	Select s = new Select(listbox);
	List<WebElement> list=s.getOptions();
	int size=list.size();
	System.out.println("count total element :"+size);
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("print the options inside the listbox");
	for(WebElement elements :list) {
		String text=elements.getText();
		System.out.println(text);
		al.add(text);
	}
	Collections.sort(al);
	System.out.println("print the option in shorted order");
	for(String value:al) {
		System.out.println(value);
	}
	driver.close();
}
}
