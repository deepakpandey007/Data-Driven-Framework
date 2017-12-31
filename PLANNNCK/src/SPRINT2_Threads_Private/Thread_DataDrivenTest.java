package SPRINT2_Threads_Private;

import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.Resources;


public class Thread_DataDrivenTest extends Resources{
	
	Properties prop;
	// Test 1 
	public Object[][] thread_getData() throws Exception
	{		
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_private_thread", "sheetname_threadprivate");
		return  data;

	}
	
	@DataProvider(name="thread_private")
	public Object[][] threadprivate_Valid() throws Exception
	{
		Object[][] data=thread_getData();
		
		
		return data;
	}
	
	@Test(dataProvider="thread_private" ,priority=1,enabled=false)
	
	public void Thread_Private(String testid,String browser,String Description, String user,String pwd,String category,String appsel,String apptitle,
			String tmsg,String screen_shot1,String user1,String pwd1,String ap2,
			String rpy,String screen1,String ap3,String screen3,String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			Threads_Start valuedata=new Threads_Start();
		valuedata.Valid_PrivateThread(browser,user, pwd,category,appsel,apptitle,tmsg,screen_shot1,user1,pwd1,ap2,rpy,screen1,ap3,screen3);
		
		}
		else
			System.out.println("Skip the Test");
	}
	
	// Test 2
	
	public Object[][] threadagain_getData() throws Exception
	{		
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_private_thread", "sheetname_threadagain");
		return  data;

	}
	
	@DataProvider(name="thread_already")
	public Object[][] threadalready_Valid() throws Exception
	{
		Object[][] data=threadagain_getData();
		
		
		return data;
	}
	
	@Test(dataProvider="thread_already" ,priority=2,enabled=true)
	
	public void thread_already(String testid,String browser,String Description, String user,String pwd,String appsel,String apptitle,
			String tmsg,String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))	
		{
			
			Threads_Start valuedata=new Threads_Start();
		valuedata.thread_alreadypresent(browser,user, pwd,appsel,apptitle,tmsg);
		
		}
		else
			System.out.println("Skip the Test");
	}
	
	}
