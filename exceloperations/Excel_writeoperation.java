package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_writeoperation {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\kanak\\Desktop\\selenium1\\webApplicationtesting\\Exceltestdatafiles\\TestDataFile.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("sheet1");
		Row r= sheet.createRow(2);
		Cell c= r.createCell(3);
		c.setCellValue("hello");
		FileOutputStream file1= new FileOutputStream("C:\\Users\\kanak\\Desktop\\selenium1\\webApplicationtesting\\Exceltestdatafiles\\TestDataFile.xlsx");
		workbook.write(file1);

	}

}
