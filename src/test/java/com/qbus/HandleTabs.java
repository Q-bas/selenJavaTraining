package com.qbus;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        driver.findElement(By.cssSelector(".blinkingText")).click();
        //get number of windows
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iter = windows.iterator();
        String parentId = iter.next();//parent tab id
        String childId = iter.next();//child tab id
        //switch to child tab
        driver.switchTo().window(childId);
        //this currently unavailable on the site so hardcode
        String email = "mentor@rahulshettyacademy.com";
        //switch back to parent tab
        driver.switchTo().window(parentId);
        //type in email
        driver.findElement(By.id("username")).sendKeys(email);

    }
}
