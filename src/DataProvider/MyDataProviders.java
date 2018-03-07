package DataProvider;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class MyDataProviders {
	
	@DataProvider(name = "GoIbibo")
	public static String[][] ReadData() throws Exception {
	
		String filePath = "Data.xlsx";

		FileInputStream file = new FileInputStream(filePath);

		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet ws = wb.getSheetAt(0);

		int rc = ws.getLastRowNum() + 1;
		int cc = ws.getRow(0).getLastCellNum();

		String[][] data = new String[rc - 1][cc];

		for (int i = 1; i < rc; i++) {
			XSSFRow row = ws.getRow(i);

			for (int j = 0; j < cc; j++) {
				XSSFCell cell = row.getCell(j);

				String val = cell.getStringCellValue();

				data[i - 1][j] = val;
			}
		}
		return data;
	}

}
