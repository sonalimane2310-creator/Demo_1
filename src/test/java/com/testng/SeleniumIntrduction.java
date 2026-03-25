package com.testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumIntrduction {

	public static void main(String[] args) {
		//-----Chromdriver-----
		//System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdriver_JarFiles\\chromedriver-win64\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		
		//-----Firefox driver-----
		//System.setProperty("webdriver.gecko.driver", "C:\\SeleniumWebdriver_JarFiles\\geckodriver-v0.36.0-win32\\geckodriver.exe");
	    //WebDriver driver =new FirefoxDriver();
		
		//-----Edge driver-----
		System.setProperty("webdriver.edge.driver", "C:\\SeleniumWebdriver_JarFiles\\msedgedriver.exe");
	   WebDriver driver =new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
	
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
		
	}

}
