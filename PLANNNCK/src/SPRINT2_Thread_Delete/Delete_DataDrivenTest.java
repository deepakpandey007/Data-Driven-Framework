package SPRINT2_Thread_Delete;

import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.Resources;


public class Delete_DataDrivenTest extends Resources {


	Properties prop;
	public Object[][] delete_getData() throws Exception
	{		
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_thread_delete", "sheetname_threaddelete");
		return  data;

	}
	
	@DataProvider(name="thread_delete")
	public Object[][] threaddelete_Valid() throws Exception
	{
		Object[][] data=delete_getData();
		
		
		return data;
	}
	
	@Test(dataProvider="thread_delete" ,enabled=true)
	
	public void Thread_Delete(String testid,String browser,String Description, String user,String pwd,String appsel,String screen1,String runmode,String status,String comments) throws Exception
	{
			
	
		if(runmode.equals("Yes"))
		{
			
			Thread_Delete valuedata=new Thread_Delete();
		valuedata.thread_delete(browser,user, pwd,appsel,screen1);
		
		}
		else
			System.out.println("Skip the Test");
	}

}
