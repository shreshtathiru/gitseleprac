package blaze_testcases;

import java.util.List;

import org.testng.annotations.Test;

import Utils.CSVUtils;

public class LoginTestCase extends BlazeBaseSet {
	
	//@Test(dataProvider = "loginData")
	
	//public void verifylogin(String username,String password)
	//{
	
		/*String filePath = "CSVFolder\\data.csv"; // Replace with your actual file path
        List<String[]> csvData = CSVUtils.readCSV(filePath);
        
        // Skip the header row and iterate over the data
        for (int i = 1; i < csvData.size(); i++) {
            String[] data = csvData.get(i);
            String username = data[0];
            String password = data[1];*/
            
            // Call login method with data from CSV
            //lp.login(username, password);
	 @Test(dataProvider = "loginData")
	 public void verifylogin(String username, String password) {
	        // Call login method with data from CSV
	        lp.login(username, password);
	        
	        System.out.println("dkmfkremfer");
	        System.out.println("dkmfkremfer");
	        System.out.println("dkmfkremfer");
        }
    }
	

