package com.qbus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class Scope1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //count links on the page
        int numberOfLinks = driver.findElements(By.tagName("a")).size();
        System.out.println(numberOfLinks);

        //limit scope of testing
        WebElement footerDriver =  driver.findElement(By.id("gf-BIG"));
        //count # of milnks in this limited scope
        int countLinks = footerDriver.findElements(By.tagName("a")).size();
        System.out.println(countLinks);

        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        //click on each link in 1 column of the footer. check if opens
        //setup CTRL click
        String clickNewTab = Keys.chord(Keys.COMMAND,Keys.ENTER);
        for (int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++){
            //CTRL click on each link
            columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickNewTab);
        }
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iter = windows.iterator();
        // String parentId = iter.next();//parent tab id
        // String childId = iter.next();//child tab id
        iter.next();
        List<String> titles = new ArrayList<String>();
        while(iter.hasNext()){
            driver.switchTo().window(iter.next());
            titles.add (driver.getTitle());
        }
        System.out.println(titles);
    }
}
