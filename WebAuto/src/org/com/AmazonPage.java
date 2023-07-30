package org.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\praka\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//Launch url
		driver.get("https://www.amazon.in/");
		
		 //Maximize window
		driver.manage().window().maximize();
		
		//Inspect search field and insert value and search the products
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
		  driver.findElement(By.id("nav-search-submit-button")).click();
		  driver.findElement(By.xpath("//span[contains(text(),' (256 GB) - Midnight')]")).click();
		  
		 //windows ctrl in parent window so need to switch to child
		  Set<String> allIds = driver.getWindowHandles();
		  List<String>li=new ArrayList();
		  li.addAll(allIds);
		  driver.switchTo().window(li.get(1));
		  driver.findElement(By.id("add-to-cart-button")).click();
		  
		  System.out.println("Successfully added to cart");
         
      

		 
		 
		 

	}
}