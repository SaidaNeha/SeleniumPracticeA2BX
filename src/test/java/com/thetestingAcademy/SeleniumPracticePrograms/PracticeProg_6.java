package com.thetestingAcademy.SeleniumPracticePrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeProg_6
{
    public static void main(String[] args) {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.google.com/");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.get("https://www.guru99.com/");

        driver.quit();
    }
}
