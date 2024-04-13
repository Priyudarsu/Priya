package mar.prac.pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeex 
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("Samples/Testcase.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
		//XSSFSheet sheet=wbook.createSheet("Sheet3");
		//XSSFRow row=sheet.createRow(0);
		//XSSFCell cell=row.createCell(0);
		//cell.setCellValue("cute");
		FileOutputStream fos=new FileOutputStream(f);
		//wbook.write(fos);
		//wbook.close();
		System.out.println("completed");
		XSSFSheet sheet1=wbook.getSheet("sheet3");
		XSSFRow row1=sheet1.getRow(0);
		XSSFCell cell1=row1.createCell(1);
		cell1.setCellValue("Handsome");
		wbook.write(fos);
		wbook.close();
		System.out.println("awesome");
	}

}
