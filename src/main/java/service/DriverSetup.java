package service;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverSetup {
    protected static AndroidDriver driver;

    protected static void prepareDriverNative() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        File appDir = new File("C:\\Users\\Volodymyr_Protsiv\\Desktop\\JavaMentoringProgram\\M15_Automated Testing of Mobile Applications with Java\\mobile-testing\\src\\main\\resources");
        File app = new File(appDir, "ContactManager.apk");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
}