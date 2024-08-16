package com.thetestingAcademy.SeleniumPracticePrograms;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

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
 EdgeDriver driver3=new EdgeDriver();

 driver3.get("https://sdet.live");
    }
}
