

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.remote.DesiredCapabilities; 
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver; 
import io.appium.java_client.AppiumDriver;
 
 
public class WhatsappProfile
{     
	static AppiumDriver driver;     
	public static void main(String[] args) throws Exception 
	{         
		openWhatsapp();  
		System.out.println("Whats app opened");  
		
	     
 
		}
 
	public static void openWhatsapp() throws Exception 
	{
		UiAutomator2Options Option = new UiAutomator2Options();         
		Option.setCapability("deviceName", "udid");         
		Option.setCapability("udid", "884f487b");        
		Option.setCapability("platformName", "android");        
		Option.setCapability("platformVersion", "13 ");        
		Option.setCapability("appPackage", "com.whatsapp");         
		Option.setCapability("appActivity", "com.whatsapp.HomeActivity"); 
		Option.setCapability("fullReset", false);
		Option.setCapability("noReset", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");         
	    driver = new AndroidDriver(url, Option); 
		
	    //WebDriverWait wait = new WebDriverWait(driver, 20); // Wait for 20 seconds
		WebElement Menu = driver.findElement(By.id("com.whatsapp:id/menuitem_overflow"));
	    Menu.click();
	    
	    WebElement Settings = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.whatsapp:id/title\" and @text=\"Settings\"]"));
	    Settings.click();
	    
	    WebElement Photo = driver.findElement(By.id("com.whatsapp:id/profile_info_photo"));
	    Photo.click();
	 
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	 // Instead of Thread.sleep(5000)
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.whatsapp:id/change_photo_btn"))).click();
    
	 
	 // Instead of Thread.sleep(2000)
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.ImageView[@resource-id=\"com.whatsapp:id/icon\"])[2]"))).click();

	 // Instead of Thread.sleep(2000)
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.whatsapp:id/title\" and @text=\"All photos\"]"))).click();

	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.ImageView[@content-desc=\"Photo\"])[1]"))).click();
	 // Instead of Thread.sleep(2000)
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(((//android.widget.Button[@resource-id=\"com.whatsapp:id/ok_btn\"])))"))).click();

	 // Instead of Thread.sleep(2000)
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();

	 // Instead of Thread.sleep(2000)
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();


	    }
	}