package com.thetestingAcademy.SeleniumPracticeProgram_11Jul24;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeProg_3
{
    public static void main(String[] args) {

        ///Function show case example
/**SearchContext driver=new EdgeDriver();
 * when want to first run on chrome then on edge
 WebDriver driver1=new EdgeDriver();
 driver1=new ChromeDriver();
 //when want to run on multiple browsers
 RemoteWebDriver driver2=new EdgeDriver();
 */
        EdgeDriver driver3 = new EdgeDriver();

        driver3.get("https://sdet.live");

    }
}