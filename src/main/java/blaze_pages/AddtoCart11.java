package blaze_pages;


/*public class AddtoCart11 {
    WebDriver driver;
    WebDriverWait wait;

    public AddtoCart11(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(4));  // Initialize the WebDriverWait with a timeout of 10 seconds
        PageFactory.initElements(driver, this);
    }

    
locators for phones
  phonelink=//div[@class='list-group']/a[@id='itemc'][1]
  
  // Locators for laptop
    By laplink = By.xpath("//a[@onclick=\"byCat('notebook')\"]");
    By lapname = By.xpath("//a[text()='MacBook Pro']");
    By addtocartbutton = By.xpath("//a[text()='Add to cart']");
    
    // Locators for monitor
    By monlink = By.xpath("//a[@onclick=\"byCat('monitor')\"]");
    By monname = By.xpath("//a[text()='Apple monitor 24']");
    By addtocartbutton1 = By.xpath("//a[@onclick=\"addToCart(10)\"]");
    
    // Locators for cart
    By cartlink = By.xpath("//a[@onclick=\"showcart()\"]");
    By cartItem = By.xpath("//td[contains(text(), 'MacBook Pro')]");
    By cartItem1 = By.xpath("//td[contains(text(), 'Apple monitor 24')]");
    
    
    @FindBy(xpath = "//div[@class='list-group']/a[@id='itemc'][1]")
    WebElement phnlink;
    
    @FindBy(xpath = "//div[@id='tbodyid']")
    List<WebElement> phoneitems;
    
   @FindBy(xpath = "//a[text()='Add to cart']")
   WebElement cartphoneaddto;
   
   
   @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[4]/a")
   WebElement cartlink;
   
   @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[2]")
   WebElement cart1;
   
   @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[1]/a")
   WebElement homelink;
   
   
   
   public void addPhone() 
   {
	   // Click on the phone link
	
       wait.until(ExpectedConditions.elementToBeClickable(phnlink)).click();
     

       // Loop through items and select the one with "MacBook Pro"
       for (WebElement e : phoneitems) {
           String name = e.getText();
           if (name.contains("Nokia lumia 1520")) {
               // Scroll the element into view if needed
        	
              e.click();
               break; // Assuming only one item needs to be clicked
               
           }
       }
   }
    
       
       public void alertphone()
       {
     
           wait.until(ExpectedConditions.alertIsPresent());
           Alert alert = driver.switchTo().alert();
           String alertText = alert.getText();
           alert.accept();
           
           assertEquals(alertText, "Product added.", "Alert text did not match!");
           }
       
   

public void checkcartPhone() {
    // wait.until(ExpectedConditions.elementToBeClickable(cartlink)).click();
    	cartlink.click();
    	  assertTrue(cart1.isDisplayed(), "MacBook Pro is not in the cart");
    	  homelink.click();
    }
}
    */
    
   
