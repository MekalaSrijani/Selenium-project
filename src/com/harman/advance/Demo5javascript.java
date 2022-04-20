package com.harman.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5javascript
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("https://www.myntra.com/");
			
			
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.querySelector('[data-track=login]').click()");

			TakesScreenshot ts =(TakesScreenshot) driver;
			File src =ts.getScreenshotAs(OutputType.FILE);
			src.renameTo(new File("error.png"));
			
			
			
			
			
	}

}
