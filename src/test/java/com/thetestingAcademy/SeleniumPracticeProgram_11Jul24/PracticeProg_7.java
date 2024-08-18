package com.thetestingAcademy.SeleniumPracticeProgram_11Jul24;

import org.openqa.selenium.edge.EdgeDriver;

public class PracticeProg_7{
    public static void main(String[] args) {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://bing.com");
        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}