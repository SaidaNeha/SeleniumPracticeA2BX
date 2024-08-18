package com.thetestingAcademy.SeleniumPracticeProgram_11Jul24;

import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProg_4
{
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        //Selenium 3.0 below was mandatory
        System.setProperty("webdriver.chrome.driver","/path/to/Chromedriver");
        driver.get("https://sdet.live");
    }
}
