package testngpractice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNGPractice2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("PawanKalyan");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  
  }
  
  @Test
  public void selenium () {
	  driver.get("http://www.seleniumlearn.com");
	//  driver.findElement(By.xpath(null))
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
