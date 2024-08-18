package com.thetestingAcademy.SeleniumPracticePrograms_13Jul24;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import javax.swing.*;

public class PracticeProg_9
{
    public static void main(String[] args) {
        EdgeOptions options=new EdgeOptions();
        //browser headless no ui or full mode
        //performance good and fast execution
        options.addArguments("--start-maximized");
        options.addArguments("--window.size=800,600");
        options.addArguments("--guest");
        Proxy proxy=new Proxy();
        proxy.setHttpProxy("222.129.35.173:57114");
        WebDriver driver=new EdgeDriver(options);
        //driver.manage().window().maximize();
        //driver.manage().window().minimize();
        driver.get("https://sdet.live");
        driver.quit();
    }
}
