
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class Call {
    static AndroidDriver driver;

    public static void main(String[] args) throws Exception {
        openCall();
        System.out.println("Calling.................");
    }

    public static void openCall() throws Exception {
     
        DesiredCapabilities  capabilities = new DesiredCapabilities();   
        capabilities.setCapability("appium:automationName", "uiautomator2");
        capabilities.setCapability("appium:deviceName", "udid");
        capabilities.setCapability("appium:udid","884f487b");		
        capabilities.setCapability("appium:platformVersion", "13");
        capabilities.setCapability("appium:appPackage", "com.google.android.dialer");
        capabilities.setCapability("appium:appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
		
		 
		URL url = new URL("http://127.0.0.1:4723/wd/hub");         
		AndroidDriver driver = new AndroidDriver(url,  capabilities); 
		

        

        WebElement Dailer = driver.findElement(By.id("com.google.android.dialer:id/dialpad_fab"));
        Dailer.click();
        WebElement Num8 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"8\"]"));
        Num8.click();
        WebElement Num6 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"6\"]"));
        Num6.click();
        WebElement Num3 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"3\"]"));
        Num3.click();
        WebElement Num9 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"9\"]"));
        Num9.click();
        
        int x = 5;
        if (x < 2) {
            WebElement Call = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Call\"])[1]"));
            Call.click();
        } else {
            WebElement Call = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Call\"])[5]"));
            Call.click();
        }
    }
}
