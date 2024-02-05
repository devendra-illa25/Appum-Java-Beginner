
import java.net.URL;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.AndroidDriver; 

 
 
public class Calculato
{     
	    
	public static void main(String[] args) throws Exception 
	{         
		openCalculator();  
		System.out.println("Application started.................");     
	     
 
		}
 
	public static void openCalculator() throws Exception 
	{
		UiAutomator2Options Option = new UiAutomator2Options();         
		Option.setCapability("deviceName", "udid");         
		Option.setCapability("udid", "884f487b");        
		Option.setCapability("platformName", "android");        
		Option.setCapability("platformVersion", "13 ");        
		Option.setCapability("appPackage", "com.oneplus.calculator");         
		Option.setCapability("appActivity", "com.android.calculator2.Calculator");    
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");     
		AndroidDriver driver = new AndroidDriver(url, Option); 
		
		WebElement one =  driver.findElement(By.id("com.oneplus.calculator:id/digit_1"));
		one.click();
		WebElement Pluse = driver.findElement(By.id("com.oneplus.calculator:id/img_op_add"));
	    Pluse.click();
		WebElement two = driver.findElement(By.id("com.oneplus.calculator:id/digit_2"));
		two.click();
		WebElement EQL = driver.findElement(By.id("com.oneplus.calculator:id/img_eq"));
		EQL.click();
		WebElement Result = driver.findElement(By.id("com.oneplus.calculator:id/result"));
	    Result.click();	
	  
	 }
	}