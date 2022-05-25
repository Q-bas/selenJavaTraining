package com.qbus;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CookiesNMisc {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver();
        //maximize browser window
        driver.manage().window().maximize();
        //delete all cookies
        driver.manage().deleteAllCookies();
        //delete specific cookie
        //driver.manage().deleteCookieNamed("sessionKey");
        

        driver.get("https://google.com");

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("/Users/andrew/dev0/files/trash/screenshot.png"));

    }
}
