package com.qbus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JSExecutorTst {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        JavascriptExecutor js = (JavascriptExecutor)driver;
        //scroll page to the table
        js.executeScript("window.scroll(0,600)");
        //scroll table
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        //form list of all cells
        List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
     
        //get sum of all values in the selected cells
        int sum = 0;
        for (int i=0; i<values.size(); i++){
            sum = sum+Integer.parseInt(values.get(i).getText());
        }
        int totl = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        Assert.assertEquals(sum,totl);

    }
}
