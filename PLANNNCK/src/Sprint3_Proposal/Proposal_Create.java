package Sprint3_Proposal;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
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
import org.testng.Assert;

import Lib.Resources;
public class Proposal_Create extends Resources{

	WebDriver driver;
	Properties prop;

	public void valid_proposalcreate(String browser,String email,String pwd,String type, String title,
			String category,String tags1,String desc,String solve,String pdo,String reso,String urlfor,String urllink
			,String atchfor,String atchlink,String img,String screen) throws InterruptedException, AWTException, IOException
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
		logger.info("Click on Proposal Tag");
		driver.findElement(By.xpath(prop.getProperty("propose_tag"))).click();
		Thread.sleep(2000);
		logger.info("Count of Submit Proposal");
		String beforsubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
		System.out.println("Count Before Submit="+beforsubmit);
		logger.info("Creating a Proposal");
		driver.findElement(By.xpath(prop.getProperty("proposal_button"))).click();
		Thread.sleep(1000);


		if(type.equals("Activity proposal"))
		{

			logger.info("Checked the Activity Proposal");
			WebElement act_checked=driver.findElement(By.xpath(prop.getProperty("activity_check")));			
			act_checked.click();

			Boolean act_display=act_checked.isDisplayed();
			System.out.println("Activity Checkbox is Displayed="+act_display);

			Boolean act_status=act_checked.isSelected();
			System.out.println("Activity Checkbox is Selected="+act_status);

			Boolean act_enabled=act_checked.isEnabled();
			System.out.println("Activity Checkbox is Enabled="+act_enabled);

			WebElement tri_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));
			Boolean tri_status=tri_checked.isSelected();
			System.out.println("Training Checkbox is Selected="+tri_status);

			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("status_check"))).getAttribute("checked") , "true", "Both are Checked");
			logger.info("Title of Proposal");
			WebElement ptitle=driver.findElement(By.id(prop.getProperty("pro_title")));
			ptitle.sendKeys(title);
			logger.info("Select the Category");
			String title_check=ptitle.getAttribute("value");
			Assert.assertTrue(title_check.equals(title), "Proposal Title Mismatch");

			if(category.equals("AGRICULTURE"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Agriculture"))).click();

			}
			else if(category.equals("ANIMAL"))
			{ 
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Animal"))).click();

			}
			else if(category.equals("ARTS"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Arts"))).click();

			}
			else if(category.equals("ARTS & CULTURE"))
			{

				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Artsculture"))).click();			
			}

			else if(category.equals("AWARENESS"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Awareness"))).click();			
			}

			else if(category.equals("CHILD"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Child"))).click();			
			}

			else if(category.equals("CLIMATE CHANGE"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Climatechange"))).click();			
			}

			else if(category.equals("COMPASSION"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Compassion"))).click();			
			}

			else if(category.equals("COMPUTERS"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Computers"))).click();			
			}

			else if(category.equals("DISASTER"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Disaster"))).click();			
			}

			else if(category.equals("EDUCATION"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Education"))).click();			
			}
			//sTARt
			else if(category.equals("ENERGY"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Energy"))).click();			
			}

			else if(category.equals("ENVIRONMENT"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Environment"))).click();			
			}

			else if(category.equals("FAMILY"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Family"))).click();			
			}

			else if(category.equals("FARMING"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Farming"))).click();			
			}

			else if(category.equals("FOOD"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Food"))).click();			
			}

			else if(category.equals("HACKATHON"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Hackathon"))).click();			
			}

			else if(category.equals("HEALTHCARE"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Healthcare"))).click();			
			}

			else if(category.equals("INFRASTRUCTURE"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Infrastructure"))).click();			
			}

			else if(category.equals("INTERNSHIP"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Internship"))).click();			
			}

			else if(category.equals("KINDNESS"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Kindness"))).click();			
			}

			else if(category.equals("PEACE"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Peace"))).click();			
			}

			else if(category.equals("REFUGEES"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Refugees"))).click();			
			}

			else if(category.equals("SCHOOL"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("School"))).click();			
			}

			else if(category.equals("SCIENCE"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Science"))).click();			
			}

			else if(category.equals("SENIORS"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Seniors"))).click();			
			}

			else if(category.equals("SPORTS"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Sports"))).click();			
			}

			else if(category.equals("STRATEGY"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Strategy"))).click();			
			}

			else if(category.equals("SUICIDE"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Suicide"))).click();			
			}

			else if(category.equals("WATER"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Water"))).click();			
			}

			else if(category.equals("WOMEN"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Women"))).click();			
			}

			else if(category.equals("OTHERS"))
			{
				logger.info("Select the Category");
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Others"))).click();			
			}

			logger.info("Enter the Tag");
			WebElement pro_tag=driver.findElement(By.id(prop.getProperty("pro_tagtext")));
			pro_tag.sendKeys(tags1);
			Thread.sleep(1000);
			String tag_check=pro_tag.getAttribute("value");
			Assert.assertTrue(tag_check.equals(tags1), "Proposal Tag Mismatch");

			WebElement tag_add=driver.findElement(By.xpath(prop.getProperty("pro_tags")));
			tag_add.click();
			Thread.sleep(1000);
			logger.info("Enter the Description");
			WebElement pro_desc=driver.findElement(By.id(prop.getProperty("desc")));
			pro_desc.sendKeys(desc);
			Thread.sleep(2000);

			String desc_check=pro_desc.getAttribute("value");
			Assert.assertEquals(desc_check, desc, "Proposal Description Mismatch");


			WebElement pro_solve=driver.findElement(By.xpath(prop.getProperty("pro_solve")));
			pro_solve.click();
			Thread.sleep(2000);
			logger.info("Enter the Plannck Solve");
			WebElement protext_click=driver.findElement(By.id(prop.getProperty("pro_text")));
			protext_click.sendKeys(solve);
			Thread.sleep(1000);

			String protext_check=protext_click.getAttribute("value");
			Assert.assertEquals(protext_check, solve, "Proposal Solve Mismatch");


			WebElement pro_do=driver.findElement(By.xpath(prop.getProperty("pro_do")));
			pro_do.click();
			Thread.sleep(1000);
			logger.info("Enter the Plannnck Do");
			WebElement prodo_text=driver.findElement(By.id(prop.getProperty("prodo_text")));
			prodo_text.sendKeys(pdo);
			Thread.sleep(1000);

			String prodo_check=prodo_text.getAttribute("value");
			Assert.assertEquals(prodo_check, pdo,"Plannnck Do Mismatch");


			WebElement prores_click=driver.findElement(By.xpath(prop.getProperty("pro_reso")));
			prores_click.click();
			Thread.sleep(1000);
			logger.info("Enter the Resources");
			WebElement protext_res=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
			protext_res.sendKeys(reso);

			Thread.sleep(2000);

			String val=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
			Assert.assertEquals(val, reso, "Resources Mismatch");

			WebElement prores_add=driver.findElement(By.xpath(prop.getProperty("reso_add")));
			prores_add.click();
			Thread.sleep(2000);

			String pro_value=driver.findElement(By.xpath("html/body/div/form/section[2]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/span/span[1]")).getText();
			System.out.println("the Resource Added="+pro_value);
			Assert.assertEquals(pro_value, reso, "Mismatch Resources After Add");
			logger.info("Enter the Url Name");
			WebElement prourl_for=driver.findElement(By.id(prop.getProperty("prourl_for")));
			prourl_for.sendKeys(urlfor);
			Thread.sleep(1000);

			String url_check=prourl_for.getAttribute("value");
			System.out.println("Url enter is="+url_check);
			Assert.assertTrue(url_check.equals(urlfor), "URL Text Mismatch");

			logger.info("Enter the URL Link");
			WebElement prolink=driver.findElement(By.id(prop.getProperty("prourllink")));
			prolink.sendKeys(urllink);

			String urllink_check=prolink.getAttribute("value");
			System.out.println("URL Lin Enter="+urllink_check);

			Assert.assertTrue(urllink_check.equals(urllink), "URL Link Text Mismatch");
			Thread.sleep(1000);

			WebElement prolink_add=driver.findElement(By.id(prop.getProperty("prolinkadd")));
			prolink_add.click();
			Thread.sleep(2000);
			//System.out.println(driver.findElement(By.xpath(prop.getProperty("urlname_count"))).getText());
			String actual=driver.findElement(By.xpath(prop.getProperty("urlname_count"))).getText();
			System.out.println("actual="+actual);
			String expected=Resources.toTitleCase(urlfor);	
			System.out.println("expected="+expected);
			Assert.assertEquals(actual, expected, "Url Name After Add not Matched");

			String urlname_link=driver.findElement(By.xpath(prop.getProperty("urllink_count"))).getText();	
			Assert.assertEquals(urlname_link, urllink, "Link Added is Not Matched");
			logger.info("Enter the Attachment Name");
			WebElement proattach_name=driver.findElement(By.id(prop.getProperty("proattachfor")));
			proattach_name.sendKeys(atchfor);

			String attname_check=proattach_name.getAttribute("value");
			Assert.assertTrue(attname_check.equals(atchfor), "Attachment Name Text Mismatch");

			Thread.sleep(1000);

			WebElement proattach_link=driver.findElement(By.xpath(prop.getProperty("proattachimg")));
			proattach_link.click();


			StringSelection stringSelection = new StringSelection(atchlink);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			Thread.sleep(2000);

			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			WebElement upload_img=driver.findElement(By.id(prop.getProperty("proimgadd")));
			upload_img.click();

			screen_shots(screen);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

			Thread.sleep(2000);
			logger.info("Attachent File Name");
			String attachname_check=driver.findElement(By.xpath(prop.getProperty("attch_count"))).getText();
			String verifyadd=Resources.toTitleCase(attachname_check);
			String verifytext=Resources.toTitleCase(atchfor);
			Assert.assertEquals(verifyadd, verifytext, "After Submit Attachment Text Not Matched");

			String attachlink_check=driver.findElement(By.xpath(prop.getProperty("attachlink_count"))).getText();
			Assert.assertEquals(attachlink_check, img, "After Submit Not Matched");

			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();

			screen_shots(screen);

			Thread.sleep(2000);
			String aftersubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
			System.out.println("Count After Submit Status="+aftersubmit);

			Assert.assertFalse(beforsubmit.equals(aftersubmit));

			driver.findElement(By.xpath(prop.getProperty("submit_status"))).click();

			//String title1=driver.findElement(By.xpath(prop.getProperty("first_submit"))).getText();

			//Assert.assertEquals(title1, title.toUpperCase(), "Title Not Matched");
			Thread.sleep(2000);
			WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive.click();
			Thread.sleep(2000);
			WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff.click();
			Thread.sleep(1000);

			driver.close();

		}
		// Training Proposal

		else if(category.equals("Training Proposal"))
		{

			WebElement act_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));			
			act_checked.click();

			Boolean act_display=act_checked.isDisplayed();
			System.out.println("Activity Checkbox is Displayed="+act_display);

			Boolean act_status=act_checked.isSelected();
			System.out.println("Activity Checkbox is Selected="+act_status);

			Boolean act_enabled=act_checked.isEnabled();
			System.out.println("Activity Checkbox is Enabled="+act_enabled);

			WebElement tri_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));
			Boolean tri_status=tri_checked.isSelected();
			System.out.println("Training Checkbox is Selected="+tri_status);

			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("status_check"))).getAttribute("checked") , "true", "Both are Checked");

			WebElement ptitle=driver.findElement(By.id(prop.getProperty("pro_title")));
			ptitle.sendKeys(title);

			String title_check=ptitle.getAttribute("value");
			Assert.assertTrue(title_check.equals(title), "Proposal Title Mismatch");

			if(category.equals("AGRICULTURE"))
			{

				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Agriculture"))).click();

			}
			else if(category.equals("ANIMAL"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Animal"))).click();

			}
			else if(category.equals("ARTS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Arts"))).click();

			}
			else if(category.equals("ARTS & CULTURE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Artsculture"))).click();			
			}

			else if(category.equals("AWARENESS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Awareness"))).click();			
			}

			else if(category.equals("CHILD"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Child"))).click();			
			}

			else if(category.equals("CLIMATE CHANGE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Climatechange"))).click();			
			}

			else if(category.equals("COMPASSION"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Compassion"))).click();			
			}

			else if(category.equals("COMPUTERS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Computers"))).click();			
			}

			else if(category.equals("DISASTER"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Disaster"))).click();			
			}

			else if(category.equals("EDUCATION"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Education"))).click();			
			}
			//sTARt
			else if(category.equals("ENERGY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Energy"))).click();			
			}

			else if(category.equals("ENVIRONMENT"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Environment"))).click();			
			}

			else if(category.equals("FAMILY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Family"))).click();			
			}

			else if(category.equals("FARMING"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Farming"))).click();			
			}

			else if(category.equals("FOOD"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Food"))).click();			
			}

			else if(category.equals("HACKATHON"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Hackathon"))).click();			
			}

			else if(category.equals("HEALTHCARE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Healthcare"))).click();			
			}

			else if(category.equals("INFRASTRUCTURE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Infrastructure"))).click();			
			}

			else if(category.equals("INTERNSHIP"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Internship"))).click();			
			}

			else if(category.equals("KINDNESS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Kindness"))).click();			
			}

			else if(category.equals("PEACE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Peace"))).click();			
			}

			else if(category.equals("REFUGEES"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Refugees"))).click();			
			}

			else if(category.equals("SCHOOL"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("School"))).click();			
			}

			else if(category.equals("SCIENCE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Science"))).click();			
			}

			else if(category.equals("SENIORS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Seniors"))).click();			
			}

			else if(category.equals("SPORTS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Sports"))).click();			
			}

			else if(category.equals("STRATEGY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Strategy"))).click();			
			}

			else if(category.equals("SUICIDE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Suicide"))).click();			
			}

			else if(category.equals("WATER"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Water"))).click();			
			}

			else if(category.equals("WOMEN"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Women"))).click();			
			}

			else if(category.equals("OTHERS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Others"))).click();			
			}

			else
			{
				System.out.println("No Category");

			}


			WebElement pro_tag=driver.findElement(By.id(prop.getProperty("pro_tagtext")));
			pro_tag.sendKeys(tags1);
			Thread.sleep(1000);
			String tag_check=pro_tag.getAttribute("value");
			Assert.assertTrue(tag_check.equals(tags1), "Proposal Tag Mismatch");

			WebElement tag_add=driver.findElement(By.xpath(prop.getProperty("pro_tags")));
			tag_add.click();
			Thread.sleep(1000);

			WebElement pro_desc=driver.findElement(By.id(prop.getProperty("desc")));
			pro_desc.sendKeys(desc);
			Thread.sleep(2000);

			String desc_check=pro_desc.getAttribute("value");
			Assert.assertEquals(desc_check, desc, "Proposal Description Mismatch");


			WebElement pro_solve=driver.findElement(By.xpath(prop.getProperty("pro_solve")));
			pro_solve.click();
			Thread.sleep(2000);

			WebElement protext_click=driver.findElement(By.id(prop.getProperty("pro_text")));
			protext_click.sendKeys(solve);
			Thread.sleep(1000);

			String protext_check=protext_click.getAttribute("value");
			Assert.assertEquals(protext_check, solve, "Proposal Solve Mismatch");


			WebElement pro_do=driver.findElement(By.xpath(prop.getProperty("pro_do")));
			pro_do.click();
			Thread.sleep(1000);

			WebElement prodo_text=driver.findElement(By.id(prop.getProperty("prodo_text")));
			prodo_text.sendKeys(pdo);
			Thread.sleep(1000);

			String prodo_check=prodo_text.getAttribute("value");
			Assert.assertEquals(prodo_check, pdo,"Plannnck Do Mismatch");


			WebElement prores_click=driver.findElement(By.xpath(prop.getProperty("pro_reso")));
			prores_click.click();
			Thread.sleep(1000);

			WebElement protext_res=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
			protext_res.sendKeys(reso);

			Thread.sleep(2000);

			String val=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
			Assert.assertEquals(val, reso, "Resources Mismatch");

			WebElement prores_add=driver.findElement(By.xpath(prop.getProperty("reso_add")));
			prores_add.click();
			Thread.sleep(2000);

			String pro_value=driver.findElement(By.xpath("html/body/div/form/section[2]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/span/span[1]")).getText();
			System.out.println("the Resource Added="+pro_value);
			Assert.assertEquals(pro_value, reso, "Mismatch Resources After Add");

			WebElement prourl_for=driver.findElement(By.id(prop.getProperty("prourl_for")));
			prourl_for.sendKeys(urlfor);
			Thread.sleep(1000);

			String url_check=prourl_for.getAttribute("value");
			System.out.println("Url enter is="+url_check);
			Assert.assertTrue(url_check.equals(urlfor), "URL Text Mismatch");

			WebElement prolink=driver.findElement(By.id(prop.getProperty("prourllink")));
			prolink.sendKeys(urllink);

			String urllink_check=prolink.getAttribute("value");
			System.out.println("URL Lin Enter="+urllink_check);

			Assert.assertTrue(urllink_check.equals(urllink), "URL Link Text Mismatch");
			Thread.sleep(1000);

			WebElement prolink_add=driver.findElement(By.id(prop.getProperty("prolinkadd")));
			prolink_add.click();
			Thread.sleep(2000);
			//System.out.println(driver.findElement(By.xpath(prop.getProperty("urlname_count"))).getText());
			String actual=driver.findElement(By.xpath(prop.getProperty("urlname_count"))).getText();
			System.out.println("actual="+actual);
			String expected=Resources.toTitleCase(urlfor);	
			System.out.println("expected="+expected);
			Assert.assertEquals(actual, expected, "Url Name After Add not Matched");

			String urlname_link=driver.findElement(By.xpath(prop.getProperty("urllink_count"))).getText();	
			Assert.assertEquals(urlname_link, urllink, "Link Added is Not Matched");

			WebElement proattach_name=driver.findElement(By.id(prop.getProperty("proattachfor")));
			proattach_name.sendKeys(atchfor);

			String attname_check=proattach_name.getAttribute("value");
			Assert.assertTrue(attname_check.equals(atchfor), "Attachment Name Text Mismatch");

			Thread.sleep(1000);

			WebElement proattach_link=driver.findElement(By.xpath(prop.getProperty("proattachimg")));
			proattach_link.click();


			StringSelection stringSelection = new StringSelection(atchlink);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			Thread.sleep(2000);

			Robot robot = new Robot();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			WebElement upload_img=driver.findElement(By.id(prop.getProperty("proimgadd")));
			upload_img.click();

			screen_shots(screen);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

			Thread.sleep(2000);
			String attachname_check=driver.findElement(By.xpath(prop.getProperty("attch_count"))).getText();
			String verifyadd=Resources.toTitleCase(attachname_check);
			String verifytext=Resources.toTitleCase(atchfor);
			Assert.assertEquals(verifyadd, verifytext, "After Submit Attachment Text Not Matched");

			String attachlink_check=driver.findElement(By.xpath(prop.getProperty("attachlink_count"))).getText();
			Assert.assertEquals(attachlink_check, img, "After Submit Not Matched");

			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();

			screen_shots(screen);

			Thread.sleep(2000);
			String aftersubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
			System.out.println("Count After Submit Status="+aftersubmit);

			Assert.assertFalse(beforsubmit.equals(aftersubmit));

			driver.findElement(By.xpath(prop.getProperty("submit_status"))).click();

			//String title1=driver.findElement(By.xpath(prop.getProperty("first_submit"))).getText();

			//Assert.assertEquals(title1, title.toUpperCase(), "Title Not Matched");
			Thread.sleep(2000);
			WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive.click();
			Thread.sleep(2000);
			WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff.click();
			Thread.sleep(1000);

			driver.close();
		}
		else
		{
			System.out.println("No Proposal Type Found");
		}	
	}

	public void coverimage_proposalcreate(String browser,String email,String pwd,String coverimg,String type, String title,
			String category,String tags1,String desc,String solve,String pdo,String reso,String urlfor,String urllink
			,String atchfor,String atchlink,String img,String screen) throws InterruptedException, AWTException, IOException
	{
		try {
			prop=file_execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));

		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user.sendKeys(email);

		WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user.sendKeys(pwd);

		driver.findElement(By.xpath(prop.getProperty("login"))).click();

		driver.findElement(By.xpath(prop.getProperty("propose_tag"))).click();
		Thread.sleep(2000);

		String beforsubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
		System.out.println("Count Before Submit="+beforsubmit);
		driver.findElement(By.xpath(prop.getProperty("proposal_button"))).click();
		Thread.sleep(1000);
		WebElement click_cover=driver.findElement(By.xpath(prop.getProperty("coverimg_btn")));
		click_cover.click();

		WebElement click_uplbtn=driver.findElement(By.xpath(prop.getProperty("upload_btn")));
		click_uplbtn.click();
		Thread.sleep(1000);

		WebElement click_selpic=driver.findElement(By.xpath(prop.getProperty("upload_btn")));
		click_selpic.click();
		Thread.sleep(1000);

		StringSelection stringSelection = new StringSelection(coverimg);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Thread.sleep(2000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		WebElement cover_img=driver.findElement(By.id(prop.getProperty("update_pic	")));
		cover_img.click();

		//screen_shots(screen);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(2000);




		if(type.equals("Activity Proposal"))
		{
			WebElement act_checked=driver.findElement(By.xpath(prop.getProperty("activity_check")));			
			act_checked.click();

			Boolean act_display=act_checked.isDisplayed();
			System.out.println("Activity Checkbox is Displayed="+act_display);

			Boolean act_status=act_checked.isSelected();
			System.out.println("Activity Checkbox is Selected="+act_status);

			Boolean act_enabled=act_checked.isEnabled();
			System.out.println("Activity Checkbox is Enabled="+act_enabled);

			WebElement tri_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));
			Boolean tri_status=tri_checked.isSelected();
			System.out.println("Training Checkbox is Selected="+tri_status);

			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("status_check"))).getAttribute("checked") , "true", "Both are Checked");

			WebElement ptitle=driver.findElement(By.id(prop.getProperty("pro_title")));
			ptitle.sendKeys(title);

			String title_check=ptitle.getAttribute("value");
			Assert.assertTrue(title_check.equals(title), "Proposal Title Mismatch");

			if(category.equals("AGRICULTURE"))
			{

				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Agriculture"))).click();

			}
			else if(category.equals("ANIMAL"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Animal"))).click();

			}
			else if(category.equals("ARTS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Arts"))).click();

			}
			else if(category.equals("ARTS & CULTURE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Artsculture"))).click();			
			}

			else if(category.equals("AWARENESS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Awareness"))).click();			
			}

			else if(category.equals("CHILD"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Child"))).click();			
			}

			else if(category.equals("CLIMATE CHANGE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Climatechange"))).click();			
			}

			else if(category.equals("COMPASSION"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Compassion"))).click();			
			}

			else if(category.equals("COMPUTERS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Computers"))).click();			
			}

			else if(category.equals("DISASTER"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Disaster"))).click();			
			}

			else if(category.equals("EDUCATION"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Education"))).click();			
			}
			//sTARt
			else if(category.equals("ENERGY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Energy"))).click();			
			}

			else if(category.equals("ENVIRONMENT"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Environment"))).click();			
			}

			else if(category.equals("FAMILY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Family"))).click();			
			}

			else if(category.equals("FARMING"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Farming"))).click();			
			}

			else if(category.equals("FOOD"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Food"))).click();			
			}

			else if(category.equals("HACKATHON"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Hackathon"))).click();			
			}

			else if(category.equals("HEALTHCARE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Healthcare"))).click();			
			}

			else if(category.equals("INFRASTRUCTURE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Infrastructure"))).click();			
			}

			else if(category.equals("INTERNSHIP"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Internship"))).click();			
			}

			else if(category.equals("KINDNESS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Kindness"))).click();			
			}

			else if(category.equals("PEACE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Peace"))).click();			
			}

			else if(category.equals("REFUGEES"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Refugees"))).click();			
			}

			else if(category.equals("SCHOOL"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("School"))).click();			
			}

			else if(category.equals("SCIENCE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Science"))).click();			
			}

			else if(category.equals("SENIORS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Seniors"))).click();			
			}

			else if(category.equals("SPORTS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Sports"))).click();			
			}

			else if(category.equals("STRATEGY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Strategy"))).click();			
			}

			else if(category.equals("SUICIDE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Suicide"))).click();			
			}

			else if(category.equals("WATER"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Water"))).click();			
			}

			else if(category.equals("WOMEN"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Women"))).click();			
			}

			else if(category.equals("OTHERS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Others"))).click();			
			}

			else
			{
				System.out.println("No Category");

			}


			WebElement pro_tag=driver.findElement(By.id(prop.getProperty("pro_tagtext")));
			pro_tag.sendKeys(tags1);
			Thread.sleep(1000);
			String tag_check=pro_tag.getAttribute("value");
			Assert.assertTrue(tag_check.equals(tags1), "Proposal Tag Mismatch");

			WebElement tag_add=driver.findElement(By.xpath(prop.getProperty("pro_tags")));
			tag_add.click();
			Thread.sleep(1000);

			WebElement pro_desc=driver.findElement(By.id(prop.getProperty("desc")));
			pro_desc.sendKeys(desc);
			Thread.sleep(2000);

			String desc_check=pro_desc.getAttribute("value");
			Assert.assertEquals(desc_check, desc, "Proposal Description Mismatch");


			WebElement pro_solve=driver.findElement(By.xpath(prop.getProperty("pro_solve")));
			pro_solve.click();
			Thread.sleep(2000);

			WebElement protext_click=driver.findElement(By.id(prop.getProperty("pro_text")));
			protext_click.sendKeys(solve);
			Thread.sleep(1000);

			String protext_check=protext_click.getAttribute("value");
			Assert.assertEquals(protext_check, solve, "Proposal Solve Mismatch");


			WebElement pro_do=driver.findElement(By.xpath(prop.getProperty("pro_do")));
			pro_do.click();
			Thread.sleep(1000);

			WebElement prodo_text=driver.findElement(By.id(prop.getProperty("prodo_text")));
			prodo_text.sendKeys(pdo);
			Thread.sleep(1000);

			String prodo_check=prodo_text.getAttribute("value");
			Assert.assertEquals(prodo_check, pdo,"Plannnck Do Mismatch");


			WebElement prores_click=driver.findElement(By.xpath(prop.getProperty("pro_reso")));
			prores_click.click();
			Thread.sleep(1000);

			WebElement protext_res=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
			protext_res.sendKeys(reso);

			Thread.sleep(2000);

			String val=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
			Assert.assertEquals(val, reso, "Resources Mismatch");

			WebElement prores_add=driver.findElement(By.xpath(prop.getProperty("reso_add")));
			prores_add.click();
			Thread.sleep(2000);

			String pro_value=driver.findElement(By.xpath("html/body/div/form/section[2]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/span/span[1]")).getText();
			System.out.println("the Resource Added="+pro_value);
			Assert.assertEquals(pro_value, reso, "Mismatch Resources After Add");

			WebElement prourl_for=driver.findElement(By.id(prop.getProperty("prourl_for")));
			prourl_for.sendKeys(urlfor);
			Thread.sleep(1000);

			String url_check=prourl_for.getAttribute("value");
			System.out.println("Url enter is="+url_check);
			Assert.assertTrue(url_check.equals(urlfor), "URL Text Mismatch");

			WebElement prolink=driver.findElement(By.id(prop.getProperty("prourllink")));
			prolink.sendKeys(urllink);

			String urllink_check=prolink.getAttribute("value");
			System.out.println("URL Lin Enter="+urllink_check);

			Assert.assertTrue(urllink_check.equals(urllink), "URL Link Text Mismatch");
			Thread.sleep(1000);

			WebElement prolink_add=driver.findElement(By.id(prop.getProperty("prolinkadd")));
			prolink_add.click();
			Thread.sleep(2000);
			//System.out.println(driver.findElement(By.xpath(prop.getProperty("urlname_count"))).getText());
			String actual=driver.findElement(By.xpath(prop.getProperty("urlname_count"))).getText();
			System.out.println("actual="+actual);
			String expected=Resources.toTitleCase(urlfor);	
			System.out.println("expected="+expected);
			Assert.assertEquals(actual, expected, "Url Name After Add not Matched");

			String urlname_link=driver.findElement(By.xpath(prop.getProperty("urllink_count"))).getText();	
			Assert.assertEquals(urlname_link, urllink, "Link Added is Not Matched");

			WebElement proattach_name=driver.findElement(By.id(prop.getProperty("proattachfor")));
			proattach_name.sendKeys(atchfor);

			String attname_check=proattach_name.getAttribute("value");
			Assert.assertTrue(attname_check.equals(atchfor), "Attachment Name Text Mismatch");

			Thread.sleep(1000);

			WebElement proattach_link=driver.findElement(By.xpath(prop.getProperty("proattachimg")));
			proattach_link.click();


			StringSelection stringSelection1 = new StringSelection(atchlink);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
			Thread.sleep(2000);

			Robot robot1 = new Robot();

			robot1.keyPress(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_V);
			robot1.keyRelease(KeyEvent.VK_V);
			robot1.keyRelease(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);

			WebElement upload_img=driver.findElement(By.id(prop.getProperty("proimgadd")));
			upload_img.click();

			screen_shots(screen);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

			Thread.sleep(2000);
			String attachname_check=driver.findElement(By.xpath(prop.getProperty("attch_count"))).getText();
			String verifyadd=Resources.toTitleCase(attachname_check);
			String verifytext=Resources.toTitleCase(atchfor);
			Assert.assertEquals(verifyadd, verifytext, "After Submit Attachment Text Not Matched");

			String attachlink_check=driver.findElement(By.xpath(prop.getProperty("attachlink_count"))).getText();
			Assert.assertEquals(attachlink_check, img, "After Submit Not Matched");

			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();

			screen_shots(screen);

			Thread.sleep(2000);
			String aftersubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
			System.out.println("Count After Submit Status="+aftersubmit);

			Assert.assertFalse(beforsubmit.equals(aftersubmit));

			driver.findElement(By.xpath(prop.getProperty("submit_status"))).click();

			//String title1=driver.findElement(By.xpath(prop.getProperty("first_submit"))).getText();

			//Assert.assertEquals(title1, title.toUpperCase(), "Title Not Matched");
			Thread.sleep(2000);
			WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive.click();
			Thread.sleep(2000);
			WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff.click();
			Thread.sleep(1000);

			driver.close();

		}
		// Training Proposal

		else if(category.equals("Training Proposal"))
		{

			WebElement act_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));			
			act_checked.click();

			Boolean act_display=act_checked.isDisplayed();
			System.out.println("Activity Checkbox is Displayed="+act_display);

			Boolean act_status=act_checked.isSelected();
			System.out.println("Activity Checkbox is Selected="+act_status);

			Boolean act_enabled=act_checked.isEnabled();
			System.out.println("Activity Checkbox is Enabled="+act_enabled);

			WebElement tri_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));
			Boolean tri_status=tri_checked.isSelected();
			System.out.println("Training Checkbox is Selected="+tri_status);

			Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("status_check"))).getAttribute("checked") , "true", "Both are Checked");

			WebElement ptitle=driver.findElement(By.id(prop.getProperty("pro_title")));
			ptitle.sendKeys(title);

			String title_check=ptitle.getAttribute("value");
			Assert.assertTrue(title_check.equals(title), "Proposal Title Mismatch");

			if(category.equals("AGRICULTURE"))
			{

				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Agriculture"))).click();

			}
			else if(category.equals("ANIMAL"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Animal"))).click();

			}
			else if(category.equals("ARTS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Arts"))).click();

			}
			else if(category.equals("ARTS & CULTURE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Artsculture"))).click();			
			}

			else if(category.equals("AWARENESS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Awareness"))).click();			
			}

			else if(category.equals("CHILD"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Child"))).click();			
			}

			else if(category.equals("CLIMATE CHANGE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Climatechange"))).click();			
			}

			else if(category.equals("COMPASSION"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Compassion"))).click();			
			}

			else if(category.equals("COMPUTERS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Computers"))).click();			
			}

			else if(category.equals("DISASTER"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Disaster"))).click();			
			}

			else if(category.equals("EDUCATION"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Education"))).click();			
			}
			//sTARt
			else if(category.equals("ENERGY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Energy"))).click();			
			}

			else if(category.equals("ENVIRONMENT"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Environment"))).click();			
			}

			else if(category.equals("FAMILY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Family"))).click();			
			}

			else if(category.equals("FARMING"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Farming"))).click();			
			}

			else if(category.equals("FOOD"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Food"))).click();			
			}

			else if(category.equals("HACKATHON"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Hackathon"))).click();			
			}

			else if(category.equals("HEALTHCARE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Healthcare"))).click();			
			}

			else if(category.equals("INFRASTRUCTURE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Infrastructure"))).click();			
			}

			else if(category.equals("INTERNSHIP"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Internship"))).click();			
			}

			else if(category.equals("KINDNESS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Kindness"))).click();			
			}

			else if(category.equals("PEACE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Peace"))).click();			
			}

			else if(category.equals("REFUGEES"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Refugees"))).click();			
			}

			else if(category.equals("SCHOOL"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("School"))).click();			
			}

			else if(category.equals("SCIENCE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Science"))).click();			
			}

			else if(category.equals("SENIORS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Seniors"))).click();			
			}

			else if(category.equals("SPORTS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Sports"))).click();			
			}

			else if(category.equals("STRATEGY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Strategy"))).click();			
			}

			else if(category.equals("SUICIDE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Suicide"))).click();			
			}

			else if(category.equals("WATER"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Water"))).click();			
			}

			else if(category.equals("WOMEN"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Women"))).click();			
			}

			else if(category.equals("OTHERS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Others"))).click();			
			}

			else
			{
				System.out.println("No Category");

			}


			WebElement pro_tag=driver.findElement(By.id(prop.getProperty("pro_tagtext")));
			pro_tag.sendKeys(tags1);
			Thread.sleep(1000);
			String tag_check=pro_tag.getAttribute("value");
			Assert.assertTrue(tag_check.equals(tags1), "Proposal Tag Mismatch");

			WebElement tag_add=driver.findElement(By.xpath(prop.getProperty("pro_tags")));
			tag_add.click();
			Thread.sleep(1000);

			WebElement pro_desc=driver.findElement(By.id(prop.getProperty("desc")));
			pro_desc.sendKeys(desc);
			Thread.sleep(2000);

			String desc_check=pro_desc.getAttribute("value");
			Assert.assertEquals(desc_check, desc, "Proposal Description Mismatch");


			WebElement pro_solve=driver.findElement(By.xpath(prop.getProperty("pro_solve")));
			pro_solve.click();
			Thread.sleep(2000);

			WebElement protext_click=driver.findElement(By.id(prop.getProperty("pro_text")));
			protext_click.sendKeys(solve);
			Thread.sleep(1000);

			String protext_check=protext_click.getAttribute("value");
			Assert.assertEquals(protext_check, solve, "Proposal Solve Mismatch");


			WebElement pro_do=driver.findElement(By.xpath(prop.getProperty("pro_do")));
			pro_do.click();
			Thread.sleep(1000);

			WebElement prodo_text=driver.findElement(By.id(prop.getProperty("prodo_text")));
			prodo_text.sendKeys(pdo);
			Thread.sleep(1000);

			String prodo_check=prodo_text.getAttribute("value");
			Assert.assertEquals(prodo_check, pdo,"Plannnck Do Mismatch");


			WebElement prores_click=driver.findElement(By.xpath(prop.getProperty("pro_reso")));
			prores_click.click();
			Thread.sleep(1000);

			WebElement protext_res=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
			protext_res.sendKeys(reso);

			Thread.sleep(2000);

			String val=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
			Assert.assertEquals(val, reso, "Resources Mismatch");

			WebElement prores_add=driver.findElement(By.xpath(prop.getProperty("reso_add")));
			prores_add.click();
			Thread.sleep(2000);

			String pro_value=driver.findElement(By.xpath("html/body/div/form/section[2]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/span/span[1]")).getText();
			System.out.println("the Resource Added="+pro_value);
			Assert.assertEquals(pro_value, reso, "Mismatch Resources After Add");

			WebElement prourl_for=driver.findElement(By.id(prop.getProperty("prourl_for")));
			prourl_for.sendKeys(urlfor);
			Thread.sleep(1000);

			String url_check=prourl_for.getAttribute("value");
			System.out.println("Url enter is="+url_check);
			Assert.assertTrue(url_check.equals(urlfor), "URL Text Mismatch");

			WebElement prolink=driver.findElement(By.id(prop.getProperty("prourllink")));
			prolink.sendKeys(urllink);

			String urllink_check=prolink.getAttribute("value");
			System.out.println("URL Lin Enter="+urllink_check);

			Assert.assertTrue(urllink_check.equals(urllink), "URL Link Text Mismatch");
			Thread.sleep(1000);

			WebElement prolink_add=driver.findElement(By.id(prop.getProperty("prolinkadd")));
			prolink_add.click();
			Thread.sleep(2000);
			//System.out.println(driver.findElement(By.xpath(prop.getProperty("urlname_count"))).getText());
			String actual=driver.findElement(By.xpath(prop.getProperty("urlname_count"))).getText();
			System.out.println("actual="+actual);
			String expected=Resources.toTitleCase(urlfor);	
			System.out.println("expected="+expected);
			Assert.assertEquals(actual, expected, "Url Name After Add not Matched");

			String urlname_link=driver.findElement(By.xpath(prop.getProperty("urllink_count"))).getText();	
			Assert.assertEquals(urlname_link, urllink, "Link Added is Not Matched");

			WebElement proattach_name=driver.findElement(By.id(prop.getProperty("proattachfor")));
			proattach_name.sendKeys(atchfor);

			String attname_check=proattach_name.getAttribute("value");
			Assert.assertTrue(attname_check.equals(atchfor), "Attachment Name Text Mismatch");

			Thread.sleep(1000);

			WebElement proattach_link=driver.findElement(By.xpath(prop.getProperty("proattachimg")));
			proattach_link.click();


			StringSelection stringSelection1 = new StringSelection(atchlink);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);
			Thread.sleep(2000);

			Robot robot1 = new Robot();

			robot1.keyPress(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_V);
			robot1.keyRelease(KeyEvent.VK_V);
			robot1.keyRelease(KeyEvent.VK_CONTROL);
			robot1.keyPress(KeyEvent.VK_ENTER);
			robot1.keyRelease(KeyEvent.VK_ENTER);

			WebElement upload_img=driver.findElement(By.id(prop.getProperty("proimgadd")));
			upload_img.click();

			screen_shots(screen);
			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

			Thread.sleep(2000);
			String attachname_check=driver.findElement(By.xpath(prop.getProperty("attch_count"))).getText();
			String verifyadd=Resources.toTitleCase(attachname_check);
			String verifytext=Resources.toTitleCase(atchfor);
			Assert.assertEquals(verifyadd, verifytext, "After Submit Attachment Text Not Matched");

			String attachlink_check=driver.findElement(By.xpath(prop.getProperty("attachlink_count"))).getText();
			Assert.assertEquals(attachlink_check, img, "After Submit Not Matched");

			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();

			screen_shots(screen);

			Thread.sleep(2000);
			String aftersubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
			System.out.println("Count After Submit Status="+aftersubmit);

			Assert.assertFalse(beforsubmit.equals(aftersubmit));

			driver.findElement(By.xpath(prop.getProperty("submit_status"))).click();

			//String title1=driver.findElement(By.xpath(prop.getProperty("first_submit"))).getText();

			//Assert.assertEquals(title1, title.toUpperCase(), "Title Not Matched");
			Thread.sleep(2000);
			WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive.click();
			Thread.sleep(2000);
			WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff.click();
			Thread.sleep(1000);

			driver.close();
		}		
		else
		{
			System.out.println("No Proposal Type");
		}
	}

	public void resources_addmultiple(String browser,String steps,String email,String pwd,String type, String title,
			String category,String tags1,String desc,String solve,String pdo,String reso1,String reso2,String reso3,String reso4,String reso5,String reso6,String reso7,
			String reso8,String reso9,String reso10,String reso11,String reso12,String reso13,String reso14,String reso15,String reso16,String reso17,String reso18,String reso19,String reso20,
			String screen) throws InterruptedException, AWTException, IOException
	{
		try {
			prop=file_execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver=Resources.browser(browser);

		driver.get(prop.getProperty("url_login"));

		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user.sendKeys(email);

		WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user.sendKeys(pwd);

		driver.findElement(By.xpath(prop.getProperty("login"))).click();

		driver.findElement(By.xpath(prop.getProperty("propose_tag"))).click();
		Thread.sleep(2000);

		String beforsubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
		System.out.println("Count Before Submit="+beforsubmit);
		driver.findElement(By.xpath(prop.getProperty("proposal_button"))).click();
		Thread.sleep(1000);
		if(steps.equals("1.0"))
		{


			if(type.equals("Activity Proposal"))
			{
				WebElement act_checked=driver.findElement(By.xpath(prop.getProperty("activity_check")));			
				act_checked.click();

				Boolean act_display=act_checked.isDisplayed();
				System.out.println("Activity Checkbox is Displayed="+act_display);

				Boolean act_status=act_checked.isSelected();
				System.out.println("Activity Checkbox is Selected="+act_status);

				Boolean act_enabled=act_checked.isEnabled();
				System.out.println("Activity Checkbox is Enabled="+act_enabled);

				WebElement tri_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));
				Boolean tri_status=tri_checked.isSelected();
				System.out.println("Training Checkbox is Selected="+tri_status);

				Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("status_check"))).getAttribute("checked") , "true", "Both are Checked");

				WebElement ptitle=driver.findElement(By.id(prop.getProperty("pro_title")));
				ptitle.sendKeys(title);

				String title_check=ptitle.getAttribute("value");
				Assert.assertTrue(title_check.equals(title), "Proposal Title Mismatch");

				if(category.equals("AGRICULTURE"))
				{

					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Agriculture"))).click();

				}
				else if(category.equals("ANIMAL"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Animal"))).click();

				}
				else if(category.equals("ARTS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Arts"))).click();

				}
				else if(category.equals("ARTS & CULTURE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Artsculture"))).click();			
				}

				else if(category.equals("AWARENESS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Awareness"))).click();			
				}

				else if(category.equals("CHILD"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Child"))).click();			
				}

				else if(category.equals("CLIMATE CHANGE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Climatechange"))).click();			
				}

				else if(category.equals("COMPASSION"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Compassion"))).click();			
				}

				else if(category.equals("COMPUTERS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Computers"))).click();			
				}

				else if(category.equals("DISASTER"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Disaster"))).click();			
				}

				else if(category.equals("EDUCATION"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Education"))).click();			
				}
				//sTARt
				else if(category.equals("ENERGY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Energy"))).click();			
				}

				else if(category.equals("ENVIRONMENT"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Environment"))).click();			
				}

				else if(category.equals("FAMILY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Family"))).click();			
				}

				else if(category.equals("FARMING"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Farming"))).click();			
				}

				else if(category.equals("FOOD"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Food"))).click();			
				}

				else if(category.equals("HACKATHON"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Hackathon"))).click();			
				}

				else if(category.equals("HEALTHCARE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Healthcare"))).click();			
				}

				else if(category.equals("INFRASTRUCTURE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Infrastructure"))).click();			
				}

				else if(category.equals("INTERNSHIP"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Internship"))).click();			
				}

				else if(category.equals("KINDNESS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Kindness"))).click();			
				}

				else if(category.equals("PEACE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Peace"))).click();			
				}

				else if(category.equals("REFUGEES"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Refugees"))).click();			
				}

				else if(category.equals("SCHOOL"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("School"))).click();			
				}

				else if(category.equals("SCIENCE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Science"))).click();			
				}

				else if(category.equals("SENIORS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Seniors"))).click();			
				}

				else if(category.equals("SPORTS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Sports"))).click();			
				}

				else if(category.equals("STRATEGY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Strategy"))).click();			
				}

				else if(category.equals("SUICIDE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Suicide"))).click();			
				}

				else if(category.equals("WATER"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Water"))).click();			
				}

				else if(category.equals("WOMEN"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Women"))).click();			
				}

				else if(category.equals("OTHERS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Others"))).click();			
				}


				WebElement pro_tag=driver.findElement(By.id(prop.getProperty("pro_tagtext")));
				pro_tag.sendKeys(tags1);
				Thread.sleep(1000);
				String tag_check=pro_tag.getAttribute("value");
				Assert.assertTrue(tag_check.equals(tags1), "Proposal Tag Mismatch");

				WebElement tag_add=driver.findElement(By.xpath(prop.getProperty("pro_tags")));
				tag_add.click();
				Thread.sleep(1000);

				WebElement pro_desc=driver.findElement(By.id(prop.getProperty("desc")));
				pro_desc.sendKeys(desc);
				Thread.sleep(2000);

				String desc_check=pro_desc.getAttribute("value");
				Assert.assertEquals(desc_check, desc, "Proposal Description Mismatch");


				WebElement pro_solve=driver.findElement(By.xpath(prop.getProperty("pro_solve")));
				pro_solve.click();
				Thread.sleep(2000);

				WebElement protext_click=driver.findElement(By.id(prop.getProperty("pro_text")));
				protext_click.sendKeys(solve);
				Thread.sleep(1000);

				String protext_check=protext_click.getAttribute("value");
				Assert.assertEquals(protext_check, solve, "Proposal Solve Mismatch");


				WebElement pro_do=driver.findElement(By.xpath(prop.getProperty("pro_do")));
				pro_do.click();
				Thread.sleep(1000);

				WebElement prodo_text=driver.findElement(By.id(prop.getProperty("prodo_text")));
				prodo_text.sendKeys(pdo);
				Thread.sleep(1000);

				String prodo_check=prodo_text.getAttribute("value");
				Assert.assertEquals(prodo_check, pdo,"Plannnck Do Mismatch");


				WebElement prores_click=driver.findElement(By.xpath(prop.getProperty("pro_reso")));
				prores_click.click();
				Thread.sleep(1000);

				// 1 Res

				WebElement protext_res1=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res1.sendKeys(reso1);

				Thread.sleep(1000);

				String val1=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val1, reso1, "Resources Mismatch");

				WebElement prores_add1=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add1.click();
				Thread.sleep(1000);
				// 2 Res

				WebElement protext_res2=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res2.sendKeys(reso2);

				Thread.sleep(1000);

				String val2=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val2, reso2, "Resources Mismatch");

				WebElement prores_add2=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add2.click();
				Thread.sleep(1000);

				// 3 Res

				WebElement protext_res3=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res3.sendKeys(reso3);

				Thread.sleep(1000);

				String val3=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val3, reso3, "Resources Mismatch");

				WebElement prores_add3=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add3.click();
				Thread.sleep(1000);

				//4 Res

				WebElement protext_res4=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res4.sendKeys(reso4);

				Thread.sleep(1000);

				String val4=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val4, reso4, "Resources Mismatch");

				WebElement prores_add4=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add4.click();
				Thread.sleep(1000);
				// 5 Res

				WebElement protext_res5=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res5.sendKeys(reso5);

				Thread.sleep(1000);

				String val5=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val5, reso5, "Resources Mismatch");

				WebElement prores_add5=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add5.click();
				Thread.sleep(1000);
				//6 Res

				WebElement protext_res6=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res6.sendKeys(reso6);

				Thread.sleep(1000);

				String val6=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val6, reso6, "Resources Mismatch");

				WebElement prores_add6=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add6.click();
				Thread.sleep(1000);
				//7 Res

				WebElement protext_res7=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res7.sendKeys(reso7);

				Thread.sleep(1000);

				String val7=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val7, reso7, "Resources Mismatch");

				WebElement prores_add7=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add7.click();
				Thread.sleep(1000);
				//8 Res

				WebElement protext_res8=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res8.sendKeys(reso8);

				Thread.sleep(1000);

				String val8=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val8, reso8, "Resources Mismatch");

				WebElement prores_add8=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add8.click();
				Thread.sleep(1000);
				//9 Res

				WebElement protext_res9=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res9.sendKeys(reso9);

				Thread.sleep(1000);

				String val9=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val9, reso9, "Resources Mismatch");

				WebElement prores_add9=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add9.click();
				Thread.sleep(1000);
				//10 Res

				WebElement protext_res10=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res10.sendKeys(reso10);

				Thread.sleep(1000);

				String val10=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val10, reso10, "Resources Mismatch");

				WebElement prores_add10=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add10.click();
				Thread.sleep(1000);
				//11 Res

				WebElement protext_res11=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res11.sendKeys(reso11);

				Thread.sleep(1000);

				String val11=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val11, reso11, "Resources Mismatch");

				WebElement prores_add11=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add11.click();
				Thread.sleep(1000);
				//12 Res

				WebElement protext_res12=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res12.sendKeys(reso12);

				Thread.sleep(1000);

				String val12=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val12, reso12, "Resources Mismatch");

				WebElement prores_add12=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add12.click();
				Thread.sleep(1000);
				//13 Res

				WebElement protext_res13=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res13.sendKeys(reso13);

				Thread.sleep(1000);

				String val13=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val13, reso13, "Resources Mismatch");

				WebElement prores_add13=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add13.click();
				Thread.sleep(1000);
				//14 Res

				WebElement protext_res14=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res14.sendKeys(reso14);

				Thread.sleep(1000);

				String val14=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val14, reso14, "Resources Mismatch");

				WebElement prores_add14=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add14.click();
				Thread.sleep(1000);
				//15 Res

				WebElement protext_res15=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res15.sendKeys(reso15);

				Thread.sleep(1000);

				String val15=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val15, reso15, "Resources Mismatch");

				WebElement prores_add15=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add15.click();
				Thread.sleep(1000);
				//16 Res

				WebElement protext_res16=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res16.sendKeys(reso16);

				Thread.sleep(1000);

				String val16=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val16, reso16, "Resources Mismatch");

				WebElement prores_add16=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add16.click();
				Thread.sleep(1000);
				//17 Res

				WebElement protext_res17=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res17.sendKeys(reso17);

				Thread.sleep(1000);

				String val17=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val17, reso17, "Resources Mismatch");

				WebElement prores_add17=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add17.click();
				Thread.sleep(1000);
				//18 Res

				WebElement protext_res18=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res18.sendKeys(reso18);

				Thread.sleep(1000);

				String val18=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val18, reso18, "Resources Mismatch");

				WebElement prores_add18=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add18.click();
				Thread.sleep(1000);
				//19 Res

				WebElement protext_res19=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res19.sendKeys(reso19);

				Thread.sleep(1000);

				String val19=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val19, reso19, "Resources Mismatch");

				WebElement prores_add19=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add19.click();
				Thread.sleep(1000);
				//20 Res

				WebElement protext_res20=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res20.sendKeys(reso20);

				Thread.sleep(1000);

				String val20=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val20, reso20, "Resources Mismatch");

				WebElement prores_add20=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add20.click();
				Thread.sleep(1000);
				screen_shots(screen);
				ArrayList<String> list = new ArrayList<String>();
				ArrayList<String>  res=new ArrayList<String>();
				for(int i=0;i<20;i++)
				{
					res.add(reso1);
					res.add(reso2);
					res.add(reso3);
					res.add(reso4);
					res.add(reso5);
					res.add(reso6);
					res.add(reso7);
					res.add(reso8);
					res.add(reso9);
					res.add(reso10);
					res.add(reso11);
					res.add(reso12);
					res.add(reso13);
					res.add(reso14);
					res.add(reso15);
					res.add(reso16);
					res.add(reso17);
					res.add(reso18);
					res.add(reso19);
					res.add(reso20);

				}

				for(int j=1;j<=20;j++)
				{
					String actual=driver.findElement(By.xpath("html/body/div[1]/form/section[2]/div/div/div/div[3]/div[1]/div/div/div[2]/div/span["+j+"]")).getText();
					list.add(actual);
				}
				Set<String>uniqueset= new HashSet<String>(list);
				for(String temp:uniqueset)
				{
					System.out.println(temp + ": " + Collections.frequency(list, temp));
				}

				System.out.println(list.size());
				for(String name1:list)
				{
					System.out.println("Added Resources is="+ name1);

				}
				for(int i=0;i<list.size();i++)
				{			
					System.out.println("List="+list.get(i));
					System.out.println("res="+res.get(i));
					Assert.assertEquals(list.get(i), res.get(i), "Mismatch Resources After Add");

				}
				screen_shots(screen);

				WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
				submit.click();

				screen_shots(screen);

				Thread.sleep(2000);
				String aftersubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
				System.out.println("Count After Submit Status="+aftersubmit);

				Assert.assertFalse(beforsubmit.equals(aftersubmit));

				driver.findElement(By.xpath(prop.getProperty("submit_status"))).click();

				//String title1=driver.findElement(By.xpath(prop.getProperty("first_submit"))).getText();

				//Assert.assertEquals(title1, title.toUpperCase(), "Title Not Matched");
				Thread.sleep(2000);
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();

			}
			// Training Proposal

			else if(category.equals("Training Proposal"))
			{

				WebElement act_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));			
				act_checked.click();

				Boolean act_display=act_checked.isDisplayed();
				System.out.println("Activity Checkbox is Displayed="+act_display);

				Boolean act_status=act_checked.isSelected();
				System.out.println("Activity Checkbox is Selected="+act_status);

				Boolean act_enabled=act_checked.isEnabled();
				System.out.println("Activity Checkbox is Enabled="+act_enabled);

				WebElement tri_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));
				Boolean tri_status=tri_checked.isSelected();
				System.out.println("Training Checkbox is Selected="+tri_status);

				Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("status_check"))).getAttribute("checked") , "true", "Both are Checked");

				WebElement ptitle=driver.findElement(By.id(prop.getProperty("pro_title")));
				ptitle.sendKeys(title);

				String title_check=ptitle.getAttribute("value");
				Assert.assertTrue(title_check.equals(title), "Proposal Title Mismatch");

				if(category.equals("AGRICULTURE"))
				{

					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Agriculture"))).click();

				}
				else if(category.equals("ANIMAL"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Animal"))).click();

				}
				else if(category.equals("ARTS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Arts"))).click();

				}
				else if(category.equals("ARTS & CULTURE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Artsculture"))).click();			
				}

				else if(category.equals("AWARENESS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Awareness"))).click();			
				}

				else if(category.equals("CHILD"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Child"))).click();			
				}

				else if(category.equals("CLIMATE CHANGE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Climatechange"))).click();			
				}

				else if(category.equals("COMPASSION"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Compassion"))).click();			
				}

				else if(category.equals("COMPUTERS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Computers"))).click();			
				}

				else if(category.equals("DISASTER"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Disaster"))).click();			
				}

				else if(category.equals("EDUCATION"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Education"))).click();			
				}
				//sTARt
				else if(category.equals("ENERGY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Energy"))).click();			
				}

				else if(category.equals("ENVIRONMENT"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Environment"))).click();			
				}

				else if(category.equals("FAMILY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Family"))).click();			
				}

				else if(category.equals("FARMING"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Farming"))).click();			
				}

				else if(category.equals("FOOD"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Food"))).click();			
				}

				else if(category.equals("HACKATHON"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Hackathon"))).click();			
				}

				else if(category.equals("HEALTHCARE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Healthcare"))).click();			
				}

				else if(category.equals("INFRASTRUCTURE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Infrastructure"))).click();			
				}

				else if(category.equals("INTERNSHIP"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Internship"))).click();			
				}

				else if(category.equals("KINDNESS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Kindness"))).click();			
				}

				else if(category.equals("PEACE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Peace"))).click();			
				}

				else if(category.equals("REFUGEES"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Refugees"))).click();			
				}

				else if(category.equals("SCHOOL"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("School"))).click();			
				}

				else if(category.equals("SCIENCE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Science"))).click();			
				}

				else if(category.equals("SENIORS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Seniors"))).click();			
				}

				else if(category.equals("SPORTS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Sports"))).click();			
				}

				else if(category.equals("STRATEGY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Strategy"))).click();			
				}

				else if(category.equals("SUICIDE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Suicide"))).click();			
				}

				else if(category.equals("WATER"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Water"))).click();			
				}

				else if(category.equals("WOMEN"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Women"))).click();			
				}

				else if(category.equals("OTHERS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Others"))).click();			
				}

				else
				{
					System.out.println("No Category");

				}


				WebElement pro_tag=driver.findElement(By.id(prop.getProperty("pro_tagtext")));
				pro_tag.sendKeys(tags1);
				Thread.sleep(1000);
				String tag_check=pro_tag.getAttribute("value");
				Assert.assertTrue(tag_check.equals(tags1), "Proposal Tag Mismatch");

				WebElement tag_add=driver.findElement(By.xpath(prop.getProperty("pro_tags")));
				tag_add.click();
				Thread.sleep(1000);

				WebElement pro_desc=driver.findElement(By.id(prop.getProperty("desc")));
				pro_desc.sendKeys(desc);
				Thread.sleep(2000);

				String desc_check=pro_desc.getAttribute("value");
				Assert.assertEquals(desc_check, desc, "Proposal Description Mismatch");


				WebElement pro_solve=driver.findElement(By.xpath(prop.getProperty("pro_solve")));
				pro_solve.click();
				Thread.sleep(2000);

				WebElement protext_click=driver.findElement(By.id(prop.getProperty("pro_text")));
				protext_click.sendKeys(solve);
				Thread.sleep(1000);

				String protext_check=protext_click.getAttribute("value");
				Assert.assertEquals(protext_check, solve, "Proposal Solve Mismatch");


				WebElement pro_do=driver.findElement(By.xpath(prop.getProperty("pro_do")));
				pro_do.click();
				Thread.sleep(1000);

				WebElement prodo_text=driver.findElement(By.id(prop.getProperty("prodo_text")));
				prodo_text.sendKeys(pdo);
				Thread.sleep(1000);

				String prodo_check=prodo_text.getAttribute("value");
				Assert.assertEquals(prodo_check, pdo,"Plannnck Do Mismatch");


				WebElement prores_click=driver.findElement(By.xpath(prop.getProperty("pro_reso")));
				prores_click.click();
				Thread.sleep(1000);

				// 1 Res

				WebElement protext_res1=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res1.sendKeys(reso1);

				Thread.sleep(1000);

				String val1=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val1, reso1, "Resources Mismatch");

				WebElement prores_add1=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add1.click();
				Thread.sleep(1000);
				// 2 Res

				WebElement protext_res2=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res2.sendKeys(reso2);

				Thread.sleep(1000);

				String val2=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val2, reso2, "Resources Mismatch");

				WebElement prores_add2=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add2.click();
				Thread.sleep(1000);

				// 3 Res

				WebElement protext_res3=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res3.sendKeys(reso3);

				Thread.sleep(1000);

				String val3=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val3, reso3, "Resources Mismatch");

				WebElement prores_add3=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add3.click();
				Thread.sleep(1000);

				//4 Res

				WebElement protext_res4=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res4.sendKeys(reso4);

				Thread.sleep(1000);

				String val4=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val4, reso4, "Resources Mismatch");

				WebElement prores_add4=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add4.click();
				Thread.sleep(1000);
				// 5 Res

				WebElement protext_res5=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res5.sendKeys(reso5);

				Thread.sleep(1000);

				String val5=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val5, reso5, "Resources Mismatch");

				WebElement prores_add5=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add5.click();
				Thread.sleep(1000);
				//6 Res

				WebElement protext_res6=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res6.sendKeys(reso6);

				Thread.sleep(1000);

				String val6=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val6, reso6, "Resources Mismatch");

				WebElement prores_add6=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add6.click();
				Thread.sleep(1000);
				//7 Res

				WebElement protext_res7=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res7.sendKeys(reso7);

				Thread.sleep(1000);

				String val7=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val7, reso7, "Resources Mismatch");

				WebElement prores_add7=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add7.click();
				Thread.sleep(1000);
				//8 Res

				WebElement protext_res8=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res8.sendKeys(reso8);

				Thread.sleep(1000);

				String val8=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val8, reso8, "Resources Mismatch");

				WebElement prores_add8=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add8.click();
				Thread.sleep(1000);
				//9 Res

				WebElement protext_res9=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res9.sendKeys(reso9);

				Thread.sleep(1000);

				String val9=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val9, reso9, "Resources Mismatch");

				WebElement prores_add9=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add9.click();
				Thread.sleep(1000);
				//10 Res

				WebElement protext_res10=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res10.sendKeys(reso10);

				Thread.sleep(1000);

				String val10=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val10, reso10, "Resources Mismatch");

				WebElement prores_add10=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add10.click();
				Thread.sleep(1000);
				//11 Res

				WebElement protext_res11=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res11.sendKeys(reso11);

				Thread.sleep(1000);

				String val11=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val11, reso11, "Resources Mismatch");

				WebElement prores_add11=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add11.click();
				Thread.sleep(1000);
				//12 Res

				WebElement protext_res12=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res12.sendKeys(reso12);

				Thread.sleep(1000);

				String val12=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val12, reso12, "Resources Mismatch");

				WebElement prores_add12=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add12.click();
				Thread.sleep(1000);
				//13 Res

				WebElement protext_res13=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res13.sendKeys(reso13);

				Thread.sleep(1000);

				String val13=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val13, reso13, "Resources Mismatch");

				WebElement prores_add13=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add13.click();
				Thread.sleep(1000);
				//14 Res

				WebElement protext_res14=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res14.sendKeys(reso14);

				Thread.sleep(1000);

				String val14=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val14, reso14, "Resources Mismatch");

				WebElement prores_add14=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add14.click();
				Thread.sleep(1000);
				//15 Res

				WebElement protext_res15=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res15.sendKeys(reso15);

				Thread.sleep(1000);

				String val15=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val15, reso15, "Resources Mismatch");

				WebElement prores_add15=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add15.click();
				Thread.sleep(1000);
				//16 Res

				WebElement protext_res16=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res16.sendKeys(reso16);

				Thread.sleep(1000);

				String val16=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val16, reso16, "Resources Mismatch");

				WebElement prores_add16=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add16.click();
				Thread.sleep(1000);
				//17 Res

				WebElement protext_res17=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res17.sendKeys(reso17);

				Thread.sleep(1000);

				String val17=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val17, reso17, "Resources Mismatch");

				WebElement prores_add17=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add17.click();
				Thread.sleep(1000);
				//18 Res

				WebElement protext_res18=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res18.sendKeys(reso18);

				Thread.sleep(1000);

				String val18=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val18, reso18, "Resources Mismatch");

				WebElement prores_add18=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add18.click();
				Thread.sleep(1000);
				//19 Res

				WebElement protext_res19=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res19.sendKeys(reso19);

				Thread.sleep(1000);

				String val19=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val19, reso19, "Resources Mismatch");

				WebElement prores_add19=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add19.click();
				Thread.sleep(1000);
				//20 Res

				WebElement protext_res20=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res20.sendKeys(reso20);

				Thread.sleep(1000);

				String val20=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val20, reso20, "Resources Mismatch");

				WebElement prores_add20=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add20.click();
				Thread.sleep(1000);
				screen_shots(screen);
				ArrayList<String> list = new ArrayList<String>();

				Thread.sleep(2000);
				for(int j=1;j<=20;j++)
				{
					Thread.sleep(1000);
					String actual=driver.findElement(By.xpath("html/body/div[1]/form/section[2]/div/div/div/div[3]/div[1]/div/div/div[2]/div/span["+j+"]")).getText();
					list.add(actual);
					//System.out.println(list.add(actual));
				}
				Set<String>uniqueset= new HashSet<String>(list);
				for(String temp:uniqueset)
				{
					System.out.println(temp + ": " + Collections.frequency(list, temp));
				}

				System.out.println(list.size());
				for(String name1:list)
				{
					System.out.println("Added Resources is="+ name1);

				}
				ArrayList<String>  res=new ArrayList<String>();
				for(int i=0;i<20;i++)
				{
					res.add(reso1);
					res.add(reso2);
					res.add(reso3);
					res.add(reso4);
					res.add(reso4);
					res.add(reso5);
					res.add(reso6);
					res.add(reso7);
					res.add(reso8);
					res.add(reso9);
					res.add(reso10);
					res.add(reso11);
					res.add(reso12);
					res.add(reso13);
					res.add(reso14);
					res.add(reso15);
					res.add(reso16);
					res.add(reso17);
					res.add(reso18);
					res.add(reso19);
					res.add(reso20);

				}
				for(int i=0;i<list.size();i++)
				{			
					Assert.assertEquals(list.get(i), res.get(i), "Mismatch Resources After Add");

				}
				screen_shots(screen);

				WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
				submit.click();

				screen_shots(screen);

				Thread.sleep(2000);
				String aftersubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
				System.out.println("Count After Submit Status="+aftersubmit);

				Assert.assertFalse(beforsubmit.equals(aftersubmit));

				driver.findElement(By.xpath(prop.getProperty("submit_status"))).click();

				//String title1=driver.findElement(By.xpath(prop.getProperty("first_submit"))).getText();

				//Assert.assertEquals(title1, title.toUpperCase(), "Title Not Matched");
				Thread.sleep(2000);
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();
			}
			else
			{
				System.out.println("No Proposal Type");
			}
		}
		else if(steps.equals("2.0"))
		{

			if(type.equals("Activity Proposal"))
			{
				WebElement act_checked=driver.findElement(By.xpath(prop.getProperty("activity_check")));			
				act_checked.click();

				Boolean act_display=act_checked.isDisplayed();
				System.out.println("Activity Checkbox is Displayed="+act_display);

				Boolean act_status=act_checked.isSelected();
				System.out.println("Activity Checkbox is Selected="+act_status);

				Boolean act_enabled=act_checked.isEnabled();
				System.out.println("Activity Checkbox is Enabled="+act_enabled);

				WebElement tri_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));
				Boolean tri_status=tri_checked.isSelected();
				System.out.println("Training Checkbox is Selected="+tri_status);

				Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("status_check"))).getAttribute("checked") , "true", "Both are Checked");

				WebElement ptitle=driver.findElement(By.id(prop.getProperty("pro_title")));
				ptitle.sendKeys(title);

				String title_check=ptitle.getAttribute("value");
				Assert.assertTrue(title_check.equals(title), "Proposal Title Mismatch");

				if(category.equals("AGRICULTURE"))
				{

					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Agriculture"))).click();

				}
				else if(category.equals("ANIMAL"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Animal"))).click();

				}
				else if(category.equals("ARTS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Arts"))).click();

				}
				else if(category.equals("ARTS & CULTURE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Artsculture"))).click();			
				}

				else if(category.equals("AWARENESS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Awareness"))).click();			
				}

				else if(category.equals("CHILD"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Child"))).click();			
				}

				else if(category.equals("CLIMATE CHANGE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Climatechange"))).click();			
				}

				else if(category.equals("COMPASSION"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Compassion"))).click();			
				}

				else if(category.equals("COMPUTERS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Computers"))).click();			
				}

				else if(category.equals("DISASTER"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Disaster"))).click();			
				}

				else if(category.equals("EDUCATION"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Education"))).click();			
				}
				//sTARt
				else if(category.equals("ENERGY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Energy"))).click();			
				}

				else if(category.equals("ENVIRONMENT"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Environment"))).click();			
				}

				else if(category.equals("FAMILY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Family"))).click();			
				}

				else if(category.equals("FARMING"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Farming"))).click();			
				}

				else if(category.equals("FOOD"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Food"))).click();			
				}

				else if(category.equals("HACKATHON"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Hackathon"))).click();			
				}

				else if(category.equals("HEALTHCARE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Healthcare"))).click();			
				}

				else if(category.equals("INFRASTRUCTURE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Infrastructure"))).click();			
				}

				else if(category.equals("INTERNSHIP"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Internship"))).click();			
				}

				else if(category.equals("KINDNESS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Kindness"))).click();			
				}

				else if(category.equals("PEACE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Peace"))).click();			
				}

				else if(category.equals("REFUGEES"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Refugees"))).click();			
				}

				else if(category.equals("SCHOOL"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("School"))).click();			
				}

				else if(category.equals("SCIENCE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Science"))).click();			
				}

				else if(category.equals("SENIORS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Seniors"))).click();			
				}

				else if(category.equals("SPORTS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Sports"))).click();			
				}

				else if(category.equals("STRATEGY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Strategy"))).click();			
				}

				else if(category.equals("SUICIDE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Suicide"))).click();			
				}

				else if(category.equals("WATER"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Water"))).click();			
				}

				else if(category.equals("WOMEN"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Women"))).click();			
				}

				else if(category.equals("OTHERS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Others"))).click();			
				}


				WebElement pro_tag=driver.findElement(By.id(prop.getProperty("pro_tagtext")));
				pro_tag.sendKeys(tags1);
				Thread.sleep(1000);
				String tag_check=pro_tag.getAttribute("value");
				Assert.assertTrue(tag_check.equals(tags1), "Proposal Tag Mismatch");

				WebElement tag_add=driver.findElement(By.xpath(prop.getProperty("pro_tags")));
				tag_add.click();
				Thread.sleep(1000);

				WebElement pro_desc=driver.findElement(By.id(prop.getProperty("desc")));
				pro_desc.sendKeys(desc);
				Thread.sleep(2000);

				String desc_check=pro_desc.getAttribute("value");
				Assert.assertEquals(desc_check, desc, "Proposal Description Mismatch");


				WebElement pro_solve=driver.findElement(By.xpath(prop.getProperty("pro_solve")));
				pro_solve.click();
				Thread.sleep(2000);

				WebElement protext_click=driver.findElement(By.id(prop.getProperty("pro_text")));
				protext_click.sendKeys(solve);
				Thread.sleep(1000);

				String protext_check=protext_click.getAttribute("value");
				Assert.assertEquals(protext_check, solve, "Proposal Solve Mismatch");


				WebElement pro_do=driver.findElement(By.xpath(prop.getProperty("pro_do")));
				pro_do.click();
				Thread.sleep(1000);

				WebElement prodo_text=driver.findElement(By.id(prop.getProperty("prodo_text")));
				prodo_text.sendKeys(pdo);
				Thread.sleep(1000);

				String prodo_check=prodo_text.getAttribute("value");
				Assert.assertEquals(prodo_check, pdo,"Plannnck Do Mismatch");


				WebElement prores_click=driver.findElement(By.xpath(prop.getProperty("pro_reso")));
				prores_click.click();
				Thread.sleep(1000);

				// 1 Res

				WebElement protext_res1=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res1.sendKeys(reso1);

				String val1=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val1, reso1, "Resources Mismatch");
				Thread.sleep(1000);			
				protext_res1.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);
				WebElement prores_add1=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add1.click();
				Thread.sleep(1000);
				// 2 Res

				WebElement protext_res2=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res2.sendKeys(reso2);



				String val2=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val2, reso2, "Resources Mismatch");
				Thread.sleep(1000);			
				protext_res2.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);
				WebElement prores_add2=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add2.click();
				Thread.sleep(1000);

				// 3 Res

				WebElement protext_res3=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res3.sendKeys(reso3);



				String val3=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val3, reso3, "Resources Mismatch");

				Thread.sleep(1000);			
				protext_res3.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);
				WebElement prores_add3=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add3.click();
				Thread.sleep(1000);

				//4 Res

				WebElement protext_res4=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res4.sendKeys(reso4);



				String val4=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val4, reso4, "Resources Mismatch");
				Thread.sleep(1000);			
				protext_res4.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);
				WebElement prores_add4=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add4.click();
				Thread.sleep(1000);
				// 5 Res

				WebElement protext_res5=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res5.sendKeys(reso5);



				String val5=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val5, reso5, "Resources Mismatch");
				Thread.sleep(1000);			
				protext_res5.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);
				WebElement prores_add5=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add5.click();
				Thread.sleep(1000);
				//6 Res

				WebElement protext_res6=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res6.sendKeys(reso6);

				String val6=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val6, reso6, "Resources Mismatch");

				Thread.sleep(1000);			
				protext_res6.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add6=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add6.click();
				Thread.sleep(1000);
				//7 Res

				WebElement protext_res7=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res7.sendKeys(reso7);

				Thread.sleep(1000);

				String val7=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val7, reso7, "Resources Mismatch");
				Thread.sleep(1000);			
				protext_res7.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add7=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add7.click();
				Thread.sleep(1000);
				//8 Res

				WebElement protext_res8=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res8.sendKeys(reso8);



				String val8=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val8, reso8, "Resources Mismatch");

				Thread.sleep(1000);			
				protext_res1.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);
				WebElement prores_add8=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add8.click();
				Thread.sleep(1000);
				//9 Res

				WebElement protext_res9=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res9.sendKeys(reso9);



				String val9=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val9, reso9, "Resources Mismatch");

				Thread.sleep(1000);			
				protext_res1.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add9=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add9.click();
				Thread.sleep(1000);
				//10 Res

				WebElement protext_res10=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res10.sendKeys(reso10);



				String val10=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val10, reso10, "Resources Mismatch");
				Thread.sleep(1000);			
				protext_res1.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add10=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add10.click();
				Thread.sleep(1000);
				//11 Res

				WebElement protext_res11=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res11.sendKeys(reso11);



				String val11=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val11, reso11, "Resources Mismatch");

				Thread.sleep(1000);			
				protext_res11.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add11=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add11.click();
				Thread.sleep(1000);
				//12 Res

				WebElement protext_res12=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res12.sendKeys(reso12);

				String val12=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val12, reso12, "Resources Mismatch");

				Thread.sleep(1000);			
				protext_res12.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add12=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add12.click();
				Thread.sleep(1000);
				//13 Res

				WebElement protext_res13=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res13.sendKeys(reso13);

				String val13=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val13, reso13, "Resources Mismatch");

				Thread.sleep(1000);			
				protext_res13.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add13=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add13.click();
				Thread.sleep(1000);
				//14 Res

				WebElement protext_res14=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res14.sendKeys(reso14);

				Thread.sleep(1000);

				String val14=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val14, reso14, "Resources Mismatch");
				Thread.sleep(1000);			
				protext_res14.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add14=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add14.click();
				Thread.sleep(1000);
				//15 Res

				WebElement protext_res15=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res15.sendKeys(reso15);

				Thread.sleep(1000);

				String val15=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val15, reso15, "Resources Mismatch");

				Thread.sleep(1000);			
				protext_res15.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add15=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add15.click();
				Thread.sleep(1000);
				//16 Res

				WebElement protext_res16=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res16.sendKeys(reso16);


				Thread.sleep(1000);

				String val16=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val16, reso16, "Resources Mismatch");


				Thread.sleep(1000);			
				protext_res16.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add16=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add16.click();
				Thread.sleep(1000);
				//17 Res

				WebElement protext_res17=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res17.sendKeys(reso17);

				Thread.sleep(1000);

				String val17=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val17, reso17, "Resources Mismatch");


				WebElement prores_add17=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add17.click();

				Thread.sleep(1000);			
				protext_res17.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				Thread.sleep(1000);
				//18 Res

				WebElement protext_res18=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res18.sendKeys(reso18);

				Thread.sleep(1000);

				String val18=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val18, reso18, "Resources Mismatch");
				Thread.sleep(1000);			
				protext_res18.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);
				WebElement prores_add18=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add18.click();
				Thread.sleep(1000);
				//19 Res

				WebElement protext_res19=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res19.sendKeys(reso19);

				Thread.sleep(1000);

				String val19=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val19, reso19, "Resources Mismatch");

				Thread.sleep(1000);			
				protext_res19.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);
				WebElement prores_add19=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add19.click();
				Thread.sleep(1000);
				//20 Res

				WebElement protext_res20=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res20.sendKeys(reso20);

				Thread.sleep(1000);

				String val20=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val20, reso20, "Resources Mismatch");
				Thread.sleep(1000);			
				protext_res20.sendKeys(Keys.DOWN,Keys.ENTER);
				Thread.sleep(1000);

				WebElement prores_add20=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add20.click();
				Thread.sleep(1000);
				screen_shots(screen);
				ArrayList<String> list = new ArrayList<String>();
				ArrayList<String>  res=new ArrayList<String>();
				for(int i=0;i<20;i++)
				{
					res.add(reso1);
					res.add(reso2);
					res.add(reso3);
					res.add(reso4);
					res.add(reso4);
					res.add(reso5);
					res.add(reso6);
					res.add(reso7);
					res.add(reso8);
					res.add(reso9);
					res.add(reso10);
					res.add(reso11);
					res.add(reso12);
					res.add(reso13);
					res.add(reso14);
					res.add(reso15);
					res.add(reso16);
					res.add(reso17);
					res.add(reso18);
					res.add(reso19);
					res.add(reso20);

				}

				for(int j=1;j<=20;j++)
				{
					String actual=driver.findElement(By.xpath("html/body/div[1]/form/section[2]/div/div/div/div[3]/div[1]/div/div/div[2]/div/span["+j+"]")).getText();
					list.add(actual);
				}
				Set<String>uniqueset= new HashSet<String>(list);
				for(String temp:uniqueset)
				{
					System.out.println(temp + ": " + Collections.frequency(list, temp));
				}

				System.out.println(list.size());
				for(String name1:list)
				{
					System.out.println("Added Resources is="+ name1);

				}
				for(int i=0;i<list.size();i++)
				{			
					Assert.assertEquals(list.get(0), res.get(i), "Mismatch Resources After Add");

				}
				screen_shots(screen);

				WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
				submit.click();

				screen_shots(screen);

				Thread.sleep(2000);
				String aftersubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
				System.out.println("Count After Submit Status="+aftersubmit);

				Assert.assertFalse(beforsubmit.equals(aftersubmit));

				driver.findElement(By.xpath(prop.getProperty("submit_status"))).click();

				//String title1=driver.findElement(By.xpath(prop.getProperty("first_submit"))).getText();

				//Assert.assertEquals(title1, title.toUpperCase(), "Title Not Matched");
				Thread.sleep(2000);
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();		
			}
			// Training Proposal

			else if(category.equals("Training Proposal"))
			{

				WebElement act_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));			
				act_checked.click();

				Boolean act_display=act_checked.isDisplayed();
				System.out.println("Activity Checkbox is Displayed="+act_display);

				Boolean act_status=act_checked.isSelected();
				System.out.println("Activity Checkbox is Selected="+act_status);

				Boolean act_enabled=act_checked.isEnabled();
				System.out.println("Activity Checkbox is Enabled="+act_enabled);

				WebElement tri_checked=driver.findElement(By.xpath(prop.getProperty("training_check")));
				Boolean tri_status=tri_checked.isSelected();
				System.out.println("Training Checkbox is Selected="+tri_status);

				Assert.assertEquals(driver.findElement(By.xpath(prop.getProperty("status_check"))).getAttribute("checked") , "true", "Both are Checked");

				WebElement ptitle=driver.findElement(By.id(prop.getProperty("pro_title")));
				ptitle.sendKeys(title);

				String title_check=ptitle.getAttribute("value");
				Assert.assertTrue(title_check.equals(title), "Proposal Title Mismatch");

				if(category.equals("AGRICULTURE"))
				{

					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Agriculture"))).click();

				}
				else if(category.equals("ANIMAL"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Animal"))).click();

				}
				else if(category.equals("ARTS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Arts"))).click();

				}
				else if(category.equals("ARTS & CULTURE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Artsculture"))).click();			
				}

				else if(category.equals("AWARENESS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Awareness"))).click();			
				}

				else if(category.equals("CHILD"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Child"))).click();			
				}

				else if(category.equals("CLIMATE CHANGE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Climatechange"))).click();			
				}

				else if(category.equals("COMPASSION"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Compassion"))).click();			
				}

				else if(category.equals("COMPUTERS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Computers"))).click();			
				}

				else if(category.equals("DISASTER"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Disaster"))).click();			
				}

				else if(category.equals("EDUCATION"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Education"))).click();			
				}
				//sTARt
				else if(category.equals("ENERGY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Energy"))).click();			
				}

				else if(category.equals("ENVIRONMENT"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Environment"))).click();			
				}

				else if(category.equals("FAMILY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Family"))).click();			
				}

				else if(category.equals("FARMING"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Farming"))).click();			
				}

				else if(category.equals("FOOD"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Food"))).click();			
				}

				else if(category.equals("HACKATHON"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Hackathon"))).click();			
				}

				else if(category.equals("HEALTHCARE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Healthcare"))).click();			
				}

				else if(category.equals("INFRASTRUCTURE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Infrastructure"))).click();			
				}

				else if(category.equals("INTERNSHIP"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Internship"))).click();			
				}

				else if(category.equals("KINDNESS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Kindness"))).click();			
				}

				else if(category.equals("PEACE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Peace"))).click();			
				}

				else if(category.equals("REFUGEES"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Refugees"))).click();			
				}

				else if(category.equals("SCHOOL"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("School"))).click();			
				}

				else if(category.equals("SCIENCE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Science"))).click();			
				}

				else if(category.equals("SENIORS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Seniors"))).click();			
				}

				else if(category.equals("SPORTS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Sports"))).click();			
				}

				else if(category.equals("STRATEGY"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Strategy"))).click();			
				}

				else if(category.equals("SUICIDE"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Suicide"))).click();			
				}

				else if(category.equals("WATER"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Water"))).click();			
				}

				else if(category.equals("WOMEN"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Women"))).click();			
				}

				else if(category.equals("OTHERS"))
				{
					driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
					System.out.println("Category="+ category);

					Thread.sleep(2000);
					driver.findElement(By.xpath(prop.getProperty("Others"))).click();			
				}

				else
				{
					System.out.println("No Category");

				}


				WebElement pro_tag=driver.findElement(By.id(prop.getProperty("pro_tagtext")));
				pro_tag.sendKeys(tags1);
				Thread.sleep(1000);
				String tag_check=pro_tag.getAttribute("value");
				Assert.assertTrue(tag_check.equals(tags1), "Proposal Tag Mismatch");

				WebElement tag_add=driver.findElement(By.xpath(prop.getProperty("pro_tags")));
				tag_add.click();
				Thread.sleep(1000);

				WebElement pro_desc=driver.findElement(By.id(prop.getProperty("desc")));
				pro_desc.sendKeys(desc);
				Thread.sleep(2000);

				String desc_check=pro_desc.getAttribute("value");
				Assert.assertEquals(desc_check, desc, "Proposal Description Mismatch");


				WebElement pro_solve=driver.findElement(By.xpath(prop.getProperty("pro_solve")));
				pro_solve.click();
				Thread.sleep(2000);

				WebElement protext_click=driver.findElement(By.id(prop.getProperty("pro_text")));
				protext_click.sendKeys(solve);
				Thread.sleep(1000);

				String protext_check=protext_click.getAttribute("value");
				Assert.assertEquals(protext_check, solve, "Proposal Solve Mismatch");


				WebElement pro_do=driver.findElement(By.xpath(prop.getProperty("pro_do")));
				pro_do.click();
				Thread.sleep(1000);

				WebElement prodo_text=driver.findElement(By.id(prop.getProperty("prodo_text")));
				prodo_text.sendKeys(pdo);
				Thread.sleep(1000);

				String prodo_check=prodo_text.getAttribute("value");
				Assert.assertEquals(prodo_check, pdo,"Plannnck Do Mismatch");


				WebElement prores_click=driver.findElement(By.xpath(prop.getProperty("pro_reso")));
				prores_click.click();
				Thread.sleep(1000);

				// 1 Res

				WebElement protext_res1=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res1.sendKeys(reso1);

				Thread.sleep(1000);

				String val1=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val1, reso1, "Resources Mismatch");

				WebElement prores_add1=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add1.click();
				Thread.sleep(1000);
				// 2 Res

				WebElement protext_res2=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res2.sendKeys(reso2);

				Thread.sleep(1000);

				String val2=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val2, reso2, "Resources Mismatch");

				WebElement prores_add2=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add2.click();
				Thread.sleep(1000);

				// 3 Res

				WebElement protext_res3=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res3.sendKeys(reso3);

				Thread.sleep(1000);

				String val3=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val3, reso3, "Resources Mismatch");

				WebElement prores_add3=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add3.click();
				Thread.sleep(1000);

				//4 Res

				WebElement protext_res4=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res4.sendKeys(reso4);

				Thread.sleep(1000);

				String val4=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val4, reso4, "Resources Mismatch");

				WebElement prores_add4=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add4.click();
				Thread.sleep(1000);
				// 5 Res

				WebElement protext_res5=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res5.sendKeys(reso5);

				Thread.sleep(1000);

				String val5=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val5, reso5, "Resources Mismatch");

				WebElement prores_add5=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add5.click();
				Thread.sleep(1000);
				//6 Res

				WebElement protext_res6=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res6.sendKeys(reso6);

				Thread.sleep(1000);

				String val6=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val6, reso6, "Resources Mismatch");

				WebElement prores_add6=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add6.click();
				Thread.sleep(1000);
				//7 Res

				WebElement protext_res7=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res7.sendKeys(reso7);

				Thread.sleep(1000);

				String val7=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val7, reso7, "Resources Mismatch");

				WebElement prores_add7=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add7.click();
				Thread.sleep(1000);
				//8 Res

				WebElement protext_res8=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res8.sendKeys(reso8);

				Thread.sleep(1000);

				String val8=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val8, reso8, "Resources Mismatch");

				WebElement prores_add8=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add8.click();
				Thread.sleep(1000);
				//9 Res

				WebElement protext_res9=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res9.sendKeys(reso9);

				Thread.sleep(1000);

				String val9=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val9, reso9, "Resources Mismatch");

				WebElement prores_add9=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add9.click();
				Thread.sleep(1000);
				//10 Res

				WebElement protext_res10=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res10.sendKeys(reso10);

				Thread.sleep(1000);

				String val10=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val10, reso10, "Resources Mismatch");

				WebElement prores_add10=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add10.click();
				Thread.sleep(1000);
				//11 Res

				WebElement protext_res11=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res11.sendKeys(reso11);

				Thread.sleep(1000);

				String val11=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val11, reso11, "Resources Mismatch");

				WebElement prores_add11=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add11.click();
				Thread.sleep(1000);
				//12 Res

				WebElement protext_res12=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res12.sendKeys(reso12);

				Thread.sleep(1000);

				String val12=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val12, reso12, "Resources Mismatch");

				WebElement prores_add12=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add12.click();
				Thread.sleep(1000);
				//13 Res

				WebElement protext_res13=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res13.sendKeys(reso13);

				Thread.sleep(1000);

				String val13=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val13, reso13, "Resources Mismatch");

				WebElement prores_add13=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add13.click();
				Thread.sleep(1000);
				//14 Res

				WebElement protext_res14=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res14.sendKeys(reso14);

				Thread.sleep(1000);

				String val14=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val14, reso14, "Resources Mismatch");

				WebElement prores_add14=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add14.click();
				Thread.sleep(1000);
				//15 Res

				WebElement protext_res15=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res15.sendKeys(reso15);

				Thread.sleep(1000);

				String val15=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val15, reso15, "Resources Mismatch");

				WebElement prores_add15=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add15.click();
				Thread.sleep(1000);
				//16 Res

				WebElement protext_res16=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res16.sendKeys(reso16);

				Thread.sleep(1000);

				String val16=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val16, reso16, "Resources Mismatch");

				WebElement prores_add16=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add16.click();
				Thread.sleep(1000);
				//17 Res

				WebElement protext_res17=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res17.sendKeys(reso17);

				Thread.sleep(1000);

				String val17=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val17, reso17, "Resources Mismatch");

				WebElement prores_add17=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add17.click();
				Thread.sleep(1000);
				//18 Res

				WebElement protext_res18=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res18.sendKeys(reso18);

				Thread.sleep(1000);

				String val18=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val18, reso18, "Resources Mismatch");

				WebElement prores_add18=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add18.click();
				Thread.sleep(1000);
				//19 Res

				WebElement protext_res19=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res19.sendKeys(reso19);

				Thread.sleep(1000);

				String val19=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val19, reso19, "Resources Mismatch");

				WebElement prores_add19=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add19.click();
				Thread.sleep(1000);
				//20 Res

				WebElement protext_res20=driver.findElement(By.xpath(prop.getProperty("pro_resotext")));
				protext_res20.sendKeys(reso20);

				Thread.sleep(1000);

				String val20=driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).getAttribute("value");
				Assert.assertEquals(val20, reso20, "Resources Mismatch");

				WebElement prores_add20=driver.findElement(By.xpath(prop.getProperty("reso_add")));
				prores_add20.click();
				Thread.sleep(1000);
				screen_shots(screen);
				ArrayList<String> list = new ArrayList<String>();
				ArrayList<String>  res=new ArrayList<String>();
				for(int i=0;i<20;i++)
				{
					res.add(reso1);
					res.add(reso2);
					res.add(reso3);
					res.add(reso4);
					res.add(reso4);
					res.add(reso5);
					res.add(reso6);
					res.add(reso7);
					res.add(reso8);
					res.add(reso9);
					res.add(reso10);
					res.add(reso11);
					res.add(reso12);
					res.add(reso13);
					res.add(reso14);
					res.add(reso15);
					res.add(reso16);
					res.add(reso17);
					res.add(reso18);
					res.add(reso19);
					res.add(reso20);

				}

				for(int j=1;j<=20;j++)
				{
					String actual=driver.findElement(By.xpath("html/body/div[1]/form/section[2]/div/div/div/div[3]/div[1]/div/div/div[2]/div/span["+j+"]")).getText();
					list.add(actual);
				}
				Set<String>uniqueset= new HashSet<String>(list);
				for(String temp:uniqueset)
				{
					System.out.println(temp + ": " + Collections.frequency(list, temp));
				}

				System.out.println(list.size());
				for(String name1:list)
				{
					System.out.println("Added Resources is="+ name1);

				}
				for(int i=0;i<list.size();i++)
				{			
					Assert.assertEquals(list.get(0), res.get(i), "Mismatch Resources After Add");

				}
				screen_shots(screen);

				WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
				submit.click();

				screen_shots(screen);

				Thread.sleep(2000);
				String aftersubmit=driver.findElement(By.xpath(prop.getProperty("submit_count"))).getText();
				System.out.println("Count After Submit Status="+aftersubmit);

				Assert.assertFalse(beforsubmit.equals(aftersubmit));

				driver.findElement(By.xpath(prop.getProperty("submit_status"))).click();

				//String title1=driver.findElement(By.xpath(prop.getProperty("first_submit"))).getText();

				//Assert.assertEquals(title1, title.toUpperCase(), "Title Not Matched");
				Thread.sleep(2000);
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();
				/*String pro_value=driver.findElement(By.xpath("html/body/div/form/section[2]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/span/span[1]")).getText();
					System.out.println("the Resource Added="+pro_value);
					Assert.assertEquals(pro_value, reso, "Mismatch Resources After Add");
				 */			}
			else
			{
				System.out.println("No Proposal Type");
			}
		}
		else
		{
			System.out.println("Enter Steps is Not Allow");
		}
	}

	public void propose_blankfields(String browser,String step,String email,String pwd,String type, String title,
			String category,String tags,String desc,String solve,String pdo,String reso) throws InterruptedException

	{

		ArrayList<String> list_click=new ArrayList<String>();	 	
		ArrayList<String> list=new ArrayList<String>();

		for(int i=2;i<=9;i++)
		{
			list.add("html/body/div["+i+"]");
			//System.out.println(list.get(i));
		}

		for(int j=1;j<=8;j++)
		{
			list_click.add("html/body/div["+j+1+"]/div[2]/button[@id='takeatour"+j+"']");
			//System.out.println(list_click.get(j));
		}
		try {
			prop=file_execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Open the Browser");
		driver=Resources.browser(browser);
		logger.info("Open the URL");
		driver.get(prop.getProperty("url_login"));
		logger.info("Enter the Email-ID");
		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user.sendKeys(email);
		logger.info("Enter the Password");
		WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user.sendKeys(pwd);
		logger.info("Click on Login Button");
		driver.findElement(By.xpath(prop.getProperty("login"))).click();
		logger.info("Click on Propose Link");
		driver.findElement(By.xpath(prop.getProperty("propose_tag"))).click();
		Thread.sleep(2000);
		logger.info("Click on Create Proposal Button");
		driver.findElement(By.xpath(prop.getProperty("proposal_button"))).click();
		Thread.sleep(1000);


		if(step.equalsIgnoreCase("1.0"))
		{

			logger.info("Click on Submit");
			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();
			try {
				for(int k=0;k<list.size();k++)
				{
					boolean box1=driver.findElement(By.xpath(list.get(k))).isDisplayed();	
					if(box1 == true) {
						System.out.println("Path of Error Message is="+list.get(k));
					}
					String loc=driver.findElement(By.xpath(list.get(k))).getLocation().toString();
					System.out.println("Status of Error Message Displayed="+box1);
					System.out.println("Location of Title Error Message is="+loc);
					logger.info("Assert Verify");
					Assert.assertEquals(list.get(k), "html/body/div[2]", "Error Mismatch Position");
				}
			}
			catch(Exception e)
			{
				System.out.println("No Other Type Of Error Message Displayed");
				Thread.sleep(2000);
                logger.info("Click on Responsive Bar");
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				logger.info("Click on Logout");
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();
			}
		}
		else if(step.equals("2.0"))
		{
			if(type.equalsIgnoreCase("Activity Proposal"))
			{
				logger.info("Check the Activity Proposal");
				driver.findElement(By.xpath(prop.getProperty("activity_check"))).click();
				Thread.sleep(1000);
				logger.info("Click on Submit");
				WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
				submit.click();
				try {
					for(int k=0;k<list.size();k++)
					{
						boolean box1=driver.findElement(By.xpath(list.get(k))).isDisplayed();
						if(box1 == true) {
							System.out.println("Path of Error Message is="+list.get(k));
						}
						String loc=driver.findElement(By.xpath(list.get(k))).getLocation().toString();
						System.out.println("Status of Error Message Displayed="+box1);
						System.out.println("Location of Title Error Message is="+loc);
						logger.info("Assert Verify");
						Assert.assertEquals(list.get(k), "html/body/div[2]", "Error Mismatch Position");
					}
				}
				catch(Exception e)
				{
					System.out.println("No Other Type Of Error Message Displayed");
					Thread.sleep(2000);
					  logger.info("Click on Responsive Bar");
					WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
					appeal_responsive.click();
					Thread.sleep(2000);
					logger.info("Click on Logout");
					WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
					logoff.click();
					Thread.sleep(1000);

					driver.close();
				}
			}
			else if(type.equalsIgnoreCase("Training Proposal"))
			{
				logger.info("Check the Training Proposal");
				driver.findElement(By.xpath(prop.getProperty("training_check"))).click();
				Thread.sleep(1000);
				logger.info("Click on Submit");
				WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
				submit.click();
				try {
					for(int k=0;k<list.size();k++)
					{
						boolean box1=driver.findElement(By.xpath(list.get(k))).isDisplayed();
						if(box1 == true) {
							System.out.println("Path of Error Message is="+list.get(k));
						}
						String loc=driver.findElement(By.xpath(list.get(k))).getLocation().toString();
						System.out.println("Status of Error Message Displayed="+box1);
						System.out.println("Location of Title Error Message is="+loc);
						logger.info("Assert Verify");
						Assert.assertEquals(list.get(k), "html/body/div[2]", "Error Mismatch Position");
					}
				}
				catch(Exception e)
				{
					System.out.println("No Other Type Of Error Message Displayed");
					Thread.sleep(2000);
					  logger.info("Click on Responsive Bar");
					WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
					appeal_responsive.click();
					Thread.sleep(2000);
					logger.info("Click on Logout");
					WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
					logoff.click();
					Thread.sleep(1000);

					driver.close();
				}
			}
			else {
				System.out.println("No Proposal Type Found");			
			}
		}
		else if(step.equals("3.0"))
		{
			logger.info("Enter the Title");
			driver.findElement(By.id(prop.getProperty("pro_title"))).sendKeys(title);
			logger.info("Click on Submit");
			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();
			try {
				for(int k=0;k<list.size();k++)
				{
					boolean box1=driver.findElement(By.xpath(list.get(k))).isDisplayed();
					if(box1 == true) {
						System.out.println("Path of Error Message is="+list.get(k));
					}
					String loc=driver.findElement(By.xpath(list.get(k))).getLocation().toString();
					System.out.println("Status of Error Message Displayed="+box1);
					System.out.println("Location of Title Error Message is="+loc);
					logger.info("Assert Verify");
					Assert.assertEquals(list.get(k), "html/body/div[2]", "Error Mismatch Position");
				}
			}
			catch(Exception e)
			{
				System.out.println("No Other Type Of Error Message Displayed");
				Thread.sleep(2000);
				  logger.info("Click on Responsive Bar");
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				logger.info("Click on Logout");
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();
			}


		}
		else if(step.equals("4.0"))
		{
			logger.info("Select the Category");
			if(category.equals("AGRICULTURE"))
			{

				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Agriculture"))).click();

			}
			else if(category.equals("ANIMAL"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Animal"))).click();

			}
			else if(category.equals("ARTS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Arts"))).click();

			}
			else if(category.equals("ARTS & CULTURE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Artsculture"))).click();			
			}

			else if(category.equals("AWARENESS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Awareness"))).click();			
			}

			else if(category.equals("CHILD"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Child"))).click();			
			}

			else if(category.equals("CLIMATE CHANGE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Climatechange"))).click();			
			}

			else if(category.equals("COMPASSION"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Compassion"))).click();			
			}

			else if(category.equals("COMPUTERS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Computers"))).click();			
			}

			else if(category.equals("DISASTER"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Disaster"))).click();			
			}

			else if(category.equals("EDUCATION"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Education"))).click();			
			}
			//sTARt
			else if(category.equals("ENERGY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Energy"))).click();			
			}

			else if(category.equals("ENVIRONMENT"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Environment"))).click();			
			}

			else if(category.equals("FAMILY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Family"))).click();			
			}

			else if(category.equals("FARMING"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Farming"))).click();			
			}

			else if(category.equals("FOOD"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Food"))).click();			
			}

			else if(category.equals("HACKATHON"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Hackathon"))).click();			
			}

			else if(category.equals("HEALTHCARE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Healthcare"))).click();			
			}

			else if(category.equals("INFRASTRUCTURE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Infrastructure"))).click();			
			}

			else if(category.equals("INTERNSHIP"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Internship"))).click();			
			}

			else if(category.equals("KINDNESS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Kindness"))).click();			
			}

			else if(category.equals("PEACE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Peace"))).click();			
			}

			else if(category.equals("REFUGEES"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Refugees"))).click();			
			}

			else if(category.equals("SCHOOL"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("School"))).click();			
			}

			else if(category.equals("SCIENCE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Science"))).click();			
			}

			else if(category.equals("SENIORS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Seniors"))).click();			
			}

			else if(category.equals("SPORTS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Sports"))).click();			
			}

			else if(category.equals("STRATEGY"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Strategy"))).click();			
			}

			else if(category.equals("SUICIDE"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Suicide"))).click();			
			}

			else if(category.equals("WATER"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Water"))).click();			
			}

			else if(category.equals("WOMEN"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Women"))).click();			
			}

			else if(category.equals("OTHERS"))
			{
				driver.findElement(By.xpath(".//*[@id='country-list-styled']")).click();
				System.out.println("Category="+ category);

				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("Others"))).click();			
			}
			else
			{
				System.out.println("No Category Found");
			}
			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();
			try {
				for(int k=0;k<list.size();k++)
				{
					boolean box1=driver.findElement(By.xpath(list.get(k))).isDisplayed();
					if(box1 == true) {
						System.out.println("Path of Error Message is="+list.get(k));
					}
					String loc=driver.findElement(By.xpath(list.get(k))).getLocation().toString();
					System.out.println("Status of Error Message Displayed="+box1);
					System.out.println("Location of Title Error Message is="+loc);
					logger.info("Assert Verify");
					Assert.assertEquals(list.get(k), "html/body/div[2]", "Error Mismatch Position");
				}
			}
			catch(Exception e)
			{
				System.out.println("No Other Type Of Error Message Displayed");
				Thread.sleep(2000);
				  logger.info("Click on Responsive Bar");
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				logger.info("Click on Logout");
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();
			}

		}
		else if(step.equals("5.0"))
		{
			logger.info("Enter the Tag");
			driver.findElement(By.id(prop.getProperty("pro_tagtext"))).sendKeys(tags);
			driver.findElement(By.xpath(prop.getProperty("pro_tags"))).click();
			logger.info("Click on Submit");
			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();
			try {
				for(int k=0;k<list.size();k++)
				{
					boolean box1=driver.findElement(By.xpath(list.get(k))).isDisplayed();
					if(box1 == true) {
						System.out.println("Path of Error Message is="+list.get(k));
					}
					String loc=driver.findElement(By.xpath(list.get(k))).getLocation().toString();
					System.out.println("Status of Error Message Displayed="+box1);
					System.out.println("Location of Title Error Message is="+loc);
					logger.info("Assert Verify");
					Assert.assertEquals(list.get(k), "html/body/div[2]", "Error Mismatch Position");
				}
			}
			catch(Exception e)
			{
				System.out.println("No Other Type Of Error Message Displayed");
				Thread.sleep(2000);
				  logger.info("Click on Responsive Bar");
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				logger.info("Click on Logout");
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();
			}			
		}
		else if(step.equals("6.0"))
		{
			logger.info("Enter the Description");
			driver.findElement(By.id(prop.getProperty("desc"))).sendKeys(desc);
			logger.info("Click on Submit");
			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();
			try {
				for(int k=0;k<list.size();k++)
				{
					boolean box1=driver.findElement(By.xpath(list.get(k))).isDisplayed();
					if(box1 == true) {
						System.out.println("Path of Error Message is="+list.get(k));
					}
					String loc=driver.findElement(By.xpath(list.get(k))).getLocation().toString();
					System.out.println("Status of Error Message Displayed="+box1);
					System.out.println("Location of Title Error Message is="+loc);
					logger.info("Assert Verify");
					Assert.assertEquals(list.get(k), "html/body/div[2]", "Error Mismatch Position");
				}
			}
			catch(Exception e)
			{
				System.out.println("No Other Type Of Error Message Displayed");
				Thread.sleep(2000);
				  logger.info("Click on Responsive Bar");
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				logger.info("Click on Logout");
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();
			}				
		}
		else if(step.equals("7.0"))
		{
			logger.info("Enter the Solve");
			driver.findElement(By.xpath(prop.getProperty("pro_solve"))).click();
			driver.findElement(By.id(prop.getProperty("pro_text"))).sendKeys(solve);
			logger.info("Click on Submit");
			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();
			try {
				for(int k=0;k<list.size();k++)
				{
					boolean box1=driver.findElement(By.xpath(list.get(k))).isDisplayed();
					if(box1 == true) {
						System.out.println("Path of Error Message is="+list.get(k));
					}
					String loc=driver.findElement(By.xpath(list.get(k))).getLocation().toString();
					System.out.println("Status of Error Message Displayed="+box1);
					System.out.println("Location of Title Error Message is="+loc);
					logger.info("Assert Verify");
					Assert.assertEquals(list.get(k), "html/body/div[2]", "Error Mismatch Position");
				}
			}
			catch(Exception e)
			{
				System.out.println("No Other Type Of Error Message Displayed");
				Thread.sleep(2000);
				  logger.info("Click on Responsive Bar");
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logger.info("Click on Logout");
				logoff.click();
				Thread.sleep(1000);

				driver.close();
			}				
		}
		else if(step.equals("8.0"))
		{
			logger.info("Enter the Plannck do");
			driver.findElement(By.xpath(prop.getProperty("pro_do"))).click();
			driver.findElement(By.id(prop.getProperty("prodo_text"))).sendKeys(pdo);
			logger.info("Click on Submit");
			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();
			try {
				for(int k=0;k<list.size();k++)
				{
					boolean box1=driver.findElement(By.xpath(list.get(k))).isDisplayed();
					if(box1 == true) {
						System.out.println("Path of Error Message is="+list.get(k));
					}
					String loc=driver.findElement(By.xpath(list.get(k))).getLocation().toString();
					System.out.println("Status of Error Message Displayed="+box1);
					System.out.println("Location of Title Error Message is="+loc);
					logger.info("Assert Verify");
					Assert.assertEquals(list.get(k), "html/body/div[2]", "Error Mismatch Position");
				}
			}
			catch(Exception e)
			{
				System.out.println("No Other Type Of Error Message Displayed");
				Thread.sleep(2000);
				  logger.info("Click on Responsive Bar");
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				logger.info("Click on Logout");
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();
			}				
		}
		else if(step.equals("9.0"))
		{

			logger.info("Enter the Resources");
			driver.findElement(By.xpath(prop.getProperty("pro_reso"))).click();
			driver.findElement(By.xpath(prop.getProperty("pro_resotext"))).sendKeys(reso);
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("reso_add"))).click();
			logger.info("Click on Submit");
			WebElement submit=driver.findElement(By.xpath(prop.getProperty("prosubmit")));
			submit.click();
			try {
				for(int k=0;k<list.size();k++)
				{
					boolean box1=driver.findElement(By.xpath(list.get(k))).isDisplayed();
					if(box1 == true) {
						System.out.println("Path of Error Message is="+list.get(k));
					}
					String loc=driver.findElement(By.xpath(list.get(k))).getLocation().toString();
					System.out.println("Status of Error Message Displayed="+box1);
					System.out.println("Location of Title Error Message is="+loc);
					logger.info("Assert Verify");
					Assert.assertEquals(list.get(k), "html/body/div[2]", "Error Mismatch Position");
				}
			}
			catch(Exception e)
			{
				System.out.println("No Other Type Of Error Message Displayed");
				Thread.sleep(2000);
                logger.info("Click on Responsive Bar");
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				logger.info("Click on Logout");
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();
				Thread.sleep(1000);

				driver.close();
			}				
		}
	}

	
		
		
	
}

