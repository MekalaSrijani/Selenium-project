package com.harman.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		String title = driver.getTitle(); 
		System.out.println(title);

		//get url and print it

		String url=driver.getCurrentUrl(); System.out.println(url);

		String html=driver.getPageSource(); System.out.println(html);

		driver.quit();
	}

}
