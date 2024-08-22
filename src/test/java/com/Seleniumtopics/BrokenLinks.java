package com.Seleniumtopics;



import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.eazework.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println(alllinks.size());
		
		for(WebElement element:alllinks) {
			String url=element.getAttribute("href");
			URL link= new URL(url);
			HttpsURLConnection httpconn=(HttpsURLConnection)link.openConnection();
			httpconn.setConnectTimeout(5000);
			Thread.sleep(5000);
			httpconn.connect();
		int resCode=	httpconn.getResponseCode();
		if(resCode>=400) {
			System.out.println(url+"- is broken link");
		}else {
			System.out.println(url+"- is valid link");
		}
;		}
		
		

	}

}
