package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");

        driver.manage().window().maximize();

        Thread.sleep(1500);
        driver.findElement(By.xpath("//a[contains(text(),'Practising')]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("(//a[text() = 'Simple Form Demo'])[2]")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@id = 'user-message']")).sendKeys("Selenium is FUN!");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[text() = 'Show Message']")).click();
        Thread.sleep(1500);
        driver.quit();


    }
}
