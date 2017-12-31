package Lib;


import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import SPRINT1_Login.DataDrivenTest;

public class Excel_Read extends DataDrivenTest {
	public String path;
	public XSSFWorkbook workbook=null;
	XSSFSheet sheet;
	public FileInputStream file=null;
	public FileOutputStream fos=null;
	XSSFRow row;
	XSSFCell cell;
	public  Excel_Read(String path) throws IOException
	{
		this.path=path;
		file=new FileInputStream(path);
		workbook=new XSSFWorkbook(file);
		//change

	} 

	public String getDataCell(String sheetName, int ColNum,int RowNum)
	{

		try {
			if(RowNum<=0)
			{
				return " ";
			}

			int index=workbook.getSheetIndex(sheetName);
			sheet=workbook.getSheetAt(index);

			row=sheet.getRow(0);
			row=sheet.getRow(RowNum-1);
			cell=row.getCell(ColNum);

			if(cell.getCellType()==Cell.CELL_TYPE_STRING)
			{
				System.out.println(cell.getStringCellValue());
				return cell.getStringCellValue();
			}
			else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
			
				System.out.println(cell.getNumericCellValue());
				return String.valueOf( cell.getNumericCellValue());
				/*String str = NumberToTextConverter.toText(cell.getNumericCellValue());
				System.out.println(str);
				return str;
							*/

			}

			else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN)
			{
				return String.valueOf(cell.getBooleanCellValue());
			}

			else if(cell.getCellType()==Cell.CELL_TYPE_BLANK)
			{
				return "";

			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;


	}
	// Returns the Row Count
	public int getRowCount(String sheetName)
	{

		int index=workbook.getSheetIndex(sheetName);
		if(index==-1)
		{
			return 0;

		}
		else
		{
			sheet=workbook.getSheetAt(index);
			int rownumber=sheet.getLastRowNum()+1;
			System.out.println("Row_Excel_Read="+rownumber);
			return rownumber;	

		}
	}

	public int getColumnCount(String sheetName)
	{
		try{
			int index=workbook.getSheetIndex(sheetName);
			if(index==-1)
			{
				return 0;

			}
			else
			{
				sheet=workbook.getSheetAt(index);
				row=sheet.getRow(0);
				int col= row.getLastCellNum();
				System.out.println("Column_Exel_Read="+col);
				return col;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	

	
	


}
