package SPRINT1_Registration;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import Lib.Resources;

public class Signup_Preference extends Resources {

	ArrayList<String> list = new ArrayList<String>();
	static WebDriver  driver;
	Properties prop;

	public void valid_Signup_Preference(String browser,String name1,String email,String pwd,String rpwd,String explore,String prof,String phno,String loc1,String intrest,String screen1,String screen2) throws Exception
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));
		Thread.sleep(1000);

		Robot robot=new Robot();


		WebElement username=driver.findElement(By.id(prop.getProperty("name_signup")));

		username.sendKeys(name1);

		String name_val=username.getAttribute("value");

		Assert.assertEquals(name_val, name1, "Name Mismatch Error");


		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

		email_user.sendKeys(email);

		String email_val=email_user.getAttribute("value");

		Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

		WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

		pwd_user.sendKeys(pwd);

		String pwd_val=pwd_user.getAttribute("value");

		Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

		WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

		rpwd_user.sendKeys(rpwd);

		String rpwd_val=rpwd_user.getAttribute("value");

		Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

		WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

		explore_user.sendKeys(explore);

		String exp_val=explore_user.getAttribute("value");

		Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


		WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

		link_preference.click();		
		Thread.sleep(1000);

		WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
		Thread.sleep(1000);		

		skip_preference.click();

		link_preference.click();

		Thread.sleep(1000);

		WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

		profession_user.sendKeys(prof);

		String prof_val=profession_user.getAttribute("value");

		Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

		Thread.sleep(1000);


		WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

		phone_user.sendKeys(phno);
		String pho_val=phone_user.getAttribute("value");

		Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

		Thread.sleep(2000);

		WebElement loc=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc.sendKeys(loc1);

		String loc_val=loc.getAttribute("value");

		Assert.assertEquals(loc_val, loc1, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc.sendKeys(Keys.DOWN,Keys.ENTER);


		Thread.sleep(2000);

		String city=driver.findElement(By.xpath(".//*[@id='span-items']/span[1]")).getText();
		System.out.println("City is="+city);

		String country=driver.findElement(By.xpath(".//*[@id='span-items']/span[2]")).getText();
		System.out.println("Country is="+country);

		Thread.sleep(2000);

		WebElement intresty=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty.sendKeys(intrest.toLowerCase());

		String int_val=intresty.getAttribute("value");

		Assert.assertEquals(int_val, intrest.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_DOWN);

		robot.keyRelease(KeyEvent.VK_DOWN);	


		WebElement interest_click=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click.click();

		Thread.sleep(1000);		

		screen_shots(screen1);

		WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
		signup_click.click();

		Thread.sleep(2000);

		screen_shots(screen2);
		Thread.sleep(1000);
		driver.close();

	}

	// Test 2

	public void preference_location(String browser,String name,String email,String pwd,String rpwd,String explore,String loc1,String loc2,String loc3,String loc4,String loc5,String loc6,
			String loc7,String loc8,String loc9,String loc10,String loc11,String loc12,String loc13,String loc14,String loc15,String loc16,String loc17) throws Exception
	{

		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));
		Thread.sleep(1000);
		//Loc 1

		WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

		user_name.sendKeys(name);

		String name_val=user_name.getAttribute("value");

		Assert.assertEquals(name_val, name, "Name Mismatch Error");


		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

		email_user.sendKeys(email);

		String email_val=email_user.getAttribute("value");

		Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

		WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

		pwd_user.sendKeys(pwd);

		String pwd_val=pwd_user.getAttribute("value");

		Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

		WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

		rpwd_user.sendKeys(rpwd);

		String rpwd_val=rpwd_user.getAttribute("value");

		Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

		WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

		explore_user.sendKeys(explore);

		String exp_val=explore_user.getAttribute("value");

		Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


		WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

		link_preference.click();		
		Thread.sleep(1000);

		WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
		Thread.sleep(1000);		

		skip_preference.click();

		link_preference.click();

		Thread.sleep(1000);

		WebElement loc_1=driver.findElement(By.xpath(prop.getProperty("location_interest")));

		loc_1.sendKeys(loc1);

		String loc_val1=loc_1.getAttribute("value");

		Assert.assertEquals(loc_val1, loc1, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

		Thread.sleep(1000);


		WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add1.click();

		Thread.sleep(1000);



		// loc 2

		WebElement loc_2=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_2.sendKeys(loc2);

		String loc_val2=loc_2.getAttribute("value");

		Assert.assertEquals(loc_val2, loc2, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_2.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add2=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add2.click();
		Thread.sleep(2000);
		// loc 3

		WebElement loc_3=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_3.sendKeys(loc3);

		String loc_val3=loc_3.getAttribute("value");

		Assert.assertEquals(loc_val3, loc3, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_3.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add3=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add3.click();

		Thread.sleep(2000);
		// loc 4

		WebElement loc_4=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_4.sendKeys(loc4);

		String loc_val4=loc_4.getAttribute("value");

		Assert.assertEquals(loc_val4, loc4, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_4.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add4=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add4.click();
		Thread.sleep(2000);
		// loc 5


		WebElement loc_5=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_5.sendKeys(loc5);

		String loc_val5=loc_5.getAttribute("value");

		Assert.assertEquals(loc_val5, loc5, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_5.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add5=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add5.click();
		Thread.sleep(2000);
		// loc 6


		WebElement loc_6=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_6.sendKeys(loc6);

		String loc_val6=loc_6.getAttribute("value");

		Assert.assertEquals(loc_val6, loc6, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_2.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add6=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add6.click();
		Thread.sleep(2000);
		// loc 7


		WebElement loc_7=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_7.sendKeys(loc7);

		String loc_val7=loc_7.getAttribute("value");

		Assert.assertEquals(loc_val7, loc7, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_7.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add7=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add7.click();
		Thread.sleep(2000);
		// loc 8


		WebElement loc_8=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_8.sendKeys(loc8);

		String loc_val8=loc_8.getAttribute("value");

		Assert.assertEquals(loc_val8, loc8, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_8.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add8=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add8.click();
		Thread.sleep(2000);
		// loc 9

		WebElement loc_9=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_9.sendKeys(loc9);

		String loc_val9=loc_9.getAttribute("value");

		Assert.assertEquals(loc_val9, loc9, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_9.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add9=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add9.click();
		Thread.sleep(2000);
		// loc 10

		WebElement loc_10=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_10.sendKeys(loc10);

		String loc_val10=loc_10.getAttribute("value");

		Assert.assertEquals(loc_val10, loc10, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_10.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add10=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add10.click();
		Thread.sleep(2000);
		// loc 11


		WebElement loc_11=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_11.sendKeys(loc11);

		String loc_val11=loc_11.getAttribute("value");

		Assert.assertEquals(loc_val11, loc11, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_11.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add11=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add11.click();
		Thread.sleep(2000);
		// loc 12


		WebElement loc_12=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_12.sendKeys(loc12);

		String loc_val12=loc_12.getAttribute("value");

		Assert.assertEquals(loc_val12, loc12, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_2.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add12=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add12.click();
		Thread.sleep(2000);
		// loc 13


		WebElement loc_13=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_13.sendKeys(loc13);

		String loc_val13=loc_13.getAttribute("value");

		Assert.assertEquals(loc_val13, loc13, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_13.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add13=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add13.click();
		Thread.sleep(2000);
		// loc 14


		WebElement loc_14=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_14.sendKeys(loc14);

		String loc_val14=loc_14.getAttribute("value");

		Assert.assertEquals(loc_val14, loc14, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_14.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add14=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add14.click();
		Thread.sleep(2000);
		// loc 15 


		WebElement loc_15=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_15.sendKeys(loc15);

		String loc_val15=loc_15.getAttribute("value");

		Assert.assertEquals(loc_val15, loc15, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_15.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add15=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add15.click();
		Thread.sleep(2000);
		// loc 16


		WebElement loc_16=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_16.sendKeys(loc16);

		String loc_val16=loc_16.getAttribute("value");

		Assert.assertEquals(loc_val16, loc16, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_16.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add16=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add16.click();
		Thread.sleep(2000);
		// loc 17


		WebElement loc_17=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_17.sendKeys(loc17);

		String loc_val17=loc_17.getAttribute("value");

		Assert.assertEquals(loc_val17, loc17, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_17.sendKeys(Keys.DOWN,Keys.ENTER);

		WebElement loc_add17=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add17.click();
		Thread.sleep(2000);

		for(int y=1;y<=18;y++)
		{
			String actual=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span["+y+"]")).getText();

			list.add(actual);				
		}
		Set<String> uniqueSet = new HashSet<String>(list);
		for (String temp : uniqueSet)
		{
			System.out.println(temp + ": " + Collections.frequency(list, temp));
		}

		System.out.println(list.size());
		for(String name1:list)
		{
			System.out.println("Add city is="+ name1);

		}
		WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
		signup_click.click();
	}	
	// Test 3

	public void preference_location(String browser,String name,String email,String pwd,String rpwd,String explore,String tag1,String tag2,String tag3,String tag4,String tag5,String tag6,
			String tag7,String tag8,String tag9,String tag10,String tag11,String tag12,String tag13,String tag14,String tag15,String tag16,String tag17,String tag18,String tag19,String tag20,String tag21,
			String tag22,String tag23,String tag24,String tag25,String tag26,String tag27,String tag28,String tag29,String tag30,String tag31,String tag32,String tag33) throws Exception
	{
		Robot robot=new Robot();


		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));
		Thread.sleep(1000);
		//Tag 1

		WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

		user_name.sendKeys(name);

		String name_val=user_name.getAttribute("value");

		Assert.assertEquals(name_val, name, "Name Mismatch Error");


		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

		email_user.sendKeys(email);

		String email_val=email_user.getAttribute("value");

		Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

		WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

		pwd_user.sendKeys(pwd);

		String pwd_val=pwd_user.getAttribute("value");

		Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

		WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

		rpwd_user.sendKeys(rpwd);

		String rpwd_val=rpwd_user.getAttribute("value");

		Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

		WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

		explore_user.sendKeys(explore);

		String exp_val=explore_user.getAttribute("value");

		Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


		WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

		link_preference.click();		
		Thread.sleep(1000);

		WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
		Thread.sleep(1000);		

		skip_preference.click();

		link_preference.click();

		Thread.sleep(1000);

		WebElement intresty=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty.sendKeys(tag1.toLowerCase());

		String int_val=intresty.getAttribute("value");

		Assert.assertEquals(int_val, tag1.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click.click();

		Thread.sleep(1000);		
		// Tag2 

		WebElement intresty2=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty2.sendKeys(tag2.toLowerCase());

		String int_val2=intresty2.getAttribute("value");

		Assert.assertEquals(int_val2, tag2.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click2=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click2.click();

		Thread.sleep(1000);	

		// Tag3

		WebElement intresty3=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty3.sendKeys(tag3.toLowerCase());

		String int_val3=intresty3.getAttribute("value");

		Assert.assertEquals(int_val3, tag3.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click3=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click3.click();

		Thread.sleep(1000);	
		// Tag4

		WebElement intresty4=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty4.sendKeys(tag4.toLowerCase());

		String int_val4=intresty4.getAttribute("value");

		Assert.assertEquals(int_val4, tag4.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click4=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click4.click();

		Thread.sleep(1000);	

		// Tag5

		WebElement intresty5=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty5.sendKeys(tag5.toLowerCase());

		String int_val5=intresty5.getAttribute("value");

		Assert.assertEquals(int_val5, tag5.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click5=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click5.click();

		Thread.sleep(1000);	
		// Tag6 

		WebElement intresty6=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty6.sendKeys(tag6.toLowerCase());

		String int_val6=intresty6.getAttribute("value");

		Assert.assertEquals(int_val6, tag6.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click6=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click6.click();

		Thread.sleep(1000);	
		// Tag 7 

		WebElement intresty7=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty7.sendKeys(tag7.toLowerCase());

		String int_val7=intresty7.getAttribute("value");

		Assert.assertEquals(int_val7, tag7.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click7=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click7.click();

		Thread.sleep(1000);	

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Tag8 

		WebElement intresty8=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty8.sendKeys(tag8.toLowerCase());

		String int_val8=intresty8.getAttribute("value");

		Assert.assertEquals(int_val8, tag8.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click8=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click8.click();

		Thread.sleep(1000);
		// Tag9 

		WebElement intresty9=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty9.sendKeys(tag9.toLowerCase());

		String int_val9=intresty9.getAttribute("value");

		Assert.assertEquals(int_val9, tag9.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click9=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click9.click();

		Thread.sleep(1000);	
		// Tag10 

		WebElement intresty10=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty10.sendKeys(tag10.toLowerCase());

		String int_val10=intresty10.getAttribute("value");

		Assert.assertEquals(int_val10, tag10.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click10=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click10.click();

		Thread.sleep(1000);
		// Tag11

		WebElement intresty11=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty11.sendKeys(tag11.toLowerCase());

		String int_val11=intresty11.getAttribute("value");

		Assert.assertEquals(int_val11, tag11.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click11=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click11.click();

		Thread.sleep(1000);	

		// Tag12

		WebElement intresty12=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty11.sendKeys(tag12.toLowerCase());

		String int_val12=intresty12.getAttribute("value");

		Assert.assertEquals(int_val12, tag12.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click12=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click12.click();

		Thread.sleep(1000);	
		// Tag13

		WebElement intresty13=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty13.sendKeys(tag13.toLowerCase());

		String int_val13=intresty13.getAttribute("value");

		Assert.assertEquals(int_val13, tag13.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click13=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click13.click();

		Thread.sleep(1000);	
		// Tag14

		WebElement intresty14=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty14.sendKeys(tag14.toLowerCase());

		String int_val14=intresty14.getAttribute("value");

		Assert.assertEquals(int_val14, tag14.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click14=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click14.click();

		Thread.sleep(1000);	
		// Tag15

		WebElement intresty15=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty15.sendKeys(tag15.toLowerCase());

		String int_val15=intresty15.getAttribute("value");

		Assert.assertEquals(int_val15, tag15.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click15=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click15.click();

		Thread.sleep(1000);	

		// Tag16

		WebElement intresty16=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty16.sendKeys(tag16.toLowerCase());

		String int_val16=intresty16.getAttribute("value");

		Assert.assertEquals(int_val16, tag16.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click16=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click16.click();

		Thread.sleep(1000);	

		// Tag17

		WebElement intresty17=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty17.sendKeys(tag17.toLowerCase());

		String int_val17=intresty17.getAttribute("value");

		Assert.assertEquals(int_val17, tag17.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click17=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click17.click();

		Thread.sleep(1000);	
		// Tag18

		WebElement intresty18=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty18.sendKeys(tag18.toLowerCase());

		String int_val18=intresty18.getAttribute("value");

		Assert.assertEquals(int_val18, tag18.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click18=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click18.click();

		Thread.sleep(1000);	
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Tag19

		WebElement intresty19=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty19.sendKeys(tag19.toLowerCase());

		String int_val19=intresty19.getAttribute("value");

		Assert.assertEquals(int_val19, tag19.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click19=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click19.click();

		Thread.sleep(1000);	
		// Tag20

		WebElement intresty20=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty20.sendKeys(tag20.toLowerCase());

		String int_val20=intresty20.getAttribute("value");

		Assert.assertEquals(int_val20, tag20.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click20=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click20.click();

		Thread.sleep(1000);	
		// Tag21

		WebElement intresty21=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty21.sendKeys(tag21.toLowerCase());

		String int_val21=intresty21.getAttribute("value");

		Assert.assertEquals(int_val21, tag21.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click21=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click21.click();

		Thread.sleep(1000);	
		// Tag22

		WebElement intresty22=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty22.sendKeys(tag22.toLowerCase());

		String int_val22=intresty22.getAttribute("value");

		Assert.assertEquals(int_val22, tag22.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click22=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click22.click();

		Thread.sleep(1000);	
		// Tag23

		WebElement intresty23=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty23.sendKeys(tag23.toLowerCase());

		String int_val23=intresty23.getAttribute("value");

		Assert.assertEquals(int_val23, tag23.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click23=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click23.click();

		Thread.sleep(1000);	
		// Tag24

		WebElement intresty24=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty24.sendKeys(tag24.toLowerCase());

		String int_val24=intresty24.getAttribute("value");

		Assert.assertEquals(int_val24, tag24.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click24=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click24.click();

		Thread.sleep(1000);	
		// Tag25

		WebElement intresty25=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty25.sendKeys(tag25.toLowerCase());

		String int_val25=intresty25.getAttribute("value");

		Assert.assertEquals(int_val25, tag25.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click25=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click25.click();

		Thread.sleep(1000);	
		// Tag26

		WebElement intresty26=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty26.sendKeys(tag26.toLowerCase());

		String int_val26=intresty26.getAttribute("value");

		Assert.assertEquals(int_val26, tag26.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click26=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click26.click();

		Thread.sleep(1000);	
		// Tag27

		WebElement intresty27=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty27.sendKeys(tag27.toLowerCase());

		String int_val27=intresty27.getAttribute("value");

		Assert.assertEquals(int_val27, tag27.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click27=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click27.click();

		Thread.sleep(1000);	
		// Tag28

		WebElement intresty28=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty28.sendKeys(tag28.toLowerCase());

		String int_val28=intresty28.getAttribute("value");

		Assert.assertEquals(int_val28, tag28.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click28=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click28.click();

		Thread.sleep(1000);	
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		// Tag29

		WebElement intresty29=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty29.sendKeys(tag29.toLowerCase());

		String int_val29=intresty29.getAttribute("value");

		Assert.assertEquals(int_val29, tag29.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click29=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click29.click();

		Thread.sleep(1000);	
		// Tag30

		WebElement intresty30=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty30.sendKeys(tag30.toLowerCase());

		String int_val30=intresty30.getAttribute("value");

		Assert.assertEquals(int_val30, tag30.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click30=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click30.click();

		Thread.sleep(1000);	
		// Tag31

		WebElement intresty31=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty31.sendKeys(tag31.toLowerCase());

		String int_val31=intresty31.getAttribute("value");

		Assert.assertEquals(int_val31, tag31.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click31=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click31.click();

		Thread.sleep(1000);	
		// Tag32

		WebElement intresty32=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty32.sendKeys(tag32.toLowerCase());

		String int_val32=intresty32.getAttribute("value");

		Assert.assertEquals(int_val32, tag32.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click32=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click32.click();

		Thread.sleep(1000);	
		// Tag33

		WebElement intresty33=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

		intresty33.sendKeys(tag33.toLowerCase());

		String int_val33=intresty33.getAttribute("value");

		Assert.assertEquals(int_val33, tag33.toLowerCase(), "Explore Mismatch Error");

		Thread.sleep(1000);

		WebElement interest_click33=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
		interest_click33.click();

		//	Thread.sleep(1000);	

		Thread.sleep(2000);



		WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
		signup_click.click();	
	}

	public void preferencelocation_repeat(String browser,String name,String email,String pwd,String rpwd,String explore,String loc1,String loc2,String loc3,String loc4,String text1,String text2,String text3) throws IOException, InterruptedException
	{


		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));
		Thread.sleep(1000);
		//Loc 1

		WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

		user_name.sendKeys(name);

		String name_val=user_name.getAttribute("value");

		Assert.assertEquals(name_val, name, "Name Mismatch Error");


		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

		email_user.sendKeys(email);

		String email_val=email_user.getAttribute("value");

		Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

		WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

		pwd_user.sendKeys(pwd);

		String pwd_val=pwd_user.getAttribute("value");

		Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

		WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

		rpwd_user.sendKeys(rpwd);

		String rpwd_val=rpwd_user.getAttribute("value");

		Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

		WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

		explore_user.sendKeys(explore);

		String exp_val=explore_user.getAttribute("value");

		Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


		WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

		link_preference.click();		
		Thread.sleep(1000);

		WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
		Thread.sleep(1000);		

		skip_preference.click();

		link_preference.click();

		Thread.sleep(1000);

		WebElement loc_1=driver.findElement(By.xpath(prop.getProperty("location_interest")));

		loc_1.sendKeys(loc1);

		String loc_val1=loc_1.getAttribute("value");

		Assert.assertEquals(loc_val1, loc1, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_1.sendKeys(Keys.DOWN,Keys.ENTER);


		Thread.sleep(1000);

		String city=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[1]")).getText();
		Assert.assertEquals(city, text1.toUpperCase(), "City Mismatch");

		String country=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[2]")).getText();
		Assert.assertEquals(country, text2.toUpperCase(), "Country Mismatch");

		WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add1.click();

		// loc 2

		WebElement loc_2=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_2.sendKeys(loc2);

		String loc_val2=loc_2.getAttribute("value");

		Assert.assertEquals(loc_val2, loc2, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_2.sendKeys(Keys.DOWN,Keys.ENTER);

		Thread.sleep(2000);
		String city1=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[1]")).getText();
		Assert.assertEquals(city1, text1.toUpperCase(), "City Mismatch");


		WebElement loc_add2=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add2.click();
		// loc 3

		WebElement loc_3=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_3.sendKeys(loc3);

		String loc_val3=loc_3.getAttribute("value");

		Assert.assertEquals(loc_val3, loc3, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_3.sendKeys(Keys.DOWN,Keys.ENTER);

		Thread.sleep(2000);
		String city2=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
		Assert.assertEquals(city2, text3.toUpperCase(), "City Mismatch");

		WebElement loc_add3=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add3.click();

		//loc4

		WebElement loc_4=(new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

		loc_4.sendKeys(loc4);

		String loc_val4=loc_4.getAttribute("value");

		Assert.assertEquals(loc_val4, loc4, "Location Entered Mismatch Error");

		Thread.sleep(2000);

		loc_4.sendKeys(Keys.DOWN,Keys.ENTER);



		Thread.sleep(2000);
		String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
		Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

		WebElement loc_add4=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		loc_add4.click();

	}
	public void preferenceinterest_repeat(String browser,String tag,String name,String email,String pwd,String rpwd,String explore,String tag1,String tag2,String tag3,String tag4) throws IOException, InterruptedException, AWTException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));
		Thread.sleep(1000);
		//Tag 1

		if(tag.equals("0.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(tag1.toLowerCase());

			//	String int_val=intresty.getAttribute("value");

			//Assert.assertEquals(int_val, tag1.toLowerCase(), "Intrest Mismatch Error");

			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			intresty.clear();

			Thread.sleep(1000);		
			//Tag2 

			WebElement intresty2=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty2.sendKeys(tag2.toLowerCase());

			//String int_val2=intresty2.getAttribute("value");

			//Assert.assertEquals(int_val2, tag2.toLowerCase(), "Explore Mismatch Error");

			Thread.sleep(1000);

			WebElement interest_click2=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click2.click();
			Thread.sleep(1000);
			intresty2.clear();

			Thread.sleep(1000);	

			// Tag3

			WebElement intresty3=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty3.sendKeys(tag3.toLowerCase());

			//	String int_val3=intresty3.getAttribute("value");

			//Assert.assertEquals(int_val3, tag3.toLowerCase(), "Explore Mismatch Error");

			Thread.sleep(1000);

			WebElement interest_click3=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click3.click();
			Thread.sleep(1000);
			intresty3.clear();

			Thread.sleep(1000);	

			for(int y=1;y<=3;y++)
			{
				String actual=driver.findElement(By.xpath("//*[@id=\"span-items1\"]/span["+y+"]")).getText();

				list.add(actual);				
			}
			Set<String> uniqueSet = new HashSet<String>(list);
			for (String temp : uniqueSet)
			{
				System.out.println(temp + ": " + Collections.frequency(list, temp));
			}

			System.out.println(list.size());
			for(String name1:list)
			{
				System.out.println("Add city is="+ name1);

			}
		}

		else if(tag.equals("1.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(tag1.toLowerCase());

			//		String int_val=intresty.getAttribute("value");

			//Assert.assertEquals(int_val, tag1.toLowerCase(), "Intrest Mismatch Error");

			Thread.sleep(1000);
			intresty.sendKeys(Keys.DOWN,Keys.ENTER);
			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			intresty.clear();

			Thread.sleep(1000);		
			//Tag2 

			WebElement intresty2=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty2.sendKeys(tag2.toLowerCase());

			//String int_val2=intresty2.getAttribute("value");

			//Assert.assertEquals(int_val2, tag2.toLowerCase(), "Explore Mismatch Error");

			Thread.sleep(1000);
			intresty2.sendKeys(Keys.DOWN,Keys.ENTER);
			WebElement interest_click2=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click2.click();
			Thread.sleep(1000);
			intresty2.clear();

			Thread.sleep(1000);	

			// Tag3

			WebElement intresty3=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty3.sendKeys(tag3.toLowerCase());

			//	String int_val3=intresty3.getAttribute("value");

			//Assert.assertEquals(int_val3, tag3.toLowerCase(), "Explore Mismatch Error");

			Thread.sleep(1000);
			intresty3.sendKeys(Keys.DOWN,Keys.ENTER);

			WebElement interest_click3=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click3.click();
			Thread.sleep(1000);
			intresty3.clear();

			Thread.sleep(1000);	
			for(int y=1;y<=3;y++)
			{
				String actual=driver.findElement(By.xpath("//*[@id=\"span-items1\"]/span["+y+"]")).getText();

				list.add(actual);				
			}
			Set<String> uniqueSet = new HashSet<String>(list);
			for (String temp : uniqueSet)
			{
				System.out.println(temp + ": " + Collections.frequency(list, temp));
			}

			System.out.println(list.size());
			for(String name1:list)
			{
				System.out.println("Add city is="+ name1);

			}
		}

		else if(tag.equals("2.0"))
		{
			// Tag 1
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(tag1.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			intresty.clear();

			//Tag2 

			WebElement intresty2=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty2.sendKeys(tag2.toLowerCase());

			//String int_val2=intresty2.getAttribute("value");

			//Assert.assertEquals(int_val2, tag2.toLowerCase(), "Explore Mismatch Error");

			Thread.sleep(1000);

			WebElement interest_click2=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click2.click();
			Thread.sleep(1000);
			intresty2.clear();

			Thread.sleep(1000);	
			// tag 3



			WebElement intresty3=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty3.sendKeys(tag3.toLowerCase());

			//String int_val2=intresty2.getAttribute("value");

			//Assert.assertEquals(int_val2, tag2.toLowerCase(), "Explore Mismatch Error");

			Thread.sleep(1000);

			WebElement interest_click3=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click3.click();
			Thread.sleep(1000);
			intresty3.clear();

			Thread.sleep(1000);	

			// tag4

			WebElement intresty4=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty4.sendKeys(tag4.toLowerCase());

			//	String int_val3=intresty3.getAttribute("value");

			//Assert.assertEquals(int_val3, tag3.toLowerCase(), "Explore Mismatch Error");

			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);	
			Thread.sleep(1000);
			WebElement interest_click4=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click4.click();
			Thread.sleep(1000);
			intresty4.clear();

			Thread.sleep(1000);	
			for(int y=1;y<=4;y++)
			{
				String actual=driver.findElement(By.xpath("//*[@id=\"span-items1\"]/span["+y+"]")).getText();

				list.add(actual);			
				
			}
			Set<String> uniqueSet = new HashSet<String>(list);
			for (String temp : uniqueSet)
			{
				System.out.println(temp + ": " + Collections.frequency(list, temp));
			}

			System.out.println(list.size());
			for(String name1:list)
			{
				System.out.println("Add Tag is="+ name1);

			}
		}
	}
	// Test 6
	public void preference_limit(String browser,String steps,String name,String email,String pwd,String rpwd,
			                      String explore,String prof,String phno,String loc1,String intrest,String screen) throws Exception
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));
		Thread.sleep(1000);
		
		if(steps.equals("0.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof.substring(0, 100), "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			String pho_val=phone_user.getAttribute("value");

			Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			String loc_val1=loc_1.getAttribute("value");

			Assert.assertEquals(loc_val1, loc1, "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			screen_shots(screen);
			driver.close();
			
		}
			
		
		else if(steps.equals("1.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, "", "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			//String pho_val=phone_user.getAttribute("value");

		//	Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			String loc_val1=loc_1.getAttribute("value");

			Assert.assertEquals(loc_val1, loc1, "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
		
			screen_shots(screen);
			driver.close();
		}
		else if(steps.equals("2.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");


			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, "", "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			//String pho_val=phone_user.getAttribute("value");

			//Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			String loc_val1=loc_1.getAttribute("value");

			Assert.assertEquals(loc_val1, loc1, "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

		//	WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
		//	loc_add1.click();

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			
			screen_shots(screen);
		
			//intresty.clear();
			
		}
		else if(steps.equals("3.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");
	

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			//String pho_val=phone_user.getAttribute("value");

			//Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			//String loc_val1=loc_1.getAttribute("value");

			//Assert.assertEquals(loc_val1, loc1.substring(0, 10), "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			intresty.clear();
             Thread.sleep(1000);			
			WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
			signup_click.click();
			Thread.sleep(1000);	
			screen_shots(screen);
			driver.close();
			
		}
		else if(steps.equals("4.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			//String pho_val=phone_user.getAttribute("value");

			
			//Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			//String loc_val1=loc_1.getAttribute("value");

			//Assert.assertEquals(loc_val1, loc1.substring(0, 10), "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			intresty.clear();
             Thread.sleep(1000);			
			WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
			signup_click.click();
			Thread.sleep(1000);	
			screen_shots(screen);
			driver.close();
			
		}
		else if(steps.equals("5.0"))
		{
			
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			//String pho_val=phone_user.getAttribute("value");

			//Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);
			
			//String loc_val1=loc_1.getAttribute("value");

			//Assert.assertEquals(loc_val1, loc1.substring(0, 10), "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			//loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			//Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();
			
			String actual= loc_1.getAttribute("value");
			
			Assert.assertEquals(actual, loc1, "Location Added");

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			intresty.clear();
            /* Thread.sleep(1000);			
			WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
			signup_click.click();*/
			Thread.sleep(1000);	
			screen_shots(screen);
			driver.close();
			
		}
		else if(steps.equals("6.0"))
		{

			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
		//	String pho_val=phone_user.getAttribute("value");

		//	Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);
			
			//String loc_val1=loc_1.getAttribute("value");

			//Assert.assertEquals(loc_val1, loc1.substring(0, 10), "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			//loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			//Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();
			
			String actual= loc_1.getAttribute("value");
			
			Assert.assertEquals(actual, loc1, "Location Added");

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			intresty.clear();
            /* Thread.sleep(1000);			
			WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
			signup_click.click();*/
			Thread.sleep(1000);	
			screen_shots(screen);
			driver.close();
			
		}
		else if(steps.equals("7.0"))
		{

			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			//String pho_val=phone_user.getAttribute("value");

		//	Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);
			
			//String loc_val1=loc_1.getAttribute("value");

			//Assert.assertEquals(loc_val1, loc1.substring(0, 10), "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			//loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			//Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();
			
			String actual= loc_1.getAttribute("value");
			
			Assert.assertEquals(actual, loc1, "Location Added");

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			intresty.clear();
            /* Thread.sleep(1000);			
			WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
			signup_click.click();*/
			Thread.sleep(1000);	
			screen_shots(screen);
			driver.close();
		}
		else if(steps.equals("8.0"))
		{

			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			
			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			//String pho_val=phone_user.getAttribute("value");

		//	Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);
			
			//String loc_val1=loc_1.getAttribute("value");

			//Assert.assertEquals(loc_val1, loc1.substring(0, 10), "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			//loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			//Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();
			
			String actual= loc_1.getAttribute("value");
			
			
			Assert.assertEquals(actual, loc1, "Location Added");

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
				
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			
			//intresty.clear();
            /* Thread.sleep(1000);			
			WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
			signup_click.click();*/
			Thread.sleep(1000);	
			screen_shots(screen);
			driver.close();
		}
		else if(steps.equals("9.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			//String pho_val=phone_user.getAttribute("value");

		//	Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			String loc_val1=loc_1.getAttribute("value");

			Assert.assertEquals(loc_val1, loc1, "Location Entered Mismatch Error");

			
			Thread.sleep(2000);
			//Robot robot=new Robot();
            
			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();
			
			// Assert.assertEquals(loc_1.getText(), loc1, "Location Added" );

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest);
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			String actual=intresty.getAttribute("value");
			  screen_shots(screen);
			Thread.sleep(1000);
			Assert.assertEquals(actual, intrest, "Text Entered Successfully");
			//intresty.clear();		
			
               driver.close();
			
		}
			
			
		else if(steps.equals("10.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
		//	String pho_val=phone_user.getAttribute("value");

		//	Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			String loc_val1=loc_1.getAttribute("value");

			Assert.assertEquals(loc_val1, loc1, "Location Entered Mismatch Error");

			
			Thread.sleep(2000);
			//Robot robot=new Robot();
            
			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();
			
			// Assert.assertEquals(loc_1.getText(), loc1, "Location Added" );

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest);
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			String actual=intresty.getAttribute("value");
			  screen_shots(screen);
			Thread.sleep(1000);
			Assert.assertEquals(actual, intrest, "Text Entered Successfully");
			intresty.clear();		
			
               driver.close();
			
		}
		else if(steps.equals("11.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			//String pho_val=phone_user.getAttribute("value");

		//	Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			String loc_val1=loc_1.getAttribute("value");

			Assert.assertEquals(loc_val1, loc1, "Location Entered Mismatch Error");

			
			Thread.sleep(2000);
			//Robot robot=new Robot();
            
			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();
			
			// Assert.assertEquals(loc_1.getText(), loc1, "Location Added" );

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest);
			Thread.sleep(1000);
			

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			String actual=intresty.getAttribute("value");
			  screen_shots(screen);
			Thread.sleep(1000);
			Assert.assertEquals(actual, intrest, "Text Entered Successfully");
			intresty.clear();		
			
               driver.close();
		}
		else if(steps.equals("12.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			//String pho_val=phone_user.getAttribute("value");

		//	Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			String loc_val1=loc_1.getAttribute("value");

			Assert.assertEquals(loc_val1, loc1, "Location Entered Mismatch Error");

			
			Thread.sleep(2000);
			//Robot robot=new Robot();
            
			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();
			
			// Assert.assertEquals(loc_1.getText(), loc1, "Location Added" );

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest);
			Thread.sleep(1000);
		

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			String actual=intresty.getText();
			  screen_shots(screen);
			Thread.sleep(1000);
			Assert.assertEquals(actual, intrest, "Text Entered Successfully");
			intresty.clear();		
			
               driver.close();
		}
		else if(steps.equals("13.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
		//	String pho_val=phone_user.getAttribute("value");

		//	Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			String loc_val1=loc_1.getAttribute("value");

			Assert.assertEquals(loc_val1, "", "Location Entered Mismatch Error");

			
			Thread.sleep(2000);
			//Robot robot=new Robot();
            
			//loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

		//	Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();
			
			Assert.assertEquals(loc_1.getText(), "", "Location is Blank" );

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest);
			Thread.sleep(1000);
		

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);
			//String actual=intresty.getText();
			 screen_shots(screen);
			Thread.sleep(1000);
			//Assert.assertEquals(actual, intrest, "Text Entered Successfully");
			intresty.clear();		
			
               driver.close();
			
		}
		else if(steps.equals("14.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
		//	String pho_val=phone_user.getAttribute("value");

		//	Assert.assertEquals(pho_val, phno, "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			String loc_val1=loc_1.getAttribute("value");

			Assert.assertEquals(loc_val1, loc1, "Location Entered Mismatch Error");

			
			Thread.sleep(2000);
			//Robot robot=new Robot();
            
			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();
			
			// Assert.assertEquals(loc_1.getText(), loc1, "Location Added" );

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest);
			
			
			Assert.assertEquals(intresty.getAttribute("value"), "", "Text Not Blank");
			Thread.sleep(1000);
			/*Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);*/

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			
			String actual=intresty.getText();
			
			Robot rovot=new Robot();
			rovot.keyPress(KeyEvent.VK_DOWN);
			rovot.keyPress(KeyEvent.VK_DOWN);
			rovot.keyPress(KeyEvent.VK_DOWN);
			  screen_shots(screen);
			Thread.sleep(1000);
			Assert.assertEquals(actual, "", "Interest is Blank");
			intresty.clear();		
			
               driver.close();
		}
		else if(steps.equals("15.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			String pho_val=phone_user.getAttribute("value");

			Assert.assertEquals(pho_val, "", "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			//String loc_val1=loc_1.getAttribute("value");

			//Assert.assertEquals(loc_val1, loc1.substring(0, 10), "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

			WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			loc_add1.click();

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			intresty.clear();
             Thread.sleep(1000);			
			WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
			signup_click.click();
			Thread.sleep(1000);	
			screen_shots(screen);
						
		}
		else if(steps.equals("16.0"))
		{
			WebElement user_name=driver.findElement(By.id(prop.getProperty("name_signup")));

			user_name.sendKeys(name);

			String name_val=user_name.getAttribute("value");

			Assert.assertEquals(name_val, name, "Name Mismatch Error");


			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_signup")));

			email_user.sendKeys(email);

			String email_val=email_user.getAttribute("value");

			Assert.assertEquals(email_val, email, "Email_id Mismatch Error");

			WebElement pwd_user=driver.findElement(By.id(prop.getProperty("pwd_signup")));

			pwd_user.sendKeys(pwd);

			String pwd_val=pwd_user.getAttribute("value");

			Assert.assertEquals(pwd_val, pwd, "Pasphrase Mismatch Error");

			WebElement rpwd_user=driver.findElement(By.id(prop.getProperty("rpwd_signup")));

			rpwd_user.sendKeys(rpwd);

			String rpwd_val=rpwd_user.getAttribute("value");

			Assert.assertEquals(rpwd_val, rpwd, "Repeat Pasphrase Mismatch Error");

			WebElement explore_user=driver.findElement(By.id(prop.getProperty("explore_signup")));

			explore_user.sendKeys(explore);

			String exp_val=explore_user.getAttribute("value");

			Assert.assertEquals(exp_val, explore, "Explore Mismatch Error");


			WebElement link_preference=driver.findElement(By.cssSelector(prop.getProperty("preference_link")));

			link_preference.click();		
			Thread.sleep(1000);

			WebElement skip_preference=driver.findElement(By.xpath(prop.getProperty("preference_skip")));
			Thread.sleep(1000);		

			skip_preference.click();

			link_preference.click();

			Thread.sleep(1000);
			
			WebElement profession_user=driver.findElement(By.id(prop.getProperty("profession")));

			profession_user.sendKeys(prof);

			String prof_val=profession_user.getAttribute("value");

			Assert.assertEquals(prof_val, prof, "Profession Mismatch Error");

			Thread.sleep(1000);


			WebElement phone_user=driver.findElement(By.id(prop.getProperty("phoneno")));    

			phone_user.sendKeys(phno);
			String pho_val=phone_user.getAttribute("value");

			Assert.assertEquals(pho_val, "", "Phone Number Mismatch Error");

			Thread.sleep(2000);
			
			WebElement loc_1=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("location_interest"))));

			loc_1.sendKeys(loc1);

			//String loc_val1=loc_1.getAttribute("value");

			//Assert.assertEquals(loc_val1, loc1.substring(0, 10), "Location Entered Mismatch Error");

			Thread.sleep(2000);
			//Robot robot=new Robot();

			loc_1.sendKeys(Keys.DOWN,Keys.ENTER);

			Thread.sleep(2000);

			//String city3=driver.findElement(By.xpath("//*[@id=\"span-items\"]/span[3]")).getText();
//			Assert.assertEquals(city3, text3.toUpperCase(), "City Mismatch");

		//	WebElement loc_add1=driver.findElement(By.xpath(prop.getProperty("add_loc")));
			//loc_add1.click();

			WebElement intresty=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_loc"))));

			intresty.sendKeys(intrest.toLowerCase());
			Thread.sleep(1000);
			Robot  robot=new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);		
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			Thread.sleep(1000);

			WebElement interest_click=(new WebDriverWait(driver, 10))
					.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.getProperty("interest_add"))));
			interest_click.click();
			Thread.sleep(1000);
			intresty.clear();
             Thread.sleep(1000);			
			WebElement signup_click=driver.findElement(By.id(prop.getProperty("submit_pref")));
			signup_click.click();
			Thread.sleep(1000);	
			screen_shots(screen);
				
		}
		else
		{
			System.out.println("No Steps You Entered is Found");
		}
			
	}	
// Test 7
	public void pref_spellcheck(String browser,String steps,String text) throws IOException, InterruptedException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_registration"));

		if(steps.equals("1.0"))
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
	
}
