package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfinityIcIcI {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLC\\eclipse-workspace\\SeliniumProjectDay01\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement txtuserName1 = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtuserName1.sendKeys("56543");
		
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("123456");

		
		
	}

}
