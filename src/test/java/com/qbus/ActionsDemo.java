package com.qbus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.amazon.com/");
        //Move cursor
        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.id("nav-link-accountList"));
        //type capitals in search box
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
            //Type cappital letters
            .keyDown(Keys.SHIFT).sendKeys("hello")
            //select those string
            .doubleClick().build().perform();
        
        //move mouse to specific place
        a.moveToElement(move)
        //rigth click on those element
        .contextClick().build().perform();

    }
}
