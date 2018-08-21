package com.timeanddatewebapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_completedata {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		String part1="html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[";
		String part2= "]/td[";
		String part3= "]";
		for(int i=1;i<=36;i++) {
			for(int j=1;j<=8;j++) {
			String data= driver.findElement(By.xpath(part1+i+part2+j+part3)).getText();	
			System.out.print(data+"");
			}
			System.out.println();
			}
driver.close();
	}

}
