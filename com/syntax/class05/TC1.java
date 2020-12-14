package com.syntax.class05;

/*
TC 1: Facebook dropdown verification
Open chrome browser
Go to “https://www.facebook.com”
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TC1 {
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.xpath("//a[@ajaxify = '/reg/spotlight/']")).click();
        Thread.sleep(500);

        Select monthDrop = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_month']")));
        Select dayDrop = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_day']")));
        Select yearDrop = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_year']")));

        List<WebElement>monthList = monthDrop.getOptions();
        List<WebElement>dayList = dayDrop.getOptions();
        List<WebElement>yearList = yearDrop.getOptions();

        System.out.println("Month dropDown has 12 month options " + (monthList.size() == 12));
        System.out.println("Day dropDown has 31 days options " + (dayList.size() == 31));
        System.out.println("Year dropDown has 115 years options " + (yearList.size() == 115));

        monthDrop.selectByVisibleText("Jan");
        Thread.sleep(500);
        dayDrop.selectByVisibleText("8");
        Thread.sleep(500);
        yearDrop.selectByVisibleText("1986");
        Thread.sleep(6000);

        driver.quit();




    }
}
