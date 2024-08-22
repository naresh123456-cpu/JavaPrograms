package com.java.prractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTopics {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com"); 
		driver.manage().window().maximize();
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println(links);
		

	}

}

/*css selectors
 1.tagname and id
tagname#idvalue
input#"test"
2.tagname and class
tagname.classvalue
input.test
3.tagname and attribute
tagname and attribute-->"input[name=email]" when we use attribute we cane any attribute and its value
4.tagname and classname and tribute
input.inputtext[name=test]

xpath optons:
and
or
contains--> //tagname[contains(@attributename,'attributevalue'); 
Scenario: stop watch
this will used mostly for dyanmic xpaths example start and stop for stop watch.
example: assume id=start, and stop
//input[contains(@id,'st')]-->for dyanmic xpath
starts-with()
//input[starts-with(@id,'st')]--> dynamic
text()
=======
//tagname[text()='attrivalue']
chained xpath

//form[@id='searchbox']//input[@class='search_query form-control ac_input']

*/
