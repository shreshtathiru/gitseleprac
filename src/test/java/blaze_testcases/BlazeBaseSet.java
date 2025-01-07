package blaze_testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import Utils.CSVUtils;
import blaze_pages.AddtoCart11;
import blaze_pages.AdtoCart;
import blaze_pages.LoginPage11;
import blaze_pages.SignupPage11;


public class BlazeBaseSet {


	WebDriver driver;
	public LoginPage11 lp;
	public AddtoCart11 c;
	public SignupPage11 sp;
	public AdtoCart cp;
	
	@BeforeTest
	
	public void setup() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();
	       driver.get("https://www.demoblaze.com/index.html");
	       sp=new SignupPage11(driver);
	       lp=new LoginPage11(driver);
	       c=new AddtoCart11(driver);
	       cp=new AdtoCart(driver);
	     
	}
	
	@DataProvider(name = "loginData")
    public Object[][] loginData() {
        String filePath = "src\\main\\resources\\CSVFolder\\test.csv";
        List<String[]> csvData = CSVUtils.readCSV(filePath);

        // Create an Object array of the size of the CSV data minus the header row
        Object[][] data = new Object[csvData.size() - 1][2];

        // Skip the header row and iterate over the data
        for (int i = 1; i < csvData.size(); i++) {
            String[] row = csvData.get(i);
            String username = row[0];
            String password = row[1];

            // Populate the data array
            data[i - 1][0] = username;
            data[i - 1][1] = password;
        }

        return data;
    }


	
/*anither method for csv files
 

	@DataProvider(name = "logindata") // Change this to "logindata"
	public Object[][] loginData() {
	    String filePath = "src/main/resources/CSVFolder/test.csv";
	    List<String[]> csvData = CSVUtils.readCSV(filePath);

	    // Create an Object array of the size of the CSV data minus the header row
	    Object[][] data = new Object[csvData.size() - 1][2];

	    // Skip the header row and iterate over the data
	    for (int i = 1; i < csvData.size(); i++) {
	        String[] row = csvData.get(i);
	        String username = row[0];
	        String password = row[1];

	        // Populate the data array
	        data[i - 1][0] = username;
	        data[i - 1][1] = password;
	    }

	    return data;
	}

*/
	
	/*@DataProvider(name = "logindata")
    public Object[][] loginData() throws IOException {
        String filePath = "src/main/resources/ExcelFolder/testdata.xlsx";
        List<String[]> excelData = CSVUtils.readExcel(filePath);

        // Create an Object array of the size of the Excel data
        Object[][] data = new Object[excelData.size()][2];

        for (int i = 0; i < excelData.size(); i++) {
            String[] row = excelData.get(i);
            String username = row[0];
            String password = row[1];

            // Populate the data array
            data[i][0] = username;
            data[i][1] = password;
        }

        return data;
    }
*/
	@AfterTest
	
	public void exit() {
		driver.quit();
		}


}
