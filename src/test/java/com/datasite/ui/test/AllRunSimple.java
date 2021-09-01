package com.datasite.ui.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  

public class AllRunSimple {  
    public static void main(String[] args) throws InterruptedException {  
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zamal\\Downloads\\codee-zamal\\datasite-codetest\\drivers\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://datasite.com/us/en/legal/terms-of-use.html");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Thread.sleep(3000);
          WebElement manuopen = driver.findElement(By.xpath("//div[@id='menuOpen']"));
  		manuopen.click();
  		Thread.sleep(3000);

          driver.quit();
          
          /*Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button  
        driver.findElement(By.linkText("Core Java")).click();     
  */
    }  
  
}  