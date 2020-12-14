package com.syntax.class05;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
Go to facebook sign up page
Fill out the whole form
Click signup
 */
public class HW1 {
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//a[@ajaxify = '/reg/spotlight/']")).click();
        Thread.sleep(700);
        driver.findElement(By.xpath("//input[@placeholder = 'First name']")).sendKeys("Ilya");
        Thread.sleep(300);
        driver.findElement(By.xpath("//input[@aria-label= 'Last name']")).sendKeys("Ivanov");
        Thread.sleep(300);
        driver.findElement(By.xpath("//input[@aria-label= 'Mobile number or email']")).sendKeys("7572145579");
        Thread.sleep(300);
        driver.findElement(By.xpath("//input[@aria-label= 'New password']")).sendKeys("qwerty12345");
        Thread.sleep(300);

        Select birthMonth = new Select(driver.findElement(By.id("month")));
        birthMonth.selectByVisibleText("Jan");
        Thread.sleep(200);
        Select birthDay = new Select(driver.findElement(By.id("day")));
        birthDay.selectByVisibleText("8");
        Thread.sleep(200);
        Select birthYear = new Select(driver.findElement(By.id("year")));
        birthYear.selectByVisibleText("1986");
        Thread.sleep(200);
        driver.findElement(By.xpath("//input[@value = '2']")).click();
        Thread.sleep(400);
        driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
        Thread.sleep(300);
 }

}
