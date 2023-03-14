package org.prog;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.web.RozetkaPage3;

public class BaseTestClass {
    private static WebDriver driver;
    private static RozetkaPage3 rozetkaPage3;

    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        rozetkaPage3 = new RozetkaPage3(driver);

    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
   @Test
   public void testPaginationWithPageNumber (){
        rozetkaPage3.loadPage();
        rozetkaPage3.goToPage("3");
    //тестуватиме знаходженяя певного обєкту пейджинації
      WebElement productItem = rozetkaPage3.getProductByLineAndIndex(1,2,5);
       System.out.println(productItem.getText());}

    @Test
   public void testPaginationWithArrows (){
        System.out.println("Hello,another test!");
        rozetkaPage3.loadPage();
        rozetkaPage3.switchToRight();
        WebElement productItem = rozetkaPage3.getProductByLineAndIndex(1,2,5);
        System.out.println(productItem.getText());}

}

