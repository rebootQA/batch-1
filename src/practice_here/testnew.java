package practice_here;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testnew {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\dilxa\\OneDrive\\Desktop\\driver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
	    driver.get("http://www.google.com/");
		
	    WebElement a = driver.findElement(By.name("q") );
	   
	    a.sendKeys("Shakira");
	    a.submit();
	    driver.quit();
	    
	    
	}

}
