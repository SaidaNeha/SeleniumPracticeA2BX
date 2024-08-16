package com.thetestingAcademy.SeleniumPracticePrograms;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PracticeProg_1
{
@Test
    public void vwoLogin()
{
    EdgeDriver driver=new EdgeDriver();
    driver.get("https://guru99.com");
    driver.quit();
}
}
