package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver chromeDriver = null;
        try {
            chromeDriver = new ChromeDriver();
            RozetkaPage3 rozetkaPage3 = new RozetkaPage3(chromeDriver);
            rozetkaPage3.loadPage();
            System.out.println("Page loaded!");

            rozetkaPage3.nextPageRightArrow();
            System.out.println("Klicking: ");
        } catch (Exception e){
            System.out.println("Verification was broken at: " + LocalDateTime.now());
        }
        finally {
            if (chromeDriver != null) {
                chromeDriver.quit();
            }
        }


    }}