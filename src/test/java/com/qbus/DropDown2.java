package com.qbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDown2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //Increment passenger count
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        int i = 1;
        while(i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        
        /* decrement count
        for (int a=5; a>3; a--){
            driver.findElement(By.id("hrefDecAdt")).click();
        }*/
        
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

        //from dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        
        //Arrive dropdown
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); -another way

        //calendar
        driver.findElement(By.cssSelector(".ui-state-highlight")).click();

        //round-trip turn ON
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();


        //driver.quit();
    }
}
