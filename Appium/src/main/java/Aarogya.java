import java.net.URL;
import java.net.http.HttpClient;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities; 
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver; 
import io.appium.java_client.AppiumDriver;
 
 
public class Aarogya
{     
	static AppiumDriver driver;     
	public static void main(String[] args) throws Exception 
	{         
		opensetu();  
		System.out.println("Whats app opened");     
	     
 
		}
 
	public static void opensetu() throws Exception 
	{
		UiAutomator2Options Option = new UiAutomator2Options();         
		Option.setCapability("deviceName", "udid");         
		Option.setCapability("udid", "884f487b");        
		Option.setCapability("platformName", "android");        
		Option.setCapability("platformVersion", "13 ");        
		Option.setCapability("appPackage", "nic.goi.aarogyasetu");         
		Option.setCapability("appActivity", "nic.goi.aarogyasetu.views.HomeActivity"); 
		Option.setCapability("fullReset", false);
		Option.setCapability("noReset", true);
		URL url = new URL("http://127.0.0.1:4723/wd/hub");         
		AndroidDriver driver = new AndroidDriver(url, Option); 
		
	 }
	}