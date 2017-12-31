package SPRINT1_Registration;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Lib.Resources;


public class Registration extends Resources{

	WebDriver driver;
	Properties prop;
	//Test 1

	public void valid_Registration(String browser,String name,String email,String pwd,String rpwd,String desc) throws Exception
	{

		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));

		WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

		user_name.sendKeys(name);

		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

		email_user.sendKeys(email);

		WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

		pwd_user.sendKeys(pwd);

		WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

		rpwd_user.sendKeys(rpwd);

		WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

		explore_user.sendKeys(desc);

		WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

		click_user.click();

		String actual_value=driver.findElement(By.cssSelector(".alert-success")).getText();
		System.out.println(actual_value);
	}

	// Test 2
	public void field_RegistrationBlank(String browser,String name,String email,String pwd,String rpwd,String desc,String screen) throws Exception
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));

		if(name.equals(""))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_data=user_name.getAttribute("value");

			Assert.assertEquals(name_data, name, "No Blank Data");

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);

			WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

			click_user.click();

			Thread.sleep(2000);


			screen_shots(screen);

			Thread.sleep(1000);

			driver.close();

		}
		else if(email.equals(""))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));
			user_name.sendKeys("gopal");

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));
			email_user.sendKeys(email);

			String email_data=email_user.getAttribute("value");

			Assert.assertEquals(email_data, email, "No Blank Data");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);

			WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

			click_user.click();

			Thread.sleep(2000);

			screen_shots(screen);

			Thread.sleep(1000);

			driver.close();

		}
		if(pwd.equals(""))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_data=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_data, pwd, "No Blank Data");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);

			WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

			click_user.click();

			Thread.sleep(2000);

			screen_shots(screen);

			Thread.sleep(1000);

			driver.close();

		}
		if(rpwd.equals(""))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_data=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_data, rpwd, "No Blank Data");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);

			WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

			click_user.click();

			Thread.sleep(2000);

			screen_shots(screen);

			Thread.sleep(1000);

			driver.close();

		}
		if(desc.equals(""))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);

			String exp_data=explore_user.getAttribute("value");

			Assert.assertEquals(exp_data, desc, "No Blank Data");

			WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

			click_user.click();

			Thread.sleep(2000);

			screen_shots(screen);

			Thread.sleep(1000);

			driver.close();

		}
		else
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String user_data=user_name.getAttribute("value");

			Assert.assertEquals(user_data, name, "No Blank Data");

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_data=email_user.getAttribute("value");

			Assert.assertEquals(email_data, email, "No Blank Data");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_data=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_data, pwd, "No Blank Data");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_data=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_data, rpwd, "No Blank Data");


			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);

			String exp_data=explore_user.getAttribute("value");

			Assert.assertEquals(exp_data, desc, "No Blank Data");

			WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

			click_user.click();

			Thread.sleep(2000);

			screen_shots(screen);

			Thread.sleep(1000);

			driver.close();
		}

	}

	//Test 3 

	public void registration_limit(String browser,String limit,String name,String email,String pwd,String rpwd,String desc,String screen) throws IOException, InterruptedException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));

		if(limit.equals("0.0"))
		{

			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_data=user_name.getAttribute("value");

			Assert.assertEquals(name_data, name.substring(0, 25), "Text Entered Above 25");

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);
			Thread.sleep(1000);
			screen_shots(screen);
			Thread.sleep(1000);
			driver.close();
		}
		else if(limit.equals("1.0"))
		{

			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String name_data=pwd_user.getAttribute("value");

			Assert.assertEquals(name_data, pwd.substring(0, 20), "Password Entered Above 19");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String name1_data=pwd_user.getAttribute("value");

			Assert.assertEquals(name1_data, rpwd.substring(0, 20), "Password Entered Above 19");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);
			Thread.sleep(1000);

			screen_shots(screen);
			Thread.sleep(1000);

			driver.close();

		}
		else if(limit.equals("2.0"))
		{

			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String name_data=pwd_user.getAttribute("value");

			Assert.assertEquals(name_data, pwd.substring(0, 20), "Password Entered Above 19");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			WebElement pwd_show=driver.findElement(By.xpath(prop.getProperty("pwd_rshow")));

			pwd_show.click();			

			String name_data1=pwd_user.getAttribute("value");

			Assert.assertEquals(name_data1, rpwd.substring(0, 20), "Password Entered Above 19");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);
			Thread.sleep(1000);

			screen_shots(screen);
			Thread.sleep(1000);

			driver.close();

		}
		else if(limit.equals("3.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_data=user_name.getAttribute("value");

			Assert.assertEquals(name_data, "", "No Blank Data");

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);

			WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

			click_user.click();

			Thread.sleep(2000);

			screen_shots(screen);

			Thread.sleep(1000);

			driver.close();
		}

		else if(limit.equals("4.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_data=user_name.getAttribute("value");

			Assert.assertEquals(name_data, "", "No Blank Data");

			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);

			WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

			click_user.click();

			Thread.sleep(2000);

			screen_shots(screen);

			Thread.sleep(1000);

			driver.close();
		}
		else if(limit.equals("5.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(desc);

			WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

			click_user.click();

			Thread.sleep(2000);

			String name_data=driver.findElement(By.xpath(prop.getProperty("explore_errmsg"))).getText();

			Assert.assertEquals(name_data, "The plank suggestion may not be greater than 255 characters.", "It Accept the Character Above 255");

			Thread.sleep(1000);

			screen_shots(screen);

			Thread.sleep(1000);

			driver.close();
		}
	}
	// Test 4
	public void registration_invalidemail(String browser,String name,String email,String pwd,String rpwd,String desc,String screen) throws IOException, InterruptedException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));

		WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

		user_name.sendKeys(name);

		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

		email_user.sendKeys(email);

		WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

		pwd_user.sendKeys(pwd);

		WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

		rpwd_user.sendKeys(rpwd);

		WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

		explore_user.sendKeys(desc);

		WebElement click_user=driver.findElement(By.cssSelector(prop.getProperty("signup")));

		click_user.click();

		Thread.sleep(2000);

		screen_shots(screen);

		Thread.sleep(1000);

		driver.close();
	}

	// Test 5
	public void registration_spellcheck(String browser,String steps,String text) throws IOException, InterruptedException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));

		if(steps.equals("0.0"))
		{

			String spell=driver.findElement(By.xpath(prop.getProperty("header_text"))).getText();

			System.out.println("Header Text at 0="+ spell);
			Assert.assertEquals(spell, text, "Spelling Mismatch");
			driver.close();

		}
		else if(steps.equals("1.0"))
		{

			String spell=driver.findElement(By.cssSelector(prop.getProperty("signup_text1"))).getText();

			System.out.println("Sign Up Text at 1="+ spell);
			Assert.assertEquals(spell, text, "Spelling Mismatch");
			driver.close();

		}
		else if(steps.equals("2.0"))
		{

			String spell=driver.findElement(By.xpath(prop.getProperty("name_label"))).getText();

			System.out.println("Sign Up Panel Text at 2="+ spell);
			Assert.assertEquals(spell, text, "Spelling Mismatch");
			driver.close();

		}
		else if(steps.equals("3.0"))
		{

			String spell=driver.findElement(By.xpath(prop.getProperty("email_label"))).getText();

			System.out.println("Sign Up Panel Text at 3="+ spell);
			Assert.assertEquals(spell, text, "Spelling Mismatch");
			driver.close();

		}

		else if(steps.equals("4.0"))
		{

			String spell=driver.findElement(By.xpath(prop.getProperty("pwd_label"))).getText();

			System.out.println("Sign Up Panel Text at 4="+ spell);
			Assert.assertEquals(spell, text, "Spelling Mismatch");
			driver.close();

		}
		else if(steps.equals("5.0"))
		{

			String spell=driver.findElement(By.xpath(prop.getProperty("rpwd_label"))).getText();

			System.out.println("Sign Up Panel Text at 5="+ spell);
			Assert.assertEquals(spell, text, "Spelling Mismatch");
			driver.close();

		}
		else if(steps.equals("6.0"))
		{

			String spell=driver.findElement(By.xpath(prop.getProperty("exp_label"))).getText();

			System.out.println("Sign Up Panel Text at 6="+ spell);
			Assert.assertEquals(spell, text, "Spelling Mismatch");
			driver.close();

		}
		else if(steps.equals("7.0"))
		{

			String spell=driver.findElement(By.xpath(prop.getProperty("pref_text"))).getText();

			System.out.println("Sign Up Panel Text at 7="+ spell);
			Assert.assertEquals(spell, text, "Spelling Mismatch");
			driver.close();

		}
		else if(steps.equals("8.0"))
		{

			String spell=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getText();

			System.out.println("Sign Up Panel Text at 8="+ spell);
			Assert.assertEquals(spell, text, "Spelling Mismatch");
			driver.close();

		}
		else if(steps.equals("9.0"))
		{
			String shout=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getText();
			System.out.println(" Shout Spells 9="+shout);
			Assert.assertEquals(shout, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("10.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getText();
			System.out.println(" Shout Spells 10="+talk);
			Assert.assertEquals(talk, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("11.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getText();
			System.out.println(" Shout Spells 11="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("12.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getText();
			System.out.println(" Shout Spells 12="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("13.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getText();
			System.out.println("Footer Shout heading Spells 13="+talk);
			Assert.assertEquals(talk, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("14.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getText();
			System.out.println("Footer Shout Heading Spells 14="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("15.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getText();
			System.out.println("Footer Shout Heading Spells 15="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("16.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getText();
			System.out.println("Footer Labels Spells 16="+talk);
			Assert.assertEquals(talk, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("17.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getText();
			System.out.println("Footer Labels Spells 17="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("18.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getText();
			System.out.println("Footer Labels Spells 18="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("19.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getText();
			System.out.println("Footer Labels Spells 19="+talk);
			Assert.assertEquals(talk, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("20.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getText();
			System.out.println("Footer Labels Spells  20="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("21.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getText();
			System.out.println("Footer Labels Spells  21="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("22.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getText();
			System.out.println("Footer Labels Spells  22="+talk);
			Assert.assertEquals(talk, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("23.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getText();
			System.out.println("Footer Labels Spells  23="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("24.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getText();
			System.out.println("Footer Labels Spells 24="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("25.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getText();
			System.out.println("Footer Labels Spells  25="+talk);
			Assert.assertEquals(talk, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("26.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getText();
			System.out.println("Footer Labels Spells  26="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("27.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getText();
			System.out.println("Footer Labels Spells 27="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}

		else if(steps.equals("28.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getText();
			System.out.println("Footer Labels Spells  28="+talk);
			Assert.assertEquals(talk, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("29.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getText();
			System.out.println("Footer Labels Spells  29="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("30.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getText();
			System.out.println("Footer Spells 30="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("31.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getText();
			System.out.println("Footer Spells  31="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("32.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getText();
			System.out.println("Footer Labels Spells 32="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("33.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("acc_text"))).getText();
			System.out.println("Account Text Spells 33="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("34.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("log_text"))).getText();
			System.out.println("Login Text Spells  34="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else if(steps.equals("35.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getText();
			System.out.println("Sign In  Labels Spells 35="+rem);
			Assert.assertEquals(rem, text, "Spelling Mismatch");
			driver.close();
		}
		else
		{
			System.out.println("No Steps Found");
		}
	}
	// Test 6
	public void registration_colorcheck(String browser,String steps,String ecol) throws IOException, InterruptedException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));

		if(steps.equals("0.0"))
		{

			String color=driver.findElement(By.xpath(prop.getProperty("header_text"))).getCssValue("color");

			System.out.println("Header Text Color at 0="+ color);			
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();

		}
		else if(steps.equals("1.0"))
		{

			String color=driver.findElement(By.cssSelector(prop.getProperty("signup_text1"))).getCssValue("color");

			System.out.println("Sign Up Text Color at 1="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();

		}
		else if(steps.equals("2.0"))
		{

			driver.findElement(By.id(prop.getProperty("name_signup"))).sendKeys("deepak");

			String color=driver.findElement(By.xpath(prop.getProperty("name_label"))).getCssValue("color");

			System.out.println("Sign Up Panel Text Color at 2="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();

		}
		else if(steps.equals("3.0"))
		{

			driver.findElement(By.id(prop.getProperty("email_signup"))).sendKeys("deepak");

			String color=driver.findElement(By.xpath(prop.getProperty("email_label"))).getCssValue("color");

			System.out.println("Sign Up Panel Text Color at 3="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();

		}


		else if(steps.equals("4.0"))
		{

			driver.findElement(By.id(prop.getProperty("pwd_signup"))).sendKeys("deepak");

			String color=driver.findElement(By.xpath(prop.getProperty("pwd_label"))).getCssValue("color");

			System.out.println("Sign Up Panel Text Color at 4="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();

		}
		else if(steps.equals("5.0"))
		{

			driver.findElement(By.id(prop.getProperty("rpwd_signup"))).sendKeys("deepak");

			String color=driver.findElement(By.xpath(prop.getProperty("rpwd_label"))).getCssValue("color");

			System.out.println("Sign Up Panel Text Color at 5="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();

		}
		else if(steps.equals("6.0"))
		{

			driver.findElement(By.id(prop.getProperty("explore_signup"))).sendKeys("deepak");

			String color=driver.findElement(By.xpath(prop.getProperty("exp_label"))).getCssValue("color");

			System.out.println("Sign Up Panel Text Color at 6="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();

		}
		else if(steps.equals("7.0"))
		{

			String color=driver.findElement(By.xpath(prop.getProperty("pref_text1"))).getCssValue("color");

			System.out.println("Sign Up Panel Text Color at 7="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();

		}
		else if(steps.equals("8.0"))
		{

			String color=driver.findElement(By.xpath(prop.getProperty("pref_text2"))).getCssValue("color");

			System.out.println("Sign Up Panel Text Color at 8="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();

		}
		else if(steps.equals("9.0"))
		{

			String color=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getCssValue("color");

			System.out.println("Sign Up Panel Text Color at 9="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("10.0"))
		{

			String color=driver.findElement(By.xpath(prop.getProperty("acc_text"))).getCssValue("color");

			System.out.println("Footer Panel Text Color at 10="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("11.0"))
		{

			String color=driver.findElement(By.xpath(prop.getProperty("log_text"))).getCssValue("color");

			System.out.println("Footer Panel Text Color at 11="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("12.0"))
		{

			String color=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getCssValue("color");

			System.out.println("Footer Panel Text Color at 12="+ color);
			String color1[];  
			color1 = color.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}

		else if(steps.equals("13.0"))
		{
			String shout=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getCssValue("color");
			System.out.println(" Shout Color 13="+shout);
			String color1[];  
			color1 = shout.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("14.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getCssValue("color");
			System.out.println(" Shout Color 14="+talk);
			String color1[];  
			color1 = talk.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("15.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getCssValue("color");
			System.out.println(" Shout Color 15="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("16.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("color");
			System.out.println(" Shout Color 16="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("17.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getCssValue("color");
			System.out.println("Footer Shout heading Color 17="+talk);
			String color1[];  
			color1 = talk.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("18.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getCssValue("color");
			System.out.println("Footer Shout Heading Color 18="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("19.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getCssValue("color");
			System.out.println("Footer Shout Heading Color 19="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("20.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getCssValue("color");
			System.out.println("Footer Labels Color 20="+talk);
			String color1[];  
			color1 = talk.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("21.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getCssValue("color");
			System.out.println("Footer Labels Color 21="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("22.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getCssValue("color");
			System.out.println("Footer Labels Color 22="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("23.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getCssValue("color");
			System.out.println("Footer Labels Color 23="+talk);
			String color1[];  
			color1 = talk.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("24.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getCssValue("color");
			System.out.println("Footer Labels Color  24="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("25.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getCssValue("color");
			System.out.println("Footer Labels Color  25="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("26.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getCssValue("color");
			System.out.println("Footer Labels Color  26="+talk);
			String color1[];  
			color1 = talk.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("27.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getCssValue("color");
			System.out.println("Footer Labels Color  27="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("28.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getCssValue("color");
			System.out.println("Footer Labels Color 28="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("29.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getCssValue("color");
			System.out.println("Footer Labels Color  29="+talk);
			String color1[];  
			color1 = talk.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("30.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getCssValue("color");
			System.out.println("Footer Labels Color 30="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("31.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getCssValue("color");
			System.out.println("Footer Labels Color 31="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}

		else if(steps.equals("32.0"))
		{
			String talk=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getCssValue("color");
			System.out.println("Footer Labels Color  32="+talk);
			String color1[];  
			color1 = talk.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("33.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getCssValue("color");
			System.out.println("Footer Labels Color  33="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("34.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getCssValue("color");
			System.out.println("Footer Color 34="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("35.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getCssValue("color");
			System.out.println("Footer Color  32="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("36.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getCssValue("color");
			System.out.println("Footer Labels Color 33="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("37.0"))
		{
			String rem=driver.findElement(By.id(prop.getProperty("header"))).getCssValue("background-color");
			System.out.println("Header Background Color 37="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("38.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("regis_signuppanel"))).getCssValue("background-color");
			System.out.println("Sign up Panel Background Color 38="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();	
		}
		else if(steps.equals("39.0"))
		{
			String rem=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getCssValue("background-color");
			System.out.println("Sign up Button Background Color 39="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("40.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("regis_footerpanel"))).getCssValue("background-color");
			System.out.println("Sign up Footer Background Color 40="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("41.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getCssValue("background-color");
			System.out.println("Sign In Background Color 41="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("42.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_panel"))).getCssValue("background-color");
			System.out.println("Shout Panel Background Color 42="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("43.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("background-color");
			System.out.println("Shout Send Background Color 43="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("44.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("footer_final"))).getCssValue("background-color");
			System.out.println("Footer Final Panel Background Color 44="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("45.0"))
		{
			String rem=driver.findElement(By.id(prop.getProperty("name_signup"))).getCssValue("color");
			System.out.println("Text Entered in Name Box Color 45="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("46.0"))
		{
			String rem=driver.findElement(By.id(prop.getProperty("email_signup"))).getCssValue("color");
			System.out.println("Text Entered in Email Box Color 46="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("47.0"))
		{
			String rem=driver.findElement(By.id(prop.getProperty("pwd_signup"))).getCssValue("color");
			System.out.println("Text Entered in Pwd Box Color 47="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("48.0"))
		{
			String rem=driver.findElement(By.id(prop.getProperty("rpwd_signup"))).getCssValue("color");
			System.out.println("Text Entered in Rpwd Box Color 48="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("49.0"))
		{
			String rem=driver.findElement(By.id(prop.getProperty("explore_signup"))).getCssValue("color");
			System.out.println("Text Entered in Explore Box Color 49="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("50.0"))
		{
			String rem=driver.findElement(By.id(prop.getProperty("shout_des"))).getCssValue("color");
			System.out.println("Text Entered in Shout 1 Box Color 50="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("51.0"))
		{
			String rem=driver.findElement(By.id(prop.getProperty("shout_emai"))).getCssValue("color");
			System.out.println("Text Entered in Shout 2 Box Color 51="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else if(steps.equals("52.0"))
		{
			String rem=driver.findElement(By.xpath(prop.getProperty("shout_img"))).getCssValue("color");
			System.out.println("Img of Shout Color 52="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		
		else if(steps.equals("53.0"))
		{
			WebElement text_enter=driver.findElement(By.id(prop.getProperty("rpwd_signup")));
			text_enter.sendKeys("deepak");
			driver.findElement(By.xpath(prop.getProperty("pwd_rshow"))).click();
			String rem=text_enter.getCssValue("color");
			System.out.println("Text Entered in Rpwd Box Color 53="+rem);
			String color1[];  
			color1 = rem.replace("rgba(", "").split(",");       
			String hex = String.format("#%02x%02x%02x", Integer.parseInt(color1[0].trim()), Integer.parseInt(color1[1].trim()), Integer.parseInt(color1[2].trim()));  
			System.out.println("Convert rgb to hex : " + hex.toUpperCase());  
			Assert.assertEquals(hex, ecol, "Color Mismatch");
			driver.close();
		}
		else
		{
			System.out.println("No Steps to Check");
		}
	}

	// Test 7
	public void registration_fontcheck(String browser,String steps,String font,String weight,String size,String pos,String widh,String loc) throws IOException, InterruptedException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));

		if(steps.equals("0.0"))
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

		if(steps.equals("1.0"))
		{
			String text_family=driver.findElement(By.cssSelector(prop.getProperty("signup_text1"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.cssSelector(prop.getProperty("signup_text1"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.cssSelector(prop.getProperty("signup_text1"))).getCssValue("font-size");
			String text_position=driver.findElement(By.cssSelector(prop.getProperty("signup_text1"))).getCssValue("position");
			String text_loc=driver.findElement(By.cssSelector(prop.getProperty("signup_text1"))).getSize().toString();
			String text_coordinate=driver.findElement(By.cssSelector(prop.getProperty("signup_text1"))).getLocation().toString();

			System.out.println("Font Family 1 ="+text_family);
			System.out.println("Font Weight 1="+text_weight);
			System.out.println("Font Size 1="+text_size);
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
		if(steps.equals("2.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("name_label"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("name_label"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("name_label"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("name_label"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("name_label"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("name_label"))).getLocation().toString();

			System.out.println("Font Family 2 ="+text_family);
			System.out.println("Font Weight 2="+text_weight);
			System.out.println("Font Size 2="+text_size);
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
		if(steps.equals("3.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("email_label"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("email_label"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("email_label"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("email_label"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("email_label"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("email_label"))).getLocation().toString();

			System.out.println("Font Family 3 ="+text_family);
			System.out.println("Font Weight 3="+text_weight);
			System.out.println("Font Size 3="+text_size);
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
		if(steps.equals("4.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("pwd_label"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("pwd_label"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("pwd_label"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("pwd_label"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("pwd_label"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("pwd_label"))).getLocation().toString();

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
		if(steps.equals("5.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("rpwd_label"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("rpwd_label"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("rpwd_label"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("rpwd_label"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("rpwd_label"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("rpwd_label"))).getLocation().toString();

			System.out.println("Font Family 5 ="+text_family);
			System.out.println("Font Weight 5="+text_weight);
			System.out.println("Font Size 5="+text_size);
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
		if(steps.equals("6.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("exp_label"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("exp_label"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("exp_label"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("exp_label"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("exp_label"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("exp_label"))).getLocation().toString();

			System.out.println("Font Family 6 ="+text_family);
			System.out.println("Font Weight 6="+text_weight);
			System.out.println("Font Size 6="+text_size);
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
		if(steps.equals("7.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("pref_text1"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("pref_text1"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("pref_text1"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("pref_text1"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("pref_text1"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("pref_text1"))).getLocation().toString();

			System.out.println("Font Family 7 ="+text_family);
			System.out.println("Font Weight 7="+text_weight);
			System.out.println("Font Size 7="+text_size);
			System.out.println("Font Position 6="+text_position);
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
		if(steps.equals("8.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("pref_text2"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("pref_text2"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("pref_text2"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("pref_text2"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("pref_text2"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("pref_text2"))).getLocation().toString();

			System.out.println("Font Family 8="+text_family);
			System.out.println("Font Weight 8="+text_weight);
			System.out.println("Font Size 8="+text_size);
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
		if(steps.equals("9.0"))
		{
			String text_family=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getCssValue("font-size");
			String text_position=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getCssValue("position");
			String text_loc=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getSize().toString();
			String text_coordinate=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getLocation().toString();

			System.out.println("Font Family 9="+text_family);
			System.out.println("Font Weight 9="+text_weight);
			System.out.println("Font Size 9="+text_size);
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
		if(steps.equals("10.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("acc_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("acc_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("acc_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("acc_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("acc_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("acc_text"))).getLocation().toString();

			System.out.println("Font Family 10="+text_family);
			System.out.println("Font Weight 10="+text_weight);
			System.out.println("Font Size 10="+text_size);
			System.out.println("Font Position 10="+text_position);
			System.out.println("Font Location Width,Height 10="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 10="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		if(steps.equals("11.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("log_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("log_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("log_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("log_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("log_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("log_text"))).getLocation().toString();

			System.out.println("Font Family 11="+text_family);
			System.out.println("Font Weight 11="+text_weight);
			System.out.println("Font Size 11="+text_size);
			System.out.println("Font Position 11="+text_position);
			System.out.println("Font Location Width,Height 11="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 11="+text_coordinate);	
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		if(steps.equals("12.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getLocation().toString();

			System.out.println("Font Family 12="+text_family);
			System.out.println("Font Weight 12="+text_weight);
			System.out.println("Font Size 12="+text_size);
			System.out.println("Font Position 12="+text_position);
			System.out.println("Font Location Width,Height 12="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 12="+text_coordinate);	
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		if(steps.equals("13.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_text"))).getLocation().toString();

			System.out.println("Font Family 13="+text_family);
			System.out.println("Font Weight 13="+text_weight);
			System.out.println("Font Size 13="+text_size);
			System.out.println("Font Position 13="+text_position);
			System.out.println("Font Location Width,Height 13="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 13="+text_coordinate);	
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("14.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_label1"))).getLocation().toString();
			System.out.println("Font Family 14 ="+text_family);
			System.out.println("Font Weight 14="+text_weight);
			System.out.println("Font Size 14="+text_size);
			System.out.println("Font Position 14="+text_position);
			System.out.println("Font Location Width,Height 14="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 14="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("15.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_label2"))).getLocation().toString();
			System.out.println("Font Family 15 ="+text_family);
			System.out.println("Font Weight 15="+text_weight);
			System.out.println("Font Size 15="+text_size);
			System.out.println("Font Position 15="+text_position);
			System.out.println("Font Location Width,Height 15="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 15="+text_coordinate);	

			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			driver.close();
		}
		else if(steps.equals("16.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getLocation().toString();
			System.out.println("Font Family 16 ="+text_family);
			System.out.println("Font Weight 16="+text_weight);
			System.out.println("Font Size 16="+text_size);
			System.out.println("Font Position 16="+text_position);
			System.out.println("Font Location Width,Height 16="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 16="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("17.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_head1"))).getLocation().toString();
			System.out.println("Font Family 17 ="+text_family);
			System.out.println("Font Weight 17="+text_weight);
			System.out.println("Font Size 17="+text_size);
			System.out.println("Font Position 17="+text_position);
			System.out.println("Font Location Width,Height 17="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 17="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("18.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_head2"))).getLocation().toString();
			System.out.println("Font Family 18="+text_family);
			System.out.println("Font Weight 18="+text_weight);
			System.out.println("Font Size 18="+text_size);
			System.out.println("Font Position 18="+text_position);
			System.out.println("Font Location Width,Height 18="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 18="+text_coordinate);
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("19.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_head3"))).getLocation().toString();
			System.out.println("Font Family 19="+text_family);
			System.out.println("Font Weight 19="+text_weight);
			System.out.println("Font Size 19="+text_size);
			System.out.println("Font Position 19="+text_position);
			System.out.println("Font Location Width,Height 19="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 19="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("20.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label1"))).getLocation().toString();
			System.out.println("Font Family 20="+text_family);
			System.out.println("Font Weight 20="+text_weight);
			System.out.println("Font Size 20="+text_size);
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
		else if(steps.equals("21.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label2"))).getLocation().toString();
			System.out.println("Font Family 21="+text_family);
			System.out.println("Font Weight 21="+text_weight);
			System.out.println("Font Size 21="+text_size);
			System.out.println("Font Position 21="+text_position);
			System.out.println("Font Location Width,Height 21="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 21="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("22.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label3"))).getLocation().toString();
			System.out.println("Font Family 22="+text_family);
			System.out.println("Font Weight 22="+text_weight);
			System.out.println("Font Size 22="+text_size);
			System.out.println("Font Position 22="+text_position);
			System.out.println("Font Location Width,Height 22="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 22="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("23.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label4"))).getLocation().toString();
			System.out.println("Font Family 23="+text_family);
			System.out.println("Font Weight 23="+text_weight);
			System.out.println("Font Size 23="+text_size);
			System.out.println("Font Position 23="+text_position);
			System.out.println("Font Location Width,Height 23="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 23="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("24.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label5"))).getLocation().toString();
			System.out.println("Font Family 24 ="+text_family);
			System.out.println("Font Weight 24="+text_weight);
			System.out.println("Font Size 24="+text_size);
			System.out.println("Font Position 24="+text_position);
			System.out.println("Font Location Width,Height 24="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 24="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("25.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label6"))).getLocation().toString();
			System.out.println("Font Family 25="+text_family);
			System.out.println("Font Weight 25="+text_weight);
			System.out.println("Font Size 25="+text_size);
			System.out.println("Font Position 25="+text_position);
			System.out.println("Font Location Width,Height 25="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 25="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("26.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label7"))).getLocation().toString();
			System.out.println("Font Family 26="+text_family);
			System.out.println("Font Weight 26="+text_weight);
			System.out.println("Font Size 26="+text_size);
			System.out.println("Font Position 26="+text_position);
			System.out.println("Font Location Width,Height 26="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 26="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("27.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label8"))).getLocation().toString();
			System.out.println("Font Family 27="+text_family);
			System.out.println("Font Weight 27="+text_weight);
			System.out.println("Font Size 27="+text_size);
			System.out.println("Font Position 27="+text_position);
			System.out.println("Font Location Width,Height 27="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 27="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("28.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label9"))).getLocation().toString();
			System.out.println("Font Family 28="+text_family);
			System.out.println("Font Weight 28="+text_weight);
			System.out.println("Font Size 28="+text_size);
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
		else if(steps.equals("29.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label10"))).getLocation().toString();
			System.out.println("Font Family 29 ="+text_family);
			System.out.println("Font Weight 29="+text_weight);
			System.out.println("Font Size 29="+text_size);
			System.out.println("Font Position 29="+text_position);
			System.out.println("Font Location Width,Height 29="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 29="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("30.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label11"))).getLocation().toString();
			System.out.println("Font Family 30 ="+text_family);
			System.out.println("Font Weight 30="+text_weight);
			System.out.println("Font Size 30="+text_size);
			System.out.println("Font Position 30="+text_position);
			System.out.println("Font Location Width,Height 30="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 30="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("31.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label12"))).getLocation().toString();
			System.out.println("Font Family 31="+text_family);
			System.out.println("Font Weight 31="+text_weight);
			System.out.println("Font Size 31="+text_size);
			System.out.println("Font Position 31="+text_position);
			System.out.println("Font Location Width,Height 31="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 31="+text_coordinate);	
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}

		else if(steps.equals("32.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label13"))).getLocation().toString();
			System.out.println("Font Family 32="+text_family);
			System.out.println("Font Weight 32="+text_weight);
			System.out.println("Font Size 32="+text_size);
			System.out.println("Font Position 32="+text_position);
			System.out.println("Font Location Width,Height 32="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 32="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("33.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_label14"))).getLocation().toString();
			System.out.println("Font Family 33="+text_family);
			System.out.println("Font Weight 33="+text_weight);
			System.out.println("Font Size 33="+text_size);
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
		else if(steps.equals("34.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_copy"))).getLocation().toString();
			System.out.println("Font Family 34="+text_family);
			System.out.println("Font Weight 34="+text_weight);
			System.out.println("Font Size 34="+text_size);
			System.out.println("Font Position 34="+text_position);
			System.out.println("Font Location Width,Height 34="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 34="+text_coordinate);	
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("35.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_serv"))).getLocation().toString();

			System.out.println("Font Family 35="+text_family);
			System.out.println("Font Weight 35="+text_weight);
			System.out.println("Font Size 35="+text_size);
			System.out.println("Font Position 35="+text_position);
			System.out.println("Font Location Width,Height 35="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 35="+text_coordinate);	
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("36.0"))
		{
			String text_family=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getCssValue("font-size");
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_pri"))).getLocation().toString();
			System.out.println("Font Family 36="+text_family);
			System.out.println("Font Weight 36="+text_weight);
			System.out.println("Font Size 36="+text_size);
			System.out.println("Font Position 36="+text_position);
			System.out.println("Font Location Width,Height 36="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 36="+text_coordinate);	
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("37.0"))
		{
			String text_loc=driver.findElement(By.id(prop.getProperty("header"))).getSize().toString();
			String text_coordinate=driver.findElement(By.id(prop.getProperty("header"))).getLocation().toString();

			System.out.println("header Location Width,Height 37="+text_loc);		
			System.out.println("header Coordinate X-axis,Y-axis 37="+text_coordinate);	
			
		
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("38.0"))
		{
			String text_loc=driver.findElement(By.xpath(prop.getProperty("header_img"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("header_img"))).getLocation().toString();			
			System.out.println("header img Location Width,Height 38="+text_loc);		
			System.out.println("header img Coordinate X-axis,Y-axis 38="+text_coordinate);	
			
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("39.0"))
		{
			String text_loc=driver.findElement(By.xpath(prop.getProperty("regis_signuppanel"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("regis_signuppanel"))).getLocation().toString();			
			System.out.println("SignUp Panel Location Width,Height 39="+text_loc);		
			System.out.println("SignUp Panel Coordinate X-axis,Y-axis 39="+text_coordinate);	
			
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("40.0"))
		{
			String text_loc=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getSize().toString();
			String text_coordinate=driver.findElement(By.cssSelector(prop.getProperty("signup"))).getLocation().toString();			
			System.out.println("SignUp Button Location Width,Height 40="+text_loc);		
			System.out.println("SignUp Button Coordinate X-axis,Y-axis 40="+text_coordinate);	
			
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("41.0"))
		{
			String text_loc=driver.findElement(By.xpath(prop.getProperty("regis_footerpanel"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("regis_footerpanel"))).getLocation().toString();			
			System.out.println("Footer Panel Location Width,Height 41="+text_loc);		
			System.out.println("Footer Panel Coordinate X-axis,Y-axis 41="+text_coordinate);	

			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			driver.close();
		}
		else if(steps.equals("42.0"))
		{
			String text_loc=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("signin_text"))).getLocation().toString();			
			System.out.println("Sign In Button Location Width,Height 42="+text_loc);		
			System.out.println("Sign In Button Coordinate X-axis,Y-axis 42="+text_coordinate);	
			
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("43.0"))
		{		
			String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_panel"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_panel"))).getLocation().toString();
			String text_position=driver.findElement(By.xpath(prop.getProperty("shout_panel"))).getCssValue("position");
			System.out.println("Font Location Width,Height 43="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 43="+text_coordinate);	
			System.out.println("Font Position 43="+text_position);		
			
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("44.0"))
		{
			
			String text_position=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getCssValue("position");
			String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_send"))).getLocation().toString();
			
			System.out.println("Font Position 44="+text_position);
			System.out.println("Font Location Width,Height 44="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 44="+text_coordinate);
			
			
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("45.0"))
		{		
			String text_loc=driver.findElement(By.xpath(prop.getProperty("footer_final"))).getSize().toString();
			String text_coordinate=driver.findElement(By.xpath(prop.getProperty("footer_final"))).getLocation().toString();
			String text_position=driver.findElement(By.xpath(prop.getProperty("footer_final"))).getCssValue("position");
			System.out.println("Font Location Width,Height 45="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 45="+text_coordinate);	
			System.out.println("Font Position 45="+text_position);		

		
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
			driver.close();
		}
		else if(steps.equals("46.0"))
		{
			String text_family=driver.findElement(By.id(prop.getProperty("name_signup"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.id(prop.getProperty("name_signup"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.id(prop.getProperty("name_signup"))).getCssValue("font-size");
			String text_position=driver.findElement(By.id(prop.getProperty("name_signup"))).getCssValue("position");
			String text_loc=driver.findElement(By.id(prop.getProperty("name_signup"))).getSize().toString();
			String text_coordinate=driver.findElement(By.id(prop.getProperty("name_signup"))).getLocation().toString();
			System.out.println("Font Family 46="+text_family);
			System.out.println("Font Weight 46="+text_weight);
			System.out.println("Font Size 46="+text_size);
			System.out.println("Font Position 46="+text_position);
			System.out.println("Font Location Width,Height 46="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 46="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("47.0"))
		{
			String text_family=driver.findElement(By.id(prop.getProperty("email_signup"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.id(prop.getProperty("email_signup"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.id(prop.getProperty("email_signup"))).getCssValue("font-size");
			String text_position=driver.findElement(By.id(prop.getProperty("email_signup"))).getCssValue("position");
			String text_loc=driver.findElement(By.id(prop.getProperty("email_signup"))).getSize().toString();
			String text_coordinate=driver.findElement(By.id(prop.getProperty("email_signup"))).getLocation().toString();
			System.out.println("Font Family 47="+text_family);
			System.out.println("Font Weight 47="+text_weight);
			System.out.println("Font Size 47="+text_size);
			System.out.println("Font Position 47="+text_position);
			System.out.println("Font Location Width,Height 47="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 47="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("48.0"))
		{
			String text_family=driver.findElement(By.id(prop.getProperty("pwd_signup"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.id(prop.getProperty("pwd_signup"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.id(prop.getProperty("pwd_signup"))).getCssValue("font-size");
			String text_position=driver.findElement(By.id(prop.getProperty("pwd_signup"))).getCssValue("position");
			String text_loc=driver.findElement(By.id(prop.getProperty("pwd_signup"))).getSize().toString();
			String text_coordinate=driver.findElement(By.id(prop.getProperty("pwd_signup"))).getLocation().toString();
			System.out.println("Font Family 48="+text_family);
			System.out.println("Font Weight 48="+text_weight);
			System.out.println("Font Size 48="+text_size);
			System.out.println("Font Position 48="+text_position);
			System.out.println("Font Location Width,Height 48="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 48="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("49.0"))
		{
			String text_family=driver.findElement(By.id(prop.getProperty("rpwd_signup"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.id(prop.getProperty("rpwd_signup"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.id(prop.getProperty("rpwd_signup"))).getCssValue("font-size");
			String text_position=driver.findElement(By.id(prop.getProperty("rpwd_signup"))).getCssValue("position");
			String text_loc=driver.findElement(By.id(prop.getProperty("rpwd_signup"))).getSize().toString();
			String text_coordinate=driver.findElement(By.id(prop.getProperty("rpwd_signup"))).getLocation().toString();
			System.out.println("Font Family 49="+text_family);
			System.out.println("Font Weight 49="+text_weight);
			System.out.println("Font Size 49="+text_size);
			System.out.println("Font Position 49="+text_position);
			System.out.println("Font Location Width,Height 49="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 49="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("50.0"))
		{
			String text_family=driver.findElement(By.id(prop.getProperty("explore_signup"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.id(prop.getProperty("explore_signup"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.id(prop.getProperty("explore_signup"))).getCssValue("font-size");
			String text_position=driver.findElement(By.id(prop.getProperty("explore_signup"))).getCssValue("position");
			String text_loc=driver.findElement(By.id(prop.getProperty("explore_signup"))).getSize().toString();
			String text_coordinate=driver.findElement(By.id(prop.getProperty("explore_signup"))).getLocation().toString();
			System.out.println("Font Family 50="+text_family);
			System.out.println("Font Weight 50="+text_weight);
			System.out.println("Font Size 50="+text_size);
			System.out.println("Font Position 50="+text_position);
			System.out.println("Font Location Width,Height 50="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 50="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("51.0"))
		{

			String text_family=driver.findElement(By.id(prop.getProperty("shout_des"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.id(prop.getProperty("shout_des"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.id(prop.getProperty("shout_des"))).getCssValue("font-size");
			String text_position=driver.findElement(By.id(prop.getProperty("shout_des"))).getCssValue("position");
			String text_loc=driver.findElement(By.id(prop.getProperty("shout_des"))).getSize().toString();
			String text_coordinate=driver.findElement(By.id(prop.getProperty("shout_des"))).getLocation().toString();


			System.out.println("Font Family 51="+text_family);
			System.out.println("Font Weight 51="+text_weight);
			System.out.println("Font Size 51="+text_size);
			System.out.println("Font Position 51="+text_position);
			System.out.println("Font Location Width,Height 51="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 51="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("52.0"))
		{
			String text_family=driver.findElement(By.id(prop.getProperty("shout_emai"))).getCssValue("font-family");
			String text_weight=driver.findElement(By.id(prop.getProperty("shout_emai"))).getCssValue("font-weight");
			String text_size=driver.findElement(By.id(prop.getProperty("shout_emai"))).getCssValue("font-size");
			String text_position=driver.findElement(By.id(prop.getProperty("shout_emai"))).getCssValue("position");
			String text_loc=driver.findElement(By.id(prop.getProperty("shout_emai"))).getSize().toString();
			String text_coordinate=driver.findElement(By.id(prop.getProperty("shout_emai"))).getLocation().toString();

			System.out.println("Font Family 52="+text_family);
			System.out.println("Font Weight 52="+text_weight);
			System.out.println("Font Size 52="+text_size);
			System.out.println("Font Position 52="+text_position);
			System.out.println("Font Location Width,Height 52="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 52="+text_coordinate);	

			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		}
		else if(steps.equals("53.0"))
		{
			WebElement xt_enter=driver.findElement(By.id(prop.getProperty("rpwd_signup")));
			xt_enter.sendKeys("deepak");
			driver.findElement(By.xpath(prop.getProperty("pwd_rshow"))).click();
			
			String text_family= xt_enter.getCssValue("font-family");
			String text_weight=xt_enter.getCssValue("font-weight");
			String text_size=xt_enter.getCssValue("font-size");
			String text_position=xt_enter.getCssValue("position");
			String text_loc=xt_enter.getSize().toString();
			String text_coordinate=xt_enter.getLocation().toString();
			
			System.out.println("Font Family 53="+text_family);
			System.out.println("Font Weight 53="+text_weight);
			System.out.println("Font Size 53="+text_size);
			System.out.println("Font Position 53="+text_position);
			System.out.println("Font Location Width,Height 53="+text_loc);		
			System.out.println("Font Coordinate X-axis,Y-axis 53="+text_coordinate);
			
			Assert.assertEquals(text_family,font,"Font-Family Mismatch");
			Assert.assertEquals(text_weight+".0",weight,"Font-Weight Mismatch");
			Assert.assertEquals(text_size,size,"Font-Size Mismatch");
			Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
			Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
			Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");

			driver.close();
		}
		else if(steps.equals("54.0"))
		{		
    	String text_loc=driver.findElement(By.xpath(prop.getProperty("shout_img"))).getSize().toString();
    	String text_coordinate=driver.findElement(By.xpath(prop.getProperty("shout_img"))).getLocation().toString();
		String text_position=driver.findElement(By.xpath(prop.getProperty("shout_img"))).getCssValue("position");
		System.out.println("Font Location Width,Height 54="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 54="+text_coordinate);	
		System.out.println("Font Position 54="+text_position);

		Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		
		 driver.close();
	}
		else if(steps.equals("55.0"))
		{		
    	String text_loc=driver.findElement(By.xpath(prop.getProperty("bottom_img"))).getSize().toString();
	    String text_coordinate=driver.findElement(By.xpath(prop.getProperty("bottom_img"))).getLocation().toString();
		String text_position=driver.findElement(By.xpath(prop.getProperty("bottom_img"))).getCssValue("position");
		System.out.println("Font Location Width,Height 55="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 55="+text_coordinate);	
		System.out.println("Font Position 55="+text_position);
		
		Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
	
		 driver.close();
	}
		else if(steps.equals("56.0"))
		{		
    	String text_loc=driver.findElement(By.xpath(prop.getProperty("pwd_rshow"))).getSize().toString();
		String text_coordinate=driver.findElement(By.xpath(prop.getProperty("pwd_rshow"))).getLocation().toString();
		String text_position=driver.findElement(By.xpath(prop.getProperty("pwd_rshow"))).getCssValue("position");
		System.out.println("Font Location Width,Height 56="+text_loc);		
		System.out.println("Font Coordinate X-axis,Y-axis 56="+text_coordinate);	
		System.out.println("Font Position 56="+text_position);
		
		Assert.assertEquals(text_position,pos,"Font-Position Mismatch");
		Assert.assertEquals(text_loc, widh, "Widt,Height Mismatch");
		Assert.assertEquals(text_coordinate, loc, "X,Y Co-ordinate Mismatch");
		
		 driver.close();
	}


	}}
