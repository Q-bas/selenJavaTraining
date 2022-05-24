package com.qbus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.path2usa.com/travel-companions");
        driver.findElement(By.id("travel_date")).click();
        while (!driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='datepicker-switch']")).getText().contains("August")){
            driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='next']")).click();
        }
        List<WebElement> dates = driver.findElements(By.className("day"));
        int count = dates.size();

        for(int i=0; i<count; i++){
            String text = dates.get(i).getText();
            if(text.equalsIgnoreCase("24")){
                dates.get(i).click();
                break;
            };
            
        }
        
    }
}
