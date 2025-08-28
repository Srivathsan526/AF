package com.sri.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab0012508 {


    @Test
    public void webDriverStart(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");


    }
}
