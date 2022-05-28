package testNG.features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaterizationEx {


   @Test
   @Parameters("Name")
   private void printName(String name) {

	   System.out.println("SACHIN "+name);
}



}
