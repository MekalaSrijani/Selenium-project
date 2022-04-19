package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.id("UserFirstName-QlRv")).sendKeys("jhon");
		driver.findElement(By.id("UserLastName-nGne")).sendKeys("wick");
		driver.findElement(By.id("UserEmail-TEJr")).sendKeys("john@gmail.com");
		driver.findElement(By.id("UserTitle-3wMw")).click();
		driver.findElement(By.xpath("//option[text()='IT Manager']")).click();

		driver.findElement(By.id("CompanyEmployees-fbQH")).click();
		driver.findElement(By.xpath("//option[text()='101 - 500 employees']")).click();
		driver.findElement(By.id("CompanyCountry-hMxk")).click();
		driver.findElement(By.xpath("//option[text()='United Kingdom']")).click();
		
		
	}

}
