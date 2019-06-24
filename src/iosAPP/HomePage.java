package iosAPP;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.bind.Element;
import java.io.*;
import java.util.List;
import java.util.Properties;

public class HomePage extends Appautomation {

    public void logIn() throws IOException {
        (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("CONTINUE")));

        Properties prop = new Properties();
        FileInputStream reader = new FileInputStream(System.getProperty("user.dir") + "/capabs//configure.properties");
        prop.load(reader);

        //String r = reader.
      /*  BufferedReader reader1 = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/capabs//configure.properties"));

            String line = reader1.readLine();
        while(line!=null){
            System.out.println(line);
            line = reader1.readLine();
        }*/

        driver.findElement(By.id(prop.getProperty("continue_button_id"))).click();
        driver.findElement(By.id(prop.getProperty("email_button_id"))).click();
        WebDriverWait web = new WebDriverWait(driver,10);
        web.until(ExpectedConditions.presenceOfElementLocated(By.name(prop.getProperty("email_field_by_name"))));
        driver.findElement(By.name(prop.getProperty("email_field_by_name"))).sendKeys(prop.getProperty("email"));
        driver.findElement(By.name(prop.getProperty("pwd_field_by_name"))).sendKeys(prop.getProperty("pwd"));
        driver.findElement(By.id(prop.getProperty("login_button_by_id"))).click();

    }
}
