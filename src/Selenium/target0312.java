package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import POJO.costcoAccount;

public class target0312 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ants\\Desktop\\driver\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		try {
			costcoAccount account1 = new costcoAccount("hello.FakeEmail@gmail.com", "AAJKIHJDK0!a324234423aaskldlkasdas");
			costcoAccount account2 = new costcoAccount("Cla0000000000000000mail.com", "AAAAA!123");
			costcoAccount account3 = new costcoAccount("Manzila@gmail.com" , "AAAAA0a123");
			costcoAccount account4 = new costcoAccount("Manzila10@gmail.com" , "AAA! aaaaa123");
			costcoAccount account5 = new costcoAccount("Claudia10@gmail.com" , "AAAAA!a!!!!");

			driver.manage().window().maximize();
			driver.get("https://www.costco.com/");

			WebElement registerButton = driver.findElement(By.xpath("//*[@id='header_sign_in']"));
			registerButton.click();
			Thread.sleep(6000);
			
			WebElement createAccount = driver.findElement(By.xpath("//*[@id='createAccount']"));
			createAccount.click();
			
			Thread.sleep(6000);

			WebElement username = driver.findElement(By.xpath("//*[@id='email']"));
			WebElement password = driver.findElement(By.xpath("//*[@id='newPassword']"));
			username.sendKeys(account1.getEmail());
			password.sendKeys(account1.getPassword());
			Thread.sleep(3000);
			username.clear();
			password.clear();
			username.sendKeys(account2.getEmail());
			password.sendKeys(account2.getPassword());
			Thread.sleep(3000);
			username.clear();
			password.clear();
			username.sendKeys(account3.getEmail());
			password.sendKeys(account3.getPassword());
			Thread.sleep(3000);
			username.clear();
			password.clear();
			username.sendKeys(account4.getEmail());
			password.sendKeys(account4.getPassword());
			Thread.sleep(3000);
			username.clear();
			password.clear();
			username.sendKeys(account5.getEmail());
			password.sendKeys(account5.getPassword());

			
			

			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			driver.close();
			driver.quit();
		}
	}

}
