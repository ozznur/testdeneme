package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class LoginEkraniKontrolu {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception{
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oznur\\IdeaProjects\\untitled1\\driver\\chromedriverr.exe");
        WebDriver driver = new ChromeDriver();
        driver= new ChromeDriver(capabilities);
        //   driver.get("http://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void GirisKontrolu() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oznur\\IdeaProjects\\untitled1\\driver\\chromedriverr.exe ");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.n11.com/giris-yap");

        driver.findElement(By.id("email")).sendKeys("ornek@gmail.com");
        driver.findElement(By.id("password")).sendKeys("ornekpass");
        WebElement login = driver.findElement(By.xpath("//input[@name='email']"));
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login.click();
        String actualUrl="https://www.n11.com/";
        String expectedUrl= driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
            System.out.println("Test passed"); }
        else
            System.out.println("Test failed");
    }
    @After
    public void tearDown() throws Exception{
        driver.quit();
    }
}
