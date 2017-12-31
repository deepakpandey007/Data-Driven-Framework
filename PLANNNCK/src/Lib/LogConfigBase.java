package Lib;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;



public class LogConfigBase {

	public static final Logger logger=Logger.getLogger(Resources.class.getName());
	@BeforeTest
	public void loadlog4j()
	{
		BasicConfigurator.configure();
		String log4jconfpath=System.getProperty("user.dir")+"\\log4j.properties";
		PropertyConfigurator.configure(log4jconfpath);
	}
}
