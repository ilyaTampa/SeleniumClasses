package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[id *='txtUser']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[value $='GIN']")).click();
        Boolean isErrorMessageIsDisplayed = driver.findElement(By.cssSelector("span[id ^='spanMessage']")).isDisplayed();
        System.out.println(isErrorMessageIsDisplayed);
        driver.quit();


    }

}