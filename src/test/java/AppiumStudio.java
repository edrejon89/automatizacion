import  io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.logging.Level;


public class AppiumStudio {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected IOSDriver<IOSElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
//        dc.setCapability("deviceName", "iPhone 6");
        dc.setCapability(MobileCapabilityType.UDID, "77ee9e8524f364c19d6f916ff000414ba86fc300");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.softrestaurant.softrestaurantappdistrib");
//        dc.setCapability("automationName", "XCUITest Real Device");
        driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @Test
    public void testUntitled() throws InterruptedException {
        Thread.sleep(8000);
        driver.findElement(By.xpath("(//[@text='Categorias']/[@class='UIAButton'])[1]")).click();
        driver.findElement(By.xpath("//*[@text='Ingresar']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@placeholder=' correo@ejemplo.com']")));
        driver.findElement(By.xpath("//*[@placeholder=' correo@ejemplo.com']")).sendKeys("walook.prueba@gmail.com");
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//[@placeholder=' *****']")));
        driver.findElement(By.xpath("//[@placeholder=' *****']")).sendKeys("Admin123");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='INICIAR SESIÓN']")));
        driver.findElement(By.xpath("//*[@text='INICIAR SESIÓN']")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Aceptar']")));
        driver.findElement(By.xpath("//*[@text='Aceptar']")).click();
        new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='CANCELAR']")));
        driver.findElement(By.xpath("//*[@text='CANCELAR']")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
