package practice_here;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing221 {
	public static void main(String[] args) {
         // Set the location of the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ants\\Desktop\\New folder (3)\\chromedriver.exe");

         WebDriver driver = new ChromeDriver();
         driver.get("http://www.google.com");
         
         // Find the search box by its name attribute and enter the search query
         driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
         driver.findElement(By.name("q")).submit();
         
         // Print the title of the page
         System.out.println(driver.getTitle());
         
         driver.quit(); // Close the browser
}
}