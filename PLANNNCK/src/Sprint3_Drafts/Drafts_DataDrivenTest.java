package Sprint3_Drafts;

import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.Resources;


public class Drafts_DataDrivenTest extends Resources {
	
	
	Properties prop;
	public Object[][] proposal_drats() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_Drafts", "sheetname_drafts");
		return  data;
	}

	@DataProvider(name="proposal_drafts")
	public Object[][] proposaldrafts_inputs() throws Exception
	{
		Object[][] data=proposal_drats();
		return data;
	}
	
	@Test(dataProvider="proposal_drafts",priority=1,enabled=true,groups="Smoke",description="Proposal Check with Valid Inputs")
	public void Proposal_Drafts(String testid,String browser,String desc,String step,String email,String pwd,String type,String title,String cate,String tag,String descp,
			                                   String solvep,String pdo,String res ,String url,String urllink,String attfor,String attlink,String runmode,String status,String comment) throws Exception
	{
		if(runmode.equals("Yes"))
		{
			Proposal_Drafts valuedata=new Proposal_Drafts();
			valuedata.proposalvalid_Drafts(browser,step,email,pwd,type,title,tag,descp,solvep,pdo,res,url,urllink,attfor);
		}

		else
			System.out.println("Skip the Test");
	}	


}
