package com.java.prractices;

import java.util.Set;

import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindowsHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		
		

		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> allwindows = driver.getWindowHandles();
		
		  for (String childwindows: allwindows) {
		  if(!parentwindow.equals(childwindows)) {
		  driver.switchTo().window(childwindows); 
		  driver.close(); }
	}
		 
		System.out.println("Closed window successfully");
	}

}
