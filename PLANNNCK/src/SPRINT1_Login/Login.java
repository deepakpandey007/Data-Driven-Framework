package SPRINT1_Login;

import java.io.IOException;


import java.util.Properties;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;


import Lib.Resources;

public class Login extends Resources {
	WebDriver driver;
	Properties prop;
	String url;
		//Test 1
	
	public void valid_Login(String browser,String email,String password,String remember, String screen_shot,String username) throws Exception

	{	

		prop=file_execute();
      	driver=Resources.browser(browser);
      	 logger.info("Start the Browser");
      			
		driver.get(prop.getProperty("url_login"));

		//check for Blank Test 1
		if(email.isEmpty() && password.isEmpty() && username.equals("No Data"))
		{
			String expected="";
			if(remember.equalsIgnoreCase("Checked"))
			{

				WebElement check_box=driver.findElement(By.xpath(prop.getProperty("remember_me")));
				Boolean status=check_box.isSelected();
				System.out.println("Remember_me Checkek_box is Checked="+ status);
				if(status.equals(false))
				{
					logger.info("Check Box Checked");
					check_box.click();
					driver.findElement(By.xpath(prop.getProperty("login"))).click();

					Thread.sleep(2000);

					screen_shots(screen_shot);

					WebElement actual=driver.findElement(By.xpath(prop.getProperty("email_login")));
					Assert.assertEquals(actual, expected, "Fail");
					driver.close();

				}
			}
			else {

				driver.findElement(By.xpath(prop.getProperty("login"))).click();

				Thread.sleep(2000);
				screen_shots(screen_shot);
				Thread.sleep(2000);
				WebElement actual=driver.findElement(By.xpath(prop.getProperty("email_login")));
				Assert.assertEquals(actual, expected, "Fail");
				driver.close();
			}
		}



		else
		{
			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
			email_user.sendKeys(email);

			WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
			pwd_user.sendKeys(password);

			driver.findElement(By.xpath(prop.getProperty("pwd_show"))).click();

			if(remember.equalsIgnoreCase("Checked"))
			{

				WebElement check_box=driver.findElement(By.xpath(prop.getProperty("remember_me")));
				Boolean status=check_box.isSelected();
				System.err.println("Remember_me Checkek_box is Checked="+ status);
				if(status.equals(false))
				{
					check_box.click();

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("login"))).click();

					Thread.sleep(2000);

					WebElement navbar_click=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
					navbar_click.click();
					
					Thread.sleep(2000);

					screen_shots(screen_shot);

					Thread.sleep(2000);

					String actual_value=driver.findElement(By.xpath(prop.getProperty("user_name"))).getText();

					System.out.println("Username we get="+actual_value);

					Assert.assertEquals(actual_value, username.toUpperCase());

					Thread.sleep(2000);
					WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
					logoff.click();

					driver.close();

				}
				else		

				{
					System.out.println("Checkbox Already Checked in");				
				}

			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("login"))).click();

				Thread.sleep(2000);

				screen_shots(screen_shot);
				Thread.sleep(2000);


				WebElement navbar_click=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				navbar_click.click();
				
				Thread.sleep(2000);

				screen_shots(screen_shot);

				Thread.sleep(3000);

				String actual_value=driver.findElement(By.xpath(prop.getProperty("user_name"))).getText();

				System.out.println("Username we get="+actual_value);

				Assert.assertEquals(actual_value, username.toUpperCase());

				Thread.sleep(2000);
				
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();

				driver.close();
			}

		}
	}




	//Test-2
	public void login_Email_Blank(String browser,String email,String password,String remember, String screen_shot) throws IOException, InterruptedException
	{

		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));

		if(email.equals(""))
		{

			WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
			pwd_user.sendKeys(password);

			driver.findElement(By.xpath(prop.getProperty("pwd_show"))).click();

			if(remember.equalsIgnoreCase("Checked"))
			{

				WebElement check_box=driver.findElement(By.xpath(prop.getProperty("remember_me")));
				Boolean status=check_box.isSelected();
				System.err.println("Remember_me Checkek_box is Checked="+ status);
				if(status.equals(false))
				{
					check_box.click();

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("login"))).click();

					Thread.sleep(2000);

					screen_shots(screen_shot);

					Thread.sleep(2000);
					
					driver.close();
				}
				else
				{
					System.out.println("Checbox Already Checked");
				}
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("login"))).click();

				Thread.sleep(2000);

				screen_shots(screen_shot);

				Thread.sleep(2000);
				driver.close();
			}
		}
		else
		{
			System.out.println("Email is Not Blank Maybe");
		}

	}
	
	

	//Test-3
	public void login_Pwd_Blank(String browser,String email, String password,String remember, String screen_shot) throws IOException, InterruptedException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));			

		if(password.equals(""))
		{
			WebElement email_id =driver.findElement(By.id(prop.getProperty("email_login")));
			email_id.sendKeys(email);

			if(remember.equalsIgnoreCase("Checked"))
			{

				WebElement check_box=driver.findElement(By.xpath(prop.getProperty("remember_me")));
				Boolean status=check_box.isSelected();
				System.err.println("Remember_me Checkek_box is Checked="+ status);
				if(status.equals(false))
				{
					check_box.click();

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("login"))).click();

					String actual=driver.findElement(By.id(prop.getProperty("pwd_login"))).getText();

					Thread.sleep(2000);
					screen_shots(screen_shot);

					Thread.sleep(2000);
					Assert.assertEquals(actual ,"", "Fail");
					driver.close();
				}
				else
				{
					System.out.println("Checbox Already Checked");
				}
			}
			else
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("login"))).click();

				Thread.sleep(2000);
				String actual=driver.findElement(By.id(prop.getProperty("pwd_login"))).getText();
				screen_shots(screen_shot);

				Thread.sleep(2000);
				Assert.assertEquals(actual ,"", "Fail");
				driver.close();
			}
		}
		else
		{
			System.out.println("Password May Not Be Blank");
		}
	}

	// Test 4
	public void login_Email_Unregister(String browser,String email,String pwd,String remember,String screen_shot) throws InterruptedException, IOException
	{

		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));

		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user.sendKeys(email);

		WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user.sendKeys(pwd);

		driver.findElement(By.xpath(prop.getProperty("pwd_show"))).click();

		if(remember.equalsIgnoreCase("Checked"))
		{

			WebElement check_box=driver.findElement(By.xpath(prop.getProperty("remember_me")));
			Boolean status=check_box.isSelected();
			System.err.println("Remember_me Checkek_box is Checked="+ status);
			if(status.equals(false))
			{
				check_box.click();

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("login"))).click();

				Thread.sleep(2000);

				screen_shots(screen_shot);

				Thread.sleep(1000);

				String actual=driver.findElement(By.cssSelector(".help-block>strong")).getText();
				System.out.println(actual);
				Assert.assertEquals(actual, "These credentials do not match our records.", "Fail");
				driver.close();

			}
			else		

			{
				System.out.println("Checkbox Already Checked in");				
			}

		}
		else
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("login"))).click();

			Thread.sleep(2000);

			screen_shots(screen_shot);

			String actual=driver.findElement(By.cssSelector(".help-block>strong")).getText();
			System.out.println(actual);
			Assert.assertEquals(actual, "These credentials do not match our records.", "Fail");


			Thread.sleep(2000);
			driver.close();


		}
	}
	
	// Test 5
	public void login_Email_Invalid(String browser,String email,String pwd,String remember,String screen_shot) throws InterruptedException, IOException
	{

		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));

		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user.sendKeys(email);

		WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user.sendKeys(pwd);

		driver.findElement(By.xpath(prop.getProperty("pwd_show"))).click();

		if(remember.equalsIgnoreCase("Checked"))
		{

			WebElement check_box=driver.findElement(By.xpath(prop.getProperty("remember_me")));
			Boolean status=check_box.isSelected();
			System.err.println("Remember_me Checkek_box is Checked="+ status);
			if(status.equals(false))
			{
				check_box.click();

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("login"))).click();

				Thread.sleep(2000);

				screen_shots(screen_shot);

				Thread.sleep(1000);

				
				driver.close();

			}
			else		

			{
				System.out.println("Checkbox Already Checked in");				
			}

		}
		else
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("login"))).click();

			Thread.sleep(2000);

			screen_shots(screen_shot);

			Thread.sleep(2000);

			driver.close();

			

		}
	}
	
	// Test 6
	
	public void login_Email_Number(String browser,String email,String pwd,String remember,String screen_shot) throws InterruptedException, IOException
	{

		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));

		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user.sendKeys(email);

		WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user.sendKeys(pwd);

		driver.findElement(By.xpath(prop.getProperty("pwd_show"))).click();

		if(remember.equalsIgnoreCase("Checked"))
		{

			WebElement check_box=driver.findElement(By.xpath(prop.getProperty("remember_me")));
			Boolean status=check_box.isSelected();
			System.err.println("Remember_me Checkek_box is Checked="+ status);
			if(status.equals(false))
			{
				check_box.click();

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("login"))).click();

				Thread.sleep(2000);

				screen_shots(screen_shot);

				Thread.sleep(1000);

				
				driver.close();

			}
			else		

			{
				System.out.println("Checkbox Already Checked in");				
			}

		}
		else
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("login"))).click();

			Thread.sleep(2000);

			screen_shots(screen_shot);

			Thread.sleep(2000);	

			driver.close();

		

		}
	}
	
	//Test 7
		public void login_Pwd_Limit(String browser,String email,String pwd) throws IOException, InterruptedException
		{
			prop=file_execute();

			driver=Resources.browser(browser);

			driver.get(prop.getProperty("url_login"));	
		
				WebElement email_id =driver.findElement(By.id(prop.getProperty("email_login")));
				email_id.sendKeys(email);
				
				WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
				pwd_user.sendKeys(pwd);
				
				String get_text=pwd_user.getAttribute("value");
				
				int text_size=get_text.length();
				
				if(text_size<=5)
				{
					System.out.println("Text Entered is Less than 6");
					
					driver.navigate().to("http://www.facebook.com");
				}
				
				else if(get_text.equals(pwd))
				{
				driver.findElement(By.xpath(prop.getProperty("login"))).click();
				
				String url=driver.getCurrentUrl();
				
				Assert.assertEquals(url, "http://planncktest.ap-south-1.elasticbeanstalk.com/home", "Wrong Password");
				
				Thread.sleep(2000);
				
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(2000);
				
				driver.close();
				}	
				
				else if(text_size>20)
				{
					System.out.println("Password Above 20 Character");
					Thread.sleep(2000);
					driver.navigate().to("http://www.gmail.com");
					
				}
		
			
			/*{
				WebElement email_id =driver.findElement(By.id(prop.getProperty("email_login")));
				email_id.sendKeys(email);
				
				WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
				pwd_user.sendKeys(pwd);
				
				String pwd_text=pwd_user.getAttribute("value");
				
				Assert.assertFalse(pwd_text.equals(pwd), "Password Matches");
				
				System.out.println("Password Entered is Above or Below Specified Limit");
				
				driver.findElement(By.xpath(prop.getProperty("login"))).click();
				
			}
			*/
			
			
			
		}
	// Test 8
	
	public void login_Spell_Check(String browser,String step,String text ) throws IOException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));
		
		if(step.equals("0.0"))
	     {
		String text_header=driver.findElement(By.xpath(prop.getProperty("header_text"))).getText();
		System.out.println("Header Text is ="+text_header);
		Assert.assertEquals(text_header, text, "Spelling Mismatch");
		driver.close();
		 }
		else if(step.equals("1.0"))
		{
		 String sign=driver.findElement(By.cssSelector(prop.getProperty("sign_text"))).getText();
		 System.out.println("Login Page spells="+sign);
		 Assert.assertEquals(sign, text, "Spelling Mismatch");
		 driver.close();
		}
		else if(step.equals("2.0"))
		{
			String emai=driver.findElement(By.xpath(prop.getProperty("email_text"))).getText();
			System.out.println("Login Spells 1="+emai);
			Assert.assertEquals(emai, text, "Spelling Mismatch");
			driver.close();
		}
		else if(step.equals("3.0"))
		{
			String pwd=driver.findElement(By.xpath(prop.getProperty("pwd_text"))).getText();
			System.out.println("Login Spells 2="+pwd);
			 Assert.assertEquals(pwd, text, "Spelling Mismatch");
			 driver.close();
		}
		
		else if(step.equals("4.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("rem_text"))).getText();
			System.out.println("Login Spells 3="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}

		else if(step.equals("5.0"))
		{
			String log=driver.findElement(By.cssSelector(prop.getProperty("log_text"))).getText();
			System.out.println("Login Spells 4="+log);
			 Assert.assertEquals(log, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("6.0"))
		{
			String fort=driver.findElement(By.xpath(prop.getProperty("for_text"))).getText();
			System.out.println("Login Spells 5="+fort);
			 Assert.assertEquals(fort, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("7.0"))
		{
			String don=driver.findElement(By.xpath(prop.getProperty("dont_text"))).getText();
			System.out.println("Login Spells 6="+don);
			 Assert.assertEquals(don, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("8.0"))
		{
			String str=driver.findElement(By.xpath(prop.getProperty("start_text"))).getText();
			System.out.println("Login Spells 7="+str);
			 Assert.assertEquals(str, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("9.0"))
		{
			String signu=driver.findElement(By.xpath(prop.getProperty("signup_text"))).getText();
			System.out.println("Footer Shout Spells 8="+signu);
			 Assert.assertEquals(signu, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("10.0"))
		{
			String shout=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getText();
			System.out.println(" Shout Spells 9="+shout);
			 Assert.assertEquals(shout, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("11.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getText();
			System.out.println(" Shout Spells 10="+talk);
			 Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("12.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getText();
			System.out.println(" Shout Spells 11="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("13.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getText();
			System.out.println(" Shout Spells 12="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("14.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getText();
			System.out.println("Footer Shout heading Spells 13="+talk);
			 Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("15.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getText();
			System.out.println("Footer Shout Heading Spells 14="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("16.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getText();
			System.out.println("Footer Shout Heading Spells 15="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("17.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getText();
			System.out.println("Footer Labels Spells 16="+talk);
			 Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("18.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getText();
			System.out.println("Footer Labels Spells 17="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("19.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getText();
			System.out.println("Footer Labels Spells 18="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("20.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getText();
			System.out.println("Footer Labels Spells 19="+talk);
			 Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("21.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getText();
			System.out.println("Footer Labels Spells  20="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("22.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getText();
			System.out.println("Footer Labels Spells  21="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("23.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getText();
			System.out.println("Footer Labels Spells  22="+talk);
			 Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("24.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getText();
			System.out.println("Footer Labels Spells  23="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("25.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getText();
			System.out.println("Footer Labels Spells 24="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("26.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getText();
			System.out.println("Footer Labels Spells  25="+talk);
			 Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("27.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getText();
			System.out.println("Footer Labels Spells  26="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("28.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getText();
			System.out.println("Footer Labels Spells 27="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		
		else if(step.equals("29.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getText();
			System.out.println("Footer Labels Spells  28="+talk);
			 Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("30.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getText();
			System.out.println("Footer Labels Spells  29="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("31.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getText();
			System.out.println("Footer Spells 30="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("32.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getText();
			System.out.println("Footer Spells  31="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("33.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getText();
			System.out.println("Footer Labels Spells 32="+rem);
			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		
		
	}
	// Test 9
	public void login_color_check(String browser,String step,String text) throws IOException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));
		
		if(step.equals("0.0"))
	     {
		String text_header=driver.findElement(By.xpath(prop.getProperty("header_text"))).getCssValue("color");
		System.out.println("Header Text Color is 0 ="+text_header);
		Assert.assertEquals(text_header, text, "Color Mismatch");
		driver.close();
		 }
		else if(step.equals("1.0"))
		{
		 String sign=driver.findElement(By.cssSelector(prop.getProperty("sign_text"))).getCssValue("color");
		 System.out.println("Login Page Color 1="+sign);
		 Assert.assertEquals(sign, text, "Color Mismatch");
		 driver.close();
		}
		else if(step.equals("2.0"))
		{
			driver.findElement(By.id(prop.getProperty("email_login"))).sendKeys("deepak");
			String emai=driver.findElement(By.xpath(prop.getProperty("email_text"))).getCssValue("color");
			System.out.println("Login Color 2="+emai);
			Assert.assertEquals(emai, text, "Color Mismatch");
			driver.close();
		}
		else if(step.equals("3.0"))
		{
			driver.findElement(By.id(prop.getProperty("pwd_login"))).sendKeys("password");
			String pwd=driver.findElement(By.xpath(prop.getProperty("pwd_text"))).getCssValue("color");
			System.out.println("Login Color 3="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
		}
		
		else if(step.equals("4.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("rem_text"))).getCssValue("color");
			System.out.println("Login Color 4="+rem);
			 Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}

		else if(step.equals("5.0"))
		{
			String log=driver.findElement(By.cssSelector(prop.getProperty("log_text"))).getCssValue("color");
			System.out.println("Login Color 5="+log);
		    Assert.assertEquals(log, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("6.0"))
		{
			String fort=driver.findElement(By.xpath(prop.getProperty("for_text"))).getCssValue("color");
			System.out.println("Login Color 6="+fort);
			Assert.assertEquals(fort, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("7.0"))
		{
			String don=driver.findElement(By.xpath(prop.getProperty("dont_text"))).getCssValue("color");
			System.out.println("Login Color 7="+don);
			Assert.assertEquals(don, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("8.0"))
		{
			String str=driver.findElement(By.xpath(prop.getProperty("start_text"))).getCssValue("color");
			System.out.println("Login Color 8="+str);
		  Assert.assertEquals(str, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("9.0"))
		{
			String signu=driver.findElement(By.xpath(prop.getProperty("signup_text"))).getCssValue("color");
			System.out.println("Footer Shout Color 9="+signu);
			 Assert.assertEquals(signu, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("10.0"))
		{
			String shout=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getCssValue("color");
			System.out.println(" Shout Color 10="+shout);
			 Assert.assertEquals(shout, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("11.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getCssValue("color");
			System.out.println(" Shout Color 11="+talk);
			Assert.assertEquals(talk, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("12.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getCssValue("color");
			System.out.println(" Shout Color 12="+rem);
			Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("13.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("color");
			System.out.println(" Shout Color 13="+rem);
			Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("14.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getCssValue("color");
			System.out.println("Footer Shout heading Color 14="+talk);
			 Assert.assertEquals(talk, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("15.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getCssValue("color");
			System.out.println("Footer Shout Heading Color 15="+rem);
			Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("16.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getCssValue("color");
			System.out.println("Footer Shout Heading Color 16="+rem);
			Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("17.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getCssValue("color");
			System.out.println("Footer Labels Color 17="+talk);
			Assert.assertEquals(talk, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("18.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getCssValue("color");
			System.out.println("Footer Labels Color 18="+rem);
			Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("19.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getCssValue("color");
			System.out.println("Footer Labels Color 19="+rem);
		 Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("20.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getCssValue("color");
			System.out.println("Footer Labels Color 20="+talk);
			Assert.assertEquals(talk, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("21.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getCssValue("color");
			System.out.println("Footer Labels Color  21="+rem);
		    Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("22.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getCssValue("color");
			System.out.println("Footer Labels Color  22="+rem);
			 Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("23.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getCssValue("color");
			System.out.println("Footer Labels Color  23="+talk);
			 //Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("24.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getCssValue("color");
			System.out.println("Footer Labels Color  24="+rem);
			Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("25.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getCssValue("color");
			System.out.println("Footer Labels Color 25="+rem);
			Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("26.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getCssValue("color");
			System.out.println("Footer Labels Color  26="+talk);
			 Assert.assertEquals(talk, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("27.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getCssValue("color");
			System.out.println("Footer Labels Color  27="+rem);
			Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("28.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getCssValue("color");
			System.out.println("Footer Labels Color 28="+rem);
			 Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		
		else if(step.equals("29.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getCssValue("color");
			System.out.println("Footer Labels Color  29="+talk);
			 Assert.assertEquals(talk, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("30.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getCssValue("color");
			System.out.println("Footer Labels Color  30="+rem);
			Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("31.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getCssValue("color");
			System.out.println("Footer Color 31="+rem);
			 Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("32.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getCssValue("color");
			System.out.println("Footer Color  32="+rem);
			 Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("33.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getCssValue("color");
			System.out.println("Footer Labels Color 33="+rem);
			Assert.assertEquals(rem, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("34.0"))
		{
			driver.findElement(By.id(prop.getProperty("email_login"))).sendKeys("deepak");
			String emai=driver.findElement(By.id(prop.getProperty("email_login"))).getCssValue("color");
			System.out.println("Email text enter Color 34="+emai);
			Assert.assertEquals(emai, text, "Color Mismatch");
			driver.close();
		}
		else if(step.equals("35.0"))
		{
			driver.findElement(By.xpath(prop.getProperty("pwd_show"))).click();
			driver.findElement(By.id(prop.getProperty("pwd_login"))).sendKeys("pandey");
			String pwd=driver.findElement(By.id(prop.getProperty("pwd_login"))).getCssValue("color");
			System.out.println("Pwd text enter Color 35="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("36.0"))
		{
			
			driver.findElement(By.id(prop.getProperty("pwd_login"))).sendKeys("pandey");
			String pwd=driver.findElement(By.id(prop.getProperty("pwd_login"))).getCssValue("color");
			System.out.println("Pwd text enter Color 36="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("37.0"))
		{
			
			
			String pwd=driver.findElement(By.id(prop.getProperty("header"))).getCssValue("background-color");
			System.out.println("Header Background Color 37="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("38.0"))
		{
			
			String pwd=driver.findElement(By.xpath(prop.getProperty("signin_panel"))).getCssValue("background-color");
			System.out.println("Sign in Panel Background Color 38="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
		}
		
		else if(step.equals("39.0"))
		{
			
			String pwd=driver.findElement(By.xpath(prop.getProperty("login"))).getCssValue("background-color");
			System.out.println("Login Button Background Color 39="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("40.0"))
		{
			
			String pwd=driver.findElement(By.xpath(prop.getProperty("footer_panel"))).getCssValue("background-color");
			System.out.println("Footer Panel Background Color 40="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("41.0"))
		{
			
			String pwd=driver.findElement(By.xpath(prop.getProperty("signup_text"))).getCssValue("background-color");
			System.out.println("Sign in Button Background Color 41="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("42.0"))
		{
			
			String pwd=driver.findElement(By.xpath(prop.getProperty("shout_panel"))).getCssValue("background-color");
			System.out.println("Shout Panel Background Color 42="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("43.0"))
		{
			
			String pwd=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("background-color");
			System.out.println("Shout Send Background Color 43="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
		}
		else if(step.equals("44.0"))
		{
			
			String pwd=driver.findElement(By.xpath(prop.getProperty("footer_final"))).getCssValue("background-color");
			System.out.println("Footer Final Background Color 44="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();
			 
		}
		else if(step.equals("45.0"))
		{
			String pwd=driver.findElement(By.xpath(prop.getProperty("remember_me"))).getCssValue("color");
			System.out.println("Check Box Before Click Color 45="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();			 
			 
		}
		else if(step.equals("46.0"))
		{
			
			driver.findElement(By.xpath(prop.getProperty("remember_me"))).click();
			String pwd=driver.findElement(By.xpath(prop.getProperty("remember_me"))).getCssValue("color");
			System.out.println("Check Box After Click Color 46="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();	
			 
		}
		else if(step.equals("47.0"))
		{
			String pwd=driver.findElement(By.id(prop.getProperty("shout_des"))).getCssValue("color");
			System.out.println("Shout Description Color 47="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();			 
			 
		}
		else if(step.equals("48.0"))
		{
			String pwd=driver.findElement(By.id(prop.getProperty("shout_emai"))).getCssValue("color");
			System.out.println("Shout Emailid Color 48="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();			 
			 
		}
		else if(step.equals("49.0"))
		{
			String pwd=driver.findElement(By.xpath(prop.getProperty("shout_img"))).getCssValue("color");
			System.out.println("Shout Img Color 49="+pwd);
			Assert.assertEquals(pwd, text, "Color Mismatch");
			 driver.close();			 
			 
		}
	}
	
	// Test 10
	
	public void login_Font_Check(String browser,String step,String font,String weight,String size,String pos,String widh,String loc ) throws IOException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));
		
		if(step.equals("0.0"))
	     {
		String text_family=driver.findElement(By.xpath(prop.getProperty("header_text"))).getCssValue("font-family");
		String text_weight=driver.findElement(By.xpath(prop.getProperty("header_text"))).getCssValue("font-weight");
		String text_size=driver.findElement(By.xpath(prop.getProperty("header_text"))).getCssValue("font-size");
		String text_position=driver.findElement(By.xpath(prop.getProperty("header_text"))).getCssValue("position");
		String text_loc=driver.findElement(By.xpath(prop.getProperty("header_text"))).getSize().toString();
		String text_coordinate=driver.findElement(By.xpath(prop.getProperty("header_text"))).getLocation().toString();
		System.out.println("Font Family 0 ="+text_family);
		System.out.println("Font Weight 0="+text_weight);
		System.out.println("Font Size 0 ="+text_size);
		System.out.println("Font Position 0="+text_position);
		System.out.println("Font Location Width,Height 0="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 0="+text_coordinate);		
		
		Assert.assertEquals(text_family,font,"Font-Family Mismatch");
		Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
		Assert.assertEquals(text_size,size,"Font-Size Mismatch");
		Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		
		driver.close();
		 }
		else if(step.equals("1.0"))
		{
			String text_family=driver.findElement(By.cssSelector(prop.getProperty("sign_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.cssSelector(prop.getProperty("sign_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.cssSelector(prop.getProperty("sign_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.cssSelector(prop.getProperty("sign_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.cssSelector(prop.getProperty("sign_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.cssSelector(prop.getProperty("sign_text"))).getLocation().toString();
			System.out.println("Font Family 1 ="+text_family);
			System.out.println("Font Weight 1="+text_weight);
			System.out.println("Font Size 1 ="+text_size);
			System.out.println("Font Position 1="+text_position);
			System.out.println("Font Location Width,Height 1="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 1="+text_coordinate);	
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		 driver.close();
		}
		else if(step.equals("2.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("email_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("email_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("email_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("email_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("email_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("email_text"))).getLocation().toString();
			System.out.println("Font Family 2 ="+text_family);
			System.out.println("Font Weight 2="+text_weight);
			System.out.println("Font Size 2 ="+text_size);
			System.out.println("Font Position 2="+text_position);
			System.out.println("Font Location Width,Height 2="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 2="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			
			driver.close();
		}
		else if(step.equals("3.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("pwd_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("pwd_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("pwd_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("pwd_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("pwd_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("pwd_text"))).getLocation().toString();
			System.out.println("Font Family 3 ="+text_family);
			System.out.println("Font Weight 3="+text_weight);
			System.out.println("Font Size 3 ="+text_size);
			System.out.println("Font Position 3="+text_position);
			System.out.println("Font Location Width,Height 3="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 3="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			 driver.close();
		}
		
		else if(step.equals("4.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("rem_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("rem_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("rem_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("rem_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("rem_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("rem_text"))).getLocation().toString();
			System.out.println("Font Family 4 ="+text_family);
			System.out.println("Font Weight 4="+text_weight);
			System.out.println("Font Size 4="+text_size);
			System.out.println("Font Position 4="+text_position);
			System.out.println("Font Location Width,Height 4="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 4="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			 driver.close();
		}

		else if(step.equals("5.0"))
		{
			String text_family=driver.findElement(By.cssSelector(prop.getProperty("log_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.cssSelector(prop.getProperty("log_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.cssSelector(prop.getProperty("log_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.cssSelector(prop.getProperty("log_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.cssSelector(prop.getProperty("log_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.cssSelector(prop.getProperty("log_text"))).getLocation().toString();
			System.out.println("Font Family 5 ="+text_family);
			System.out.println("Font Weight 5="+text_weight);
			System.out.println("Font Size 5 ="+text_size);
			System.out.println("Font Position 5="+text_position);
			System.out.println("Font Location Width,Height 5="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 5="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			 driver.close();
		}
		else if(step.equals("6.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("for_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("for_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("for_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("for_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("for_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("for_text"))).getLocation().toString();
			System.out.println("Font Family 6 ="+text_family);
			System.out.println("Font Weight 6="+text_weight);
			System.out.println("Font Size 6 ="+text_size);
			System.out.println("Font Position 6="+text_position);
			System.out.println("Font Location Width,Height 6="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 6="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			 driver.close();
		}
		else if(step.equals("7.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("dont_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("dont_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("dont_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("dont_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("dont_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("dont_text"))).getLocation().toString();
			System.out.println("Font Family 7 ="+text_family);
			System.out.println("Font Weight 7="+text_weight);
			System.out.println("Font Size 7 ="+text_size);
			System.out.println("Font Position 7="+text_position);
			System.out.println("Font Location Width,Height 7="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 7="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			
			 driver.close();
		}
		else if(step.equals("8.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("start_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("start_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("start_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("start_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("start_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("start_text"))).getLocation().toString();
			System.out.println("Font Family 8 ="+text_family);
			System.out.println("Font Weight 8="+text_weight);
			System.out.println("Font Size 8 ="+text_size);
			System.out.println("Font Position 8="+text_position);
			System.out.println("Font Location Width,Height 8="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 8="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			 driver.close();
		}
		else if(step.equals("9.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("signup_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("signup_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("signup_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("signup_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("signup_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("signup_text"))).getLocation().toString();
			System.out.println("Font Family 9 ="+text_family);
			System.out.println("Font Weight 9="+text_weight);
			System.out.println("Font Size 9 ="+text_size);
			System.out.println("Font Position 9="+text_position);
			System.out.println("Font Location Width,Height 9="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 9="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			 driver.close();
		}
	
		else if(step.equals("10.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getLocation().toString();
			System.out.println("Font Family 10 ="+text_family);
			System.out.println("Font Weight 10="+text_weight);
			System.out.println("Font Size 10 ="+text_size);
			System.out.println("Font Position 10="+text_position);
			System.out.println("Font Location Width,Height 10="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 10="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(shout, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("11.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getLocation().toString();
			System.out.println("Font Family 11 ="+text_family);
			System.out.println("Font Weight 11="+text_weight);
			System.out.println("Font Size 11 ="+text_size);
			System.out.println("Font Position 11="+text_position);
			System.out.println("Font Location Width,Height 11="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 11="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("12.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getLocation().toString();
			System.out.println("Font Family 12 ="+text_family);
			System.out.println("Font Weight 12="+text_weight);
			System.out.println("Font Size 12 ="+text_size);
			System.out.println("Font Position 12="+text_position);
			System.out.println("Font Location Width,Height 12="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 12="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("13.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getLocation().toString();
			System.out.println("Font Family 13 ="+text_family);
			System.out.println("Font Weight 13="+text_weight);
			System.out.println("Font Size 13 ="+text_size);
			System.out.println("Font Position 13="+text_position);
			System.out.println("Font Location Width,Height 13="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 13="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			//			 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("14.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getLocation().toString();
			System.out.println("Font Family 14 ="+text_family);
			System.out.println("Font Weight 14="+text_weight);
			System.out.println("Font Size 14 ="+text_size);
			System.out.println("Font Position 14="+text_position);
			System.out.println("Font Location Width,Height 14="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 14="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("15.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getLocation().toString();
			System.out.println("Font Family 15 ="+text_family);
			System.out.println("Font Weight 15="+text_weight);
			System.out.println("Font Size 15 ="+text_size);
			System.out.println("Font Position 15="+text_position);
			System.out.println("Font Location Width,Height 15="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 15="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("16.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getLocation().toString();
			System.out.println("Font Family 16 ="+text_family);
			System.out.println("Font Weight 16="+text_weight);
			System.out.println("Font Size 16 ="+text_size);
			System.out.println("Font Position 16="+text_position);
			System.out.println("Font Location Width,Height 16="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 16="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("17.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getLocation().toString();
			System.out.println("Font Family 17 ="+text_family);
			System.out.println("Font Weight 17="+text_weight);
			System.out.println("Font Size 17 ="+text_size);
			System.out.println("Font Position 17="+text_position);
			System.out.println("Font Location Width,Height 17="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 17="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("18.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getLocation().toString();
			System.out.println("Font Family 18 ="+text_family);
			System.out.println("Font Weight 18="+text_weight);
			System.out.println("Font Size 18 ="+text_size);
			System.out.println("Font Position 18="+text_position);
			System.out.println("Font Location Width,Height 18="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 18="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			//		 Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("19.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getLocation().toString();
			System.out.println("Font Family 19 ="+text_family);
			System.out.println("Font Weight 19="+text_weight);
			System.out.println("Font Size 19 ="+text_size);
			System.out.println("Font Position 19="+text_position);
			System.out.println("Font Location Width,Height 19="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 19="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			//Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("20.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getLocation().toString();
			System.out.println("Font Family 20 ="+text_family);
			System.out.println("Font Weight 20="+text_weight);
			System.out.println("Font Size 20 ="+text_size);
			System.out.println("Font Position 20="+text_position);
			System.out.println("Font Location Width,Height 20="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 20="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("21.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getLocation().toString();
			System.out.println("Font Family 21 ="+text_family);
			System.out.println("Font Weight 21="+text_weight);
			System.out.println("Font Size 21 ="+text_size);
			System.out.println("Font Position 21="+text_position);
			System.out.println("Font Location Width,Height 21="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 21="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("22.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getLocation().toString();
			System.out.println("Font Family 22 ="+text_family);
			System.out.println("Font Weight 22="+text_weight);
			System.out.println("Font Size 22 ="+text_size);
			System.out.println("Font Position 22="+text_position);
			System.out.println("Font Location Width,Height 22="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 22="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("23.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getLocation().toString();
			System.out.println("Font Family 23 ="+text_family);
			System.out.println("Font Weight 23="+text_weight);
			System.out.println("Font Size 23 ="+text_size);
			System.out.println("Font Position 23="+text_position);
			System.out.println("Font Location Width,Height 23="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 23="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		// Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("24.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getLocation().toString();
			System.out.println("Font Family 24 ="+text_family);
			System.out.println("Font Weight 24="+text_weight);
			System.out.println("Font Size 24 ="+text_size);
			System.out.println("Font Position 24="+text_position);
			System.out.println("Font Location Width,Height 24="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 24="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("25.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getLocation().toString();
			System.out.println("Font Family 25 ="+text_family);
			System.out.println("Font Weight 25="+text_weight);
			System.out.println("Font Size 25 ="+text_size);
			System.out.println("Font Position 25="+text_position);
			System.out.println("Font Location Width,Height 25="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 25="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("26.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getLocation().toString();
			System.out.println("Font Family 26 ="+text_family);
			System.out.println("Font Weight 26="+text_weight);
			System.out.println("Font Size 26 ="+text_size);
			System.out.println("Font Position 26="+text_position);
			System.out.println("Font Location Width,Height 26="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 26="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("27.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getLocation().toString();
			System.out.println("Font Family 27 ="+text_family);
			System.out.println("Font Weight 27="+text_weight);
			System.out.println("Font Size 27 ="+text_size);
			System.out.println("Font Position 27="+text_position);
			System.out.println("Font Location Width,Height 27="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 27="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("28.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getLocation().toString();
			System.out.println("Font Family 28 ="+text_family);
			System.out.println("Font Weight 28="+text_weight);
			System.out.println("Font Size 28 ="+text_size);
			System.out.println("Font Position 28="+text_position);
			System.out.println("Font Location Width,Height 28="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 28="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		
		else if(step.equals("29.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getLocation().toString();
			System.out.println("Font Family 29 ="+text_family);
			System.out.println("Font Weight 29="+text_weight);
			System.out.println("Font Size 29 ="+text_size);
			System.out.println("Font Position 29="+text_position);
			System.out.println("Font Location Width,Height 29="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 29="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(talk, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("30.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getLocation().toString();
			System.out.println("Font Family 30 ="+text_family);
			System.out.println("Font Weight 30="+text_weight);
			System.out.println("Font Size 30 ="+text_size);
			System.out.println("Font Position 30="+text_position);
			System.out.println("Font Location Width,Height 30="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 30="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("31.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getLocation().toString();
			System.out.println("Font Family 31 ="+text_family);
			System.out.println("Font Weight 31="+text_weight);
			System.out.println("Font Size 31 ="+text_size);
			System.out.println("Font Position 31="+text_position);
			System.out.println("Font Location Width,Height 31="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 31="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("32.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getLocation().toString();
			
			System.out.println("Font Family 32 ="+text_family);
			System.out.println("Font Weight 32="+text_weight);
			System.out.println("Font Size 32 ="+text_size);
			System.out.println("Font Position 32="+text_position);
			System.out.println("Font Location Width,Height 32="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 32="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			// Assert.assertEquals(rem, text, "Spelling Mismatch");
			 driver.close();
		}
		else if(step.equals("33.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getLocation().toString();
			System.out.println("Font Family 33 ="+text_family);
			System.out.println("Font Weight 33"+text_weight);
			System.out.println("Font Size 33 ="+text_size);
			System.out.println("Font Position 33="+text_position);
			System.out.println("Font Location Width,Height 33="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 33="+text_coordinate);	
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			 driver.close();
		}
		else if(step.equals("34.0"))
		{
			String text_loc=driver.findElement(By.id(prop.getProperty("header"))).getSize().toString();
			String text_coordinate=driver.findElement(By.id(prop.getProperty("header"))).getLocation().toString();
			
			System.out.println("header Location Width,Height 34="+text_loc);		
			System.out.println("header Coordinate X-axis,Y-axis 34="+text_coordinate);	
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			
			 driver.close();
		}
		else if(step.equals("35.0"))
		{
			String text_loc=driver.findElement(By.xpath(prop.getProperty("header_img"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("header_img"))).getLocation().toString();			
			System.out.println("header img Location Width,Height 35="+text_loc);		
			System.out.println("header img Coordinate X-axis,Y-axis 35="+text_coordinate);	
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			
			 driver.close();
		}
		else if(step.equals("36.0"))
		{
			String text_loc=driver.findElement(By.xpath(prop.getProperty("signin_panel"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("signin_panel"))).getLocation().toString();			
			System.out.println("Signin Panel img Location Width,Height 36="+text_loc);		
			System.out.println("Signin Panel img Coordinate X-axis,Y-axis 36="+text_coordinate);	
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			 driver.close();
		}
		else if(step.equals("37.0"))
		{
			String text_family=driver.findElement(By.xpath("//*[@id=\"text1\"]")).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath("//*[@id=\"text1\"]")).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath("//*[@id=\"text1\"]")).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath("//*[@id=\"text1\"]")).getCssValue("position");
			String text_loc=driver.findElement(By.xpath("//*[@id=\"text1\"]")).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath("//*[@id=\"text1\"]")).getLocation().toString();	
			System.out.println("Font Family 37 ="+text_family);
			System.out.println("Font Weight 37="+text_weight);
			System.out.println("Font Size 37 ="+text_size);
			System.out.println("Font Position 37="+text_position);
			System.out.println("Signin Panel img Location Width,Height 37="+text_loc);		
			System.out.println("Signin Panel img Coordinate X-axis,Y-axis 37="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			 driver.close();
		}
		else if(step.equals("38.0"))
		{
			String text_family=driver.findElement(By.xpath("//*[@id=\"password_show\"]")).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath("//*[@id=\"password_show\"]")).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath("//*[@id=\"password_show\"]")).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath("//*[@id=\"password_show\"]")).getCssValue("position");
			System.out.println("Font Family 38 ="+text_family);
			System.out.println("Font Weight 38="+text_weight);
			System.out.println("Font Size 38 ="+text_size);
			System.out.println("Font Position 38="+text_position);
			String text_loc=driver.findElement(By.xpath("//*[@id=\"password_show\"]")).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath("//*[@id=\"password_show\"]")).getLocation().toString();			
			System.out.println("Signin Panel img Location Width,Height 38="+text_loc);		
			System.out.println("Signin Panel img Coordinate X-axis,Y-axis 38="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			
			 driver.close();
		}
		
		else if(step.equals("39.0"))
		{
		
		String text_family=driver.findElement(By.xpath(prop.getProperty("remember_me"))).getCssValue("font-family");
		String text_weight=driver.findElement(By.xpath(prop.getProperty("remember_me"))).getCssValue("font-weight");
		String text_size=driver.findElement(By.xpath(prop.getProperty("remember_me"))).getCssValue("font-size");
		String text_position=driver.findElement(By.xpath(prop.getProperty("remember_me"))).getCssValue("position");
		String text_loc=driver.findElement(By.xpath(prop.getProperty("remember_me"))).getSize().toString();
		String text_coordinate=driver.findElement(By.xpath(prop.getProperty("remember_me"))).getLocation().toString();
		
		System.out.println("Font Family 39 ="+text_family);
		System.out.println("Font Weight 39="+text_weight);
		System.out.println("Font Size 39="+text_size);
		System.out.println("Font Position 39="+text_position);
		System.out.println("Font Location Width,Height 39="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 39="+text_coordinate);
		Assert.assertEquals(text_family,font,"Font-Family Mismatch");
		Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
		Assert.assertEquals(text_size,size,"Font-Size Mismatch");
		Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		 driver.close();
	}
		else if(step.equals("40.0"))
		{		
		String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_panel"))).getSize().toString();
		String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_panel"))).getLocation().toString();
		String text_position=driver.findElement(By.xpath(prop.getProperty("shout_panel"))).getCssValue("position");
		System.out.println("Font Location Width,Height 40="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 40="+text_coordinate);	
		System.out.println("Font Position 40="+text_position);		
		Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		 driver.close();
	}
		else if(step.equals("41.0"))
		{
		
		String text_family=driver.findElement(By.id(prop.getProperty("shout_des"))).getCssValue("font-family");
		String text_weight=driver.findElement(By.id(prop.getProperty("shout_des"))).getCssValue("font-weight");
		String text_size=driver.findElement(By.id(prop.getProperty("shout_des"))).getCssValue("font-size");
		String text_position=driver.findElement(By.id(prop.getProperty("shout_des"))).getCssValue("position");
		String text_loc=driver.findElement(By.id(prop.getProperty("shout_des"))).getSize().toString();
		String text_coordinate=driver.findElement(By.id(prop.getProperty("shout_des"))).getLocation().toString();
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		
		System.out.println("Font Family 41 ="+text_family);
		System.out.println("Font Weight 41="+text_weight);
		System.out.println("Font Size 41="+text_size);
		System.out.println("Font Position 41="+text_position);
		System.out.println("Font Location Width,Height 41="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 41="+text_coordinate);	
		Assert.assertEquals(text_family,font,"Font-Family Mismatch");
		Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
		Assert.assertEquals(text_size,size,"Font-Size Mismatch");
		Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		 driver.close();
	}
		else if(step.equals("42.0"))
		{
		
		String text_family=driver.findElement(By.id(prop.getProperty("shout_emai"))).getCssValue("font-family");
		String text_weight=driver.findElement(By.id(prop.getProperty("shout_emai"))).getCssValue("font-weight");
		String text_size=driver.findElement(By.id(prop.getProperty("shout_emai"))).getCssValue("font-size");
		String text_position=driver.findElement(By.id(prop.getProperty("shout_emai"))).getCssValue("position");
		String text_loc=driver.findElement(By.id(prop.getProperty("shout_emai"))).getSize().toString();
		String text_coordinate=driver.findElement(By.id(prop.getProperty("shout_emai"))).getLocation().toString();
				
		System.out.println("Font Family 42 ="+text_family);
		System.out.println("Font Weight 42="+text_weight);
		System.out.println("Font Size 42"+text_size);
		System.out.println("Font Position 42="+text_position);
		System.out.println("Font Location Width,Height 42="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 42="+text_coordinate);	
		Assert.assertEquals(text_family,font,"Font-Family Mismatch");
		Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
		Assert.assertEquals(text_size,size,"Font-Size Mismatch");
		Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		 driver.close();
	}
		else if(step.equals("43.0"))
		{		
    	String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_img"))).getSize().toString();
    	String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_img"))).getLocation().toString();
		String text_position=driver.findElement(By.xpath(prop.getProperty("shout_img"))).getCssValue("position");
		System.out.println("Font Location Width,Height 43="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 43="+text_coordinate);	
		System.out.println("Font Position 43="+text_position);
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		Assert.assertEquals(text_position, pos, "Font-Position Mismatch");
		 driver.close();
	}
		else if(step.equals("44.0"))
		{		
    	String text_loc=driver.findElement(By.xpath(prop.getProperty("bottom_img"))).getSize().toString();
	    String text_coordinate=driver.findElement(By.xpath(prop.getProperty("bottom_img"))).getLocation().toString();
		String text_position=driver.findElement(By.xpath(prop.getProperty("bottom_img"))).getCssValue("position");
		System.out.println("Font Location Width,Height 44="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 44="+text_coordinate);	
		System.out.println("Font Position 44="+text_position);
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		Assert.assertEquals(text_position, pos, "Font-Position Mismatch");
		 driver.close();
	}
		else if(step.equals("45.0"))
		{		
    	String text_loc=driver.findElement(By.xpath(prop.getProperty("pwd_show"))).getSize().toString();
		String text_coordinate=driver.findElement(By.xpath(prop.getProperty("pwd_show"))).getLocation().toString();
		String text_position=driver.findElement(By.xpath(prop.getProperty("pwd_show"))).getCssValue("position");
		System.out.println("Font Location Width,Height 45="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 45="+text_coordinate);	
		System.out.println("Font Position 45="+text_position);
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		Assert.assertEquals(text_position, pos, "Font-Position Mismatch");
		 driver.close();
	}
		else if(step.equals("46.0"))
		{		
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_final"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_final"))).getLocation().toString();
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_final"))).getCssValue("position");
			System.out.println("Font Location Width,Height 46="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 46="+text_coordinate);	
			System.out.println("Font Position 46="+text_position);	
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			Assert.assertEquals(text_position, pos, "Font-Position Mismatch");

			driver.close();
		}
	}
}


