package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchWebApp {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KLC\\eclipse-workspace\\SeliniumProjectDay01\\Driver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		
	Driver.get("http://www.greenstechnologys.com");

	}

}
