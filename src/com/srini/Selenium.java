package com.srini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.bcom-126.tbe.zeus.fds.com/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.findElement(By.linkText("MY ACCOUNT")).click();
        driver.findElement(By.linkText("CREATE AN ACCOUNT")).click();
        driver.findElement(By.name("ca-profile-firstname")).sendKeys("asr");
        driver.findElement(By.name("ca-profile-lastname")).sendKeys("vas");
        driver.findElement(By.name("email")).sendKeys("textauto@g.com");
        driver.findElement(By.name("password")).sendKeys("macys123");
        Select list = new Select(driver.findElement(By.xpath("//select[@id='ca-profile-birth-month']")));
        //list.selectByVisibleText("February");
        List<WebElement> option = list.getOptions();
        for (int j = 0; j < option.size(); j++) {
            if (option.get(j).getText().equals("February")) {
                list.selectByIndex(j);
            }
            //driver.findElement(By.xpath("//input[contains(@type,'search')]")).sendKeys("jeans");

            // WebDriverWait wait = new WebDriverWait(driver, 20);
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@type,'search')]")));
        }
        Thread.sleep(5000);
        driver.quit();
    }
}
