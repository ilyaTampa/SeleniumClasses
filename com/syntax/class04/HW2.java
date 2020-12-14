package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        List<WebElement> everyLinkFromAmazon = driver.findElements(By.tagName("a"));

        System.out.println(everyLinkFromAmazon.size()); // total links on the page

        for(WebElement oneLink: everyLinkFromAmazon){
            String fullLinkList = oneLink.getAttribute("href");
            System.out.println(fullLinkList); // full list of links

            String linkText = oneLink.getText(); // looking for links with text

            if (!linkText.isEmpty()){
                System.out.println("Links with text "+fullLinkList+" "+linkText); // printing links with text
            }
        }
        driver.quit();



    }
}
