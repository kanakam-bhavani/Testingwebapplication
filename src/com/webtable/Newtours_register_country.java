package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newtours_register_country {

	public static void main(String[] args) 
	{
	FirefoxDriver driver= new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	
	//<a href="mercuryregister.php?osCsid=122b6dda3383860d4d79a17063e1aae4">REGISTER</a>
	
	driver.manage().window().maximize();
	driver.findElement(By.linkText("REGISTER")).click();
	//<select name="country" size="1">
	WebElement country= driver.findElement(By.name("country"));
	//capturing all the country names for country element
	List<WebElement>countrynames=country.findElements(By.tagName("option"));
	
System.out.println(countrynames.size());
for(int i=0;i<countrynames.size();i++) {
	String countryname=countrynames.get(i).getText();
	System.out.println(i + " " +countryname);
}
driver.close();
	}

}
