package SeleniumTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab0012908 {
    @Test
    public void test_trial_errorMessage(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//a[@data-qa='bericafeqo']")).click();
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("abc");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"page-free-trial-signup-form-step1\"]/div[1]/div"));
        String eMessage = errorMessage.getText();
        if(eMessage.equalsIgnoreCase("The email address you entered is incorrect.")){
            Assert.assertTrue(true);
            System.out.println("Testcase passed");
        }else{
            Assert.fail();
            System.out.println("Testcase Failed");
        }
        driver.close();

    }
}
