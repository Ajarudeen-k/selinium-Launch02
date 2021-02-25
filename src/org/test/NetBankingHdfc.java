package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetBankingHdfc {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLC\\eclipse-workspace\\SeliniumProjectDay01\\driver\\chromedriver.exe");
		
     WebDriver driv = new ChromeDriver();
     driv.manage().window().maximize();
     
     driv.get("https://netbanking.hdfcbank.com/");
     
     
     WebElement btnpress = driv.findElement(By.name("fldLoginUserId"));
     btnpress.sendKeys("ajar");
  
     
     
     
	
}
}