/*public class AddtoCart11 {
    WebDriver driver;
    WebDriverWait wait;

    public AddtoCart11(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));  // Increased timeout to 10 seconds
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='list-group']/a[@id='itemc'][1]")
    WebElement phnlink;
    
    @FindBy(xpath = "//div[@id='tbodyid']")
    List<WebElement> phoneitems;
    
    @FindBy(xpath = "//a[text()='Add to cart']")
    WebElement cartphoneaddto;
    
    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[4]/a")
    WebElement cartlink;
    
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[2]")
    WebElement cart1;
    
    @FindBy(xpath = "//div[@class='list-group']/a[@id='itemc'][2]")
    WebElement laplink;
    
    @FindBy(xpath = "//div[@id='tbodyid']")
    List<WebElement> lapitems;
    
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    WebElement addtocartlap;
    
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr[2]/td[2]")
    WebElement cart2;
    
    @FindBy(xpath ="//div[@class='list-group']/a[@id='itemc'][3]")
    WebElement monitorlink;
    
    @FindBy(xpath = "//*[@id=\"contcont\"]/div/div[2]")
    List<WebElement> monitoritems;
    
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    WebElement addtocartmon;
    
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr[2]/td[2]")
    WebElement cart3;
    
    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[1]/a")
    WebElement homelink;
    
    
    
   
    public void addPhone() throws TimeoutException {
        // Click on the phone link
       // wait.until(ExpectedConditions.elementToBeClickable(phnlink)).click();
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

       // wait.until(ExpectedConditions.elementToBeClickable(addtocartlap)).click();
        addtocartlap.click();
    }
    
    public void alertphone() throws TimeoutException {
        // Wait for the alert to appear
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		
		assertEquals(alertText, "Product added", "Alert text did not match!");
    }
    
   
    
    public void checkcartPhone() {
    // wait.until(ExpectedConditions.elementToBeClickable(cartlink)).click();
    	cartlink.click();
    	  assertTrue(cart1.isDisplayed(), "MacBook Pro is not in the cart");
    	  homelink.click();
    }
}
    
    
 /*   
    
    public void addLappy() throws TimeoutException {
        // Click on the phone link
        wait.until(ExpectedConditions.elementToBeClickable(phnlink)).click();

        // Loop through items and select the one with "Nokia lumia 1520"
        for (WebElement e : lapitems) {
            String name = e.getText();
            if (name.contains("Sony vaio i5")) {
                // Click the item
                e.click();
                break;
            }
        }

        wait.until(ExpectedConditions.elementToBeClickable(cartphoneaddto)).click();
    }
    
    public void alertlap() throws TimeoutException {
        // Wait for the alert to appear
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		
		assertEquals(alertText, "Product added", "Alert text did not match!");
    }
    
   
    
    public void checkcartlap() {
    	 wait.until(ExpectedConditions.elementToBeClickable(cartlink)).click();
    	  assertTrue(cart2.isDisplayed(), "MacBook Pro is not in the cart");
    	  homelink.click();
    }
    
    
    public void addMon() throws TimeoutException {
        // Click on the phone link
        wait.until(ExpectedConditions.elementToBeClickable(monitorlink)).click();

        // Loop through items and select the one with "Nokia lumia 1520"
        for (WebElement e : monitoritems) {
            String name = e.getText();
            if (name.contains("Sony vaio i5")) {
                // Click the item
                e.click();
                break;
            }
        }

        wait.until(ExpectedConditions.elementToBeClickable(addtocartmon)).click();
    }
    
    public void alertmon() throws TimeoutException {
        // Wait for the alert to appear
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		alert.accept();
		
		assertEquals(alertText, "Product added", "Alert text did not match!");
    }
    
   
    
    public void checkcartmon() {
     wait.until(ExpectedConditions.elementToBeClickable(cartlink)).click();
    	  assertTrue(cart3.isDisplayed(), "MacBook Pro is not in the cart");
          homelink.click();
    	  */
    	  
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AddtoCart11 {
    WebDriver driver;
    WebDriverWait wait;

    public AddtoCart11(WebDriver driver) {
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

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr/td[2]")
    WebElement cart1;

    @FindBy(xpath = "//div[@class='list-group']/a[@id='itemc'][2]")
    WebElement laplink;

    @FindBy(xpath = "//div[@id='tbodyid']")
    List<WebElement> lapitems;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    WebElement addtocartlap;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr[2]/td[2]")
    WebElement cart2;

    @FindBy(xpath ="//div[@class='list-group']/a[@id='itemc'][3]")
    WebElement monitorlink;

    @FindBy(xpath = "//*[@id=\"contcont\"]/div/div[2]")
    List<WebElement> monitoritems;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[2]/div/a")
    WebElement addtocartmon;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/tr[2]/td[2]")
    WebElement cart3;

    @FindBy(xpath = "//*[@id=\"navbarExample\"]/ul/li[1]/a")
    WebElement homelink;

    public void addPhone() {
        // Click on the phone link
        wait.until(ExpectedConditions.elementToBeClickable(phnlink)).click();

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
        wait.until(ExpectedConditions.elementToBeClickable(cartphoneaddto)).click();
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
        wait.until(ExpectedConditions.elementToBeClickable(cartlink)).click();

        // Validate that the item is present in the cart
        assertTrue(cart1.isDisplayed(), "Product is not in the cart");

        // Return to home
        homelink.click();
    }
}


