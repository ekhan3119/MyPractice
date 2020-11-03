package nothing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPrac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//iftekharchowdhoury//Documents//drivers//chromedriver1");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree");
		//driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		WebElement src = driver.findElement(By.xpath("//span[text()='Learning DHTMLX Suite UI']"));
		WebElement dest = driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
	}

}
