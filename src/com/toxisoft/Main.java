package com.toxisoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String chromeDriverPath = System.getProperty("user.dir")+"/src/selenium/drivers/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.google.com");


    }
}