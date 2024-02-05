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

public class WhatsappMessage1 {
    static AppiumDriver driver;

    public static void main(String[] args) throws Exception {
        openWhatsapp();
        All_Categories();
        Fashion();
        System.out.println("Successfully Selected product");
    }

    public static void openWhatsapp() throws Exception {
        // Desired capabilities to connect to a real device
    	UiAutomator2Options option = new UiAutomator2Options();
        option.setCapability("deviceName", "udid");
        option.setCapability("udid", "884f487b");
        option.setCapability("platformName", "android");
        option.setCapability("platformVersion", "13 ");
        option.setCapability("appPackage", "com.whatsapp");
        option.setCapability("appActivity", "com.whatsapp.HomeActivity");

        // Other capabilities
        option.setCapability("fullReset", false);
        option.setCapability("noReset", true);

        // Connecting to the server
        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, option);

        System.out.println("Whatsapp Opened");

        // Data type, variables, and operator
        String contactName = "Jio Mart";
        String messageToSend = "Hi";

        WebElement searchIcon = driver.findElement(By.id("com.whatsapp:id/menuitem_search"));
        searchIcon.click();

        WebElement searchInput = driver.findElement(By.id("com.whatsapp:id/search_input"));
        searchInput.sendKeys(contactName);

        WebElement message = driver.findElement(By.xpath("(//android.widget.TextView[@resource-id='com.whatsapp:id/conversations_row_contact_name'])[5]"));
        message.click();

        Thread.sleep(3000);
        WebElement msgText = driver.findElement(By.id("com.whatsapp:id/entry"));
        msgText.sendKeys(messageToSend);

        WebElement send = driver.findElement(By.id("com.whatsapp:id/send"));
        send.click();

        Thread.sleep(3000);
        WebElement link = driver.findElement(By.xpath("//android.view.View[@content-desc='https://wa.me/c/917977079770']"));
        link.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.whatsapp:id/button_category_see_all"))).click();
    }

    public static void All_Categories() throws Exception {
        System.out.println("All Categories displayed");
        int i = 2;
        switch (i) {
            case 1:
                System.out.println("Click on Groceries");
                WebElement groceries = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.whatsapp:id/image_category_list_item'])[1]"));
                groceries.click();
                break;

            case 2:
                System.out.println("Click on Fashion");
                Thread.sleep(2000);
                WebElement fashion = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.whatsapp:id/image_category_list_item'])[2]"));
                fashion.click();
                break;

            case 3:
                System.out.println("Click on Beauty");
                WebElement beauty = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.whatsapp:id/image_category_list_item'])[3]"));
                beauty.click();
                break;

            default:
                System.out.println("No other categories in the list");
        }
    }

    public static void Fashion() throws Exception {
        System.out.println("Select Infants Dropdown");
        Thread.sleep(2000);
        WebElement list = driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().text(\"Tech\"));"));

        WebElement juniorBoy = driver.findElement(By.xpath("//android.widget.ExpandableListView[@resource-id='com.whatsapp:id/expandable_list_catalog_category']/android.widget.LinearLayout[4]"));
        juniorBoy.click();
        String dress = "western";

        if ("western".equals(dress)) {
            WebElement western = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.whatsapp:id/title_category_list_item' and @text='Western Wear']"));
            western.click();
            System.out.println("Select any looper from the list");
            Thread.sleep(2000);

            int looper = 3;
            switch (looper) {
                case 1:
                    WebElement black = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.whatsapp:id/catalog_list_product_image'])[1]"));
                    black.click();
                    break;
                case 2:
                    WebElement yellow = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.whatsapp:id/catalog_list_product_image'])[2]"));
                    yellow.click();
                    break;

                case 3:
                    WebElement green = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.whatsapp:id/catalog_list_product_image'])[5]"));
                    green.click();
                    Thread.sleep(3000);
                    WebElement add = driver.findElement(By.id("com.whatsapp:id/pdp_action_button"));
                    add.click();

                    Thread.sleep(2000);
                    for (int j = 1; j <= 2; j++) {
                        WebElement plus = driver.findElement(By.id("com.whatsapp:id/plus_button"));
                        plus.click();
                    }

                    WebElement viewCart = driver.findElement(By.id("com.whatsapp:id/pdp_action_button"));
                    viewCart.click();

                    Thread.sleep(3000);
                    WebElement placeOrder = driver.findElement(By.id("com.whatsapp:id/send_cart_cta_btn"));
                    placeOrder.click();

                    Thread.sleep(5000);
                    System.out.println("Check WhatsApp to continue shopping");
                    break;

                default:
                    WebElement tShirt = driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id='com.whatsapp:id/catalog_list_product_image'])[6]"));
                    tShirt.click();
                    break;
            }

        } else {
            WebElement footwear = driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.whatsapp:id/title_category_list_item' and @text='Western Wear']"));
            footwear.click();
        }
    }
}
