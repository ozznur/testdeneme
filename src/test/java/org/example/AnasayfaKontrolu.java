package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnasayfaKontrolu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oznur\\IdeaProjects\\untitled1\\driver\\chromedriverr.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.n11.com/";
        String expectedTitle = "n11.com - Alışverişin Uğurlu Adresi";
        String actualTitle = "";
        driver.get(baseUrl);
        actualTitle = driver.getTitle();
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();


    }
}
