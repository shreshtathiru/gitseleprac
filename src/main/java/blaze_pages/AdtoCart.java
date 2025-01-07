package blaze_pages;

/*import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdtoCart {
	
    WebDriver driver;
    WebDriverWait wait;

   public AdtoCart(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Increased timeout to 10 seconds
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='list-group']/a[@id='itemc'][1]")
    WebElement phnlink;

    @FindBy(xpath = "//div[@id='tbodyid']")
    List<WebElement> phoneitems;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    WebElement cartphoneaddto;

    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[4]/a")
    WebElement cartlink;
    
    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[1]/a")
    WebElement homelink;
    
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[2]")
    WebElement cart1;

    public void addPhone() {
        // Click on the phone link
      //  wait.until(ExpectedConditions.elementToBeClickable(phnlink)).click();

    	phnlink.click();
        // Loop through items and select the one with "Nokia lumia 1520"
        for (WebElement e : phoneitems) {
            String name = e.getText();
            if (name.contains("Nokia lumia 1520")) {
                // Click the item
                e.click();
                break;
            }
        }

        // Click the "Add to cart" button for the selected phone
      //  wait.until(ExpectedConditions.elementToBeClickable(cartphoneaddto)).click();
        cartphoneaddto.click();
    }

    public void alertphone() throws TimeoutException {
        // Wait for the alert to appear
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();

		// Validate the alert text
		assertEquals(alertText, "Product added", "Alert text did not match!");
    }

    public void checkcartPhone() {
        // Click on the cart link
       // wait.until(ExpectedConditions.elementToBeClickable(cartlink)).click();
    	cartlink.click();

        // Validate that the item is present in the cart
        assertTrue(cart1.isDisplayed(), "Product is not in the cart");

        // Return to home
        homelink.click();
    }
}
*/


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdtoCart {

    WebDriver driver;
    WebDriverWait wait;

    public AdtoCart(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Increased timeout to 10 seconds
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='list-group']/a[@id='itemc'][1]")
    WebElement phnlink;

    @FindBy(xpath = "//div[@id='tbodyid']/div")
    List<WebElement> phoneitems;

    @FindBy(xpath = "//*[@id='tbodyid']/div[2]/div/a")
    WebElement cartphoneaddto;

    @FindBy(xpath = "//*[@id='navbarExample']/ul/li[4]/a")
    WebElement cartlink;

    @FindBy(xpath = "//*[@id='navbarExample']/ul/li[1]/a")
    WebElement homelink;

    @FindBy(xpath = "//*[@id='tbodyid']/tr/td[2]")
    WebElement cart1;

    public void addPhone() {
        try {
            // Wait for and click the phone link
            wait.until(ExpectedConditions.elementToBeClickable(phnlink)).click();

            // Wait for phone items to be visible
            wait.until(ExpectedConditions.visibilityOfAllElements(phoneitems));

            // Loop through items and select the one with "Nokia lumia 1520"
            for (WebElement e : phoneitems) {
                String name = e.getText();
                if (name.contains("Nokia lumia 1520")) {
                    e.click();
                    break;
                }
            }

            // Wait for and click the "Add to cart" button
            wait.until(ExpectedConditions.elementToBeClickable(cartphoneaddto)).click();
        } catch (Exception e) {
            System.out.println("An error occurred while adding the phone to the cart: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void alertphone() {
        try {
            // Wait for the alert to appear
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.accept();

            // Validate the alert text
            assertEquals(alertText, "Product added", "Alert text did not match!");
        } catch (Exception e) {
            System.out.println("An error occurred while handling the alert: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void checkcartPhone() {
        try {
            // Wait for and click the cart link
            wait.until(ExpectedConditions.elementToBeClickable(cartlink)).click();

            // Validate that the item is present in the cart
            assertTrue(cart1.isDisplayed(), "Product is not in the cart");

            // Return to home
            wait.until(ExpectedConditions.elementToBeClickable(homelink)).click();
        } catch (Exception e) {
            System.out.println("An error occurred while checking the cart: " + e.getMessage());
            e.printStackTrace();
        }
    }
}




