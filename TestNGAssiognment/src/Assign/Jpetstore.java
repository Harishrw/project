package Assign;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class Jpetstore {
	 WebDriver driver;
	 @Test(priority=2)
	public void signin() throws InterruptedException {
	 driver.findElement(By.linkText("Sign In")).click(); 
	 Thread.sleep(2000);
	 driver.findElement(By.name("username")).clear();
	  Thread.sleep(2000);
	 driver.findElement(By.name("username")).sendKeys("Harish212");
	 Thread.sleep(2000);
	 driver.findElement(By.name("password")).clear();
     Thread.sleep(2000);
     driver.findElement(By.name("password")).sendKeys("Prathyusha1232");
     Thread.sleep(2000);
     driver.findElement(By.name("signon")).click();
     Thread.sleep(2000);
	 }
  @Test(priority=1)
  public void registernow() throws InterruptedException {
	  driver.findElement(By.name("username")).clear();
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("Harish212");
      Thread.sleep(2000);
      driver.findElement(By.name("password")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("password")).sendKeys("Prathyusha1232");
      Thread.sleep(2000);
      driver.findElement(By.name("repeatedPassword")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("repeatedPassword")).sendKeys("Prathyusha1232");
      Thread.sleep(2000);
      driver.findElement(By.name("account.firstName")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("account.firstName")).sendKeys("Harish");
      Thread.sleep(2000);
      driver.findElement(By.name("account.lastName")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("account.lastName")).sendKeys("Warrier");
      Thread.sleep(2000);
      driver.findElement(By.name("account.email")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("account.email")).sendKeys("harishrw_2004@yahoo.com");
      Thread.sleep(2000);
      driver.findElement(By.name("account.phone")).clear();
      Thread.sleep(2000);
       driver.findElement(By.name("account.phone")).sendKeys("1234567890");
      Thread.sleep(2000);
      driver.findElement(By.name("account.address1")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("account.address1")).sendKeys("Kuruvikkadu");
      Thread.sleep(2000);
      driver.findElement(By.name("account.address2")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("account.address2")).sendKeys("Thiruvananthapuram");
      Thread.sleep(2000);
      driver.findElement(By.name("account.city")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("account.city")).sendKeys("Vattiyooukavu");
      Thread.sleep(2000);
      driver.findElement(By.name("account.state")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("account.state")).sendKeys("kerala");
      Thread.sleep(2000);
      driver.findElement(By.name("account.zip")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("account.zip")).sendKeys("695013");
      Thread.sleep(2000);
      driver.findElement(By.name("account.country")).clear();
      Thread.sleep(2000);
      driver.findElement(By.name("account.country")).sendKeys("India");
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[1]/td[2]/select")).click();
      Thread.sleep(2000);  
      driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[2]/td[2]/select")).click();
      Thread.sleep(2000);  
      driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[3]/td[2]/input")).click();;
      Thread.sleep(2000);
      driver.findElement(By.xpath("/html/body/div[2]/div/form/table[3]/tbody/tr[4]/td[2]/input")).click();;
      Thread.sleep(2000);
      driver.findElement(By.name("newAccount")).click();
      Thread.sleep(2000);
     System.out.println("Newaccount button clicked");
          Thread.sleep(2000);
          
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver","C:\\selenium\\Edge\\Driver_Notes\\msedgedriver.exe");
      driver=new EdgeDriver();
      driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=13689ACA94852D49ED72C55E26FBCEF3?signonForm=");
      Thread.sleep(2000);
      driver.findElement(By.linkText("Register Now!")).click();
      Thread.sleep(2000);
      
       }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
