import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Luna\\Desktop\\megaa\\Book1.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook work = new XSSFWorkbook(inputStream);
		Sheet sheet = work.getSheet("meg1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(cell);

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Row Count:" + physicalNumberOfRows);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println("row :" + row.getRowNum() + " Particular row cell count:" + physicalNumberOfCells);
		// get all the cell value from row

		for (int i = 0; i < physicalNumberOfCells; i++) {

			System.out.println(row.getCell(i));
		}

		System.out.println("----------------printing full sheet value--------------");
		//
		for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {
			Row row2 = sheet.getRow(j);
			for (int i = 0; i < row2.getPhysicalNumberOfCells(); i++) {
				System.out.println(row2.getCell(i));
			}
		}

	}

}