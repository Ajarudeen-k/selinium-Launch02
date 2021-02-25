package org.test;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RedBus {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLC\\eclipse-workspace\\SeliniumProjectDay01\\driver\\chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		
		WebElement txtname1 = driver.findElement(By.id("src"));
		txtname1.sendKeys("Trichy");
		txtname1.click();
		
		WebElement txtname2 = driver.findElement(By.id("dest"));
		txtname2.sendKeys("Tambaram, Chennai");
		
		  Alert al=driver.switchTo().alert();
	        
	        al.accept();
			
		txtname2.click();
		
		
		
		WebElement txtclc3 = driver.findElement(By.xpath("//input[@id='dest']"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(txtclc3).perform();
		
    
		
		
	
		
		
	}

}
