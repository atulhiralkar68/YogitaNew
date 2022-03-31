package test_Scripts;

import java.io.IOException;

import org.testng.annotations.Test;
//verify that user is able to sort 
import generic.Base_Class;

public class TestScript2 extends Base_Class //browser instance in a base class so we have extended 
{   
	@Test(dataProvider = "testdata")
	public void testScript1(String email, String pwd) 
	{
		
		
	}
}
