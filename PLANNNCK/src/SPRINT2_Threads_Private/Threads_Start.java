package SPRINT2_Threads_Private;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Lib.Resources;

public class Threads_Start extends Resources{

	static WebDriver driver;
	static WebDriver  driver1;
	
	Properties prop;
	Properties prop1;
	public void Valid_PrivateThread(String browser,String email,String password,String category,String ap1,String title,String msg,String screen_shot1
			, String emait,String pwdt,String ap2,String rply,String screen_shot2,String ap3,String screen3) throws IOException, InterruptedException, AWTException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));

		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user.sendKeys(email);

		WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user.sendKeys(password);

		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("login"))).click();

		driver.findElement(By.xpath(prop.getProperty("appeal_header"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("category_open"))).click();

		Thread.sleep(1000);


		if(category.equalsIgnoreCase("All"))
		{

			driver.findElement(By.xpath(prop.getProperty("category_all"))).click();

			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_PAGE_DOWN);

			driver.navigate().to(ap1);
			
			String threadStart_verfiy=driver.findElement(By.id(prop.getProperty("startnew_thread"))).getText();
			
			if(threadStart_verfiy.equals("Start a New Thread"))
			{

			robot.keyPress(KeyEvent.VK_PAGE_DOWN);

			WebElement thread_title=driver.findElement(By.id(prop.getProperty("thread_title")));

			thread_title.sendKeys(title);

			Thread.sleep(2000);		
		

			WebElement thread_msg=driver.findElement(By.id(prop.getProperty("thread_msg")));

			thread_msg.sendKeys(msg);
			
			Thread.sleep(2000);

			WebElement start_thread=driver.findElement(By.cssSelector(prop.getProperty("thread_start")));

			start_thread.click();

			Thread.sleep(2000);

			screen_shots(screen_shot1);

			String title_name=driver.findElement(By.xpath(prop.getProperty("title_created"))).getText();

			System.out.println("Created Thread Title is="+title_name);

			String person_name=driver.findElement(By.xpath(prop.getProperty("threadowner_name"))).getText();

			System.out.println("Name of Person Whom Thread Created="+person_name);

			String get_msg=driver.findElement(By.xpath(".//*[@id='tab-4']/div[3]/div/ul/li/div[1]/div[2]/div/div")).getText();

			System.out.println("Message Send to thread person="+get_msg);
			
			Assert.assertEquals(title_name, title);
			
		    Assert.assertEquals(get_msg, msg);

			Thread.sleep(2000);

			WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive.click();

			Thread.sleep(2000);

			WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff.click();
			
			Thread.sleep(2000);
			
			driver.close();
			
			Thread.sleep(1000);
			

			// 2nd time 
			
			prop=file_execute();
			
			driver=Resources.browser(browser);
			
			driver.get(prop.getProperty("url_login"));

			WebElement email_user1=driver.findElement(By.id(prop.getProperty("email_login")));
			email_user1.sendKeys(emait);

			WebElement pwd_user1 =driver.findElement(By.id(prop.getProperty("pwd_login")));
			pwd_user1.sendKeys(pwdt);

			Thread.sleep(2000);

			driver.findElement(By.xpath(prop.getProperty("login"))).click();

			Robot robot1 = new Robot();

			robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot1.keyPress(KeyEvent.VK_PAGE_DOWN);		
			
			Thread.sleep(2000);

		  driver.navigate().to(ap2);

			robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot1.keyPress(KeyEvent.VK_PAGE_DOWN);
			

			String title_name1=driver.findElement(By.xpath(prop.getProperty("title_created"))).getText();

			System.out.println("Created Thread Title Seen in Whom thread Created="+title_name1);

			String person_name1=driver.findElement(By.xpath(prop.getProperty("threadowner_name"))).getText();

			System.out.println("Name of Person Who Created Thread="+person_name1);
			
			Assert.assertFalse(person_name.equals(person_name1), "Fail");
			
			WebElement thread_msg1=driver.findElement(By.xpath(prop.getProperty("msg_write")));

			thread_msg1.sendKeys(rply);
			
			
			
			Thread.sleep(2000);
			
			WebElement send_msg=driver.findElement(By.xpath(prop.getProperty("msg_reply")));

			send_msg.click();
			
			Thread.sleep(2000);
			
			driver.navigate().refresh();
			
			Thread.sleep(2000);
			

			String get_threaduser=driver.findElement(By.xpath(".//*[@id='tab-4']/div[3]/div/ul/li[2]/div[1]/div[2]/div/div")).getText();

			System.out.println("Message Seen to thread person After Send="+get_threaduser);
			
           /* String rply_msg=driver.findElement(By.xpath(".//*[@id='tab-4']/div[3]/div/ul/li[1]/div[1]/div[2]/div/div)")).getText();
			
			System.out.println("New Message Send from Whom thread Created="+rply_msg);
			*/
			
			
			
			screen_shots(screen_shot2);
			
			WebElement appeal_responsive1=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive1.click();

			Thread.sleep(2000);

			WebElement logoff1=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff1.click();
			
			Thread.sleep(1000);
			
			driver.close();
			Thread.sleep(2000);

			//3rd time
             prop1=file_execute();
			
			driver1=Resources.browser(browser);
			
			driver1.get(prop1.getProperty("url_login"));

			
			WebElement email_user2=driver1.findElement(By.id(prop1.getProperty("email_login")));
			email_user2.sendKeys(email);

			WebElement pwd_user2=driver1.findElement(By.id(prop1.getProperty("pwd_login")));
			pwd_user2.sendKeys(password);

			Thread.sleep(2000);
			driver1.findElement(By.xpath(prop1.getProperty("login"))).click();
            
			Thread.sleep(2000);
			driver1.navigate().to(ap3);
			Thread.sleep(2000);
			
			Robot robot2 = new Robot();

			robot2.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robot2.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(1000);
			robot2.keyPress(KeyEvent.VK_PAGE_DOWN);
			
			
					
			screen_shots(screen3);
			Thread.sleep(1000);
			
			WebElement appeal_responsive2=driver1.findElement(By.xpath(prop1.getProperty("responsivebar")));
			appeal_responsive2.click();

			Thread.sleep(2000);

			WebElement logoff2=driver1.findElement(By.cssSelector(prop1.getProperty("logout")));
			logoff2.click();
			
			
			
			driver1.close();
			
			
			
			}
			else
			{
				System.out.println("Category ot Matched");
			}
						
		}
		else
		{
			
			System.out.println("Appeal Already Created By This User");
			
			driver.navigate().refresh();
		}

		}
	
	// 2nd test
	public void thread_alreadypresent(String browser,String email,String pwd,String aplid,String title,String msg) throws IOException, InterruptedException, AWTException
	{
		prop=file_execute();

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));

		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user.sendKeys(email);

		WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user.sendKeys(pwd);

		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("login"))).click();
		
		Thread.sleep(2000);
		
		driver.navigate().to(aplid);
		
		Robot robot=new Robot();
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		String Status_before=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul")).getText();
		System.out.println(Status_before);
		
		String actual=Status_before.substring(0, 36);
		System.out.println(actual);
		
		if(driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[1]")).getText().substring(2).equals("Public Threads"))
        {
        if(driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[2]")).getText().equals("Start a New Thread"))
        {
         
	        WebElement start_thread=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[2]"));
	        start_thread.click();
	        
	        WebElement thread_title=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[2]/input[2]"));
	        thread_title.sendKeys(title);
	        
	        WebElement thread_msg=driver.findElement(By.id(prop.getProperty("thread_msg")));
	        thread_msg.sendKeys(msg);
	        
	        Thread.sleep(2000);
	        WebElement send=driver.findElement(By.cssSelector(prop.getProperty("thread_start")));

			send.click();

			Thread.sleep(2000);
			
			WebElement appeal_responsive1=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive1.click();

			Thread.sleep(2000);

			WebElement logoff1=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff1.click();
			
			Thread.sleep(1000);
	
			driver.get(prop.getProperty("url_login"));
			
			WebElement email_user1=driver.findElement(By.id(prop.getProperty("email_login")));
			email_user1.sendKeys(email);

			WebElement pwd_user1 =driver.findElement(By.id(prop.getProperty("pwd_login")));
			pwd_user1.sendKeys(pwd);

			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("login"))).click();
			
			Thread.sleep(2000);
			
			driver.navigate().to(aplid);
			
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			
			String text1=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul")).getText();
			System.out.println(text1);
			String expected=text1.substring(0, 34);
			System.out.println(expected);
			Assert.assertFalse(actual.equals(expected));
			
			
			
			
        }
        else
        {
        	System.out.println("Hello");
        }
				        
         

		
	} 
		
	}	
}
		
	
	




