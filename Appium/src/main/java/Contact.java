

import java.net.URL;
import java.net.http.HttpClient;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities; 
import io.appium.java_client.android.AndroidDriver; 
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
 
 
public class Contact
{     
	static AppiumDriver driver;     
	public static void main(String[] args) throws Exception 
	{         
		openCall();  
		System.out.println("Calling.................");     
		
		}
 
	public static void openCall() throws Exception 
	{
		UiAutomator2Options Option = new UiAutomator2Options();  
		
		Option.setCapability("appium:automationName", "uiautomator2");
		Option.setCapability("appium:deviceName", "udid");
		Option.setCapability("appium:udid","884f487b");		
		Option.setCapability("appium:platformVersion", "13");
		Option.setCapability("appium:appPackage", "com.google.android.dialer");
		Option.setCapability("appium:appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity");
		
		 
		URL url = new URL("http://127.0.0.1:4723/wd/hub");         
		AndroidDriver driver = new AndroidDriver(url, Option); 
		
		  
		WebElement Dailer =  driver.findElement(By.id("com.google.android.dialer:id/dialpad_fab"));
		Dailer.click();
		WebElement Num8 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"8\"]"));
	    Num8.click();
		WebElement Num6 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"6\"]"));
		Num6.click();
		WebElement Num3 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"3\"]"));
		Num3.click();
		WebElement Num9 = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"9\"]"));
	    Num9.click();
//	    Thread.sleep(2000);
	 int x=6;
	    if(x<2){
	    WebElement Call = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Call\"])[1]"));
	    Call.click();
	    }
	    else
	    {
	    	WebElement Call1 = driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Call\"])[5]"));
		    Call1.click();
	    }
	  
	   // HttpClient.Factory shttpClientFactory = HttpClient.Factory.createDefault();
	 }
	}