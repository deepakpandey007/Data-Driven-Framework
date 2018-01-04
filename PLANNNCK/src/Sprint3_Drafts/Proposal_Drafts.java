package Sprint3_Drafts;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Lib.Resources;

public class Proposal_Drafts extends Resources {
	WebDriver driver;
	Properties prop;
	
	public void proposalvalid_Drafts(String browser,String step,String email,String pwd,String type, String title,
			String tags,String desc,String solve,String pdo,String reso,String urlfor,String urllink,String attfor) throws InterruptedException, Exception
	
		{
			
			try {
				prop=file_execute();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			logger.info("Start the Browser");
			driver=Resources.browser(browser);
			logger.info("Open the Link");
			driver.get(prop.getProperty("url_login"));
			logger.info("Enter the Email-ID");
			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
			email_user.sendKeys(email);
			logger.info("Enter the Passphrase");
			WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
			pwd_user.sendKeys(pwd);
			logger.info("Click on Login Button");
			
			driver.findElement(By.xpath(prop.getProperty("login"))).click();
			Thread.sleep(1000);
			logger.info("Click on Proposal Tag");
			driver.findElement(By.xpath(prop.getProperty("propose_tag"))).click();
			Thread.sleep(1000);
		String countbefore=driver.findElement(By.xpath(prop.getProperty("drafts_status"))).getText();
		System.out.println("Count Before Submit="+countbefore);
		logger.info("Select Create Proposal");
		driver.findElement(By.xpath(prop.getProperty("proposal_button"))).click();
		if(step.equals("1.0"))
		{
			Thread.sleep(2000);
		logger.info("Click on Drafts Button");
		driver.findElement(By.xpath(prop.getProperty("drafts_submit"))).click();
		logger.info("Drafts Status After Submit");
		Thread.sleep(1000);
		String countafter=driver.findElement(By.xpath(prop.getProperty("drafts_status"))).getText();
		System.out.println("Drafts Submit Status="+countafter);
		logger.info("Verify the Drafts Counts");
		Assert.assertFalse(countbefore.equals(countafter), "Drafts Counts");
		
		Thread.sleep(2000);
		logger.info("Click on Drafts");
		driver.findElement(By.xpath(prop.getProperty("drafts_status"))).click();
		Thread.sleep(1000);
		logger.info("Image By Default URL");
		String imgurl=driver.findElement(By.xpath(prop.getProperty("img_src"))).getAttribute("src");
		System.out.println("Image add Url="+imgurl);
		logger.info("Verify the Image Attached URL");
		Assert.assertEquals(imgurl, "http://planncktest.ap-south-1.elasticbeanstalk.com/public/categoryimage/others.jpg", "Image Added Mismatch");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("drafts_pro"))).click();
		Thread.sleep(2000);
		String act_src=driver.findElement(By.xpath(prop.getProperty("activity_check"))).getAttribute("src");
		logger.info("Verify the Image Attached URL Activity Proposal");
		Assert.assertEquals(act_src, "http://planncktest.ap-south-1.elasticbeanstalk.com/public/images/unchecked.svg", "Type Checked");
		String tra_src=driver.findElement(By.xpath(prop.getProperty("training_check"))).getAttribute("src");
		logger.info("Verify the Image Attached URL Training Proposal");
		Assert.assertEquals(tra_src, "http://planncktest.ap-south-1.elasticbeanstalk.com/public/images/unchecked.svg", "Type Checked");
		String title_text=driver.findElement(By.id(prop.getProperty("pro_title"))).getAttribute("value");
		logger.info("Verify the Title");
		Assert.assertEquals(title_text, "", "Title text Entered");
		String cat_text=driver.findElement(By.xpath(prop.getProperty("cat_text"))).getAttribute("value");
		logger.info("Verify the Category");
		Assert.assertEquals(cat_text, "", "Category text Entered");
		String text_tag=driver.findElement(By.xpath(prop.getProperty("pro_tagtext"))).getAttribute("value");
		logger.info("Verify the Tag");
		Assert.assertEquals(text_tag, "", "Tag text Entered");
		try
		{
			logger.info("Verify the Tag Added");
			Boolean status1=driver.findElement(By.xpath(prop.getProperty("tag_text"))).isDisplayed();
			Assert.assertEquals("false", status1);	
		}
		catch(Exception e)
		{
		System.out.println("No Tags Added");
		}
		logger.info("Verify the Description");
		String desc_text1=driver.findElement(By.id(prop.getProperty("desc"))).getAttribute("value");
		Assert.assertEquals(desc_text1, "", "Description text Entered");
		try {
			logger.info("Verify the Solve Text");
		Boolean status2=driver.findElement(By.id(prop.getProperty("pro_text"))).isDisplayed();
		Assert.assertEquals("false", status2);	
		}
		catch(Exception e)
		{
			System.out.println("No Solve Typing is Open");
		}
		try {
			logger.info("Verify the Plannck Do");
			Boolean status3=driver.findElement(By.id(prop.getProperty("prodo_text"))).isDisplayed();
			Assert.assertEquals("false", status3);	
			}
			catch(Exception e)
			{
				System.out.println("No Do Typing is Open");
			}
		
		try {
			logger.info("Verify the Resources");
			Boolean status4=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).isDisplayed();
			Assert.assertEquals("false", status4);	
			}
			catch(Exception e)
			{
				System.out.println("No Do Typing is Open");
			}
				
