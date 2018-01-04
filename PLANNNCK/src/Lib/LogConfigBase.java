package Lib;

//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;



public class LogConfigBase extends extendReport {

	public static final Logger logger=Logger.getLogger(Resources.class.getName());
	@BeforeTest
	public void loadlog4j()
	{
		//BasicConfigurator.configure();
	/*	// Generation of og Using XML
		String log4jconfpath=System.getProperty("user.dir")+"\\src\\Lib\\log4j.xml";
		DOMConfigurator.configure(log4jconfpath);
		*/
		
		String log4jconfpath=System.getProperty("user.dir")+"\\src\\Lib\\log4j.properties";
		PropertyConfigurator.configure(log4jconfpath);
	}
}
