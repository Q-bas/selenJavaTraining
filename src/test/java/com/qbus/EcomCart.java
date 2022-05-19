package com.qbus;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcomCart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        //set array of products to add in cart
        String[] grocList ={"Cucumber","Brocolli","Beetroot"};

        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        //take list of all product names on page
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        //iterator to break loop in the end
        int count1 = 0;
        //for each product name
        for (int i=0;i<products.size();i++){
            //get name + remove any extra chars + trim  from space
            String[] name = products.get(i).getText().split("-");
            String formatedName = name[0].trim();

            //1. convet arrau to aray  list
            List<String> li1 = Arrays.asList(grocList);
            //check if name conatins product from list grocList
            if(li1.contains(formatedName)){
                //click on add to cart
                count1++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if(count1==grocList.length){
                    break;
                    
                }
            }
            
        }
    }
}
