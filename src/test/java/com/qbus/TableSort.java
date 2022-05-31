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
        List<String> price;
        do{
            List<WebElement> rows =  driver.findElements(By.xpath("//tbody/tr/td[1]"));
            price = rows.stream()
                .filter(s->s.getText().contains("Rice"))
                .map(s -> getPriceVeggie(s))
                .collect(Collectors.toList());
            price.forEach(a->System.out.println(a));
            if(price.size()<1){
                driver.findElement(By.cssSelector("[aria-label='Next']")).click();
            }
        }while(price.size()<1);
    }

    private static String getPriceVeggie(WebElement s) {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
