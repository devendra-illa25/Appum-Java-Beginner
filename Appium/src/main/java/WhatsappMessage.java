
// Importing necessary libraries for Selenium and Appium
// (imports for WebDriver, WebElement, WebDriverWait, etc.)

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class WhatsappMessage {
	static AppiumDriver driver;

	public static void main(String[] args) throws Exception {
		// Entry point of the program - main method
		openWhatsapp(); 
		All_Categories();
		Fashion();
		System.out.println("Successfully Selected product");
	}

	public static void openWhatsapp() throws Exception {
		// Setting desired capabilities for connecting to a real Android device using Appium
		UiAutomator2Options Option = new UiAutomator2Options();
		Option.setCapability("deviceName", "udid");
		Option.setCapability("udid", "884f487b");
		Option.setCapability("platformName", "android");
		Option.setCapability("platformVersion", "13 ");
		Option.setCapability("appPackage", "com.whatsapp");
		Option.setCapability("appActivity", "com.whatsapp.HomeActivity");
		
		/*noReset just clears the app data, such as its cache. 
		fullRest uninstalls the app. 
		*/
		
		Option.setCapability("fullReset", false);
		Option.setCapability("noReset", true);
		//Connecting to server
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, Option);
		// Opening WhatsApp, searching for a contact, sending a message, and clicking on a link
		System.out.println("Whats app Opened"); 
		
		
		//Used Data type, Variable 
		String contactName = "Jio Mart";
		String messageToSend = "Hi";

		WebElement Search_icon = driver.findElement(By.id("com.whatsapp:id/menuitem_search"));
		Search_icon.click();

		WebElement Search_input = driver.findElement(By.id("com.whatsapp:id/search_input"));
		Search_input.sendKeys(contactName);

		WebElement Message = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.whatsapp:id/conversations_row_contact_name\"])[5]"));
		Message.click();

		Thread.sleep(3000);
		WebElement Msg_Text = driver.findElement(By.id("com.whatsapp:id/entry"));
		Msg_Text.sendKeys(messageToSend);

		WebElement Send = driver.findElement(By.id("com.whatsapp:id/send"));
		Send.click();

		Thread.sleep(3000);
		WebElement link = driver.findElement(By.xpath("//android.view.View[@content-desc=\"https://wa.me/c/917977079770\"]"));
		link.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.whatsapp:id/button_category_see_all"))).click();

	}
		public static void All_Categories()throws Exception{
			System.out.println("All Categories displayed"); 
			//used switch case
		int i=2;
		switch (i)	{
		case 1:
			System.out.println("Click on Groceries");
			WebElement Groceries=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.whatsapp:id/image_category_list_item\"])[1]"));
			Groceries.click();
			break;
			
		case 2:
			System.out.println("Click on Fashion");
			Thread.sleep(2000);
			WebElement Fashion =driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.whatsapp:id/image_category_list_item\"])[2]"));
			Fashion.click();
			break;
			
		case 3:
			System.out.println("Click on Beauty");
			WebElement Beauty=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.whatsapp:id/image_category_list_item\"])[3]"));
			Beauty.click();
			break;	
			
		default:	
			System.out.println("No other categories in the list");
		}
		
	}

		public static void Fashion() throws Exception {
			System.out.println("Select Infants Dropdown");
			Thread.sleep(2000);
			
			//Vertical Scroll
			WebElement list = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+ ".scrollIntoView(new UiSelector().text(\"Tech\"));"));
			
			WebElement Junior_Boy=driver.findElement(By.xpath("//android.widget.ExpandableListView[@resource-id=\"com.whatsapp:id/expandable_list_catalog_category\"]/android.widget.LinearLayout[4]"));
			Junior_Boy.click();
			String dress="western";
			//used if
			if(dress=="western") {
				WebElement Western=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.whatsapp:id/title_category_list_item\" and @text=\"Western Wear\"]"));
				Western.click();
				System.out.println("Select any looper from the list");
				Thread.sleep(2000);
				//By using switch case
				int looper=3;
				switch(looper) {
				case 1:
					WebElement black=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.whatsapp:id/catalog_list_product_image\"])[1]"));
					black.click();
					break;
				case 2:
					WebElement yellow=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.whatsapp:id/catalog_list_product_image\"])[2]"));
					yellow.click();
					break;
					
				case 3:
					
					WebElement green=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.whatsapp:id/catalog_list_product_image\"])[5]"));
					green.click();
					//Add to card
					Thread.sleep(3000);
					WebElement Add=driver.findElement(By.id("com.whatsapp:id/pdp_action_button"));
					Add.click();
					
					Thread.sleep(2000);
					//add one more looper to cart
					//used for loop
					for(int j=1;j<=2;j++) {
					WebElement plus=driver.findElement(By.id("com.whatsapp:id/plus_button"));
					plus.click();
					}
					
					WebElement view_cart=driver.findElement(By.id("com.whatsapp:id/pdp_action_button"));
					view_cart.click();
					
					Thread.sleep(3000);
					WebElement placeorder=driver.findElement(By.id("com.whatsapp:id/send_cart_cta_btn"));
					placeorder.click();
					
					Thread.sleep(5000);
					System.out.println("Check to whatsapp to continue shopping");
					break;
				default:
					WebElement tshirt=driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.whatsapp:id/catalog_list_product_image\"])[6]"));
					tshirt.click();
					break;
					
					}
				
			}
				else {
					WebElement footwear=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.whatsapp:id/title_category_list_item\" and @text=\"Western Wear\"]"));
					footwear.click();
					
			}
			
	    }

	}
		
			
		
		
	
		


