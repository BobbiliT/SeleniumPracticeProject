package Allpractiedsecession;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multidrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/HP/Documents/mulitdropdown.html");
		WebElement list = driver.findElement(By.id("mtr"));
		Select s = new Select(list);
		List<WebElement> alloptions = s.getOptions();
		int size = alloptions.size();
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		for (WebElement element : alloptions) {
			String text = element.getText();
			if (hs.containsKey(text)) {
				hs.put(text, hs.get(text) + 1);
			} else {
				hs.put(text, 1);
			}
		}
		System.out.println(hs);
		for (HashMap.Entry<String, Integer> e : hs.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}
		driver.close();
	}
}
