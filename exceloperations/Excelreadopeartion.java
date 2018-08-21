package exceloperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Excelreadopeartion {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("C:\\Users\\kanak\\Desktop\\selenium1\\webApplicationtesting\\Exceltestdatafiles\\TestDataFile.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("sheet1");
		Row r= sheet.getRow(0);
	Cell c= r.getCell(0);
	String data= c.getStringCellValue();
	System.out.println(data);

	}

}