		String url_text=driver.findElement(By.id(prop.getProperty("prourl_for"))).getAttribute("value");
		logger.info("Verify the URL For");
		Assert.assertEquals(url_text, "", "URL text Entered");
		String url_linktext=driver.findElement(By.id(prop.getProperty("prourllink"))).getAttribute("value");
		logger.info("Verify the URL Link");
		Assert.assertEquals(url_linktext, "", "URL LINK text Entered");
		String att_text=driver.findElement(By.id(prop.getProperty("proattachfor"))).getAttribute("value");
		logger.info("Verify the Attachment For");
		Assert.assertEquals(att_text, "", "Attach text Entered");
		try {
			logger.info("Verify the URL For Added");
			Boolean status8=driver.findElement(By.xpath(prop.getProperty("urlname_count"))).isDisplayed();
			Assert.assertEquals("false", status8);	
			Boolean status9=driver.findElement(By.xpath(prop.getProperty("urllink_count"))).isDisplayed();
			logger.info("Verify the URL Link Added");
			Assert.assertEquals("false", status9);	
			Boolean status10=driver.findElement(By.xpath(prop.getProperty("attch_count"))).isDisplayed();
			logger.info("Verify the Attachment For Added");
			Assert.assertEquals("false", status10);
			Boolean status11=driver.findElement(By.xpath(prop.getProperty("attachlink_count"))).isDisplayed();
			logger.info("Verify the Attachment Link Added");
			Assert.assertEquals("false", status11);	
		
			}
			catch(Exception e)
			{
				System.out.println("No Typing is Open");
			}
				}
		else if(step.equals("2.0"))
		{
			if(type.equalsIgnoreCase("Activity Proposal"))
			{
			Thread.sleep(2000);
			logger.info("Check the Activity Proposal");
			driver.findElement(By.xpath(prop.getProperty("activity_check"))).click();
			String actual=driver.findElement(By.xpath(prop.getProperty("activity_check"))).getAttribute("src");
			System.out.println(actual);
		logger.info("Click on Drafts Button");
		driver.findElement(By.xpath(prop.getProperty("drafts_submit"))).click();
		logger.info("Drafts Status After Submit");
		Thread.sleep(1000);
		String countafter=driver.findElement(By.xpath(prop.getProperty("drafts_status"))).getText();
		System.out.println("Drafts Submit Status="+countafter);
		logger.info("Verify the Drafts Counts");
		Assert.assertFalse(countbefore.equals(countafter), "Drafts Counts");
		
		Thread.sleep(2000);
		logger.info("Click on Drafts");
		driver.findElement(By.xpath(prop.getProperty("drafts_status"))).click();
		Thread.sleep(1000);
		logger.info("Image By Default URL");
		String imgurl=driver.findElement(By.xpath(prop.getProperty("img_src"))).getAttribute("src");
		System.out.println("Image add Url="+imgurl);
		logger.info("Verify the Image Attached URL");
		//Assert.assertEquals(imgurl, "http://planncktest.ap-south-1.elasticbeanstalk.com/public/categoryimage/others.jpg", "Image Added Mismatch");
		Thread.sleep(1000);
		driver.findElement(By.xpath(prop.getProperty("drafts_pro"))).click();
		Thread.sleep(2000);
		String act_src=driver.findElement(By.xpath(prop.getProperty("activity_check"))).getAttribute("src");
		logger.info("Verify the Image Attached URL Activity Proposal");
		Assert.assertEquals(act_src, "http://planncktest.ap-south-1.elasticbeanstalk.com/public/images/checked.svg", "Type Checked");
		String tra_src=driver.findElement(By.xpath(prop.getProperty("training_check"))).getAttribute("src");
		logger.info("Verify the Image Attached URL Training Proposal");
		Assert.assertEquals(tra_src, "http://planncktest.ap-south-1.elasticbeanstalk.com/public/images/unchecked.svg", "Type Checked");
		String title_text=driver.findElement(By.id(prop.getProperty("pro_title"))).getAttribute("value");
		logger.info("Verify the Title");
		Assert.assertEquals(title_text, " ENTER Proposal TITLE  FOR DRAFTS", "Title text Entered");
		logger.info("Click on Category");
		driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
		String cat_text=driver.findElement(By.xpath(".//*[@id='country-list-styled']")).getAttribute("value");
		logger.info("Verify the Category");
		Assert.assertEquals(cat_text, "", "Category text Entered");
		String text_tag=driver.findElement(By.id(prop.getProperty("pro_tagtext"))).getAttribute("value");
		logger.info("Verify the Tag");
		Assert.assertEquals(text_tag, "", "Tag text Entered");
		try
		{
			logger.info("Verify the Tag Added");
			Boolean status1=driver.findElement(By.xpath(prop.getProperty("tag_text"))).isDisplayed();
			Assert.assertEquals("false", status1);	
		}
		catch(Exception e)
		{
		System.out.println("No Tags Added");
		}
		logger.info("Verify the Description");
		String desc_text1=driver.findElement(By.id(prop.getProperty("desc"))).getAttribute("value");
		Assert.assertEquals(desc_text1, " ", "Description text Entered");
		
			logger.info("Verify the Solve Text");
		boolean status2=driver.findElement(By.id(prop.getProperty("pro_text"))).isDisplayed();
		boolean expected=true;
			
		Assert.assertEquals(status2, expected);
		
			logger.info("Verify the Plannck Do");
			boolean status3=driver.findElement(By.id(prop.getProperty("prodo_text"))).isDisplayed();
			boolean expected1=true;
			Assert.assertEquals(status3, expected1);
		
			logger.info("Verify the Resources");
			boolean status4=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).isDisplayed();
			boolean expected2=true;
			Assert.assertEquals(status4, expected2);
			
							
		String url_text=driver.findElement(By.id(prop.getProperty("prourl_for"))).getAttribute("value");
		logger.info("Verify the URL For");
		Assert.assertEquals(url_text, "", "URL text Entered");
		String url_linktext=driver.findElement(By.id(prop.getProperty("prourllink"))).getAttribute("value");
		logger.info("Verify the URL Link");
		Assert.assertEquals(url_linktext, "", "URL LINK text Entered");
		String att_text=driver.findElement(By.id(prop.getProperty("proattachfor"))).getAttribute("value");
		logger.info("Verify the Attachment For");
		Assert.assertEquals(att_text, "", "Attach text Entered");
		try {
			logger.info("Verify the URL For Added");
			Boolean status8=driver.findElement(By.xpath(prop.getProperty("urlname_count"))).isDisplayed();
			Assert.assertEquals("false", status8);	
			Boolean status9=driver.findElement(By.xpath(prop.getProperty("urllink_count"))).isDisplayed();
			logger.info("Verify the URL Link Added");
			Assert.assertEquals("false", status9);	
			Boolean status10=driver.findElement(By.xpath(prop.getProperty("attch_count"))).isDisplayed();
			logger.info("Verify the Attachment For Added");
			Assert.assertEquals("false", status10);
			Boolean status11=driver.findElement(By.xpath(prop.getProperty("attachlink_count"))).isDisplayed();
			logger.info("Verify the Attachment Link Added");
			Assert.assertEquals("false", status11);	
		
			}
			catch(Exception e)
			{
				System.out.println("No Typing is Open");
			}
			}
			else if(type.equalsIgnoreCase("Training Proposal"))
					{
				
				Thread.sleep(2000);
				logger.info("Check the Training Proposal");
				driver.findElement(By.xpath(prop.getProperty("activity_check"))).click();
				String actual=driver.findElement(By.xpath(prop.getProperty("activity_check"))).getAttribute("src");
				System.out.println(actual);
			logger.info("Click on Drafts Button");
			driver.findElement(By.xpath(prop.getProperty("drafts_submit"))).click();
			logger.info("Drafts Status After Submit");
			Thread.sleep(1000);
			String countafter=driver.findElement(By.xpath(prop.getProperty("drafts_status"))).getText();
			System.out.println("Drafts Submit Status="+countafter);
			logger.info("Verify the Drafts Counts");
			Assert.assertFalse(countbefore.equals(countafter), "Drafts Counts");
			
			Thread.sleep(2000);
			logger.info("Click on Drafts");
			driver.findElement(By.xpath(prop.getProperty("drafts_status"))).click();
			Thread.sleep(1000);
			logger.info("Image By Default URL");
			String imgurl=driver.findElement(By.xpath(prop.getProperty("img_src"))).getAttribute("src");
			System.out.println("Image add Url="+imgurl);
			logger.info("Verify the Image Attached URL");
			//Assert.assertEquals(imgurl, "http://planncktest.ap-south-1.elasticbeanstalk.com/public/categoryimage/others.jpg", "Image Added Mismatch");
			Thread.sleep(1000);
			driver.findElement(By.xpath(prop.getProperty("drafts_pro"))).click();
			Thread.sleep(2000);
			String act_src=driver.findElement(By.xpath(prop.getProperty("activity_check"))).getAttribute("src");
			logger.info("Verify the Image Attached URL Activity Proposal");
			Assert.assertEquals(act_src, "http://planncktest.ap-south-1.elasticbeanstalk.com/public/images/checked.svg", "Type Checked");
			String tra_src=driver.findElement(By.xpath(prop.getProperty("training_check"))).getAttribute("src");
			logger.info("Verify the Image Attached URL Training Proposal");
			Assert.assertEquals(tra_src, "http://planncktest.ap-south-1.elasticbeanstalk.com/public/images/unchecked.svg", "Type Checked");
			String title_text=driver.findElement(By.id(prop.getProperty("pro_title"))).getAttribute("value");
			logger.info("Verify the Title");
			Assert.assertEquals(title_text, " ENTER Proposal TITLE  FOR DRAFTS", "Title text Entered");
			logger.info("Click on Category");
			driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
			String cat_text=driver.findElement(By.xpath(".//*[@id='country-list-styled']")).getAttribute("value");
			logger.info("Verify the Category");
			Assert.assertEquals(cat_text, "", "Category text Entered");
			String text_tag=driver.findElement(By.id(prop.getProperty("pro_tagtext"))).getAttribute("value");
			logger.info("Verify the Tag");
			Assert.assertEquals(text_tag, "", "Tag text Entered");
			try
			{
				logger.info("Verify the Tag Added");
				Boolean status1=driver.findElement(By.xpath(prop.getProperty("tag_text"))).isDisplayed();
				Assert.assertEquals("false", status1);	
			}
			catch(Exception e)
			{
			System.out.println("No Tags Added");
			}
			logger.info("Verify the Description");
			String desc_text1=driver.findElement(By.id(prop.getProperty("desc"))).getAttribute("value");
			Assert.assertEquals(desc_text1, " ", "Description text Entered");
			
				logger.info("Verify the Solve Text");
			boolean status2=driver.findElement(By.id(prop.getProperty("pro_text"))).isDisplayed();
			boolean expected=true;
				
			Assert.assertEquals(status2, expected);
			
				logger.info("Verify the Plannck Do");
				boolean status3=driver.findElement(By.id(prop.getProperty("prodo_text"))).isDisplayed();
				boolean expected1=true;
				Assert.assertEquals(status3, expected1);
			
				logger.info("Verify the Resources");
				boolean status4=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).isDisplayed();
				boolean expected2=true;
				Assert.assertEquals(status4, expected2);
				
								
			String url_text=driver.findElement(By.id(prop.getProperty("prourl_for"))).getAttribute("value");
			logger.info("Verify the URL For");
			Assert.assertEquals(url_text, "", "URL text Entered");
			String url_linktext=driver.findElement(By.id(prop.getProperty("prourllink"))).getAttribute("value");
			logger.info("Verify the URL Link");
			Assert.assertEquals(url_linktext, "", "URL LINK text Entered");
			String att_text=driver.findElement(By.id(prop.getProperty("proattachfor"))).getAttribute("value");
			logger.info("Verify the Attachment For");
			Assert.assertEquals(att_text, "", "Attach text Entered");
			try {
				logger.info("Verify the URL For Added");
				Boolean status8=driver.findElement(By.xpath(prop.getProperty("urlname_count"))).isDisplayed();
				Assert.assertEquals("false", status8);	
				Boolean status9=driver.findElement(By.xpath(prop.getProperty("urllink_count"))).isDisplayed();
				logger.info("Verify the URL Link Added");
				Assert.assertEquals("false", status9);	
				Boolean status10=driver.findElement(By.xpath(prop.getProperty("attch_count"))).isDisplayed();
				logger.info("Verify the Attachment For Added");
				Assert.assertEquals("false", status10);
				Boolean status11=driver.findElement(By.xpath(prop.getProperty("attachlink_count"))).isDisplayed();
				logger.info("Verify the Attachment Link Added");
				Assert.assertEquals("false", status11);	
			
				}
				catch(Exception e)
				{
					System.out.println("No Typing is Open");
				}
			
					}
			else 
			{
				System.out.println("No Proposal Type");
			}
					
		}
		else if(type.equals("3.0"))
		{
			
		}
		}
}
