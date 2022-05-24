package com.qbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        //choose frame on page
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        //activate actions functionality
        Actions act = new Actions(driver);
        //define dragable and dropable
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target =  driver.findElement(By.id("droppable"));
        //drag & drop
        act.dragAndDrop(source, target).build().perform();
        //return FROM frame
        driver.switchTo().defaultContent();
    }
}
