package com.qbus;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EcomCart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();
        //explicit wait declaration
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //implicit wait - for each step in the class (commented as explicit wait used now)
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        //set array of products to add in cart
        String[] grocList ={"Cucumber","Brocolli","Beetroot"};
        //add items to cart
        addItems(driver,grocList);
        //open cart popup
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//div[@class='cart-preview active']/div/button")).click();
            //explicit wait usage
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        //apply promo code
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();
            //explicit wait use
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        //check if allert shown
        Assert.assertEquals(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText(), "Code applied ..!"); 

    }

    public static void addItems(WebDriver driver,String[] grocList){
        //take list of all product names on page
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        //iterator to break loop in the end
        int count1 = 0;
        //for each product name
        for (int i=0;i<products.size();i++){
            //get name + remove any extra chars + trim  from space
            String[] name = products.get(i).getText().split("-");
            String formatedName = name[0].trim();
            //convert array to list
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
