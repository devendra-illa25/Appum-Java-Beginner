import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class New {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setCapability("appium:automationName", "uiautomator2");
		options.setCapability("appium:deviceName", "udid");
		options.setCapability("appium:udid","884f487b");		
		options.setCapability("appium:platformVersion", "13");
		options.setCapability("appium:appPackage", "com.oneplus.calculator");
		options.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
		
		AndroidDriver driver = new AndroidDriver(
			    // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
			    new URL("http://127.0.0.1:4723"), options
			);

	}

}
