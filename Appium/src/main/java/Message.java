

import java.net.URL;
import java.net.http.HttpClient;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities; 
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver; 
import io.appium.java_client.AppiumDriver;
 
 
public class Message
{     
	static AppiumDriver driver;     
	public static void main(String[] args) throws Exception 
	{         
		openMessage();  
		System.out.println("Sent Message.................");     
	     
 
		}
 
	public static void openMessage() throws Exception 
	{
		UiAutomator2Options Option = new UiAutomator2Options();         
		Option.setCapability("deviceName", "udid");         
		Option.setCapability("udid", "884f487b");        
		Option.setCapability("platformName", "android");        
		Option.setCapability("platformVersion", "13 ");        
		Option.setCapability("appPackage", "com.google.android.apps.messaging");         
		Option.setCapability("appActivity", "com.google.android.apps.messaging.ui.ConversationListActivity");    
		URL url = new URL("http://127.0.0.1:4723/wd/hub");         
		AndroidDriver driver = new AndroidDriver(url, Option); 
		WebElement Next = driver.findElement(By.id("com.google.android.apps.messaging:id/welcome_fragment_federated_learning_next_button"));
	    Next.click();
	    WebElement SpaNext = driver.findElement(By.id("com.google.android.apps.messaging:id/welcome_fragment_spam_next_button"));
	    SpaNext.click();
	    Thread.sleep(10000);
			
	    WebElement Mani = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.apps.messaging:id/conversation_name\" and @text=\"Mani -vizag\"]"));
	    Mani.click();	
	    WebElement emoji = driver.findElement(By.id("com.google.android.apps.messaging:id/emoji_gallery_button"));
	    emoji.click();	
	    Thread.sleep(5000);
	    WebElement smile = driver.findElement(By.xpath("//android.view.View[@content-desc=\"😆\"]"));
	    smile.click();
	    WebElement sent = driver.findElement(By.id("com.google.android.apps.messaging:id/send_message_button_icon"));
	    sent.click();
	   // HttpClient.Factory httpClientFactory = HttpClient.Factory.createDefault();
	 }
	}