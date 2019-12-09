package selenium.automation;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityClass {
	public String health(String User, String Details) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\dev03\\Desktop\\NagendraReddy\\Excel\\Merc.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Merc");
		// String s1=sheet.getRow(1).getCell(2).getStringCellValue();
		// System.out.println(s1);
		/*int s1=sheet.getLastRowNum();
		System.out.println(s1);*/
		for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
			if (sheet.getRow(i).getCell(0).getStringCellValue().equals(User)) {
				for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
					if (sheet.getRow(0).getCell(j).getStringCellValue().equals(Details)) {
						return sheet.getRow(i).getCell(j).getStringCellValue();
					}
				}
			}
		}
		return null;
	}

	public static void main(String[] args) throws Exception {
		UtilityClass uc = new UtilityClass();
		String fn = uc.health("Details", "First");
		System.out.println(fn);
		String fn1 = uc.health("Details", "Last");
		System.out.println(fn1);

	}
}
