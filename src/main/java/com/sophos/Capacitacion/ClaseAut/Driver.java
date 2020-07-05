package com.sophos.Capacitacion.ClaseAut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Driver {
	
	private WebDriver driver;
	
		public Driver() {
		
	}

		public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

		public void lanzarnavegador(String navegador) {
			navegador = navegador.toLowerCase();
			
			switch (navegador) {
			case "google":
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\java\\resources\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
			case "firefox":
			System.setProperty("webdriver.gecko.driver", ".\\src\\main\\java\\resources\\Drivers\\geckodriver-v0.26.0-win64");
			driver = new FirefoxDriver();
			break;
		
			default:
				System.out.println("El navegador seleccionado no esta permitido");
				break;
			}
			}
			
		public void navegarA (String url) {
			driver.get(url);
			
		}
		
		public void cierreNavegador() {
			driver.close();
		}
			
			
		
		
	
	

}
