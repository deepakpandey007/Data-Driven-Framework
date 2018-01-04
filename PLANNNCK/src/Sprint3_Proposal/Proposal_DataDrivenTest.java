package Sprint3_Proposal;

import java.util.Properties;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Lib.Resources;


public class Proposal_DataDrivenTest extends Resources{
	
	Properties prop;

	public Object[][] proposalcreate_data() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_Proposal", "sheetname_prodata");
		return  data;
	}

	@DataProvider(name="proposalcreate_data")
	public Object[][] proposaldata_Valid() throws Exception
	{
		Object[][] data=proposalcreate_data();
		return data;
	}
	
	@Test(dataProvider="proposalcreate_data",priority=1,enabled=false,groups="Smoke",description="Proposal Create With Valid Data Info")
	public void Proposal_Data(String testid,String browser,String desc,String email,String pwd,String type,String title,String lim1,String cate,String tag,String lim2,String descp,String lim3,
			                                   String solvep,String lim4,String pdo,String lim5,String res,String lim6,String urltext,String lim7,String urlfor,
			                                           String atttext,String lim8,String attfor,String img,String screen,String runmode,String status,String comment) throws Exception
	{
		if(runmode.equals("Yes"))
		{
			Proposal_Create valuedata=new Proposal_Create();
			valuedata.valid_proposalcreate(browser,email,pwd,type,title,cate,tag,descp,solvep,pdo,res,urltext,urlfor,atttext,attfor,img,screen);
		}

		else
			System.out.println("Skip the Test");
	}

	public Object[][] proposalmultiple_resources() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_Proposal", "sheetname_Resources");
		return  data;
	}

	@DataProvider(name="proposalresource_multiple")
	public Object[][] proposalresource_Valid() throws Exception
	{
		Object[][] data=proposalmultiple_resources();
		return data;
	}
	
	@Test(dataProvider="proposalresource_multiple",priority=2,enabled=false,groups="Smoke",description="Proposal Create With Valid Multiple Resources")
	public void Proposal_Resources(String testid,String browser,String desc,String step,String email,String pwd,String type,String title,String cate,String tag,String descp,
			                                   String solvep,String pdo,String res1,String res2,String res3,String res4,String res5,String res6,String res7,String res8,String res9,String res10,
			                      String res11,String res12,String res13,String res14,String res15,String res16,String res17,String res18,String res19,String res20,String screen,String runmode,String status,String comment) throws Exception
	{
		if(runmode.equals("Yes"))
		{
			Proposal_Create valuedata=new Proposal_Create();
			valuedata.resources_addmultiple(browser,step,email,pwd,type,title,cate,tag,descp,solvep,pdo,res1,res2,res3,res4,res5,res6,res7,res8,res9,res10,res11,res12,res13,res14,
					res15,res16,res17,res18,res19,res20,screen);
		}

		else
			System.out.println("Skip the Test");
	}

	public Object[][] proposal_blankinputs() throws Exception
	{
		prop= file_execute();
		Object[][] data=sheet_data("sheetpath_Proposal", "sheetname_blank");
		return  data;
	}

	@DataProvider(name="proposal_blank")
	public Object[][] proposalblank_inputs() throws Exception
	{
		Object[][] data=proposal_blankinputs();
		return data;
	}
	
	@Test(dataProvider="proposal_blank",priority=2,enabled=true,groups="Smoke",description="Proposal Check with Blank Inputs")
	public void Proposal_Blank(String testid,String browser,String desc,String step,String email,String pwd,String type,String title,String cate,String tag,String descp,
			                                   String solvep,String pdo,String res ,String exp,String acu,String runmode,String status,String comment) throws Exception
	{
		if(runmode.equals("Yes"))
		{
			Proposal_Create valuedata=new Proposal_Create();
			valuedata.propose_blankfields(browser,step,email,pwd,type,title,cate,tag,descp,solvep,pdo,res);
		}

		else
			System.out.println("Skip the Test");
	}
	
	
}
