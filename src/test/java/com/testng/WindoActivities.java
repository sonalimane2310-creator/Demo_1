package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoActivities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdriver_JarFiles\\chromedriver-win64\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("http://google.com");   //Navigates to the URL, Waits for the page to load completely

			driver.navigate().to("https://rahulshettyacademy.com");  //Navigates to the URL, Doesn't wait for the page load completely(faster)

			driver.navigate().back();
			Thread.sleep(2000);

			driver.navigate().forward();
	}

}
