package SPRINT1_Appeal_Create;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.Excel_Read;


public class AppealCreate_DataDrivenTest {

	Properties prop;
	public Object[][] appealcreate_getData() throws Exception
	{
		FileInputStream file=new FileInputStream("D:\\Users\\Microsoft\\eclipse\\workspace01\\plannnck_project.zip_expanded\\PLANNNCK\\src\\Lib\\ObjectRepository.properties");

		prop=new Properties();
		prop.load(file);

		String path=prop.getProperty("sheet_path");
		System.out.println(path);
		Excel_Read Data=new Excel_Read(path);
		int colnum=Data.getColumnCount(prop.getProperty("sheetname_appealcreate"));
		System.out.println("colnum="+colnum);
		int rownum=Data.getRowCount(prop.getProperty("sheetname_appealcreate"));

		System.out.println("rownum="+rownum);

		Object SampleData[][]=new Object[rownum-1][colnum];
		for(int i=2;i<=rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				SampleData[i-2][j]=Data.getDataCell(prop.getProperty("sheetname_appealcreate"), j, i);
			}
		}
		System.out.println(SampleData);
		return SampleData;
	}

	@DataProvider(name="appealcreatedata")
	public Object[][] appealcreatedata_Valid() throws Exception
	{
		Object[][] data=appealcreate_getData();
		return data;
	}

	@Test(dataProvider="appealcreatedata")
	public void appealcreate_valid_test(String testid,String desc,String emailid,String pass,String title,String category,String loc,String tag1, String tag2,
			String apldesc, String urlfor,String urllink,String atchfor,String atchlink, String anonystatus,String runmode) throws Exception
	{

		if(runmode.equals("Yes"))
		{
			AppealCreate valuedata=new AppealCreate();
			valuedata.valid_AppealCreate(emailid,pass,title,category,loc,tag1,tag2,apldesc,urlfor,
					urllink,atchfor,atchlink,anonystatus);
		}

		else 
			System.out.println("Skip the Test");



	}


}
