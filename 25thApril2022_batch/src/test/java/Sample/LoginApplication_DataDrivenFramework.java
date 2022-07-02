package Sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class LoginApplication_DataDrivenFramework {

	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;
	private static HSSFRow row;
	// cell is ntg but column
	private static HSSFCell cell;

	public static void main(String[] args) throws IOException {
		
	
		File file = new File(
				"C:\\Users\\himaj\\Desktop\\Selenium With Java New Batch\\25thApril2022_batch\\src\\test\\java\\Testdata\\RealTimeExample.xls");

		FileInputStream fIS = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		workbook=new HSSFWorkbook(fIS);

		// creating a Sheet object
		sheet=workbook.getSheet("RealTime");

		// getting the cell value from rowNumber and cell Number
		cell=sheet.getRow(0).getCell(1);

		// returning the cell value as string
		System.out.println(cell.getStringCellValue()); 

		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		
		System.out.println(rowcount);
		
		for(int i = 1;i<=rowcount;i++)
		{

			sheet.getRow(i).createCell(3).setCellValue("100");

			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);

		}
	
	}



}
