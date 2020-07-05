package com.sophos.Capacitacion.ClaseAut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	WebDriver driver;
	
	public void navegadorGoogle() {
		String rutaDriver = ".\\src\\main\\java\\resources\\Drivers\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaDriver);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
		
	}
	
	public void navegadorFirefox() {
		String rutaDriver = ".\\src\\main\\java\\resources\\Drivers\\geckodriver-v0.26.0-win64";
		System.setProperty("webdriver.gecko.driver", rutaDriver);
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
		
	}
	
	

}
