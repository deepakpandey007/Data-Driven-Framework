package SPRINT1_Registration;



import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Lib.Resources;

public class SignupPreference_DataDrivenTest extends Resources {

	Properties prop;

	public Object[][] preference_signup() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_preference", "sheetname_regispref");
		return  data;
	}

	@DataProvider(name="preferencedata")
	public Object[][] preferencedata_Valid() throws Exception
	{
		Object[][] data=preference_signup();
		return data;
	}

	@Test(dataProvider="preferencedata",priority=1,enabled=false,groups="Smoke",description="Sign Up With Preference for Valid Inputs")
	public void preference_signupvalid(String testid,String browser,String desc,String name,String lim1,String email,String pwd,String lim3,String rpwd,String expl,String lim2,String prof,String phno,
			                                   String loc,String intr,String scr1,String scr2,String runmode,String status,String comment) throws Exception
	{
		if(runmode.equals("Yes"))
		{
			Signup_Preference valuedata=new Signup_Preference();
			valuedata.valid_Signup_Preference(browser,name,email,pwd,rpwd,expl,prof,phno,loc,intr,scr1,scr2);
		}

		else
			System.out.println("Skip the Test");
	}

// Test 2
	public Object[][] preference_location() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_preference", "sheetname_regisloc");
		return  data;
	}

	@DataProvider(name="preferenceloc")
	public Object[][] preferencedata_location() throws Exception
	{
		Object[][] data=preference_location();
		return data;
	}

	@Test(dataProvider="preferenceloc",priority=2,enabled=false,groups="Functional",description="Sign Up With Preference for Multiple Location Inputs")
	public void Pref_Location(String testid,String browser,String desc,String name,String email,String pwd,String rpwd,String expl,
			                         String loc1,String loc2,String loc3,String loc4,String loc5,String loc6,String loc7,String loc8,String loc9,
			                                String loc10,String loc11,String loc12,String loc13,String loc14,String loc15,
			                                       String loc16,String loc17,String runmode,String status,String comment) throws Exception
	{
		if(runmode.equals("Yes"))
		{
			Signup_Preference valuedata=new Signup_Preference();
			valuedata.preference_location(browser,name,email,pwd,rpwd,expl,loc1,loc2,loc3,loc4,loc5,loc6,loc7,loc8,loc9,loc10,loc11,loc12,loc13,
					loc14,loc15,loc16,loc17);
		}

		else
			System.out.println("Skip the Test");
	}

// Test 3
	
	public Object[][] preference_interest() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_preference", "sheetname_regisintr");
		return  data;
	}

	@DataProvider(name="preferenceintr")
	public Object[][] preferencedata_interest() throws Exception
	{
		Object[][] data=preference_interest();
		return data;
	}

	@Test(dataProvider="preferenceintr",priority=3,enabled=false,groups="Functional",description="Sign Up With Preference for Multiple Interests Inputs")
	public void Pref_Interest(String testid,String browser,String desc,String name,String email,String pwd,String rpwd,String expl,
			String tag1,String tag2,String tag3,String tag4,String tag5,String tag6,
			String tag7,String tag8,String tag9,String tag10,String tag11,String tag12,String tag13,String tag14,String tag15,String tag16,String tag17,String tag18,String tag19,String tag20,String tag21,
			String tag22,String tag23,String tag24,String tag25,String tag26,String tag27,String tag28,String tag29,String tag30,String tag31,String tag32,String tag33,String runmode,String status,String comment) throws Exception
	{
		if(runmode.equals("Yes"))
		{
			Signup_Preference valuedata=new Signup_Preference();
			valuedata.preference_location(browser,name,email,pwd,rpwd,expl,tag1,tag2,tag3,tag4,tag5,tag6,tag7,tag8,tag9,tag10,tag11,tag12,tag13,
					tag14,tag15,tag16,tag17,tag18,tag19,tag20,tag21,tag22,tag23,tag24,tag25,tag26,tag27,tag28,tag29,tag30,tag31,tag32,tag33);
		}

		else
			System.out.println("Skip the Test");
	}

// Test 4
	
	public Object[][] preference_locrepeat() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_preference", "sheetname_locrepeat");
		return  data;
	}

	@DataProvider(name="locationrepeat")
	public Object[][] preferencedata_locrepeat() throws Exception
	{
		Object[][] data=preference_locrepeat();
		return data;
	}
	
	@Test(dataProvider="locationrepeat",priority=4,enabled=false,groups="Functional",description="Sign Up With Preference for Repeat Locations Inputs")
	public void Location_Repeat(String testid,String browser,String desc,String name,String email,String pwd,String rpwd,String explore,String loc1,String loc2,String loc3,String loc4,String text1,String text2,
			String text3,String runmode,String status,String comment) throws Exception
	{

		if(runmode.equals("Yes"))
		{
			Signup_Preference valuedata=new Signup_Preference();
			valuedata.preferencelocation_repeat(browser,name,email,pwd,rpwd,explore,loc1,loc2,loc3,loc4,text1,text2,text3);
		}

		else
			System.out.println("Skip the Test");
	}
	
	// Test 5
		
	public Object[][] preference_intrsrepeat() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_preference", "sheetname_intrsrepeat");
		return  data;
	}

	@DataProvider(name="interestrepeat")
	public Object[][] preferencedata_intrsrepeat() throws Exception
	{
		Object[][] data=preference_intrsrepeat();
		return data;
	}
	
	@Test(dataProvider="interestrepeat",priority=5,enabled=false,groups="Functional",description="Sign Up With Preference for Repeat Interest Inputs")
	public void Interest_Repeat(String testid,String browser,String desc,String steps,String name,String email,String pwd,String rpwd,String explore,String tag1,String tag2,String tag3,String tag4,String runmode,String status,String comment) throws Exception
	{

		if(runmode.equals("Yes"))
		{
			Signup_Preference valuedata=new Signup_Preference();
			valuedata.preferenceinterest_repeat(browser,steps,name,email,pwd,rpwd,explore,tag1,tag2,tag3,tag4);
		}

		else
			System.out.println("Skip the Test");
	}
	
	// Test 6
	public Object[][] preference_limit() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_preference", "sheetname_preflimit");
		return  data;
	}

	@DataProvider(name="preferencelimit")
	public Object[][] preferencedata_limitcheck() throws Exception
	{
		Object[][] data=preference_limit();
		return data;
	}
	
	@Test(dataProvider="preferencelimit",priority=6,enabled=true,groups="Functional",description="Check for Preference Limits Inputs")
	public void Preference_Limit(String testid,String browser,String desc,String steps,String name,String email,String pwd,String rpwd,String explore,String prof,String lim1,String phn,String lim2,
			                    String loc,String intr,String screen,String exp,String act,String runmode,String status,String comment) throws Exception
	{

		if(runmode.equals("Yes"))
		{
			Signup_Preference valuedata=new Signup_Preference();
			valuedata.preference_limit(browser,steps,name,email,pwd,rpwd,explore,prof,phn,loc,intr,screen);
		}

		else
			System.out.println("Skip the Test");
	}
		
	
	
}
