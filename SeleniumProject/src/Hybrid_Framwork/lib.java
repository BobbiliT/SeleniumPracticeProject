package Hybrid_Framwork;

import java.util.Properties;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class lib {

	public static Workbook wb;

	public static String getpoperty(String CONFIG_PATH, String key) {

		String property = "";

		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_PATH));
			property = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return property;
	}

	public static String getcell(String EXCEL_PATH, String sheet, int row, int column) {
		String value = "";

		try {
			wb = WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			value = wb.getSheet(sheet).getRow(row).getCell(column).toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
}
