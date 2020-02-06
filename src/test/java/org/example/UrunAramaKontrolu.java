package org.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class UrunAramaKontrolu {
    protected WebDriver driver;

    @Before
    public void setUp() throws Exception{
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oznur\\IdeaProjects\\untitled1\\driver\\chromedriverr.exe");
        driver= new ChromeDriver(capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void UrunArama()
    {
        Random rnd=new Random();
        //int index = rnd.nextInt(20) + 1;
        driver.get("https://www.n11.com/arama");
        driver.findElement(By.id("searchData")).sendKeys("bilgisayar");
        WebElement search = driver.findElement(By.className("searchBtn"));
        search.click();
        /*System.out.println();
        List<WebElement> urunlerIsimListesi = driver.findElements(By.cssSelector("span[class='count']"));
        String urunIsmi = urunlerIsimListesi.get(index).getText();

        List<WebElement> urunListesi= driver.findElements(By.cssSelector("li[class='']"));
        urunListesi.get(index).click();
        String urununSayfasindakiIsmi= driver.findElement(By.id("product-name")).getText();
        Assert.assertEquals("ürün ismi uyuşmadı", urununSayfasindakiIsmi,urunIsmi);
          driver.findElement(By.id("sponsoredProduct")).click();
          if(urunIsmi!=null)
        {
            System.out.println("ürün var");
        }
        else System.out.println("ürün yok");
        */
        String actualUrl="https://www.n11.com/arama?q=bilgisayar";
        String expectedUrl= driver.getCurrentUrl();
        if(actualUrl.equalsIgnoreCase(expectedUrl))
        {
        System.out.println("Arama gerçekleşti"); }
         else
        { System.out.println("Arama hatalı");}
}
    @After
    public void tearDown() throws Exception{
        driver.quit();
    }
}
