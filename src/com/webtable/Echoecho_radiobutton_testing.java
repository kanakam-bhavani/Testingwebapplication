package com.webtable;

import java.util.List;

import javax.sql.RowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Echoecho_radiobutton_testing {

	public static void main(String[] args) {
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("http://www.echoecho.com/htmlforms10.htm");
	WebElement block= driver.findElement(By.xpath("html/body/div[2]/table[9]"));
	//capturing all the radio button into radio array
	
List<WebElement>radio=block.findElements(By.name("group1"));
//find the size of the array
System.out.println(radio.size());
for(int i=0;i<radio.size();i++) {
	radio.get(i).click();
	Sleeper.sleepTightInSeconds(10);
	for(int j=0;j<radio.size();j++) {
		System.out.println(radio.get(j).getAttribute("value")+ " " + radio.get(j).getAttribute("checked"));
	}
	Sleeper.sleepTightInSeconds(10);
}
	}

}
