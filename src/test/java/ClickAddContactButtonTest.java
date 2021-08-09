import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import service.DriverSetup;

public class ClickAddContactButtonTest extends DriverSetup {
    @BeforeClass
    public static void setUp() throws Exception {
        prepareDriverNative();
    }

    @Test
    public void clickAddContactButtonCheck() {
        String applicationPackageName = "com.example.android.contactmanager:id/";
        By addButton = By.id(applicationPackageName + "addContactButton");
        driver.findElement(addButton).click();

        System.out.println("ClickAddContactButtonTest passed");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}