package com.srini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;


public class Strip {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Actions builder = new Actions(driver);

        //WebElement select = driver.findElement(By.id("ContentHolder_lbFeatures_LBT"));

        List<WebElement> options = driver.findElements(By.xpath("//table[contains(@id,'ContentHolder_lbFeatures_LBT')]/tr/td[2]"));
        ListIterator<WebElement> optionsiterator = options.listIterator();
String s = "QWERTY keyboard";
        while(optionsiterator.hasNext()){
            if(optionsiterator.next().getText().equals(s)){
                //optionsiterator.
            }

        }
        //ListIterator<String> li = new ListIterator<String>();
          //      options.
        //System.out.println(options.get(5).getText());

        /*String s = "Infrared";
        int i = 0;
        while(i<options.size()){
            if(options.get(i).getText().equals(s)){
                options.get(i).click();
            }

            i++;
        }*/
Thread.sleep(5000);
        driver.quit();
    }
}