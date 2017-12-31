package SPRINT2_Categories;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Categories {
	
	WebDriver driver;
	Properties prop;

	
	@SuppressWarnings("unlikely-arg-type")
	public void categories_filter(String email,String pwd,String category,String spell_check,String screen_shot) throws Exception
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\Lib\\ObjectRepository.properties");

		prop=new Properties();
		prop.load(file);

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe" );

		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url_login"));
		
		WebElement emailid=driver.findElement(By.id(prop.getProperty("email_login")));
		emailid.sendKeys(email);
		
		WebElement password=driver.findElement(By.id(prop.getProperty("pwd_login")));
		password.sendKeys(pwd);
		
		Thread.sleep(1000);
		
		WebElement login=driver.findElement(By.xpath(prop.getProperty("login")));
		login.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("appeal_header"))).click();
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("category_open"))).click();
		
		if(category.equalsIgnoreCase("agriculture"))
		{
			
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_agri"))).getCssValue("background-color");
                System.out.println("Color Before Selecting Agriculture_Checkbox="+before_color);	
            Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_agri"))).isEnabled();
                System.out.println("Agriculture_Checkbox is Enabled="+checkbox_enabled);
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_agri"))).isSelected();
                System.out.println("By default Checkbox is Selected="+ checkbox_selected);
            WebElement agri=driver.findElement(By.xpath(prop.getProperty("category_agri")));
                agri.click();
                
                Thread.sleep(2000);
    			
    			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    			
    			File destFile=new File(screen_shot+timestamp()+".png");
    			FileUtils.copyFile(srcFile, destFile);
    			Thread.sleep(2000);
             
             
                System.out.println(agri.isDisplayed());
            String after_color=agri.getCssValue("background-color");
                System.out.println("Color After Selecting Agriculture_Checkbox="+after_color);
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
                 System.out.println("Status After Selecting CheckBox Agriculture="+ after_selected);
            Boolean after_enabled=agri.isEnabled();
                 System.out.println("Agriclture is Enabled after Selected status="+after_enabled );
                 
                 System.out.println(agri.isSelected());
                
                 Assert.assertFalse(before_color.equals(after_color), "Pass");
                 
                Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
              
                String actual=agri.getText();
                
                Assert.assertEquals(actual, spell_check);
                                 
                                           
                        Robot robot=new Robot();
                        
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        Thread.sleep(1000);
                        robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                        
                        Thread.sleep(2000);

        				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
        				appeal_responsive.click();
        				Thread.sleep(2000);
        				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
        				logoff.click();
                        driver.close();
                        
		}
		else if(category.equalsIgnoreCase("Animal"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_animal"))).getCssValue("background-color");
           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_animal"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_animal"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_animal")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
                             
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    
                    
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
    				
                    driver.close();
		}
		
		else if(category.equalsIgnoreCase("Arts"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_arts"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_arts"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_arts"))).isSelected();
            
            WebElement arts=driver.findElement(By.xpath(prop.getProperty("category_arts")));
            arts.click();
            
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=arts.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=arts.isEnabled();
            
            String actual=arts.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		
		else if(category.equalsIgnoreCase("Arts & culture"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_artsculture"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_artsculture"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_artsculture"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_artsculture")));
            anml.click();
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("Awareness"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_awareness"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_awareness"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_awareness"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_awareness")));
            anml.click();
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
         
		else if(category.equalsIgnoreCase("Child"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_child"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_child"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_child"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_child")));
            anml.click();
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		
		else if(category.equalsIgnoreCase("Climate Change"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("categoryclimate"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("categoryclimate"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("categoryclimate"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("categoryclimate")));
            anml.click();
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("Compassion"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_compassion"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_compassion"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_compassion"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_compassion")));
            anml.click();
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("Computers"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_comp"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_comp"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_comp"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_comp")));
            anml.click();
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("DISASTER"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_disa"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_disa"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_disa"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_disa")));
            anml.click();
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("EDUCATION"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_edu"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_edu"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_edu"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_edu")));
            anml.click();
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("ENERGY"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_engy"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_engy"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_engy"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_engy")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("Environment"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_env"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_env"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_env"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_env")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("Family"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_fam"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_fam"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_fam"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_fam")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("Food"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_food"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_food"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_food"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_food")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		
		else if(category.equalsIgnoreCase("Farming"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_farm"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_farm"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_farm"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_farm")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("Hackathon"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_hack"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_hack"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_hack"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_hack")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("Healthcare"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_health"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_health"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_health"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_health")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("INFRASTRUCTURE"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_infra"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_infra"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_infra"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_infra")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("INTERNSHIP"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_inter"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_inter"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_inter"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_inter")));
            anml.click();
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();                    driver.close();
		}
		else if(category.equalsIgnoreCase("KINDNESS"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_kind"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_kind"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_kind"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_kind")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();                    driver.close();
		}
		else if(category.equalsIgnoreCase("Peace"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_peace"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_peace"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_peace"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_peace")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
			
			
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();                    driver.close();
		}
		else if(category.equalsIgnoreCase("REFUGEES"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_refug"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_refug"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_refug"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_refug")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();                    
    				driver.close();
		}
		else if(category.equalsIgnoreCase("SCHOOL"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_school"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_school"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_school"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_school")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("SCIENCE"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_science"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_science"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_science"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_science")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();                   
    				driver.close();
		}
		else if(category.equalsIgnoreCase("SENIORS"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_senior"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_senior"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_senior"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_senior")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
       
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("SPORTS"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_sports"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_sports"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_sports"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_sports")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                  
                    
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		
		else if(category.equalsIgnoreCase("STRATEGY"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_strat"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_strat"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_strat"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_strat")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
    				
                    driver.close();
		}
		else if(category.equalsIgnoreCase("SUICIDE"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_suic"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_suic"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_suic"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_suic")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("WATER"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_water"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_water"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_water"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_water")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("WOMEN"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_women"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_women"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_women"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_women")));
            anml.click();
            
            Thread.sleep(2000);
            
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else if(category.equalsIgnoreCase("OTHERS"))
		{
			String before_color=driver.findElement(By.xpath(prop.getProperty("category_other"))).getCssValue("background-color");
	           
			Boolean checkbox_enabled=driver.findElement(By.xpath(prop.getProperty("category_other"))).isEnabled();
           
            Boolean checkbox_selected=driver.findElement(By.xpath(prop.getProperty("category_other"))).isSelected();
            
            WebElement anml=driver.findElement(By.xpath(prop.getProperty("category_other")));
            anml.click();
            
            Thread.sleep(2000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(screen_shot+timestamp()+".png");
			FileUtils.copyFile(srcFile, destFile);
			Thread.sleep(2000);
            
            String after_color=anml.getCssValue("background-color");
         
            String after_selected=driver.findElement(By.id("check_2")).getAttribute("checked");
        
            Boolean after_enabled=anml.isEnabled();
            
            String actual=anml.getText();
            Assert.assertEquals(actual, spell_check);
            
            
             Assert.assertFalse(before_color.equals(after_color), "Pass");
             
            Assert.assertFalse(checkbox_selected.equals(after_selected), "Pass");
            
            Assert.assertEquals(checkbox_enabled, after_enabled);
                        
                    Robot robot=new Robot();
                    
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(1000);
                    robot.keyPress((KeyEvent.VK_PAGE_DOWN));
                    Thread.sleep(2000);

    				WebElement appeal_responsive=driver.findElement(By.xpath(prop.getProperty("responsivebar")));
    				appeal_responsive.click();
    				Thread.sleep(2000);
    				WebElement logoff=driver.findElement(By.cssSelector(prop.getProperty("logout")));
    				logoff.click();
                    driver.close();
		}
		else
			System.out.println("hello");
	
		
	}
	public String timestamp() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
	
}
