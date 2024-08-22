package com.java.prractices;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeLaunch {
	
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().browserVersion("121.0.6167.185").setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/441520/identity/login/password");
		driver.manage().window().maximize();
		String titleOfthePage = driver.getTitle();
		System.out.println(titleOfthePage);
		//driver.quit();
}  
}
