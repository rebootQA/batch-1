package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ne {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\dilxa\\OneDrive\\Desktop\\driver\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");	
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/");
		Thread.sleep(5000);
		driver.get("https://jqueryui.com/tabs/");
		Thread.sleep(5000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
WebElement a= driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]"));
a.click();
Thread.sleep(5000);
driver.close();
driver.quit();
	}

}
