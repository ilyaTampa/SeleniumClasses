package com.syntax.class06;
/*
    Go to http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php
click on each button and handle the alert accordingly
     */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static String url = "http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(800);

        driver.findElement(By.xpath("//button[@onclick = 'myAlertFunction()']")).click();
        Alert alertBox = driver.switchTo().alert();
        Thread.sleep(2000);
        alertBox.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@onclick = 'myConfirmFunction()']")).click();
        Alert confirmBox = driver.switchTo().alert();
        Thread.sleep(2000);
        confirmBox.dismiss();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@onclick = 'myPromptFunction()']")).click();
        Alert promtBox = driver.switchTo().alert();
        Thread.sleep(2000);
        promtBox.sendKeys("Ilya Ivanov");
        Thread.sleep(2000);
        promtBox.accept();

    }
}
