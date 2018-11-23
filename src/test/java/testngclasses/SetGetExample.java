package testngclasses;

import org.testng.annotations.Test;

import examples.TestData;

public class SetGetExample {
	
	@Test(priority=1)
	public void Login()
	{
		TestData data=new TestData();
		data.setUsername("Admin");
		
	}
	
	@Test(priority=2)
	public void Dashboard()
	{
		TestData data=new TestData();
		data.getUsername();
		System.out.println("** Inside Test Dashboard ** :" +data.getUsername());
	}

}
