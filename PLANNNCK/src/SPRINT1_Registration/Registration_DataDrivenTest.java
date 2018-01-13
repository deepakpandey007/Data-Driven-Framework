package SPRINT1_Registration;

import org.testng.annotations.Test;

import java.util.Properties;

import org.testng.annotations.DataProvider;

import Lib.Resources;

public class Registration_DataDrivenTest extends Resources {

	Properties prop;

	public Object[][] registration_getData() throws Exception
	{

		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_registration", "sheetname_regisvalid");
		return  data;
	}
	@DataProvider(name="registrationdata")
	public Object[][] registrationdata_Valid() throws Exception
	{
		Object[][] data=registration_getData();
		return data;
	}

	@Test(dataProvider="registrationdata",priority=1,enabled=false,description="Check fo Valid Inputs",groups="Smoke")
	public void signup_valid_test(String testid,String browser,String desc,String uname,String emailid,String pass,String rpass,String explore,String runmode,String status) throws Exception
	{

		if(runmode.equals("Yes"))
		{
			Registration valuedata=new Registration();
			valuedata.valid_Registration(browser,uname, emailid, pass, rpass, explore);
		}

		else
			System.out.println("Skip the Test");



	}
	// Test 2
	public Object[][] registration_blankfield() throws Exception
	{

		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_registration", "sheetname_regisblank");
		return  data;
	}
	@DataProvider(name="registrationblank")
	public Object[][] registrationdata_blank() throws Exception
	{
		Object[][] data=registration_blankfield();
		return data;
	}

	@Test(dataProvider="registrationblank",priority=2,enabled=false,groups="Functional",description="Check with Blank Inputs")
	public void reg_blank(String testid,String browser,String desc,String uname,String emailid,String pass,String rpass,String explore,String screen,String runmode,String status,String comment) throws Exception
	{

		if(runmode.equals("Yes"))
		{
			Registration valuedata=new Registration();
			valuedata.field_RegistrationBlank(browser,uname, emailid, pass, rpass, explore,screen);
		}

		else
			System.out.println("Skip the Test");
	}
	// Test 3
		public Object[][] registration_limit() throws Exception
		{

			prop= file_execute();
			Object[][] data=sheet_data("sheetpath_registration", "sheetname_regislimit");
			return  data;
		}
		@DataProvider(name="registrationlimit")
		public Object[][] registrationdata_limit() throws Exception
		{
			Object[][] data=registration_limit();
			return data;
		}

		@Test(dataProvider="registrationlimit",priority=3,enabled=false,groups="Functional",description="Check for Fields Limit")
		public void Reg_Limit(String testid,String browser,String desc,String steps,String uname,String emailid,String pass,String rpass,String explore,String screen,String runmode,
				                     String eres,String ares,String status,String comment) throws Exception
		{

			if(runmode.equals("Yes"))
			{
				Registration valuedata=new Registration();
				valuedata.registration_limit(browser,steps,uname, emailid, pass, rpass, explore,screen);
			}

			else
				System.out.println("Skip the Test");
		}

		// Test 4
				public Object[][] registration_invalidemail() throws Exception
				{

					prop= file_execute();
					Object[][] data=sheet_data("sheetpath_registration", "sheetname_regisinvalid");
					return  data;
				}
				@DataProvider(name="registrationinvalidemail")
				public Object[][] registrationdata_invalidemail() throws Exception
				{
					Object[][] data=registration_invalidemail();
					return data;
				}

				@Test(dataProvider="registrationinvalidemail",priority=4,enabled=false,groups="Functional",description="Check for Validation with Invalid Emails")
				public void registration_invalid(String testid,String browser,String desc,String uname,String emailid,String pass,String rpass,String explore,String screen,String runmode,
						                     String status,String comment) throws Exception
				{

					if(runmode.equals("Yes"))
					{
						Registration valuedata=new Registration();
						valuedata.registration_invalidemail(browser,uname, emailid, pass, rpass, explore,screen);
					}

					else
						System.out.println("Skip the Test");
				}
				
				// Test 5
				public Object[][] registration_spellcheck() throws Exception
				{

					prop= file_execute();
					Object[][] data=sheet_data("sheetpath_registration", "sheetname_regisspell");
					return  data;
				}
				@DataProvider(name="registrationspellcheck")
				public Object[][] registrationdata_spellcheck() throws Exception
				{
					Object[][] data=registration_spellcheck();
					return data;
				}

				@Test(dataProvider="registrationspellcheck",priority=5,enabled=false,groups="User Interface",description="Check for Spelling of Fields")
				public void Registrartion_SpellCheck(String testid,String browser,String desc,String step,String text,String runmode,
						                     String status,String comment) throws Exception
				{

					if(runmode.equals("Yes"))
					{
						Registration valuedata=new Registration();
						valuedata.registration_spellcheck(browser,step,text);
					}

					else
						System.out.println("Skip the Test");
				}
				// Test 6
				public Object[][] registration_colorcheck() throws Exception
				{

					prop= file_execute();
					Object[][] data=sheet_data("sheetpath_registration", "sheetname_regiscolor");
					return  data;
				}
				@DataProvider(name="registrationcolorcheck")
				public Object[][] registrationdata_colorcheck() throws Exception
				{
					Object[][] data=registration_colorcheck();
					return data;
				}

				@Test(dataProvider="registrationcolorcheck",priority=6,enabled=false,groups="User Interface",description="Check for Colors of Fields")
				public void Registrartion_ColorCheck(String testid,String browser,String desc,String step,String text,String colhgb,String ahgb,String ecol,String runmode,
						                     String status,String comment) throws Exception
				{

					if(runmode.equals("Yes"))
					{
						Registration valuedata=new Registration();
						valuedata.registration_colorcheck(browser,step,ecol);
					}

					else
						System.out.println("Skip the Test");
				}

				// Test 7
				public Object[][] registration_fontcheck() throws Exception
				{

					prop= file_execute();
					Object[][] data=sheet_data("sheetpath_registration", "sheetname_regisfont");
					return  data;
				}
				@DataProvider(name="registrationfontcheck")
				public Object[][] registrationdata_fontcheck() throws Exception
				{
					Object[][] data=registration_fontcheck();
					return data;
				}

				@Test(dataProvider="registrationfontcheck",priority=7,enabled=true,groups="User Interface",description="Check for Font of Fields")
				public void Registrartion_FontCheck(String testid,String browser,String desc,String step,String text,String font,String fontw,String fonts,String fontp,String fontl,String fontc,String runmode,
						                     String status,String comment) throws Exception
				{
					if(runmode.equals("Yes"))
					{
						Registration valuedata=new Registration();
						valuedata.registration_fontcheck(browser,step,font,fontw,fonts,fontp,fontl,fontc);
					}

					else
						System.out.println("Skip the Test");
				}


}
