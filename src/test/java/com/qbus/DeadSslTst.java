package com.qbus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeadSslTst {
    public static void main(String[] args) {
        // browser optins init
        ChromeOptions options = new ChromeOptions();
        
        //launc ignoring fake/expired SSL certificate
        options.setAcceptInsecureCerts(true);
        
        // Same for Firefox safary or so
        // FirefoxOptions options = new FirefoxOptions();
         
        // launch browser with extensions
        // options.addExtensions(paths)

        // proxy
        // Proxy proxy = new Proxy();
        // proxy.setHttpProxy("ipAddress")
        // options.setCapability("proxy", proxy);

        //block pop-ups like "allow your location" etc.
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

        //Set download location
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "/directory/path");
        options.setExperimentalOption("prefs", prefs);

        //watch more on https://chromedriver.chromium.org/capabilities

        System.setProperty("webdriver.chrome.driver", "/Users/andrew/dev0/files/chromedriver");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");


        System.out.println(driver.getTitle());
    }
}
