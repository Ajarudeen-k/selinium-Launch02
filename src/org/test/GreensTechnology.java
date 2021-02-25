package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTechnology {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLC\\eclipse-workspace\\SeliniumProjectDay01\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement txtEn = driver.findElement(By.xpath("//input[@maxlength='2048']"));
		txtEn.sendKeys("GreensTechnology");
		txtEn.click();
		
		WebElement btnllogin = driver.findElement(By.xpath("//div[@class='sbic sb43']"));
		btnllogin.click();
		
		driver.manage().window().maximize();
				
	}

}
