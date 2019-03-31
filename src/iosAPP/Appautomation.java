package iosAPP;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CapsReader;

import java.io.FilterInputStream;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Appautomation {

    public static IOSDriver driver = null;

    public static void main(String[] args) throws MalformedURLException {
        Appautomation asr = new Appautomation();
        asr.firstTest();
    }

    public void firstTest() throws MalformedURLException {
        CapsReader capabilities = new CapsReader();
        driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities.getCapabilities());
        HomePage home = new HomePage();
        home.logIn();
        driver.quit();


    }
}
