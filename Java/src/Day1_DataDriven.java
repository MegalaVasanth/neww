import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Day1_DataDriven {
	public static void main(String[] args) throws IOException {
 		
		File file = new File("C:\\Users\\Luna\\Desktop\\megaa\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		
//		Workbook work = new XSSFWorkbook(stream);
//		Sheet sheet = work.getSheet("meg1");
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		System.out.println(cell);
		
		//sheet sheet = work.getSheet("meg1");
		
		//FileUtils f= new FileUtils();
	}

}
