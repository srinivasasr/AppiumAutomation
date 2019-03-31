package iosAPP;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Appautomation{

    public void logIn(){
        (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("CONTINUE")));
        driver.findElement(By.id("CONTINUE")).click();
        driver.findElement(By.id("EMAIL")).click();
        driver.findElement(By.name("Email")).sendKeys("asr@g.com");
        driver.findElement(By.name("Password")).sendKeys("asr");
        driver.findElement(By.id("LOGIN")).click();
    }
}
