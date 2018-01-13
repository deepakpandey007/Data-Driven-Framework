package SPRINT2_Thread_MovePublic;

import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.Resources;


public class MoveThread_DataDrivenTest extends Resources{
	
	Properties prop;
	public Object[][] movethread_getData() throws Exception
	{		
		prop= file_execute();
		Object[][] data=sheet_data("thread_publicmove", "sheetname_threadmovepublic");
		return  data;

	}
	
	@DataProvider(name="thread_move")
	public Object[][] threadmovepublic_Valid() throws Exception
	{
		Object[][] data=movethread_getData();
		
		
		return data;
	}
	
	@Test(dataProvider="thread_move" ,enabled=true)
	
	public void Thread_MovePublic(String testid,String browser,String Description, String user,String pwd,String appsel,String screen1,String username,String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			Thread_PublicMove valuedata=new Thread_PublicMove();
		valuedata.Valid_MoveThread(browser,user, pwd,appsel,screen1,username);
		
		}
		else
			System.out.println("Skip the Test");
	}
	
	//Test 2 No Public thread
	
	public Object[][] onlyprithread_getData() throws Exception
	{		
		prop= file_execute();
		Object[][] data=sheet_data("thread_publicmove", "sheetname_onlyprivate");
		return  data;

	}
	
	@DataProvider(name="thread_private")
	public Object[][] threadmoveprivate_Valid() throws Exception
	{
		Object[][] data=onlyprithread_getData();
		
		
		return data;
	}
	
	@Test(dataProvider="thread_private" ,enabled=false)
	
	public void PrivateThread_Only(String testid,String browser,String Description, String user,String pwd,String appsel,String screen1,String username,String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			Thread_PublicMove valuedata=new Thread_PublicMove();
		valuedata.Valid_MovePrivate(browser,user, pwd,appsel,screen1,username);
		
		}
		else
			System.out.println("Skip the Test");
	}

}
