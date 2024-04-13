package mar.prac.pack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenExm 
{
	public static void main(String[] args) throws IOException
	{
		try
		{
		String location="./src/test/resources/Testcs/Book1sample.xlsx";	
		XSSFWorkbook wbook=new XSSFWorkbook(location);
		XSSFSheet sheet=wbook.getSheet("sheet1");
		XSSFRow row=sheet.getRow(0);
		XSSFCell cell=row.getCell(0);
		String name=cell.getStringCellValue();
		System.out.println("name- "+name);
		XSSFRow row1=sheet.getRow(0);
		XSSFCell cell1=row1.getCell(1);
		Double id=cell1.getNumericCellValue();
		System.out.println("id- "+id);
		wbook.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
}}
