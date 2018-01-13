package SPRINT1_Login;
import org.testng.annotations.Test;
import java.util.Properties;



import org.testng.annotations.DataProvider;
import Lib.Resources;


public class DataDrivenTest extends Resources  {

	Properties prop;
		
	// Test 1 
	public Object[][] login_getData() throws Exception
	{		
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_login", "sheetname_login");
		return  data;

	}
	
	@DataProvider(name="valid_blank")
	public Object[][] logindata_Valid() throws Exception
	{
		Object[][] data=login_getData();
		
		
		return data;
	}
	
	@Test(dataProvider="valid_blank" ,enabled=true,priority=1)
	
	public void Login_Valid(String testid,String browser,String Description, String user,String pwd,String remember,String screen_shot,String username, 
			String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
		Login valuedata=new Login();
		valuedata.valid_Login(browser,user, pwd,remember,screen_shot,username);
		
		}
		else
			System.out.println("Skip the Test");
	}
	
	// Test 2
	public Object[][] login_emailid() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_login", "sheetname_emailblank");
		return  data;

	}
	
	@DataProvider(name="emailblank")
	public Object[][] logindata_Valid1() throws Exception
	{
		Object[][] data=login_emailid();
		
		
		return data;
	}
	
	@Test(dataProvider="emailblank",enabled=false,priority=2)
	
	public void Login_EmailBlank(String testid,String browser,String desc,String email,String pwd,String remember,String screen_shot, String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			
		Login valuedata=new Login();
		valuedata.login_Email_Blank( browser,email,pwd,remember,screen_shot);
		
		}
		else
			System.out.println("Skip the Test");
	}
	
	// Test 3
	
	public Object[][] login_pwd() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_login", "sheetname_pwdblank");
		return  data;

	}
	
	@DataProvider(name="pwdblank")
	public Object[][] logindata_pwd() throws Exception
	{
		Object[][] data=login_pwd();
		
		
		return data;
	}
	
	@Test(dataProvider="pwdblank",enabled=false,priority=3)
	
	public void Login_Pwd_Blank(String testid,String browser,String desc,String email,String pwd,String remember,String screen_shot, String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			
		Login valuedata=new Login();
		valuedata.login_Pwd_Blank( browser,email,pwd,remember,screen_shot);
		
		}
		else
			System.out.println("Skip the Test");
	}
	
	// Test 4
	
	public Object[][] login_unregister() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_login", "sheetname_unregister");
		return  data;

	}
	
	@DataProvider(name="unregisterid")
	public Object[][] logindata_unregister() throws Exception
	{
		Object[][] data=login_unregister();
		
		
		return data;
	}
	
	@Test(dataProvider="unregisterid",enabled=false,priority=4)
	
	public void Login_UnRegister(String testid,String browser,String desc,String email,String pwd,String remember,String screen_shot, String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			
		Login valuedata=new Login();
		valuedata.login_Email_Unregister( browser,email,pwd,remember,screen_shot);
		
		}
		else
			System.out.println("Skip the Test");
	}
	
	// Test 5
	
	public Object[][] login_invalidemail() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_login", "sheetname_invalidid");
		return  data;

	}
	
	@DataProvider(name="invalidid")
	public Object[][] logindata_invalidemail() throws Exception
	{
		Object[][] data=login_invalidemail();
		
		
		return data;
	}
	
	@Test(dataProvider="invalidid",enabled=false,priority=5)
	
	public void Login_InvalidEmail(String testid,String browser,String desc,String email,String pwd,String remember,String screen_shot, String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			
		Login valuedata=new Login();
		valuedata.login_Email_Invalid( browser,email,pwd,remember,screen_shot);
		
		}
		else
			System.out.println("Skip the Test");
	} 

	// Test 6
	
	public Object[][] login_emailnumber() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_login", "sheetname_emailnumber");
		return  data;

	}
	
	@DataProvider(name="emailnumber")
	public Object[][] logindata_emailnumber() throws Exception
	{
		Object[][] data=login_emailnumber();
		
		
		return data;
	}
	
	@Test(dataProvider="emailnumber",enabled=false,priority=6)
	
	public void Login_Number(String testid,String browser,String desc,String email,String pwd,String remember,String screen_shot, String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			
		Login valuedata=new Login();
		valuedata.login_Email_Number( browser,email,pwd,remember,screen_shot);
		
		}
		else
			System.out.println("Skip the Test");
	} 
	
	
	// Test 7
		public Object[][] login_pwdlimit() throws Exception
		{
			prop= file_execute();
			Object[][] data=sheet_data("sheetpath_login", "sheetname_pwdlimit");
			return  data;

		}
		
		@DataProvider(name="pwdlimit")
		public Object[][] loginverify_pwdlimit() throws Exception
		{
			Object[][] data=login_pwdlimit();
			
			
			return data;
		}
		
		@Test(dataProvider="pwdlimit",enabled=false,priority=7)
		
		public void Login_PasswordLimit(String testid,String browser,String desc,String email,String pwd,String text, String runmode,String status,String comments) throws Exception
		{
				
			
			if(runmode.equals("Yes"))
			{
				
				
			Login valuedata=new Login();
			valuedata.login_Pwd_Limit(browser,email,pwd);
			
			}
			else
				System.out.println("Skip the Test");
		} 
	// Test 8
	
	public Object[][] login_spells() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_login", "sheetname_loginspell");
		return  data;

	}
	
	@DataProvider(name="loginspells")
	public Object[][] loginverify_spells() throws Exception
	{
		Object[][] data=login_spells();
		
		
		return data;
	}
	
	@Test(dataProvider="loginspells",enabled=false,priority=8)
	
	public void Login_SpellCheck(String testid,String browser,String desc,String step,String text, String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			
		Login valuedata=new Login();
		valuedata.login_Spell_Check( browser,step,text);
		
		}
		else
			System.out.println("Skip the Test");
	} 

	// Test 9
	public Object[][] login_color() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_login", "sheetname_logincolor");
		return  data;

	}
	
	@DataProvider(name="logincolor")
	public Object[][] loginverify_color() throws Exception
	{
		Object[][] data=login_color();
		
		
		return data;
	}
	
	@Test(dataProvider="logincolor",enabled=false,priority=9)
	
	public void Login_ColorCheck(String testid,String browser,String desc,String step,String text, String text1,String text2, String text3,String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			
		Login valuedata=new Login();
		valuedata.login_color_check( browser,step,text1);
		
		}
		else
			System.out.println("Skip the Test");
	} 

// Test 10
	public Object[][] login_fonts() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_login", "sheetname_loginfonts");
		return  data;

	}
	
	@DataProvider(name="loginfont")
	public Object[][] loginverify_fonts() throws Exception
	{
		Object[][] data=login_fonts();
		
		
		return data;
	}
	
	@Test(dataProvider="loginfont",enabled=false,priority=10)
	
	public void Login_FontCheck(String testid,String browser,String desc,String step,String text, String text1,String text2,String text3,String text4,String text5,String text6, String runmode,String status,String comments) throws Exception
	{
			
		
		if(runmode.equals("Yes"))
		{
			
			
		Login valuedata=new Login();
		valuedata.login_Font_Check( browser,step,text1,text2,text3,text4,text5,text6);
		
		}
		else
			System.out.println("Skip the Test");
	} 

	
}
