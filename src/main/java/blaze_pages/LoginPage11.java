package blaze_pages;
/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage11 {


 
    WebDriver driver;

    // Constructor to initialize WebDriver and PageFactory
    public LoginPage11(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Define WebElements with @FindBy annotations
    @FindBy(id = "login2")
    WebElement loginLink;

    @FindBy(id = "loginusername")
    WebElement usernameField;

    @FindBy(id = "loginpassword")
    WebElement passwordField;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginButton;

    // Method to perform login action
    public void login(String username, String password) {
        loginLink.click();
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
}

*/


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage11 {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor to initialize WebDriver, WebDriverWait, and PageFactory
    public LoginPage11(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
        PageFactory.initElements(driver, this);
    }

    // Define WebElements with @FindBy annotations
    @FindBy(id = "login2")
    WebElement loginLink;

    @FindBy(id = "loginusername")
    WebElement usernameField;

    @FindBy(id = "loginpassword")
    WebElement passwordField;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginButton;

    // Method to perform login action
    public void login(String username, String password) {
        try {
            // Wait for the login link to be clickable and click it
            wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();
            
            // Wait for username field to be visible and enter username
            wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
            
            // Wait for password field to be visible and enter password
            wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
            
            // Wait for login button to be clickable and click it
            wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        } catch (Exception e) {
            System.out.println("An error occurred during login: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


