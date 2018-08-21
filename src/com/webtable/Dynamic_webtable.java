package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Dynamic_webtable {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		
		//identifying the table in the web application
		WebElement table=driver.findElement(By.xpath("html/body/din[1]/div[9]/section[2]/div[1]/table"));
		//capturing all the TR in the table
List<WebElement>rows= table.findElements(By.tagName("tr"));
for(int i=0;i<rows.size();i++) {
	//going to every TR and identifying all the TD's in it
	List<WebElement>columns=rows.get(i).findElements(By.tagName("td"));
	//getting data of all the columns of the current row
	for(int j=0;j<columns.size();j++) {
		String data= columns.get(j).getText();
		System.out.println(data + " ");
		
	}
	System.out.println();
}
driver.close();

	}

}
