package lul;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Init {
    static WebDriver driver;

    public static WebDriver getDriver() {
        String path = "F:\\Opera Driver\\operadriver.exe";
        OperaOptions options = new OperaOptions();
        options.setBinary("F:\\Opera\\60.0.3255.151\\opera.exe");
        System.setProperty("webdriver.opera.driver", "F:\\Opera Driver\\operadriver.exe");

        driver = new OperaDriver(options);

        return driver;
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     /*public static void sleep(int seconds){
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }*/
    }
}