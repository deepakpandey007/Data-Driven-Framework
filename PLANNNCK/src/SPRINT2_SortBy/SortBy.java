package SPRINT2_SortBy;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Lib.Resources;

public class SortBy extends Resources{
	
static WebDriver driver;
	
	public void sortby_dropdown(String browser,String email,String pwd,String sort ,String screen_shot) throws IOException, InterruptedException, AWTException
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
		
		driver.findElement(By.xpath(prop.getProperty("appeal_header"))).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("sortby"))).click();
		
		String time_color=driver.findElement(By.xpath(prop.getProperty("time"))).getCssValue("background-color");
		
		System.out.println("Before Click Time Color="+time_color);
		
		String vote_color=driver.findElement(By.xpath(prop.getProperty("vote"))).getCssValue("background-color");
		
		System.out.println("Before Click Vote Color="+vote_color);
		
		String follow_color=driver.findElement(By.xpath(prop.getProperty("vote"))).getCssValue("background-color");
		
		System.out.println("Before Click Follow Color="+follow_color);
		
		String conv_color=driver.findElement(By.xpath(prop.getProperty("vote"))).getCssValue("background-color");
		
		System.out.println("Before Click Conversation Color="+conv_color);
	
		if(sort.equals("Time"))
		{

			Robot robot=new Robot();
			Thread.sleep(1000);
			driver.findElement(By.xpath(prop.getProperty("time"))).click();
			
			String after_click=driver.findElement(By.xpath(prop.getProperty("time"))).getCssValue("background-color");
			System.out.println("Color After Click Time is="+after_click);
			
			Thread.sleep(3000);		
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(1000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			
			 screen_shots(screen_shot);
		    robot.keyPress(KeyEvent.VK_PAGE_UP);
		    robot.keyRelease(KeyEvent.VK_PAGE_UP);
		    Thread.sleep(1000);
		    screen_shots(screen_shot);
		    robot.keyPress(KeyEvent.VK_END);
		    robot.keyRelease(KeyEvent.VK_END);
		    Thread.sleep(3000);
		    screen_shots(screen_shot);
		    org.testng.Assert.assertEquals(after_click, time_color, "Color Mismatch");
		    Thread.sleep(2000);
		    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive.click();
			Thread.sleep(2000);
			WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff.click();
		   
		    }
		else if(sort.equals("Voted"))
		{
			Robot robot=new Robot();
			Thread.sleep(1000);
			driver.findElement(By.xpath(prop.getProperty("vote"))).click();
			
			String after_click=driver.findElement(By.xpath(prop.getProperty("vote"))).getCssValue("background-color");
			System.out.println("Color After Click Time is="+after_click);
			
			Thread.sleep(3000);		
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(1000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			
			 screen_shots(screen_shot);
		    robot.keyPress(KeyEvent.VK_PAGE_UP);
		    robot.keyRelease(KeyEvent.VK_PAGE_UP);
		    Thread.sleep(1000);
		    screen_shots(screen_shot);
		    robot.keyPress(KeyEvent.VK_END);
		    robot.keyRelease(KeyEvent.VK_END);
		    Thread.sleep(3000);
		    screen_shots(screen_shot);
		    org.testng.Assert.assertFalse(after_click.equals(vote_color), "Color Matches");
		    Thread.sleep(2000);
		    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive.click();
			Thread.sleep(2000);
			WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff.click();
			
		}
		
		else if(sort.equals("Follow"))
		{
			Robot robot=new Robot();
			Thread.sleep(1000);
			driver.findElement(By.xpath(prop.getProperty("follow"))).click();
			
			String after_click=driver.findElement(By.xpath(prop.getProperty("follow"))).getCssValue("background-color");
			System.out.println("Color After Click Time is="+after_click);
			
			Thread.sleep(3000);		
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(1000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			
			 screen_shots(screen_shot);
		    robot.keyPress(KeyEvent.VK_PAGE_UP);
		    robot.keyRelease(KeyEvent.VK_PAGE_UP);
		    Thread.sleep(1000);
		    screen_shots(screen_shot);
		    robot.keyPress(KeyEvent.VK_END);
		    robot.keyRelease(KeyEvent.VK_END);
		    Thread.sleep(3000);
		    screen_shots(screen_shot);
		    org.testng.Assert.assertFalse(after_click.equals(follow_color), "Color Matches");
		    Thread.sleep(2000);
		    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive.click();
			Thread.sleep(2000);
			WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff.click();
			
		}
		else if(sort.equals("Conversations"))
		{
			Robot robot=new Robot();
			Thread.sleep(1000);
			driver.findElement(By.xpath(prop.getProperty("conversation"))).click();
			
			String after_click=driver.findElement(By.xpath(prop.getProperty("conversation"))).getCssValue("background-color");
			System.out.println("Color After Click Time is="+after_click);
			
			Thread.sleep(3000);		
			
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(1000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			 screen_shots(screen_shot);
			robot.keyPress(KeyEvent.VK_END);
			robot.keyRelease(KeyEvent.VK_END);
			Thread.sleep(2000);
			
			 screen_shots(screen_shot);
		    robot.keyPress(KeyEvent.VK_PAGE_UP);
		    robot.keyRelease(KeyEvent.VK_PAGE_UP);
		    Thread.sleep(1000);
		    screen_shots(screen_shot);
		    robot.keyPress(KeyEvent.VK_END);
		    robot.keyRelease(KeyEvent.VK_END);
		    Thread.sleep(3000);
		    screen_shots(screen_shot);
		    org.testng.Assert.assertFalse(after_click.equals(conv_color), "Color Matches");
		    Thread.sleep(2000);
		    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive.click();
			Thread.sleep(2000);
			WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff.click();
			
		}


	}
	
	// Test 2 Spells Verify	
	public void options_spells(String browser,String email,String pwd,String step,String spell) throws InterruptedException, IOException
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
		
		driver.findElement(By.xpath(prop.getProperty("appeal_header"))).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(prop.getProperty("sortby"))).click();
				
		driver.findElement(By.xpath(prop.getProperty("time"))).click();
		if(step.equals("0.0"))
		{
			String time_spell=driver.findElement(By.xpath(prop.getProperty("time"))).getText();
			System.out.println("Spell of time by is="+time_spell);
			Assert.assertEquals(time_spell, spell, "Spelling Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
		}
		else if(step.equals("1.0"))
		{
			String vote_spell=driver.findElement(By.xpath(prop.getProperty("vote"))).getText();
			System.out.println("Spell of vote by is="+vote_spell);
			Assert.assertEquals(vote_spell, spell, "Spelling Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		else if(step.equals("2.0"))
		{
			String follow_spell=driver.findElement(By.xpath(prop.getProperty("follow"))).getText();
			System.out.println("Spell of follow by is="+follow_spell);
			Assert.assertEquals(follow_spell, spell, "Spelling Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		
		else if(step.equals("3.0"))
		{
			String conv_spell=driver.findElement(By.xpath(prop.getProperty("conversation"))).getText();
			System.out.println("Spell of conv by is="+conv_spell);
			Assert.assertEquals(conv_spell, spell, "Spelling Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		else if(step.equals("4.0"))
		{
			String sortby_spell=driver.findElement(By.xpath(prop.getProperty("sortbybox"))).getText();
			System.out.println("Spell of sort by is="+sortby_spell);
			Assert.assertEquals(sortby_spell, spell, "Spelling Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		
		else
		{
			System.out.println("No Method to Check");
		}
		
		
	}

	// Test 3 Colors Verify	
	public void sort_colors(String browser,String email,String pwd,String step,String col_rgb) throws InterruptedException, IOException
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
		
		driver.findElement(By.xpath(prop.getProperty("appeal_header"))).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath(prop.getProperty("sortby"))).click();	
		//driver.findElement(By.xpath(prop.getProperty("time"))).click();
		if(step.equals("0.0"))
		{
			driver.findElement(By.xpath(prop.getProperty("sortby"))).click();
			String time_txtcolor=driver.findElement(By.xpath(prop.getProperty("time"))).getCssValue("color");
			System.out.println("Color of time Before Click is="+time_txtcolor);
			Assert.assertEquals(time_txtcolor, col_rgb, "Color Mismatched");
			 Thread.sleep(2000);
			 
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
		}
		else if(step.equals("1.0"))
		{
			driver.findElement(By.xpath(prop.getProperty("sortby"))).click();
			String vote_txtcolor=driver.findElement(By.xpath(prop.getProperty("vote"))).getCssValue("color");
			System.out.println("Color of vote Before Click is="+vote_txtcolor);
			Assert.assertEquals(vote_txtcolor, col_rgb, "Color Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		else if(step.equals("2.0"))
		{
			driver.findElement(By.xpath(prop.getProperty("sortby"))).click();
			String follow_txtcolor=driver.findElement(By.xpath(prop.getProperty("follow"))).getCssValue("color");
			System.out.println("Color of follow Before Click is="+follow_txtcolor);
		Assert.assertEquals(follow_txtcolor, col_rgb, "Color Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		
		else if(step.equals("3.0"))
		{
			driver.findElement(By.xpath(prop.getProperty("sortby"))).click();
			String conv_txtcolor=driver.findElement(By.xpath(prop.getProperty("conversation"))).getCssValue("color");
			System.out.println("Color of conv Before Click is="+conv_txtcolor);
			Assert.assertEquals(conv_txtcolor, col_rgb, "Color Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		else if(step.equals("4.0"))
		{
			String sortby_txtcolor=driver.findElement(By.xpath(prop.getProperty("sortby"))).getCssValue("color");
			System.out.println("Color of sort by Before Click is="+sortby_txtcolor);
		    Assert.assertEquals(sortby_txtcolor, col_rgb, "Color Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		
		else if(step.equals("5.0"))
		{
			String bgcolor_sort=driver.findElement(By.xpath(prop.getProperty("sortbybox"))).getCssValue("background-color");
			System.out.println("Before Click Sort by Background-Color="+bgcolor_sort);
			 Thread.sleep(2000);
			 Assert.assertEquals(bgcolor_sort, col_rgb, "Color Mismatch");
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				driver.close();
			
		}
		
		else if(step.equals("6.0"))
		{
			
			driver.findElement(By.xpath(prop.getProperty("sortby"))).click();
			//driver.findElement(By.xpath(prop.getProperty("time"))).click();
			String time_spell=driver.findElement(By.xpath(prop.getProperty("time"))).getCssValue("color");
			System.out.println("Color of time after click is="+time_spell);
			Assert.assertEquals(time_spell, col_rgb, "Color Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				driver.close();
		}
		else if(step.equals("7.0"))
		{
			driver.findElement(By.xpath(prop.getProperty("vote"))).click();
			String vote_spell=driver.findElement(By.xpath(prop.getProperty("vote"))).getCssValue("color");
			System.out.println("Color of vote after click is="+vote_spell);
			Assert.assertEquals(vote_spell, col_rgb, "Color Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		else if(step.equals("8.0"))
		{
			driver.findElement(By.xpath(prop.getProperty("follow"))).click();
			String follow_spell=driver.findElement(By.xpath(prop.getProperty("follow"))).getCssValue("color");
			System.out.println("Color of follow After Click is="+follow_spell);
			Assert.assertEquals(follow_spell, col_rgb, "Color Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		
		else if(step.equals("9.0"))
		{
			driver.findElement(By.xpath(prop.getProperty("conversation"))).click();
			String conv_spell=driver.findElement(By.xpath(prop.getProperty("conversation"))).getCssValue("color");
			System.out.println("Color of conv After Click is="+conv_spell);
			Assert.assertEquals(conv_spell, col_rgb, "Color Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		else if(step.equals("10.0"))
		{
			driver.findElement(By.xpath(prop.getProperty("sortby"))).click();
			Thread.sleep(2000);
			String sortby_contain=driver.findElement(By.cssSelector(prop.getProperty("container"))).getCssValue("background-color");
			System.out.println("Container Tab Color is="+sortby_contain);
			Assert.assertEquals(sortby_contain, col_rgb, "Color Mismatched");
			 Thread.sleep(2000);
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		else if(step.equals("11.0"))
		{
			String afterclick_sort=driver.findElement(By.xpath(prop.getProperty("bysort"))).getCssValue("background-color");
			System.out.println("After Click Sort By Background Color is="+afterclick_sort);
			 Thread.sleep(2000);
			 Assert.assertEquals(afterclick_sort, col_rgb, "Color Mismatch");
			    WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				
		}
			
		else if(step.equals("12.0"))
		{
			String arrow_before=driver.findElement(By.xpath(prop.getProperty("arrowdown"))).getCssValue("color");
			System.out.println("Arrow Before click color="+arrow_before);
			Assert.assertEquals(arrow_before, col_rgb, "Color Mismatch");
			Thread.sleep(1000);
			 WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
		}
		else if(step.equals("13.0"))
		{
			String arrow_after=driver.findElement(By.xpath(prop.getProperty("arrowup"))).getCssValue("color");
			System.out.println("Arrow Before click color="+arrow_after);
			Assert.assertEquals(arrow_after, col_rgb, "Color Mismatch");
			Thread.sleep(1000);
			 WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
			
		}
		
		else
		{
			System.out.println("No Method to Check");
		}
		
	}
}

