package com.thetestingAcademy.SeleniumPracticePrograms_13Jul24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeProg_11
{
    @Test
    public void loginAppVWO()
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--guest");
        //options.setPageLoadStrategy()
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        WebElement uname=driver.findElement(By.id("login-username"));
        uname.sendKeys("mcaneha123@gmail.com");
        WebElement pwd=driver.findElement(By.id("login-password"));
        pwd.sendKeys("neha");

        WebElement Submitbutton =driver.findElement(By.id("js-login-btn"));
        Submitbutton.click();
       WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
      // WebElement errorMsg=driver.findElement(By.class("notification-box-description"));
       // Assert.assertEquals(errorMsg.getText(), "Your email, password, IP address or location did not match");
       driver.quit();
    }

}
