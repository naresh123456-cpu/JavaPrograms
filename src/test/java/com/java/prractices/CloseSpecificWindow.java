package com.java.prractices;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseSpecificWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")).click();
		
		Set<String> windows=driver.getWindowHandles();
		List<String> winid=new ArrayList(windows);
		for (String wins : winid) {
			String titles=driver.switchTo().window(wins).getTitle();
			System.out.println(titles);
			if(titles.equals("OrangeHRM")) {  // but here to close specific window to close we need o know the title and if u have multiple windows u can close them also by using || operator
				driver.close();
			}
		}
		
		}

}
