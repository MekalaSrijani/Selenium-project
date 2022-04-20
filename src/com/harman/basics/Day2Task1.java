package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.cssSelector("[name=UserFirstName]")).sendKeys("jhon");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		driver.findElement(By.name("UserTitle")).click();
		driver.findElement(By.xpath("//option[text()='IT Manager']")).click();
		driver.findElement(By.name("CompanyName")).sendKeys("Google");

		driver.findElement(By.name("CompanyEmployees")).click();
		driver.findElement(By.xpath("//option[text()='101 - 500 employees']")).click();
		driver.findElement(By.name("CompanyCountry")).click();
		driver.findElement(By.xpath("//option[text()='India']")).click();
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		driver.findElement(By.xpath("//button[text()='start my free trial']")).click();
		String errorText=driver.findElement(By.xpath("//span[contains(text(),'Enter a valid phone number')]")).getText();
		System.out.println(errorText);	
		
		//driver.quit();
	}

}
