package Sprint2_UpVote_Appeal;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.Excel_Read;


public class UpVote_DataDrivenTest {
	
	Properties prop;
	public Object[][]upvoteappeal_getData() throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Microsoft\\eclipse-workspace\\PLANNNCK\\src\\Lib\\ObjectRepository.properties");

		prop=new Properties();
		prop.load(file);

		String path=prop.getProperty("sheet_path");
		System.out.println(path);
		Excel_Read Data=new Excel_Read(path);
		int colnum=Data.getColumnCount(prop.getProperty("sheetname_upvote"));
		System.out.println("colnum="+colnum);
		int rownum=Data.getRowCount(prop.getProperty("sheetname_upvote"));

		System.out.println("rownum="+rownum);

		Object SampleData[][]=new Object[rownum-1][colnum];
		for(int i=2;i<=rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				SampleData[i-2][j]=Data.getDataCell(prop.getProperty("sheetname_upvote"), j, i);
			}
		}
		System.out.println(SampleData);
		return SampleData;
	}

	@DataProvider(name="upvoteappealdata")
	public Object[][] upvote_Appeal() throws Exception
	{
		Object[][] data=upvoteappeal_getData();
		return data;
	}

	@Test(dataProvider="upvoteappealdata")
	public void upvoteappeal_test(String testid,String desc,String emailid,String pass,String appealvote,
			String screen1,String runmode,String status,String comment) throws Exception
	{

		if(runmode.equals("Yes"))
		{
			Upvote valuedata=new Upvote();
			valuedata.Vote_appeal(emailid,pass,appealvote,screen1);
		}

		else 
			System.out.println("Skip the Test");



	}


}



