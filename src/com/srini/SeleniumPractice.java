package com.srini;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumPractice {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/yc05s2a/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.mcom-125.tbe.zeus.fds.com");
    driver.findElement(By.className("tier-status")).click();
    driver.navigate().back();
//driver.findElement(By.id("ca-profile-submit")).sendKeys(key.ENTER);
        /*List<WebElement> li = driver.findElements(By.tagName("a"));
        Iterator<WebElement> it = li.iterator();
        while(it.hasNext()){
            String links = it.next().getAttribute("href");
            System.out.println(links);

        }

        for(WebElement link:li){
            link.click();
            Thread.sleep(1000);
        }

        driver.getWindowHandles();*/


//System.out.println(text);

      /*  WebElement we = driver.findElement(By.xpath("//input[@value='Subscribe']"));
        String text = we.getAttribute("type");

        System.out.println("**************"+text);
        WebDriverWait wdw = new WebDriverWait(driver,10);
        wdw.until(ExpectedConditions.attributeContains(By.xpath("//input[@value='Subscribe']"),"value","Subscribe"));

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
        driver.quit();

    }
}
