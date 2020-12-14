package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://18.232.148.34/humanresources/symfony/web/index.php/auth/login");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[id *='txtUser']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name ^='txtPassword']")).sendKeys("Hum@nhrm123");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[value $='GIN']")).click();

        Boolean isLogoIsRight=driver.findElement(By.cssSelector("img[alt ^=Orange] ")).isDisplayed();
        System.out.println(isLogoIsRight);
        driver.quit();







    }
}
