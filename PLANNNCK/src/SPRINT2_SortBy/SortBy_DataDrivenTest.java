package SPRINT2_SortBy;

import java.util.Properties;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Lib.Resources;

public class SortBy_DataDrivenTest extends Resources {
	
	Properties prop;
	public Object[][] sortby_getData() throws Exception
	{		
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_sortby", "sheetname_sortby");
		return  data;

	}
	
	@DataProvider(name="sortby")
	public Object[][] sortby_Valid() throws Exception
	{
		Object[][] data=sortby_getData();
		
		
		return data;
	}
	
	@Test(dataProvider="sortby" ,enabled=false)
	
	public void Sort_By(String testid,String browser,String Description, String user,String pwd,String sort,String screen1,String runmode,String status,String comments) throws Exception
	{
			
	
		if(runmode.equals("Yes"))
		{
			
			SortBy valuedata=new SortBy();
		valuedata.sortby_dropdown(browser,user, pwd,sort,screen1);
		
		}
		else
			System.out.println("Skip the Test");
	}

// Test 2
	
	public Object[][] spells_getData() throws Exception
	{		
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_sortby", "sheetname_spell");
		return  data;

	}
	
	@DataProvider(name="sortbyspells")
	public Object[][] spells_Valid() throws Exception
	{
		Object[][] data=spells_getData();
		
		
		return data;
	}
	
	@Test(dataProvider="sortbyspells" ,enabled=false)
	
	public void SortBy_Spells(String testid,String browser,String Description, String user,String pwd,String step,String spells,String runmode,String status,String comments) throws Exception
	{
			
	
		if(runmode.equals("Yes"))
		{
			
			SortBy valuedata=new SortBy();
		valuedata.options_spells(browser,user, pwd,step,spells);
		
		}
		else
			System.out.println("Skip the Test");
	}

	// Test 3
	public Object[][] colors_getData() throws Exception
	{		
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_sortby", "sheetname_color");
		return  data;

	}
	
	@DataProvider(name="sortbycolor")
	public Object[][] colors_Valid() throws Exception
	{
		Object[][] data=colors_getData();
		
		
		return data;
	}
	
	@Test(dataProvider="sortbycolor" ,enabled=true)
	
	public void Sort_Colors(String testid,String browser,String Description, String user,String pwd,String step,String text,String color,String colhex,String runmode,String status,String comments) throws Exception
	{
			
	
		if(runmode.equals("Yes"))
		{
			
			SortBy valuedata=new SortBy();
		valuedata.sort_colors(browser,user, pwd,step,color);
		
		}
		else
			System.out.println("Skip the Test");
	}
}
