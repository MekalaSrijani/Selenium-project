package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.cssSelector("[class=appClose]")).click();
		//driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.partialLinkText("Login")).click();
		
		
	}

}
