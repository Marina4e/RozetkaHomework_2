package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RozetkaPage3 {
    private final WebDriver driver;
    private final static By RIGHT_ARROW_BUTTON =
            By.xpath("//a [text() ='До наступної сторінки']");
    public RozetkaPage3(WebDriver driver) {
        this.driver = driver;
    }
    public void loadPage() {
        driver.get("https://rozetka.com.ua/network-equipment/c80111/");
    }

    public void  nextPageRightArrow() {
        driver.findElement(RIGHT_ARROW_BUTTON).click();

    }


}

