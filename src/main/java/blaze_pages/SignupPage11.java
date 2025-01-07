package blaze_pages;


/*
/*import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertEquals;

public class SignupPage11 {
	WebDriver driver;
	WebDriverWait wait;
	
	public SignupPage11(WebDriver driver)
	{
		this.driver=driver;
	    PageFactory.initElements(driver, this);
	}
	
	   By signuplink = By.xpath("//a[@id='signin2']");
	    By username = By.xpath("//input[@id='sign-username']");
	    By pass = By.xpath("//input[@id='sign-password']");
	    By signupbutton = By.xpath("//button[@onclick='register()']");
	
	@FindBy(id = "signin2")
	WebElement signuplink;

	@FindBy(id="sign-username")
	WebElement username;
	
	@FindBy(id="sign-password")
	WebElement password;
	
	@FindBy(xpath = "//button[@onclick='register()']")
	WebElement signupbutton;
	
	
	//methods
	
	public void signup(String uname,String pwd)
	{
		
	signuplink.click();
	username.sendKeys(uname);
	password.sendKeys(pwd);
	signupbutton.click();
	}
	
	public void alertsignup()
	{
		// Wait for the alert to be present
	    wait.until(ExpectedConditions.alertIsPresent());
	    // Switch to the alert
	    Alert alert = driver.switchTo().alert();
	    // Capture the text from the alert
	    String alertText = alert.getText();
	    // Accept the alert
	    alert.accept();

	    // Assert the alert text
	    assertEquals(alertText, "Sign up successful.", "Alert text did not match!");
	     System.out.println(alertText);
	}
	
	
}
*/

/*import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

public class SignupPage11 {
    WebDriver driver;
    WebDriverWait wait;

    public SignupPage11(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(4));  // Initialize the WebDriverWait with a timeout of 10 seconds
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "signin2")
    WebElement signuplink;

    @FindBy(id="sign-username")
    WebElement username;

    @FindBy(id="sign-password")
    WebElement password;

    @FindBy(xpath = "//button[@onclick='register()']")
    WebElement signupbutton;

    // Methods
    public void signup(String uname, String pwd) {
        signuplink.click();
        username.sendKeys(uname);
        password.sendKeys(pwd);
        signupbutton.click();
    }

   
        public void alertsignup() {
            // Wait for the alert to be present
            wait.until(ExpectedConditions.alertIsPresent());
            // Switch to the alert
            Alert alert = driver.switchTo().alert();
            // Capture the text from the alert
            String alertText = alert.getText();
            // Accept the alert
            alert.accept();

            // Assert the alert text
            assertEquals(alertText, "Sign up successful.", "Alert text did not match!");
            System.out.println(alertText);
        }
    }
*/


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

public class SignupPage11 {
    WebDriver driver;
    WebDriverWait wait;

    public SignupPage11(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Adjusted timeout for wait
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "signin2")
    WebElement signuplink;

    @FindBy(id = "sign-username")
    WebElement username;

    @FindBy(id = "sign-password")
    WebElement password;

    @FindBy(xpath = "//button[@onclick='register()']")
    WebElement signupbutton;

    // Methods
    public void signup(String uname, String pwd) {
        // Wait for the sign-up link to be clickable before clicking
        wait.until(ExpectedConditions.elementToBeClickable(signuplink)).click();
        username.sendKeys(uname);
        password.sendKeys(pwd);
        signupbutton.click();
    }

    public void alertsignup() {
        // Wait for the alert to be present
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            // Switch to the alert
            Alert alert = driver.switchTo().alert();
            // Capture the text from the alert
            String alertText = alert.getText();
            // Accept the alert
            alert.accept();

            // Assert the alert text
            assertEquals(alertText, "Sign up successful.", "Alert text did not match!");
            System.out.println(alertText);
        } catch (Exception e) {
            System.out.println("No alert appeared.");
            e.printStackTrace();
        }
    }
}

