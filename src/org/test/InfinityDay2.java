package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfinityDay2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLC\\eclipse-workspace\\SeliniumProjectDay01\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		
		Alert al=driver.switchTo().alert();
		al.accept();
		
		
	
	}

}
