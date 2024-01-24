package Com.Utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataTNG 
{
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
