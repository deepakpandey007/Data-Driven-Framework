package Sprint2_UpVote_Appeal;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Upvote {
	WebDriver driver;
	Properties prop;
	String url;
	public void Vote_appeal(String email,String password,String appeal_vote,String screen1) throws Exception
	{
		 FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\Lib\\ObjectRepository.properties");
			
			prop=new Properties();
			prop.load(file);
			
        	
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Microsoft\\eclipse-workspace\\PLANNNCK\\Driver\\chromedriver.exe" );

			driver=new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url_login"));
			
			WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
			email_user.sendKeys(email);
			
			WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
			pwd_user.sendKeys(password);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("login"))).click();
			
			driver.findElement(By.linkText("Appeal")).click();
			
			String actual=driver.findElement(By.xpath(prop.getProperty("vote_sort"))).getText();
			
			System.out.println("Before vote="+actual);
		
			Thread.sleep(3000);		
							
			driver.findElement(By.xpath(prop.getProperty("all_appeal"))).click();
			
				Thread.sleep(2000);
											
	         WebElement f1=driver.findElement(By.xpath(appeal_vote));
	         f1.click();
	        	          	              	         
			  Thread.sleep(2000);							
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen1+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			
			driver.findElement(By.linkText("Appeal")).click();
			Thread.sleep(2000);
			
			String expected=driver.findElement(By.xpath(prop.getProperty("vote_sort"))).getText();
			System.out.println("After Vote="+ expected);
			
			Assert.assertFalse(actual.equals(expected));
			Thread.sleep(2000);
			
			driver.close();
				
		
	
	}
	

	public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}

}
