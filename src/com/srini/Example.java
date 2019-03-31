package com.srini;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import java.util.List;
import org.openqa.selenium.support.ui.Select;



public class Example {
    WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

Example obj1 = new Example();
        obj1.registrationForm();
        obj1.selectRandomProduct();
        //driver.close();
    }

     public void registrationForm(){
         try {
             driver.get("http://newtours.demoaut.com/mercurywelcome.php?osCsid=ac9efa8ed1b91e67ee6c6a11481c58c5");
             driver.manage().window().maximize();
             //driver.findElement(By.id("u_0_c")).sendKeys("Srinivas") ;
             driver.findElement(By.linkText("REGISTER")).click();
             driver.findElement(By.name("firstName")).sendKeys("asr");
             driver.findElement(By.name("lastName")).sendKeys("vas");
             driver.findElement(By.name("phone")).sendKeys("2348745345");
             driver.findElement(By.id("userName")).sendKeys("asr@g.com");
             driver.findElement(By.name("address1")).sendKeys("mowry ave");
             driver.findElement(By.name("city")).sendKeys("fremont");

             driver.findElement(By.name("state")).sendKeys("ca");
             driver.findElement(By.name("postalCode")).sendKeys("94536");

             //Select state =  new Select(driver.findElement(By.name("country")));
             //state.selectByVisibleText("UNITED STATES");
             //ArrayList<String> al ;
             //WebElement wb = driver.findElement(By.name("country"));


             driver.findElement(By.id("email")).sendKeys("asr@g.com");
             driver.findElement(By.name("password")).sendKeys("pass");
             driver.findElement(By.name("confirmPassword")).sendKeys("pass");

             Thread.sleep(3000);
             //driver.close();
         } catch (InterruptedException e) {
             System.out.println("got interrupted!");
         }
     }

    public void selectRandomProduct() {

        // Find and click on a random product
        WebElement allProducts = driver.findElement(By.name("country"));
        //System.out.println(allProducts);
        Select objSel = new Select(allProducts);
        List <WebElement> weblist = objSel.getOptions();
        int iCnt = weblist.size();
       // System.out.println(iCnt);
        Random rand = new Random();
        int iSelect = rand.nextInt(iCnt);
        objSel.selectByIndex(iSelect);
        System.out.println(allProducts.getAttribute("value"));
        //int randomProduct = rand.nextInt(allProducts.size());
        //allProducts.get(randomProduct).click();
        driver.quit();
    }
}

