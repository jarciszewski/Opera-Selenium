package lul;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainMenuTest {
    WebDriver driver;

    @Before

    public void start() {
        driver = Init.getDriver();
    }



    @Test
    public void mainMenu() {
        driver.get("http://newtours.demoaut.com");
        driver.findElement(By.linkText("CONTACT")).click();
        //sleep(2);
        driver.findElement(By.linkText("SUPPORT")).click();
        //sleep(2);
        driver.findElement(By.linkText("REGISTER")).click();
        //sleep(2);
        driver.findElement(By.linkText("SIGN-ON")).click();
        //sleep(2);
        driver.quit();
    }
}