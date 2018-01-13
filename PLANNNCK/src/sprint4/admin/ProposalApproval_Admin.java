package sprint4.admin;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Lib.Resources;

public class ProposalApproval_Admin extends Resources{
	
	WebDriver driver;
	Properties prop;
	@Test
	public void adminProposalApproval() throws InterruptedException
	{
		
		logger.info("************START************");
		
			try {
				prop=file_execute();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.info("Start the Browser");
			driver=Resources.browser("chrome");
			logger.info("Open the Link");
			driver.get(prop.getProperty("admin_url"));
			logger.info("Enter the Email-ID");
			WebElement email_user=driver.findElement(By.xpath(prop.getProperty("email_admin")));
			email_user.sendKeys("14deepak07@gmail.com");
			logger.info("Enter the Passphrase");
			WebElement pwd_user =driver.findElement(By.xpath(prop.getProperty("pwd_admin")));
			pwd_user.sendKeys("qwerty");
			logger.info("Click on Login Button");
			driver.findElement(By.className(prop.getProperty("login_admin"))).click();
			Thread.sleep(2000);
			// Starts list Count with Zero to print
			List<WebElement> data= driver.findElements(By.xpath(prop.getProperty("nav_bar")));
			data.get(2).click();
			Thread.sleep(1000);	
			List<WebElement>divtag=driver.findElements(By.xpath("//*[@class='col-md-12 col-sm-12 row proposeshere pad']"));
			System.out.println(divtag.size());
			int count=divtag.size();
			//WebElement start=driver.findElement(By.xpath("html/body/div[1]/div[@class='admin-wrapper']/section/div/div/div[1]/div"));
			List<WebElement> listing=new ArrayList<WebElement>();
			int i=1;
			while(i<=count)	
			{
			listing.add(driver.findElement(By.xpath("html/body/div[1]/div[@class='admin-wrapper']/section/div/div/div[1]/div["+i+"]/div[1]/div[2]/a/p")));
			Thread.sleep(1000);
			listing.get(0).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='aprovals']/div/div/form/div[1]/div[1]/div[2]/div[1]/label/span/img")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@class='confirmbtn']")).click();
			i=1;
			count=count-1;
			
			}
			System.out.println(listing.size());
			
			
			data.clear();
			Thread.sleep(2000);
			List<WebElement> data1= driver.findElements(By.xpath(prop.getProperty("nav_bar")));
			data1.get(6).click();
			Thread.sleep(2000);
			driver.quit();
			
	}
	
		

}
