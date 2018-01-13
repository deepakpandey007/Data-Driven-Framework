package SPRINT2_Categories;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.Excel_Read;

public class Categories_DataDrivenTest {

	
	Properties prop;
	
	public Object[][] category_getData() throws Exception
	{
		 FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\Lib\\ObjectRepository.properties");
			
			prop=new Properties();
			prop.load(file);
		
		String path=prop.getProperty("sheet_path_sprint2");
		System.out.println(path);
		Excel_Read Data=new Excel_Read(path);
		
		int colnum=Data.getColumnCount(prop.getProperty("sheetname_categories"));
		System.out.println("colnum="+colnum);
		int rownum=Data.getRowCount(prop.getProperty("sheetname_categories"));
		
		System.out.println("rownum="+rownum);
		
		Object SampleData[][]=new Object[rownum-1][colnum];
		for(int i=2;i<=rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				SampleData[i-2][j]=Data.getDataCell(prop.getProperty("sheetname_categories"), j, i);
			}
		}
		System.out.println(SampleData);
		return SampleData;
	}
	@DataProvider(name="categorydata")
	public Object[][] categorydata_Filter() throws Exception
	{
		Object[][] data=category_getData();
		
		
		return data;
	}
	
	@Test(dataProvider="categorydata")
	
	public void category_Valid_Test(String testid,String desc,String email,String pwd,String category,String spell,String screen,
			String runmode,String status,String comment) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
		Categories valuedata=new Categories();
		valuedata.categories_filter(email,pwd,category,spell,screen);
		
		}
		else
			System.out.println("Skip the Test");
	}
	
	
}


