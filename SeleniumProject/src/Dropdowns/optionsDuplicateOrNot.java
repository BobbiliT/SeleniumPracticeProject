package Dropdowns;


import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class optionsDuplicateOrNot {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Documents/dropdown.html");
		WebElement listbox = driver.findElement(By.id("mtr"));
		Select s = new Select(listbox);
		System.out.println("number of elements in the list box.");
		List<WebElement> alloption = s.getOptions();
		int count1 = alloption.size();
		System.out.println(count1);
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < count1; i++) {
			String text = alloption.get(i).getText();
			System.out.println(text);
			hs.add(text);
		}
		System.out.println("number of elements in the HashSet :");
		int count2 = hs.size();
		System.out.println(count2);
		if (count1 == count2) {
			System.out.println("list box has no duplicate values.");
		} else {
			System.out.println("list box has duplicate values");
		}

		driver.close();
	}
}
