package Assign;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v136.io.IO;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoBlaze {
	WebDriver driver;
	@Test(priority=3)
	public void placeOrder () throws InterruptedException {
		 
		  driver.findElement(By.id("name")).sendKeys("Harishwarrier");
		  Thread.sleep(2000);
		  driver.findElement(By.id("country")).sendKeys("India");
		 Thread.sleep(2000); 
			  
		 driver.findElement(By.id("card")).sendKeys("Debitcard");
		 Thread.sleep(2000);  
		
		  driver.findElement(By.id("month")).sendKeys("March");
		  Thread.sleep(2000); 
		  driver.findElement(By.id("year")).sendKeys("2025");
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		  Thread.sleep(2000);
	}
	 @Test(priority=2)
   public void signIn() throws InterruptedException {
			  driver.findElement(By.id("login2")).click();
			  Thread.sleep(2000);
		      driver.findElement(By.id("loginusername")).sendKeys("Harish91");
		      Thread.sleep(2000);
		      driver.findElement(By.id("loginpassword")).sendKeys("Prathyusha123");
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("/html/body/div[3]/div/div/div[3]/button[2]")).click();
		      Thread.sleep(2000);
		      JavascriptExecutor ja=(JavascriptExecutor)driver;// for scrolling downwards 1
              Thread.sleep(2000);
              ja.executeScript("window.scroll(0,500)");
              Thread.sleep(2000);
             WebElement link= driver.findElement(By.linkText("Samsung galaxy s7"));
             link.click();
             Thread.sleep(2000);
             WebElement button=  driver.findElement(By.linkText("Add to cart"));
             button.click();
            try {
             driver.switchTo().alert().accept();
              }catch( Exception e) {System.out.println(e);}
           
              driver.findElement(By.id("cartur")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/button")).click();
			  Thread.sleep(2000);
	}
	 
	  @Test(priority=1)
   public void signUp() throws InterruptedException {
	      driver.findElement(By.id("signin2")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.id("sign-username")).sendKeys("Harish91");
          Thread.sleep(2000);
          driver.findElement(By.id("sign-password")).sendKeys("Prathyusha123");
          Thread.sleep(2000);
          driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/button[2]")).click();
          Thread.sleep(2000);
          driver.switchTo().alert().accept();
  }
  
  
  
  @BeforeTest
   public void beforeTest() throws InterruptedException {
	  
	     System.setProperty("webdriver.edge.driver", "C:\\selenium\\Edge\\msedgedriver.exe");
         driver=new EdgeDriver();
         driver.get("https://www.demoblaze.com/");
         Thread.sleep(2000); 
         driver.manage().window().maximize();
         Thread.sleep(2000); 
  }
  

//  @AfterTest
//  public void afterTest() throws InterruptedException {
//	  Thread.sleep(2000);
//	  driver.quit();
//  }

}
