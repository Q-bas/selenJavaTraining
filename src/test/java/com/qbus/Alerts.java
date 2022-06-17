package com.qbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //path to pop-up
        String text = "qbus";
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        //handle pop-up
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        //another alert. with cancel btn
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().dismiss();
        


        
    }
}
