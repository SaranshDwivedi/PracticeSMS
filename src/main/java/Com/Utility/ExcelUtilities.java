package Com.Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities
{
	public String ReadDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstant.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String data = cell.getStringCellValue();
		return data;
	}

	public int getLastRowNum(String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstant.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int data = sheet.getLastRowNum();
		return data;
	}

	public HashMap<String, String> hashMapData(String sheetName, int cell) throws Throwable 
	{
		FileInputStream fi = new FileInputStream(IPathConstant.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet(sheetName);
		int lastRow = sh.getLastRowNum();

		HashMap<String, String> map = new HashMap<String, String>();
		for (int i = 0; i <= lastRow; i++) {
			String key = sh.getRow(i).getCell(cell).getStringCellValue();
			String value = sh.getRow(i).getCell(cell + 1).getStringCellValue();
			map.put(key, value);
		}
		return map;
	}

	public void WriteDataFromExcel(String sheetName, int rowNum, int cellNum) throws Throwable, IOException
	{
		FileInputStream fis = new FileInputStream(IPathConstant.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		sheet.createRow(rowNum).createCell(cellNum);

		FileOutputStream fos = new FileOutputStream(IPathConstant.ExcelPath);
		wb.write(fos);
		wb.close();
	}

	public Object[][] ReadDataExcel(String sheetName) throws Throwable 
	{
		FileInputStream fis = new FileInputStream(IPathConstant.ExcelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum();
		int lastCell = sheet.getRow(0).getLastCellNum();

		Object[][] obj = new Object[lastRow][lastCell];
		for(int i = 0; i < lastRow; i++)
		{
			for(int j = 0; j < lastCell; j++)
			{
				obj[i][j]= sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}
}


