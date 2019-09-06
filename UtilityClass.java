package ExcellSheets;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityClass {
	void test(String Username, String Password) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\dev03\\Desktop\\NagendraReddy\\Excel\\Book1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet=book.getSheet("FACEBOOK");
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		

	}

}
