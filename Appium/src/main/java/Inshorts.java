
import java.net.URL;
import java.net.http.HttpClient;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities; 
import io.appium.java_client.android.AndroidDriver; 
import io.appium.java_client.AppiumDriver;
 
 
public class Inshorts
{     
	static AppiumDriver driver;     
	public static void main(String[] args) throws Exception 
	{         
		openNews();  
		System.out.println("Inshorts.................");     
		
		}
 
	public static void openNews() throws Exception 
	{
		DesiredCapabilities Dcap = new DesiredCapabilities();   
		Dcap.setCapability("appium:automationName", "uiautomator2");
		Dcap.setCapability("appium:deviceName", "udid");
		Dcap.setCapability("appium:udid","884f487b");		
		Dcap.setCapability("appium:platformVersion", "13");
		Dcap.setCapability("appium:appPackage", "com.nis.app");
		Dcap.setCapability("appium:appActivity", "com.nis.app.ui.activities.HomeActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");         
		AndroidDriver driver = new AndroidDriver(url, Dcap); 
		WebElement Lang =  driver.findElement(By.id("com.nis.app:id/button_1"));
		Lang.click();
		WebElement Refresh =  driver.findElement(By.id("com.nis.app:id/toolbar_refresh_button"));
		Refresh.click();
		WebElement Up =  driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.nis.app:id/card\"]/android.widget.RelativeLayout"));
		Up.click();
		WebElement Allow =  driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		Allow.click();
		WebElement Discover = driver.findElement(By.id("com.nis.app:id/toolbar_category_button"));
	    Discover.click();
		WebElement AllNews = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.nis.app:id/category_image\"])[2]"));
		AllNews.click();
		WebElement Disc = driver.findElement(By.id("com.nis.app:id/toolbar_category_button"));
		Disc.click();
		WebElement Poll = driver.findElement(By.id("com.nis.app:id/poll_view_all"));
	    Poll.click();	
	    WebElement Parti = driver.findElement(By.id("(com.nis.app:id/btn_poll_yes"));
	    Parti.click();
	  
	    /*WebElement End = driver.findElement(By.xpath("(	\r\n"
	    		+ "//android.widget.ImageButton[@content-desc=\"End call\"]"));
	    End.click();*/
	   // HttpClient.Factory httpClientFactory = HttpClient.Factory.createDefault();
	 }
	}