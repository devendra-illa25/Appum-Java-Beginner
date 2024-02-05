
import java.net.URL;
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy;
//import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
 
public class Ca {
 
	public static void main(String[] args) throws Exception {
		openCalculator();
 
	}
 
	public static void openCalculator() throws Exception {
		// DesiredCapabilities Dcap = new DesiredCapabilities();
		UiAutomator2Options Dcap = new UiAutomator2Options();
		Dcap.setCapability("deviceName", "udid");//Redmi Note 12 Pro 5G
		Dcap.setCapability("udid", "a6fuugukwcwseekv");//a6fuugukwcwseekv  //a6fuugukwcwseekv
		Dcap.setCapability("platformName", "android");
		Dcap.setCapability("platformVersion", "13 "); //TP1A.220624.014
		Dcap.setCapability("appPackage", "com.miui.calculator");//com.miui.calculator
		Dcap.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");//com.miui.calculator.cal.CalculatorActivity
 
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, Dcap);
 
		System.out.println("Application started.................");
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement one = driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));//com.miui.calculator:id/btn_5_s
		one.click();
		WebElement Pluse = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));//com.miui.calculator:id/btn_plus_s
		Pluse.click();
		WebElement two = driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));//com.miui.calculator:id/btn_5_s
		two.click();
		/*
		 * WebElement EQL =
		 * driver.findElement(By.id("com.oneplus.calculator:id/img_eq"));//com.miui.
		 * calculator:id/btn_equal_s EQL.click(); WebElement Result =
		 * driver.findElement(By.id("com.oneplus.calculator:id/result"));//com.miui.
		 * calculator:id/result Result.click();
		 */
 
		//System.out.println("Addtion result: " + Result);
 
	}
}