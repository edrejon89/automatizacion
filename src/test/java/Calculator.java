import org.openqa.selenium.winium.DesktopOptions;
import  org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {
    public static void main (String[] args) throws MalformedURLException, InterruptedException {
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:\\Windows\\system32\\calc.exe");
        Thread.sleep(5000);
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),option);
        driver.findElement(By.id("138")).click();
        driver.findElement(By.id("93")).click();
        driver.findElement(By.name("8")).click();
        driver.findElement(By.id("121")).click();
        driver.close();
    }
}
