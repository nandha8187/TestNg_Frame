package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

    @Test(dataProvider = "test_Data")
	private void adactin_Runner (String username,int password){

    	
    	System.out.println("Username : "+username);
    	
    	System.out.println("Password : "+password);
		
	}

    @DataProvider
    private Object[][] test_Data() {
    	
    	return new Object[][] {
    		
    		{"starc",123},
            
    		{"Smith",2345},
    		
    		{"Watson",546}
    		    		
    	};
     }

    @Test(dataProvider = "test_Data")
   	private void aoutomation_Runner (String username,int password){

       	
       	System.out.println("Username in automation : "+username);
       	
       	System.out.println("Password in automatio  : "+password);
   		
    }

}
