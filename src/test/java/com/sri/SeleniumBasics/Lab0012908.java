package com.sri.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Lab0012908 {

    @Test
    public void assertCheck(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.getCurrentUrl();
        driver.getTitle();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com/");

        //assertJ
        assertThat(driver.getCurrentUrl()).isNotNull().isNotEmpty().isNotBlank().isEqualTo("https://www.google.com/");

        driver.quit();

    }
}
