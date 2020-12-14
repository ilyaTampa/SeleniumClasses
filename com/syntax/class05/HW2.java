package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
/*
Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
 */

public class HW2 {
    public static String url = "https://www.ebay.com/";
    public static String header = "Computers, Tablets & Network Hardware";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        Select allCategories = new Select(driver.findElement(By.xpath("//select[@id = 'gh-cat']")));

        List<WebElement>listOfAll = allCategories.getOptions();
        for (WebElement element:listOfAll) {
            System.out.println(element.getText());
        }
        allCategories.selectByValue("58058");
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();

        System.out.println("Is header matching expected: " + (header.equalsIgnoreCase(driver.findElement(By.xpath("//span[@class = 'b-pageheader__text']")).getText())));


    }
}
