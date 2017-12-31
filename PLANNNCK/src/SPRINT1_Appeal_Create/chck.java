package SPRINT1_Appeal_Create;

import java.util.ArrayList;
import java.util.List;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;




public class chck {
	
	WebDriver driver;
	Properties prop;
	
	@Test
	
	public void test() throws Exception 
	{
		
	System.out.println(System.getProperty("user.dir"));
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\Lib\\ObjectRepository.properties");

		prop=new Properties();
		prop.load(file);
		
		/*Screen screen=new Screen();
		org.sikuli.script.Pattern img=new org.sikuli.script.Pattern("C:\\Users\\Microsoft\\Desktop\\appeal2.png");*/
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Microsoft\\eclipse-workspace\\PLANNNCK\\Driver\\chromedriver.exe" );

		driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	   driver.get("http://planncktest.ap-south-1.elasticbeanstalk.com/login");
	   
	
	 //  System.out.println( driver.findElement(By.xpath("//label[contains(text(),'Email')]")).getText());
		//driver.get("http://planncktest.ap-south-1.elasticbeanstalk.com/register");

	   JavascriptExecutor js1 = (JavascriptExecutor)driver;
	   String domain=js1.executeScript("return document.domain;").toString();
	   System.out.println("Domain Name="+domain);
	   
	   //Initially bellow given if condition will check ready state of page.
	   if (js1.executeScript("return document.readyState").toString().equals("complete")){ 
	    System.out.println("Page Is loaded.");
	   } 
	  
	   
	   //This loop will rotate for 25 times to check If page Is ready after every 1 second.
	   //You can replace your value with 25 If you wants to Increase or decrease wait time.
	/*   for (int i=0; i<3; i++){ 
	    try {
	     Thread.sleep(1000);
	     }catch (InterruptedException e) {} 
	    //To check page ready state.
	    if (js1.executeScript("return document.readyState").toString().equals("complete")){ 
	     //break; 
	    }   */
	   
	
	   
	   WebElement email_user=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user.sendKeys("14deepak07@gmail.com");
		WebElement pwd_user =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user.sendKeys("qwerty");
		
		WebElement button=driver.findElement(By.xpath(prop.getProperty("login")));
		
		js.executeScript("arguments[0].click();", button);
		if (js1.executeScript("return document.readyState").toString().equals("complete")){ 
		    System.out.println("Page Is loaded.");
		}
		js.executeScript("alert('Login Successfully');");
	   String src=driver.getWindowHandle();
	   Alert pop=driver.switchTo().alert();
	   pop.accept();
	   driver.switchTo().window(src);
	   
		driver.findElement(By.xpath(prop.getProperty("propose_tag"))).click();
		Thread.sleep(1000);				
		driver.findElement(By.xpath("//*[@class='apl-btn']")).click();
		Thread.sleep(2000);
		ArrayList<String> list_click=new ArrayList<String>();	
		ArrayList<String> list=new ArrayList<String>();
		for(int i=2;i<=9;i++)
		{
		list.add("html/body/div["+i+"]");
		
		}
		for(int j=1;j<=8;j++)
		{
			int t=j+1;
			list_click.add("html/body/div["+t+"]/div[2]/button[@id='takeatour"+j+"']");
			System.out.println(list_click.get(0));
		}
		driver.findElement(By.xpath(prop.getProperty("prosubmit"))).click();
		Thread.sleep(2000);
		try {
		for(int l=0;l<list.size();l++)
		{
			
		boolean box1=driver.findElement(By.xpath(list.get(l))).isDisplayed();
		System.out.println(box1);
		
		}
		}
			catch(Exception e)
			{
			System.out.println("No Element is Present");
			}
		
	
		
		String loc=driver.findElement(By.xpath("html/body/div[2]")).getLocation().toString();
		System.out.println(loc);
		String arrow=driver.findElement(By.xpath("html/body/div[2]/div[@class='arrow']")).getLocation().toString();
		System.out.println(arrow);
		String tit=driver.findElement(By.xpath("html/body/div[2]/div[2]/p[@id='titleerror1']")).getText();
		System.out.println(tit);
		boolean status1=driver.findElement(By.xpath("html/body/div[2]/div[2]/button[@id='takeatour1']")).isEnabled();
		System.out.println(status1);
		driver.findElement(By.xpath(prop.getProperty("activity_check"))).click();
		boolean status00=driver.findElement(By.xpath("html/body/div[2]/div[2]/button[@id='takeatour1']")).isEnabled();
		System.out.println(status00);
		driver.findElement(By.xpath("html/body/div[2]/div[2]/button[@id='takeatour1']")).click();
		boolean status77=driver.findElement(By.xpath("html/body/div[2]")).isDisplayed();
		System.out.println(status77);
		
		
		driver.findElement(By.xpath("html/body/div/form/section[2]/div/div/div/div/div[2]/div/p[@class='hideithere']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/form/section[2]/div/div/div/div/div[2]/div/div/div[2]/button[@id='selectvid-btn3']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Microsoft\\Desktop\\autoitscript.exe");
		System.out.println(driver.findElement(By.xpath("html/body/div/form/section[3]/div/div/div[2]/div[1]/div/div/div/span[1]")).getText());		
		driver.findElement(By.xpath("//h6[contains(text(),'Submitted')]")).click();
		driver.findElement(By.xpath("//p[@id='pr-header' and contains(text(),'if you')]")).click();
		
		driver.findElement(By.xpath("html/body/div[1]/header/div/div/div/div/div/div[2]/button")).click();
		System.out.println("Before Click status activity");
		
		driver.findElement(By.id("proposal_title")).sendKeys("hi");
		
		System.out.println(driver.findElement(By.xpath(prop.getProperty("activity_check"))).isEnabled());
		System.out.println(driver.findElement(By.xpath(prop.getProperty("activity_check"))).isSelected());
		System.out.println(driver.findElement(By.xpath(prop.getProperty("activity_check"))).isDisplayed());
		System.out.println("Before Click status Traini");
		System.out.println(driver.findElement(By.xpath(prop.getProperty("training_check"))).isEnabled());
		System.out.println(driver.findElement(By.xpath(prop.getProperty("training_check"))).isSelected());
		System.out.println(driver.findElement(By.xpath(prop.getProperty("training_check"))).isDisplayed());
		
	String status5=driver.findElement(By.xpath("//*[@id=\"activity-prps\"]")).getAttribute("checked");
	System.out.println("status1="+status5);
	String status2=driver.findElement(By.xpath("//*[@id=\"activity-prps\"]")).getAttribute("checked");
	System.out.println("status2="+status2);
	System.out.println("After Click activity");
	WebElement status3=driver.findElement(By.xpath(prop.getProperty("activity_check")));
	status3.click();
	Thread.sleep(1000);
	String stat=driver.findElement(By.xpath("//*[@id=\"activity-prps\"]")).getAttribute("checked");
	System.out.println("stat="+stat);	
	System.out.println("After Click the Activity Status of training");
	String status4=driver.findElement(By.xpath("//*[@id=\"activity-prps\"]")).getAttribute("checked");
	System.out.println("status4="+status4);
	System.out.println("Afetr click status");
	
	System.out.println(driver.findElement(By.xpath(prop.getProperty("training_check"))).isEnabled());
	System.out.println(driver.findElement(By.xpath(prop.getProperty("training_check"))).isSelected());
	System.out.println(driver.findElement(By.xpath(prop.getProperty("training_check"))).isDisplayed());
	System.out.println("Afetr click status");
	System.out.println(driver.findElement(By.xpath(prop.getProperty("activity_check"))).isEnabled());
	System.out.println(driver.findElement(By.xpath(prop.getProperty("activity_check"))).isSelected());
	System.out.println(driver.findElement(By.xpath(prop.getProperty("activity_check"))).isDisplayed());
	
	
	
	
		
		 List<WebElement> allLinkElements = driver.findElements(By.xpath("//a"));
	       
	        // Count the total Link list on Web Page 
	        int linkListCount = allLinkElements.size();
	               
	        //Print the total count of links on webpage
	        System.out.println("Total Number of link count on webpage = "  + linkListCount);    
	             
	       //Identify all the elements on web page
	       List<WebElement> allElements = driver.findElements(By.xpath("//*"));
	      
	       //Count the total all element on web page
	       linkListCount = allElements.size();
	    
	       //Print the total count of all element on webpage
	       System.out.println("Total Number of All Element on webpage = "  + linkListCount); 
	       
	        for (WebElement Element : allElements) {
	          
	            //System.out.println(Element.getTagName());
	            System.out.println(Element.getText());
	        }
		driver.findElement(By.xpath("//*[@id=\"text1\"]")).sendKeys("deepak");
		driver.findElement(By.id("password_show")).sendKeys("deepak");
		System.out.println(driver.findElement(By.id("password_show")).getAttribute("value"));		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"password_show\"]")).getCssValue("font-size"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"password_show\"]")).getCssValue("position"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"password_show\"]")).getCssValue("font-weight"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"initialshout\"]/h5/span/img")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"initialshout\"]/h5/span/img")).getCssValue("color"));
		
		

		System.out.println(driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div")).getCssValue("position"));
		System.out.println(driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div")).getSize());
		String header=driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div")).getCssValue("background-color");
		System.out.println("Header Color is="+header);
		String sign=driver.findElement(By.cssSelector(".panel-heading>h4")).getText();
		System.out.println("Text of Sign ="+sign);
		System.out.println(driver.findElement(By.xpath(".//*[@id='text1']")).getAttribute("placeholder"));
		String email=driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div/div[2]/form/div[1]/div[1]/label")).getText();
		System.out.println(email);
		String pwd=driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div/div[2]/form/div[1]/div[2]/div/label")).getText();
		System.out.println(pwd);
		String rmb=driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div/div[2]/form/div[2]/div/div/span/span[2]")).getText();
		System.out.println(rmb);
		String login=driver.findElement(By.cssSelector(".sign-on-in")).getText();
		System.out.println(login);
		Dimension dat=driver.findElement(By.cssSelector(".sign-on-in")).getSize();
		System.out.println(dat.height);
		System.out.println(dat.width);
		String forpwd=driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/div/div[2]/form/div[3]/div/div/div[2]/span/a")).getText();
		System.out.println(forpwd);
		String boss=driver.findElement(By.xpath(".//*[@id='navbarResponsive']/ul/li/h5")).getText();
		System.out.println(boss);
		Dimension img=driver.findElement(By.xpath(".//*[@id='home']/img")).getSize();
		System.out.println("Height is="+img.height);
		System.out.println("Width is="+img.width);
		//String d=driver.findElement(By.xpath(".//*[@id='home']/img")).getText();
		//System.out.println(d);		
		
		
		
		WebElement email_user1=driver.findElement(By.id(prop.getProperty("email_login")));
		email_user1.sendKeys("hitha@gmail.com");
		
		WebElement pwd_user1 =driver.findElement(By.id(prop.getProperty("pwd_login")));
		pwd_user1.sendKeys(" hithashree1234567");
		
		driver.findElement(By.xpath(prop.getProperty("login"))).click();
		
		driver.get("http://planncktest.ap-south-1.elasticbeanstalk.com/appealView");
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath(".//*[@id='down2-1']")).getCssValue("color"));
		driver.findElement(By.xpath("html/body/div[1]/div[3]/div[1]/div/ul/li[2]/a/span[1]")).click();
		System.out.println(driver.findElement(By.xpath(".//*[@id='down2-2']")).getCssValue("background-color"));
		
     
		
		
		
		Boolean t3=driver.findElement(By.xpath(prop.getProperty("vote"))).isEnabled();
		System.out.println("t is enable="+t3);
		
		Boolean t4=driver.findElement(By.xpath(prop.getProperty("vote"))).isDisplayed();
		System.out.println("t1 is display="+t4);
		
		Boolean t5=driver.findElement(By.xpath(prop.getProperty("vote"))).isSelected();
		System.out.println("t2 is selected="+t5);
		
		driver.findElement(By.xpath(prop.getProperty("vote"))).click();
		Boolean t6=driver.findElement(By.xpath(prop.getProperty("vote"))).isEnabled();
		System.out.println("t3 is enable="+t6);
		
		Boolean t7=driver.findElement(By.xpath(prop.getProperty("vote"))).isDisplayed();
		System.out.println("t4 is display="+t7);
		
		Boolean t8=driver.findElement(By.xpath(prop.getProperty("vote"))).isSelected();
		System.out.println("t5 is selected="+t8);
		
		 //   substring(2).equals("Private Threads")
		    
		    /*String text=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/ul/li[1]")).getText();
		    System.out.println(text);
		    String z1=text.substring(2);
		    System.out.println(z1);
		    String z= (String) text.subSequence(2, 15);
		    System.out.println(z);
		    robot.keyPress(KeyEvent.VK_DOWN); 
		    robot.keyPress(KeyEvent.VK_DOWN);
		    //char[] ch=text.toCharArray();
	int j=text.charAt(0);
	System.out.println(j);
	System.out.println(driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[2]/div[1]/div[1]/div[2]")).getText());
		    for(int i=2;i<=text.charAt(0);i++)
		    {
		    	if(i<=text.charAt(0))
		    	{
		    	System.out.println("first="+i);
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[2]/div[1]/div[1]/div[3]/span/img")).click();
		    	Thread.sleep(3000);
		    
		    	WebElement q=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div/div/div[3]/div[2]/div[1]/div[2]/div["+i+"]/div[2]/p[1]"));
		    	q.click();
		    	System.out.println(q.getText());
		    	Thread.sleep(3000);
		    	Robot r1=new Robot();
		    r1.keyPress(KeyEvent.VK_DOWN);
		    r1.keyPress(KeyEvent.VK_DOWN);
	    	System.out.println(i);
		    	}
		    	else
		    	{
		    		System.out.println("Data Check Finised");
		    	}
			    }
		    System.out.println("Finished");
		    
	}
*/
}
}
