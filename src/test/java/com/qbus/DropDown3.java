package com.qbus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown3 {
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class$='ui-menu-item'] a"));

        for(WebElement option: options){
            if(option.getText().equalsIgnoreCase("india")){
                option.click();
                break;
            }
        }
//click checkbox      
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
//check if checkbox is selected
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//count number of checkboxes
        System.out.print(driver.findElements(By.cssSelector("input[type='checkbox']")).size());




    }
}
