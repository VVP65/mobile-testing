package service;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverSetup {
    protected static AndroidDriver driver;
    private  static String APPLICATION_PATH = "src\\main\\resources";
    private  static String DEVICE_NAME = "emulator-5554";
    private  static String PLATFORM_NAME = "Android";
    private  static String HOST_URL = "http://127.0.0.1:4723/wd/hub";
    private  static String APPLICATION_APK_FILE = "ContactManager.apk";


    protected static void prepareDriverNative() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", DEVICE_NAME);
        capabilities.setCapability("platformName", PLATFORM_NAME);
        File app = new File(APPLICATION_PATH, APPLICATION_APK_FILE);
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL(HOST_URL), capabilities);
    }
}