package com.qbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        int i = 1;
        while(i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        
        for (int a=5; a>3; a--){
            driver.findElement(By.id("hrefDecAdt")).click();
        }
        
        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        driver.quit();
    }
}
