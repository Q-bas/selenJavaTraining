package com.qbus;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggies = driver.findElements(By.xpath("//th/td[1]"));
        List<WebElement> fltrdList = veggies.stream()
            .filter(veg->veg.getText()
                .contains("Rice"))
            .collect(Collectors.toList());
        Assert.assertEquals(veggies,fltrdList);
    }
}
