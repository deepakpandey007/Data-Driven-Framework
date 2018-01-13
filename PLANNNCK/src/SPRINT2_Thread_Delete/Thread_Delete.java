package SPRINT2_Thread_Delete;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Lib.Resources;

public class Thread_Delete extends Resources{

	static WebDriver driver;
	
	public void thread_delete(String browser,String email,String pwd,String aplid ,String screen_shot) throws IOException, InterruptedException, AWTException
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
		
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		
		if(!(driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[2]")).getText()).equals("Start a New Thread"))
		{
        String private_status=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[2]")).getText();
		
		System.out.println("Priavte Thread Status="+ private_status);
		
		WebElement click_dropdown=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[3]/div/a/img"));
		click_dropdown.click();
		
		Thread.sleep(2000);
		
		WebElement click_delete=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[3]/div/div/form/input[2]"));
		click_delete.click();

		Thread.sleep(1000);
		
		WebElement click_confirm=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[3]/div[1]/div[1]/div[3]/div/div/form/button"));
		click_confirm.click();
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		screen_shots(screen_shot);
		
		String msg_error=driver.findElement(By.xpath(prop.getProperty("error_msg"))).getText();
		
		System.out.println("Error Message Displayed is="+msg_error);
		

        String expected=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[2]")).getText();
		
		System.out.println("Priavte Thread Status="+ expected);
		
		Assert.assertFalse(private_status.equals(expected));
		
		Thread.sleep(2000);
		
		WebElement appeal_responsive1=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
		appeal_responsive1.click();

		Thread.sleep(2000);

		WebElement logoff1=driver.findElement(By.cssSelector(prop.getProperty("logout")));
		logoff1.click();
		
		Thread.sleep(1000);
		
		driver.close();
		
		
		
		}
		else
		{
			System.out.println("No Thread is There to Delete");
		}
		

		
	}
}
