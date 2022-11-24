package Generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_utility 
{
	/*
	 * used to fetch the excel value
	 * parameters 
	 * return type is String
	 * prepared by Shiva shankar r
	 */
	public String getExcelValue(String Sheet1,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(ipathConstant.Excel_path);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(Sheet1);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String data = cell.getStringCellValue();
		return data;
		
	}

}
