package com.thetestingAcademy.SeleniumPracticePrograms;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeProg_8
{
@Test
    public void testVWOLogin()
{
    EdgeDriver driver=new EdgeDriver();
    driver.get("https://app.vwo.com");
    Assert.assertEquals(driver.getTitle(),"Login - VWO");
    Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
    driver.quit();
}
}
