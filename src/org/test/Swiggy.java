package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLC\\eclipse-workspace\\SeliniumProjectDay01\\driver\\chromedriver.exe");
		
		WebDriver div = new ChromeDriver();
		
		div.get("https://www.swiggy.com/");
		div.manage().window().maximize();
		
		WebElement txtlc =div.findElement(By.id("location"));
		txtlc.sendKeys("Thoraipakkam, Tamil Nadu, India");
		txtlc.click();
		
		Thread.sleep(2000);
		
		WebElement txtloc =div.findElement(By.xpath("//span[text()='Thoraipakkam, Tamil Nadu, India']"));
		txtloc.click();
		
		WebElement btnlogin =div.findElement(By.xpath("//span[text()='FIND FOOD']"));
		btnlogin.click();
	
	}

}
