package com.qbus;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.xpath("//th[@role='columnheader'][1]")).click();
        
        List<WebElement> elementList =  driver.findElements(By.xpath("//tbody/tr/td[1]"));
        
        List<String> originalList  = elementList.stream()
            .map(a->a.getText())
            .collect(Collectors.toList());
        
        List<String> sortdList = originalList.stream().sorted().collect(Collectors.toList());

        Assert.assertTrue(originalList.equals(sortdList));
    }
}
