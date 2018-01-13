package SPRINT2_Thread_MovePublic;

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

public class Thread_PublicMove extends Resources {
	
	static WebDriver driver;	
	Properties prop;
	
	// Public Thread is There
	//Test 1
	public void Valid_MoveThread(String browser,String email,String pwd,String aplid,String screen_shot,String username) throws IOException, InterruptedException, AWTException
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
		robot.keyPress(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		//Public Thread is There
		String dt=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[1]")).getText().substring(2);
		System.out.println(dt);
		String status_public1=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[1]")).getText();
		System.out.println("Status Count  Before Move to Public="+status_public1);
		
		if(dt.equals("Public Threads"))
		{
			Thread.sleep(2000);
			
			WebElement priv_thread=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[2]"));
			priv_thread.click();
			String thread_status1=priv_thread.getText();
			System.out.println("Before Move to Public Status="+thread_status1);
			
			Thread.sleep(2000);
			
			String thread_title=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[2]/p[1]")).getText();
			System.out.println("Thread Title Before Move="+thread_title);
			
			String thread_name=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[2]/p[2]/strong")).getText();
			System.out.println("Name of thread Creator="+thread_name);
			
			
			Thread.sleep(2000);
			
			WebElement drop_down=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/a/img"));
			drop_down.click();
			Thread.sleep(1000);
			WebElement thread_move=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[3]/div/div/form/input[1]"));
			thread_move.click();
			Thread.sleep(1000);			
			WebElement confirm=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div/form/button"));
			confirm.click();
			
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			
			Thread.sleep(5000);
			
			screen_shots(screen_shot);
			
			String msg=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[1]/strong")).getText();
	           
			System.out.println("Message of Delete="+msg);
			
			String public_status2=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[1]")).getText();
			
			System.out.println("Thread Move to Public Status="+public_status2);
			Assert.assertFalse(status_public1.equals(public_status2));
			
			String movethread_title=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[2]/p[1]")).getText();
			System.out.println("Thread Title After move public="+movethread_title);
			
			String conv=driver.findElement(By.xpath(".//*[@id='tab-1']/div[1]/div[1]/div[2]/p[2]")).getText();
			System.out.println("Conversation between="+conv);
			
			String private_status2=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[2]")).getText();
			System.out.println("Private Thread Status After Move="+private_status2);
			
			Assert.assertEquals(movethread_title, thread_title, "Thread Title not Match");
			Assert.assertEquals(conv, "Conversation between "+ username +" and "+  thread_name, "Name not Match");
			Assert.assertFalse(thread_status1.equals(private_status2));
			Thread.sleep(2000);
			
			driver.close();
			
		}
		
		else
		{
			System.out.println("No Thread is There to Move");
		}
	}
		
		//No Public Thread is There
	// Test 2
		public void Valid_MovePrivate(String browser,String email,String pwd,String aplid,String screen_shot,String username) throws IOException, InterruptedException, AWTException
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
			robot.keyPress(KeyEvent.VK_DOWN);
			
			Thread.sleep(2000);
			
		if(driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[2]")).getText().substring(2).equals("Private Threads"))
		{
			String thread_status1=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[2]")).getText();
			System.out.println("Thread Status Before Delete="+thread_status1);
			Thread.sleep(2000);
			
			
			String thread_title=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[2]/p[1]")).getText();
			System.out.println("Thread Title Before Delete="+thread_title);
			
			String thread_name=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[2]/p[2]/strong")).getText();
			System.out.println("Name of thread Creator="+thread_name);
			
			
			
			WebElement dropdown=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[3]/div/a/img"));
			dropdown.click();
			
			WebElement move_thread=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[3]/div/div/form/input[1]"));
			move_thread.click();
			Thread.sleep(1000);			
			WebElement confirm=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div/form/button"));
			confirm.click();
			
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(5000);
			
			screen_shots(screen_shot);
            String msg=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[1]/strong")).getText();
           
			System.out.println("Message of Delete="+msg);
			String getmove_status=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[2]")).getText();
			System.out.println("After Delete Status="+getmove_status);
			
			String public_status=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[1]")).getText();
			System.out.println("Public Status After Move is="+public_status);
			
			Assert.assertEquals(public_status, "1 Public Threads");
			String title_public=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[2]/p[1]")).getText();
			System.out.println("Title After Move to Public="+title_public);
			
			String conv=driver.findElement(By.xpath("//*[@id='tab-1']/div[1]/div[1]/div[2]/p[2]")).getText();
			System.out.println(conv);
			
			Assert.assertEquals(title_public, thread_title);
			
			
			Assert.assertEquals(conv, "Conversation between "+ username +" and "+  thread_name);
			Thread.sleep(1000);
			
			driver.close();
			
			
		}
		else
		{
			System.out.println("No Thread is There to Move");
		}
		
		
		
		
		
		
	}

}
