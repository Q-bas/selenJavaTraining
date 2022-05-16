package com.qbus;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class sel1 {
    public static void main(String[] args) throws InterruptedException {
        //invoke browser
       System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        //open page
        driver.get("https://rahulshettyacademy.com/locatorspractice");
        
        //fill form
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("inputUsername")).sendKeys("qbus");
        driver.findElement(By.name("inputPassword")).sendKeys("qwerty");
        driver.findElement(By.className("submit")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//check error message
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000); 
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("qbus");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("qwerty");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.xpath("//form/input[2]")).sendKeys("email@email.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("222");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("qbus");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(1000);
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.className("submit")).click();
       
       
        //driver.quit();


    }
}
