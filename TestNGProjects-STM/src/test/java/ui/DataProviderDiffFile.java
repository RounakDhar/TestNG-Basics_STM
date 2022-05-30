package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;


//import org.testng.annotations.Test;

public class DataProviderDiffFile {
	
	@DataProvider(name ="create")
	public Object[][] dataSet1(Method m)
	{
		Object[][] testdata = null;
		
		if(m.getName().equals("test"))
		{
			testdata = new Object[][]
		
		   {
			
				{"username","password"},
				{"username1","password1"},
				{"username2","password2"},
				{"username3","password3"}
				
		   
			
			};
			
		}

else if(m.getName().equals("test1"))
			{
				testdata = new Object[][]
						
						   {
							
							{"username","password","third1"},
							{"username1","password1","third2"},
							{"username2","password2","third3"},
							{"username3","password3","third4"}
							
							};
			}
		
			
			else if(m.getName().equals("test2"))
			{
				testdata = new Object[][]
						
						   {
							
							{"username","password","third1","fourth1"},
							{"username1","password1","third2","fourth2"},
							{"username2","password2","third3","fourth3"},
							{"username3","password3","third4","fourth4"}
							
							};
			}
		
		return testdata;
				
	}
	


}
