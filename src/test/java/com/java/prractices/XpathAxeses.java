package com.java.prractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxeses {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers"); 
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Super Spinning")).click()
		//self node
		String s=driver.findElement(By.xpath("//a[contains(text(),'Super Spinning')]/self::a")).getText();
		System.out.println(s);
		
		//parent node
		String text=driver.findElement(By.xpath("//a[contains(text(),'Super Spinning')]/parent::td")).getText();	
		System.out.println(text);
		
		//child utiliztion
		List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'Super Spinning')]/ancestor::tr/child::td"));
		System.out.println(childs.size());
		
		for(int i=0;i<childs.size();i++) {
			System.out.println(childs.get(i).getText());
		
		}
		//Ancestor
		String ancestor=driver.findElement(By.xpath("//a[contains(text(),'Super Spinning')]/ancestor::tr")).getText();
		System.out.println(ancestor);
		//driver.quit();
		
		//Descendant  //a[contains(text(),'Super Spinning')]/ancestor::tr/descendant::*
		
		List<WebElement> desc=driver.findElements(By.xpath("//a[contains(text(),'Super Spinning')]/ancestor::tr/descendant::*"));
		System.out.println(desc.size());
		//Following
		List<WebElement> following=driver.findElements(By.xpath("//a[contains(text(),'Super Spinning')]/ancestor::tr/following::tr"));
		System.out.println(following.size());
		
		
		
	
	}

}
