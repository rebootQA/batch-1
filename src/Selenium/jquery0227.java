package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquery0227 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/animate/");
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement button = driver.findElement(By.xpath("//*[@id = 'button']"));
		
		button.click();
		
		driver.close();
		driver.quit();

	}

}
