package mar.prac.pack;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;


public class ReadndWrite
{
	public static void main(String[] args) throws IOException 
	{
		String location="./src/test/resources/Testcs/Book1sample.xlsx";
		XSSFWorkbook wbook=new XSSFWorkbook(location);
		XSSFSheet sheet=wbook.getSheetAt(2);
		int noofRows=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<noofRows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			int noofCells=row.getPhysicalNumberOfCells();
			for(int j=0;j<noofCells;j++)
			{
				XSSFCell cell=row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType==CellType.STRING)
				{
					String svalue=cell.getStringCellValue();
					System.out.println("String"+svalue);
				}
				else if(cellType==CellType.BOOLEAN)
				{
					Boolean bvalue=cell.getBooleanCellValue();
					System.out.println("boolean"+bvalue);
				}
				else if(cellType==CellType.NUMERIC)
				{
					if(DateUtil.isCellDateFormatted(cell)) {
						   Date d = cell.getDateCellValue();
						   
						   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						   String dateValue = sdf.format(d);
						   System.out.println("Date : "+dateValue);
					   }
					   else {
						  double dValue = cell.getNumericCellValue();
						  System.out.println(dValue);
					   }
				}
				
			}
				
		}
	}

}
