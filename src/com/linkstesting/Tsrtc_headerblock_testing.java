package com.linkstesting;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tsrtc_headerblock_testing {

	public static void main(String[] args) 
	{
		
FirefoxDriver driver= new FirefoxDriver();
driver.get("http://www.tsrtconline.in/oprs-web/");
/*<a class="tabcopy" href="/oprs-web/guest/home/miniBus.do?h=1" target="_top" title="Vajra Booking">Vajra Booking</a>
driver.findElementByLinkText("Vajra Booking").click();
System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());*/

List<WebElement>links=driver.findElements(By.tagName("a"));
int linkscount= links.size();
System.out.println("Total number of links on home page is:" + linkscount);
for(int k=0;k<links.size();k++) {
	String linkname= links.get(k).getText();
	System.out.println(k + " " + linkname);
}


	}

}
