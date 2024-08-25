package com.thetestingAcademy.SeleniumPracticePrograms_13Jul24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class PracticeProg_12
{
@Test
public void verifyFREETrial()
{
    ChromeOptions options=new ChromeOptions();
    options.addArguments("--start-maximized");
    options.addArguments("--guest");
    //options.setPageLoadStrategy()
    WebDriver driver=new ChromeDriver(options);
    driver.get("https://app.vwo.com");
    WebElement freeTrial=driver.findElement(By.partialLinkText("Start a free"));
    freeTrial.click();
    //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement busienessEmail= driver.findElement(By.id("page-v1-step1-email"));
    busienessEmail.sendKeys("admin@admin.com");
    WebElement consentChkBox= driver.findElement(By.id("page-668cu-gdpr-consent-checkbox"));
    consentChkBox.click();
    List<WebElement> button=driver.findElements(By.tagName("button"));
    button.get(0).click();
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    WebElement error_msg=driver.findElement(By.className("invalid-reason"));
    System.out.println(error_msg.getText());
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

    try {
       Assert.assertEquals(error_msg.getText(),"An account with this email already exists. Login Here");
   } catch (Exception e) {
       throw new RuntimeException(e);
    }

    driver.quit();
}
}
