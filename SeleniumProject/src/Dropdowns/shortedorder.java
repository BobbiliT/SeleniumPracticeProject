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



public class shortedorder {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement listbox = driver.findElement(By.id("ide"));
		Select s = new Select(listbox);
		System.out.println("all option present in the list box ");
		List<WebElement> alloptions = s.getOptions();
		int size = alloptions.size();
		System.out.println(size);
		ArrayList<String> al = new ArrayList<String>();
		for (WebElement options : alloptions) {
			String text = options.getText();
			System.out.println(text);
			al.add(text);
		}
		System.out.println("shorted order from list box ");
		Collections.sort(al);
		for (String value : al) {
			System.out.println(value);
		}
	}
}
