package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice0221 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement searchBar = driver.findElement(By.name("q"));
		
		searchBar.sendKeys("Shakira");

		searchBar.submit();
		
		driver.get("https://www.google.com/");

		
		driver.close();
		driver.quit();

	}
}
