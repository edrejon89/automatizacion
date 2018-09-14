import org.junit.Test;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import  org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Sincronizador {
  public static void main(String[] args) throws MalformedURLException, InterruptedException {


    DesktopOptions option = new DesktopOptions();
    option.setApplicationPath("C:\\Program Files (x86)\\SoftRestaurantSincronizador\\SoftRestaurantX.Syncronize.exe");
    WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
    WebDriverWait wait = new WebDriverWait(driver,60);
    wait.until(ExpectedConditions.elementToBeClickable(By.id("btnFlat"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.name("Correo Electrónico"))).sendKeys("walook.pruebas@gmail.com");
    wait.until(ExpectedConditions.elementToBeClickable(By.name("Contraseña"))).sendKeys("PruebasWa100k");
    wait.until(ExpectedConditions.elementToBeClickable(By.name("Enviar"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.id("cmbEnterprises"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.className("Popup"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.name("ACEPTAR"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.name("Seleccionar..."))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.name("Empresa 2"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.name("Seleccionar"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.name("ACEPTAR"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.name("Sincronizar"))).click();
    wait.until(ExpectedConditions.elementToBeClickable(By.name("ACEPTAR"))).click();
   // wait.until(ExpectedConditions.elementToBeClickable(By.id("PART_Toggle"))).click();
    (new TouchAction
    wait.until(ExpectedConditions.elementToBeClickable(By.name("Cerrar Sesión"))).click();
    driver.quit();
  }
}
