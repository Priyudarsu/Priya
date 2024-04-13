package mar.prac.pack;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadEx 
{
	public static void main(String[] args) throws IOException 
	{
		String location="./src/test/resources/Testcs/Book1sample.xlsx";
		XSSFWorkbook wbook=new XSSFWorkbook(location);
		XSSFSheet sheet=wbook.getSheetAt(1);
		int rows=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			int cells=row.getPhysicalNumberOfCells();
			for(int j=0;j<cells;j++)
			{
				XSSFCell cell=row.getCell(j);
				String value=cell.getStringCellValue();
				System.out.println(value);
			}
		}
			
	
		}
		
		
	}


