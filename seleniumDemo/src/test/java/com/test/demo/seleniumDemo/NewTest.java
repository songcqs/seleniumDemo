package com.test.demo.seleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

//import 

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	driver.get("http://www.baidu.com"); // 打开百度首页
    driver.findElement(By.id("kw")).clear();
    driver.findElement(By.id("kw")).sendKeys("selenium");
    driver.findElement(By.id("su")).click();
    Thread.sleep(3000);
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "f:/software/webdriver/chromedriver.exe"); // 配置chrome驱动属性
	  driver = new ChromeDriver();	// 初始化webdriver驱动
	  driver.manage().window().maximize(); // 窗口最大化

  }

  @AfterClass
  public void afterClass() {
	  // 结束测试后关闭浏览器资源
	  driver.close();
	  driver.quit();
  }

}
