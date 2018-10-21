package XeroTestScripts;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class DriverScriptTest extends AutomationScript{
	
	public static void main(String[] args)  throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException 
	{
		
        String dt_Path = "C:\\Users\\suman\\eclipse-workspace\\MySeleniumTest\\Utility\\TestSuit.xls";
		
		String[][] recdata = ReusableMethod.readSheet(dt_Path, "Sheet1");
		
		String testCase =null;
		

		executionReport("Sprint1");
		
		String flag = null;
		
		for(int i = 1; i< recdata.length; i++) {
			
				flag = recdata[i][1];
				if(flag.equalsIgnoreCase("Y")) {
					testCase = recdata[i][2];

					System.out.println("testCase - " + testCase);
					/*Java Reflection */
					//try {
					Method testScript = AutomationScript.class.getMethod(testCase);
					testScript.invoke(testScript);						
					//} catch (Exception e) {
						// TODO: handle exception
						//System.out.println(e.getMessage());///
					//}
					
				}else {
					System.out.println("**********Row  number "+ i+" test case Name "+ recdata[i][2]+" is not Executed*********");
				}
				
	

		}
		
		extent.flush();

	}
}
	
	


