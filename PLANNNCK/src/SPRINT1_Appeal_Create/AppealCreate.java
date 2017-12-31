package SPRINT1_Appeal_Create;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppealCreate {

	WebDriver driver;
	Properties prop;


	@Test
	public void valid_AppealCreate(String email,String pwd,String title,String category,String loc,String tags1,String tags2,String desc,String urlfor,String urllink,String atchfor,String atchlink,String anymsstatus) throws Exception
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\Lib\\ObjectRepository.properties");

		prop=new Properties();
		prop.load(file);
		

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );

		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url_home"));

		Thread.sleep(2000);

		WebElement link_login=driver.findElement(By.xpath(prop.getProperty("login_link")));
		link_login.click();

		WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user.sendKeys(email);

		WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user.sendKeys(pwd);

		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("login"))).click();

		driver.findElement(By.linkText("Appeal")).click();
		Thread.sleep(3000);		

		WebElement appeal_btn=driver.findElement(By.cssSelector(prop.getProperty("appeal_pblm")));
		appeal_btn.click();

		WebElement title_appeal=driver.findElement(By.id(prop.getProperty("appeal_title")));
		title_appeal.sendKeys(title);

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

		WebElement loc_appeal=driver.findElement(By.name(prop.getProperty("appeal_loc")));
		loc_appeal.sendKeys(loc);

		Thread.sleep(2000);

		loc_appeal.sendKeys(Keys.DOWN,Keys.ENTER);
		Thread.sleep(2000);


		if(tags1.equals("") && !tags2.isEmpty() )
		{
			WebElement tag_appeal=driver.findElement(By.id(prop.getProperty("appeal_tag")));
			tag_appeal.sendKeys(tags2);
			Thread.sleep(1000);

			WebElement tag_add=	driver.findElement(By.xpath(prop.getProperty("add_tag")));
			tag_add.click();   

			WebElement desc_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_desc")));
			desc_appeal.sendKeys(desc);

			WebElement appeal_urlname=driver.findElement(By.cssSelector(prop.getProperty("url_for")));
			appeal_urlname.sendKeys(urlfor);

			Thread.sleep(1000);

			WebElement appeal_urllink=driver.findElement(By.cssSelector(prop.getProperty("url_link")));
			appeal_urllink.sendKeys(urllink);

			Thread.sleep(2000);

			WebElement appeal_addlink=driver.findElement(By.cssSelector(prop.getProperty("url_add")));
			appeal_addlink.click();

			Thread.sleep(1000);

			WebElement appeal_attachname=driver.findElement(By.cssSelector(prop.getProperty("attachment_for")));
			appeal_attachname.sendKeys(atchfor);          

			Thread.sleep(2000);

			WebElement attach_link=driver.findElement(By.xpath(prop.getProperty("attachment_link")));
			attach_link.click();

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

			WebElement attach_add=driver.findElement(By.cssSelector(prop.getProperty("add_doc")));  
			attach_add.click();

			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);


			if(anymsstatus.equals("Checked"))
			{

				driver.findElement(By.xpath("//*[@id=\"myImage\"]")).click();

				WebElement submit_appeal123=driver.findElement(By.cssSelector(prop.getProperty("appeal_submit")));
				submit_appeal123.click();

				Thread.sleep(2000);
				WebElement raise_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_raise")));
				raise_appeal.click();
				Thread.sleep(2000);

				WebElement created_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_create")));
				created_appeal.click();

				WebElement gettitle=driver.findElement(By.xpath(prop.getProperty("appeal_create.title")));
				String actual_value=gettitle.getText();
				System.out.println("Actual value="+actual_value);

				Thread.sleep(2000);

				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();

				driver.close();

			}
			else
			{


				WebElement submit_appeal=driver.findElement(By.cssSelector(prop.getProperty("appeal_submit")));
				submit_appeal.click();

				Thread.sleep(2000);
				WebElement raise_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_raise")));
				raise_appeal.click();
				Thread.sleep(2000);

				WebElement created_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_create")));
				created_appeal.click();

				WebElement gettitle=driver.findElement(By.xpath(prop.getProperty("appeal_create.title")));
				String actual_value=gettitle.getText();

				System.out.println("Actual value="+actual_value);

				Thread.sleep(2000);

				driver.close();
			}

		}

		else if(!tags1.isEmpty() && tags2.equals(""))
		{


			WebElement tag_appeal1=driver.findElement(By.id(prop.getProperty("appeal_tag")));
			tag_appeal1.sendKeys(tags1);
			Thread.sleep(1000);

			WebElement tag_add1=driver.findElement(By.xpath(prop.getProperty("add_tag")));
			tag_add1.click();

			WebElement desc_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_desc")));
			desc_appeal.sendKeys(desc);


			WebElement appeal_urlname=driver.findElement(By.cssSelector(prop.getProperty("url_for")));
			appeal_urlname.sendKeys(urlfor);

			Thread.sleep(1000);

			WebElement appeal_urllink=driver.findElement(By.cssSelector(prop.getProperty("url_link")));
			appeal_urllink.sendKeys(urllink);

			Thread.sleep(2000);

			WebElement appeal_addlink=driver.findElement(By.cssSelector(prop.getProperty("url_add")));
			appeal_addlink.click();

			Thread.sleep(1000);

			WebElement appeal_attachname=driver.findElement(By.cssSelector(prop.getProperty("attachment_for")));
			appeal_attachname.sendKeys(atchfor);          

			Thread.sleep(2000);

			WebElement attach_link=driver.findElement(By.xpath(prop.getProperty("attachment_link")));
			attach_link.click();

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

			WebElement attach_add=driver.findElement(By.cssSelector(prop.getProperty("add_doc")));  
			attach_add.click();

			Thread.sleep(5000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

			if(anymsstatus.equals(("Checked")))
			{

				driver.findElement(By.xpath("//*[@id=\"myImage\"]")).click();	

				WebElement submit_appeal1=driver.findElement(By.cssSelector(prop.getProperty("appeal_submit")));
				submit_appeal1.click();

				Thread.sleep(2000);
				WebElement raise_appeal1=driver.findElement(By.xpath(prop.getProperty("appeal_raise")));
				raise_appeal1.click();
				Thread.sleep(2000);

				WebElement created_appeal1=driver.findElement(By.xpath(prop.getProperty("appeal_create")));
				created_appeal1.click();

				WebElement gettitle=driver.findElement(By.xpath(prop.getProperty("appeal_create.title")));
				String actual_value=gettitle.getText();

				System.out.println("Actual value="+actual_value);
									
				Thread.sleep(2000);
				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();

				driver.close();
			}
				
		else
		{
			WebElement submit_appeal=driver.findElement(By.cssSelector(prop.getProperty("appeal_submit")));
			submit_appeal.click();

			Thread.sleep(2000);
			WebElement raise_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_raise")));
			raise_appeal.click();
			Thread.sleep(2000);

			WebElement created_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_create")));
			created_appeal.click();

			WebElement gettitle=driver.findElement(By.xpath(prop.getProperty("appeal_create.title")));
			String actual_value=gettitle.getText();

			System.out.println("Actual value="+actual_value);
			
			Thread.sleep(2000);
			WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
			appeal_responsive.click();
			Thread.sleep(2000);
			WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
			logoff.click();
			driver.close();
		}
	}

	// if both tags and fill then
	else
		{

			WebElement tag_appeal=	driver.findElement(By.id(prop.getProperty("appeal_tag")));
			tag_appeal.sendKeys(tags1);
			Thread.sleep(1000);

			WebElement tag_add=driver.findElement(By.xpath(prop.getProperty("add_tag")));
			tag_add.click();

			tag_appeal=driver.findElement(By.id(prop.getProperty("appeal_tag")));
			tag_appeal.sendKeys(tags2);
			Thread.sleep(1000);

			tag_add=driver.findElement(By.xpath(prop.getProperty("add_tag")));
			tag_add.click();   

			WebElement desc_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_desc")));
			desc_appeal.sendKeys(desc);

			WebElement appeal_urlname=driver.findElement(By.cssSelector(prop.getProperty("url_for")));
			appeal_urlname.sendKeys(urlfor);

			Thread.sleep(1000);

			WebElement appeal_urllink=driver.findElement(By.cssSelector(prop.getProperty("url_link")));
			appeal_urllink.sendKeys(urllink);

			Thread.sleep(2000);

			WebElement appeal_addlink=driver.findElement(By.cssSelector(prop.getProperty("url_add")));
			appeal_addlink.click();

			Thread.sleep(1000);

			WebElement appeal_attachname=driver.findElement(By.cssSelector(prop.getProperty("attachment_for")));
			appeal_attachname.sendKeys(atchfor);          

			Thread.sleep(2000);

			WebElement attach_link=driver.findElement(By.xpath(prop.getProperty("attachment_link")));
			attach_link.click();

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

			Thread.sleep(5000);

			WebElement attach_add=driver.findElement(By.cssSelector(prop.getProperty("add_doc")));  
			attach_add.click();

			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);


			if(anymsstatus.equals("Checked"))
			{

					driver.findElement(By.xpath("//*[@id=\"myImage\"]")).click();

					Thread.sleep(2000);

					WebElement submit_appeal=driver.findElement(By.cssSelector(prop.getProperty("appeal_submit")));
					submit_appeal.click();

					Thread.sleep(2000);
					WebElement raise_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_raise")));
					raise_appeal.click();
					Thread.sleep(2000);

					WebElement created_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_create")));
					created_appeal.click();

					WebElement gettitle=driver.findElement(By.xpath(prop.getProperty("appeal_create.title")));
	                String actual_value=gettitle.getText();

	                System.out.println("Actual value="+actual_value);
	              
					Thread.sleep(2000);

					WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
					appeal_responsive.click();
					Thread.sleep(2000);
					WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
					logoff.click();
	                driver.close();
				}
		
			
	else
			{
				WebElement submit_appeal=driver.findElement(By.cssSelector(prop.getProperty("appeal_submit")));
				submit_appeal.click();

				Thread.sleep(2000);
				WebElement raise_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_raise")));
				raise_appeal.click();
				Thread.sleep(2000);

				WebElement created_appeal=driver.findElement(By.xpath(prop.getProperty("appeal_create")));
				created_appeal.click();

				WebElement gettitle=driver.findElement(By.xpath(prop.getProperty("appeal_create.title")));

				String actual_value=gettitle.getText();


				System.out.println("Actual value="+actual_value);
	               
				Thread.sleep(2000);

				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
				appeal_responsive.click();
				Thread.sleep(2000);
				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
				logoff.click();

				driver.close();



			}

		}
}
}






