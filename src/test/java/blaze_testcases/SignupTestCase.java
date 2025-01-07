package blaze_testcases;

import java.util.List;

import org.testng.annotations.Test;

import Utils.CSVUtils;


public class SignupTestCase extends BlazeBaseSet {

	//@Test(dataProvider = "loginData")
	
	/*public void signupverify(String username,String password)
	{
	  sp.signup("username","password");
		/*String filePath = "CSVFolder\\data.csv"; // Replace with your actual file path
        List<String[]> csvData = CSVUtils.readCSV(filePath);
        
        // Skip the header row and iterate over the data
        for (int i = 1; i < csvData.size(); i++) {
            String[] data = csvData.get(i);
            String username = data[0];
            String password = data[1];
            
            // Call signup and alert methods with data from CSV
            sp.signup(username, password);*/
           // sp.alertsignup();
	
  
	 @Test(dataProvider = "loginData")
	  public void signupverify(String username, String password) {
	        // Call signup method with data from CSV
	        sp.signup(username, password);
	        sp.alertsignup();
	
	}
}
	

