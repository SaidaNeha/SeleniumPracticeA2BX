package com.thetestingAcademy.SeleniumPracticeProgram_11Jul24;

import org.openqa.selenium.edge.EdgeDriver;

public class PracticeProg_5
{
    public static void main(String[] args) {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
    }
}
