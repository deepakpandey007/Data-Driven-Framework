package Lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resources extends LogConfigBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public static WebDriver browser(String name)
	{
		if(name.equalsIgnoreCase("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );

			driver=new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}
		else if(name.equalsIgnoreCase("Firefox"))
		{
			
		}
		
		else if(name.equalsIgnoreCase("Explorer"))
		{
			
		}
		return driver;
	}
	
	public static Properties file_execute() throws IOException
	{
		 FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\Lib\\ObjectRepository.properties");
			
			prop=new Properties();
			prop.load(file);
			return prop;
	}
	
	public static Object[][] sheet_data(String path1,String sheetname) throws IOException
	{
	
	String path=prop.getProperty(path1);
	System.out.println(path);
	Excel_Read Data=new Excel_Read(path);
	
	int colnum=Data.getColumnCount(prop.getProperty(sheetname));
	System.out.println("colnum="+colnum);
	int rownum=Data.getRowCount(prop.getProperty(sheetname));
	
	System.out.println("rownum="+rownum);
	
	Object SampleData[][]=new Object[rownum-1][colnum];
	for(int i=2;i<=rownum;i++)
	{
		for(int j=0;j<colnum;j++)
		{
			SampleData[i-2][j]=Data.getDataCell(prop.getProperty(sheetname), j, i);
		}
	}
	System.out.println(SampleData);
	
	return SampleData;
	}
	
	public static void screen_shots(String loc) throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destFile=new File(loc+timestamp1()+".png");
		FileUtils.copyFile(srcFile, destFile);
	}
	
	public static String timestamp1() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
	public static String toTitleCase(String givenString) {
	    String[] arr = givenString.split(" ");
	    StringBuffer sb = new StringBuffer();

	    for (int i = 0; i < arr.length; i++) {
	    	
	    System.out.println(arr[i]);
	        sb.append(Character.toUpperCase(arr[i].charAt(0)))
	            .append(arr[i].substring(1)).append(" ");
	    }          
	    return sb.toString().trim();
	}  
	public static void main(String[] args) {
		
		String d="deepak Pandey";
		String z=Resources.toTitleCase(d);
		System.out.println("z="+z);
				
	}

}
