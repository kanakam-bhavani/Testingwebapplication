package com.keyboarddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Loginusingkeywords {
@Test
public void logInTest() throws IOException {
	Loginkeywords key= new Loginkeywords();
	FileInputStream file= new FileInputStream("C:\\Users\\kanak\\Desktop\\Bhavani\\Testingwebapplication\\ApplicationTestDataFiles\\Actionkeys.xlsx");
	XSSFWorkbook workbook= new XSSFWorkbook(file);
	XSSFSheet sheet= workbook.getSheet("sheet1");
	int rowcount=sheet.getLastRowNum();
	for(int i=1;i<=rowcount;i++) {
		Row r=sheet.getRow(i);
		String runmode= r.getCell(4).getStringCellValue();
		if(runmode.equals("Y")) {
			String keyword= r.getCell(3).getStringCellValue();
			if(keyword.equals("LaunchBrowser")) {
				key.LaunchBrowser();
			}
			else
				if(keyword.equals("navigate")) {
					key.navigate();
				}
				else
					if(keyword.equals("enterUserName")) {
						key.enterUserName();
					}
					else
						if(keyword.equals("enterPassword")) {
							key.enterPassword();
						}
						else
							if(keyword.equals("clickLogIn")) {
								key.clickLogIn();
							}

		}
	}
}
}
