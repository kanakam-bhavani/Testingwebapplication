package com.timeanddatewebapplication;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturingfirstcolumndata {

	public static void main(String[] args) {
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().window().maximize();
		String part1="html/body/div[1]/div[9]/section[2]/div[1]/table/tbody/tr[";
		String part2= "]/td[1]";
		for(int i=1;i<=36;i++) {
			String cityName= driver.findElementByXPath(part1+i+part2).getText();
			System.out.println(cityName);
			
			
		}
		driver.close();
		
	}

}
