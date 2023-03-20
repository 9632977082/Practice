package Generic_lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility 
{
	public String getExcelValue(Sheet sheet,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./DATA1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet1=book.getSheet("sheet");
		Row row = sheet1.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String data = cell.getStringCellValue();
		return data;
	}

	public int getRowcount(String Sheet) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./DATA1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet1=book.getSheet("sheet");
		int rownum = sheet1.getLastRowNum();
		return rownum;
	}
	public void toWriteDataInExcel(String sheetname,int rownum,int cellnum,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./DATA1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream fis1 = new FileOutputStream("./DATA1.xlsx");
		book.write(fis1);
		book.close();
	}

}
