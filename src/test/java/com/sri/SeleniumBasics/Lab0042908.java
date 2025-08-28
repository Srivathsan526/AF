package com.sri.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab0042908 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
